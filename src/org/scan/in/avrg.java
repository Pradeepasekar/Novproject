package org.scan.in;

import java.util.Scanner;

public class avrg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Mark1");
		int M1 = s.nextInt();
		System.out.println("mark1:"+M1);
		System.out.println("Enter Mark2");
		int M2 = s.nextInt();
		System.out.println("mark1:"+M2);
		System.out.println("Enter Mark3");
		int M3 = s.nextInt();
		System.out.println("mark1:"+M3);
		System.out.println("Enter Mark4");
		int M4 = s.nextInt();
		System.out.println("mark1:"+M4);
		System.out.println("Enter Mark5");
		int M5 = s.nextInt();
		System.out.println("mark1:"+M5);
		int total=M1+M2+M3+M4+M5;
		System.out.println("total:"+total);
		int avg=total/5;
		System.out.println("avg:"+avg);
	}

}
