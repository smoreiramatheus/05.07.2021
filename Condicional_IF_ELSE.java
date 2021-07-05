package Familia28;

import java.util.Scanner;

public class Condicional_IF_ELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\nEntre com sua idade: ");
	idade = leia.nextInt();
	leia.nextLine();
	System.out.println("\nEntre com seu nome: ");
	nome = leia.nextLine();
	System.out.printf("\nSeu nome: %s",nome);
	System.out.printf("\nSua idade: %s",idade);
	
	if(idade>=18)
	{
		System.out.println("\nVocê é maior de idade!!!");
	}
	else if(idade>=1 && idade<18)
	{
		System.out.println("\nVocê é menor de idade!!!");
	}
	else
	{
		System.out.println("\nVocê entrou com uma idade inválida!!!");
	}
	}

}
