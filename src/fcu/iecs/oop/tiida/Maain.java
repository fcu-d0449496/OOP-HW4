package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Maain {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner scanner=new Scanner(System.in);
		NissanTiida nissantiida=new NissanTiida();
		int loop,i;
		System.out.println("Please enter a number:");
		loop=scanner.nextInt();
		for(i=1;i<=loop;i++)
		{
			System.out.println("��"+i+"���I�stiida()");
			nissantiida.tiida();
		}
	}
}
