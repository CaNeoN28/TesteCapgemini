package testeCapgemini.questoes;

import java.text.MessageFormat;
import java.util.Scanner;

public class AtividadeUm 
{
	//M�todo principal referente � quest�o 1
	public static void atividadeUm()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro : ");
		int num = sc.nextInt();
		
		
		System.out.println(MessageFormat.format("Exibindo uma escada com {0} degraus", num));
		for(int i = 1; i <= num;i++)
		{
			//Imprime espa�os com quantidade inversa � de pontos
			for(int b = num; b > i;b--)
				System.out.print(' ');
			
			for(int c = 0; c < i;c++)
				System.out.print('*');
			
			System.out.println("");
		}
		
	}
}
