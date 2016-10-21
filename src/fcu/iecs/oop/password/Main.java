package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		PasswordEncorder passwordencorder=new PasswordEncorder();
		Scanner scanner=new Scanner(System.in);
		String A;
		while(true){
			System.out.println("Please enter a password:");
			A=scanner.next();
			if(A.contentEquals("exit"))
				break;
			else
				System.out.println(passwordencorder.encode(A));
		}
	}
}
