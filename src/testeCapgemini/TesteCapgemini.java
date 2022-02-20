package testeCapgemini;

import java.util.Scanner;

import testeCapgemini.questoes.*;

public class TesteCapgemini 
{

	public static void main(String[] args) 
	{
		while (true)
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\n1 - Exercicio 01\n"
					+ "2 - Exercicio 02\n"
					+ "3 - Exercicio 03\n"
					+ "4 - Sair\n"
					+ "Informe sua opção : ");
			String opc = sc.nextLine();
			
			if (opc.equals("1"))
				AtividadeUm.atividadeUm();
			
			else if(opc.equals("2"))
				AtividadeDois.atividadeDois();
			
			else if(opc.equals("3"))
				AtividadeTres.atividadeTres();
			
			else if(opc.equals("4"))
				break;
			
			else
				System.out.println("Opção inválida! Tente novamente");
			
		}
		
		System.out.println("Isso é tudo, tenha um bom dia!");
	}

}
