package Familia28;

import java.util.Scanner;

public class ExerRepeticao5 {
	/*Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, soma=0;
		Scanner leia = new Scanner(System.in);
		
	
	
		
		do
		{
			System.out.println("\nDigite um valor: ");
			num = leia.nextInt();
			soma = soma + num;
			
		}
		while(num !=0);
		
		System.out.println("\n A soma dos dígitos será igual a "+soma);
		
	}
}
