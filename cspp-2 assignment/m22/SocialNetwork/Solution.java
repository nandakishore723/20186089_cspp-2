import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class User {
	private String username;
	private List<String> friends = new List<String>();
 	User(String uname, String[] friends1) {
 		this.username = uname;
 		for (int i = 0; i < friends1.length; i++) {
 			friends.add(friends1[i]);
 		}
	}
	public String getusername() {
        return this.username;
    }
    public List<String> getfriends() {
    	return this.friends;
    }
    public String toString() {
		String s = getusername() + ": [";
		for (int i = 0; i < getfriends().size() - 1; i++) {
			s += getfriends().get(i) + ", ";
		}
		s += getfriends().get(getfriends().size() - 1) + "]";
		return s;
	}
 
	
}
class SocialNetwork {
	private List<User> user;
	 SocialNetwork() {
	 	user = new List<User>();
	}
	public List<User> getuser() {
        return user;
    }
	public List<String> getConnections(String name) {
     	int s = indexOf(name);
	 	if (s != -1) {
	 		return user.get(s).getfriends();

	 	}
	 	return null;
	}
	 public void adduser(User frnd) {
	 	user.add(frnd);
	 }
	public void addConnection(String nm1, String nm2) {
	 	int index = indexOf(nm1);
	 	if (index != -1) {
	 		List<String> friends = user.get(index).getfriends();
	 		friends.add(nm2);
	 	} 		
	}
 	public void addTo(User soc) {
	user.add(soc);
	}
	public int indexOf(String name) {
	 	for (int i =0; i< user.size() ; i++ ) {
	 		if (user.get(i).getusername().equals(name)) {
	 			return i;
	 		}
	 	}
	 	return -1;
	}
	public List getCommonConnections(String nm1, String nm2) {
		List<String> fr = getConnections(nm1);
		List<String> fr1 = getConnections(nm2);
		List<String> newlist = new List<String>();
		if(fr.size() !=0 && fr1.size() != 0) {
			for (int i = 0; i < fr.size() ; i++) {
				if (fr1.contains(fr.get(i))) {
					newlist.add(fr.get(i));
				}
				
			}
		}
		System.out.println(newlist);
		return newlist;
	}
	public String toString() {
		String[] keys = new String[user.size()];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = user.get(i).getusername();
		}
		Arrays.sort(keys);
		String s = "";
		int i = 0;
		for (i = 0; i < keys.length - 1; i++) {
			s += keys[i] + ": " + getConnections(keys[i])+", ";
		}
		s += keys[i] + ": " + getConnections(keys[i]);
		return s;
	}
}


class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        SocialNetwork user = new  SocialNetwork();
        String[] input = s.nextLine().split(" ");
        int x = Integer.parseInt(input[1]);
        while (x != 0) {
        	String[] line = s.nextLine().split(" is connected to ");
			String[] friends = line[1].replace(".","").split(", ");
			user.addTo(new User(line[0], friends));
			x -= 1;
        	
        }
        while (s.hasNext()) {
			String[] soc = s.nextLine().split(" ");
			switch (soc[0]) {
				case "addConnections":
					user.addConnection(soc[1], soc[2]);
				break;
				case "getConnections":
				if (user.getConnections(soc[1]) != null) {
					System.out.println(user.getConnections(soc[1]));
				}
				break;
				case "CommonConnections":
				System.out.println(user.getCommonConnections(soc[1], soc[2]));	
				break;
				case "Network":
				System.out.println(user);
				default:
				break;
			}
		}
	}
}

