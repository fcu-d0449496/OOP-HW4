package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Maain {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner scanner=new Scanner(System.in);
		NissanTiida nissantiida=new NissanTiida();
		int loop,i;
		System.out.println("Please enter a number:");
		loop=scanner.nextInt();
		for(i=1;i<=loop;i++)
		{
			System.out.println("第"+i+"次呼叫tiida()");
			nissantiida.tiida();
		}
	}
}
