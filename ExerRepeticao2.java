package Familia28;

import java.util.Scanner;

public class ExerRepeticao2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int x, num, par=0,impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um valor: ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				 num = par++;
				 
			}
			else
			{
				num = impar++;
				
			}
				
		}
		System.out.println("\n"+par+ " valores pares");
		System.out.println("\n"+impar+ " valores impares");
	}

}
