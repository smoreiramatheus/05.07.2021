package Familia28;

import java.util.Scanner;

public class Exerc6_DO_WHILE {
	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE) */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,soma=0,multiplo=0, media=0;
		
		
		Scanner leia = new Scanner(System.in);
		
				
		do
		{
			System.out.println("\nEntre com um valor: ");
			x = leia.nextInt();
			
			if(x%3==0)
			{
				soma = soma + x;
				multiplo++;
			}
			
		}
		while(x!=0);
		
		media = soma/multiplo;
		
		System.out.println("\n m�dia dos multiplos de 3: "+media);
			
		}
		
	}


