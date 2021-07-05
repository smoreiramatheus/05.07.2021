package Familia28;

import java.util.Scanner;

public class ExerRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		int x = 0, idade, contIdadeMenor = 0, IntervaloIdades=0, contIdadeMaior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade !=-99)
		{
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
		}
		if (idade<21)
		{
			contIdadeMenor++;
		}
		else if (idade>50)
		{
			contIdadeMaior++;
		}
		else
		{
			IntervaloIdades++;
		}
		
		System.out.println("\nSão "+contIdadeMenor+ " idades menores que 21 anos");
		System.out.println("\nSão "+contIdadeMaior+ " idades maiores que 50 anos");
	}

}
