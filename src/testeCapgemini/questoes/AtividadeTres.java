package testeCapgemini.questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AtividadeTres 
{
	public static void atividadeTres()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra : ");
		String palavra = sc.next().toLowerCase();
		
		String[] substrings = extrairTrechos(palavra);
		
		int ocorrencias = pegarOcorrencias(substrings);
		
		System.out.println("O numero de anagramas pares é de: " + ocorrencias);
		
	}
	
	public static String[] extrairTrechos(String palavra)
	{
		ArrayList<String> substr = new ArrayList<>();
		
		//O laço a seguir reparte a string em substrings
		for(int i = 0; i <= palavra.length(); i++)
		{
			//Esse laço une o carácter inicial com todos os seguintes
			for(int j = i; j <= palavra.length(); j++)
			{
				if (!palavra.substring(i, j).isEmpty())
				{
					System.out.println(palavra.substring(i, j));
					substr.add(palavra.substring(i, j));
				}
			}
		}
		
		String[] substrings = substr.toArray(new String[substr.size()]);
		
		return substrings;
	}
	
	public static int pegarOcorrencias(String[] trechos)
	{
		int ocorrencias = 0;
		
		for(int i = 0; i < trechos.length; i++)
		{
			for(int j = i + 1; j < trechos.length; j++)
			{
				boolean eAnagrama = trechos[i].length() == trechos[j].length();
				
				if(eAnagrama)
				{
					char[] palavrai = trechos[i].toCharArray();
					char[] palavraj = trechos[j].toCharArray();
					
					Arrays.sort(palavrai);
					Arrays.sort(palavraj);
					
					if(Arrays.equals(palavrai, palavraj))
					{
						ocorrencias++;
					}
				}
			}
		}
		
		return ocorrencias;
	}
}
