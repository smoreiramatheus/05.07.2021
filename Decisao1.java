package Familia28;

import java.util.Scanner;
	//entre com um número e informe se este número é positivo, negativo ou zero
public class Decisao1 {

	public static void main(String[] args) 
	{
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nENtre com um número: ");
		num = leia.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num+" é positivo!!!");
		}
		else if(num<0)
		{
			System.out.println("\n"+num+" é negativo!!!");
		}
		else
		{
			System.out.println("\n"+num+" é ZERO!!!");
		}
	}

}
