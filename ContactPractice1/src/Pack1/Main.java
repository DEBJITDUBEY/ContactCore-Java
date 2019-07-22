package Pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter contact 1 detail:");
		String data=sc.nextLine();
		String a[]=data.split(",");
		Contact c1=new Contact(a[0],a[1],a[2],a[3],a[4],a[5],sdf.parse(a[6]));
		System.out.println("Enter contact 2 detail:");
		String data1=sc.nextLine();
		String a1[]=data1.split(",");
		Contact c2=new Contact(a1[0],a1[1],a1[2],a1[3],a1[4],a1[5],sdf.parse(a1[6]));
		
		System.out.println("Contact 1:");
		System.out.println(c1);
		System.out.println("Contact 2:");
		System.out.println(c2);
		
		if(c1.equals(c2)) {
			System.out.println("Contact 1 is same as Contact 2");
		}
		else {
			System.out.println("Contact 1 and Contact 2 are different");
		}
		
		
		

	}

}
