package Familia28;

import java.util.Scanner;

public class Repeticao2_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1)
		{
			System.out.println("\nSua idade: "+idade);
			if(idade>=18)
			{
				System.out.println("\nVocê é maior de idade!!");
			}
			else
			{
				System.out.println("\nVocê é menor de idade!!");
			}
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
		}
	}

}
