import java.util.*;
public class student {
	String name,rollno;
	float[] avg;
    float avg1;
	student(String name, String rollno, float[] avg) {
		this.name = name;
		this.rollno = rollno;
		this.avg = avg;
	}
	void display() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(avg1);
    }
    float avrg() {
 		float sum = 0;
 		for (float  i : avg){
 			sum = sum +i;
 		}
 		avg1 = sum/avg.length;
 		return avg1;	
    }

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String name =ip.nextLine();
		String rollno = ip.nextLine();
		System.out.println("enter no of subjects");
		int n = ip.nextInt();
		System.out.println("enter marks:");
		float a[]= new float[n];
		for(int i = 0;i<n;i++)
		{
			a[i]=ip.nextFloat();
		}
		student s1 = new student(name,rollno,a);
		s1.avrg();
		s1.display();
	}
}
