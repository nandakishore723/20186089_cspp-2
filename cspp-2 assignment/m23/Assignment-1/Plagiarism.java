import java.util.*;
import java.io.*;


class Plagiarism {
	private List<String> documentList;
	public Plagiarism() {
		documentList = new ArrayList<String>();
	}
	public List<String> getdocumentList() {
		return this.documentList;
	}
	public void setdocumentList(List<String> docs) {
	this.documentList = docs;	
	}

	
	public void adddocument(String doc) {
		documentList.add(doc);
	}


	public List<String> loadstopwords() throws Exception {
		List<String> swordslist = new ArrayList<String>();
		Scanner ip = new Scanner(new File("stopwords.txt"));
		while (ip.hasNext()) {
			String line = ip.nextLine();
			swordslist.add(line);
		}
		return swordslist;
	}


	public List<String> removeStopWords(String[] tokens) throws Exception {
		List<String> newwords = new ArrayList<String>();
		List<String> swords = loadstopwords();
		for(String word : tokens) {
			if (!swords.contains(word)) {
				newwords.add(word);
			}
		}
		return newwords;
	}


	public String toString(File filename) throws Exception {
		String str = "";
		try {
			Scanner ip = new Scanner(new FileReader(filename));
		StringBuffer sb = new StringBuffer();
		while(ip.hasNext()) {
			sb.append(ip.next());
			sb.append(" ");
		}
		ip.close();
		str = sb.toString();
		return str;
		} catch (Exception e) {
			return null;
		}
	}
	

	public int bagOfWords(String doc1, String doc2) throws Exception {
		Hashtable<String, Integer> ht1 = count(doc1);
		Hashtable<String, Integer> ht2 = count(doc2);
		double dp = dotProduct(ht1, ht2);
		double sqrt1 = eculidean(ht1);
		double sqrt2 = eculidean(ht2);
		double res = dp / (sqrt1 * sqrt2);
		return (int)(res*100);
	}


	public double dotProduct(Hashtable<String, Integer> ht1, Hashtable<String, Integer> ht2 ) {
		double product = 0.0;
		for (String element : ht1.keySet()) {
			for(String element1 : ht2.keySet()) {
				if(element.equals(element1)){
					product += ht1.get(element) * ht2.get(element);
				}
			}
		}
		return product;
	}


	public double eculidean(Hashtable<String, Integer> ht) {
		double sum = 0.0;
		for (String element : ht.keySet()) {
			sum += Math.pow(ht.get(element), 2);
		}
		double sq = Math.sqrt(sum);
		return sq;
	}


	public Hashtable<String, Integer> count(String doc) throws Exception {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		doc = doc.toLowerCase();
		String token = doc.replaceAll("[^a-zA-Z ]", "");
		String[] tokens = token.split(" ");
		List<String> wrdList = removeStopWords(tokens);
		for (int i = 0; i < wrdList.size(); i++) {
			if (ht.containsKey(wrdList.get(i))) {
				ht.put(wrdList.get(i), ht.get(wrdList.get(i)) + 1);
			} else {
				ht.put(wrdList.get(i), 1);
			}
		}
		return ht;
	}


	public void print(int[][] matrix, File[] listFiles) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t\t");
		for(int i = 0; i < listFiles.length-1; i++) {
			sb.append(listFiles[i].getName() + "\t");
		}
		sb.append(listFiles[listFiles.length - 1].getName() + "\n");
		for(int i = 0; i < listFiles.length - 1; i++) {
			sb.append(listFiles[i].getName() + "\t");
			for(int k = 0; k < listFiles.length; k++) {
				sb.append(matrix[i][k] + "\t\t");
			}
			sb.append("\n");
		}
		sb.append(listFiles[listFiles.length - 1].getName() + "\t");
		for(int k = 0; k < listFiles.length; k++) {
			sb.append(matrix[listFiles.length - 1][k] + "\t\t");
		}
		System.out.println(sb.toString());
	}		
}

