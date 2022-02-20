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
		String palavra = sc.next();
		
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
				substr.add(palavra.substring(i, j));
			}
		}
		
		substr.removeAll(Arrays.asList("", null));
		//Por algum motivo, a lista possui espaços em branco. Esse trecho limpa eles
		
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
				String aux = new StringBuilder(trechos[j]).reverse().toString(); //Inverte os subconjuntos seguintes
				
				//System.out.println(trechos[i] + "/" + aux); 
				//O trecho acima pode ser descomentado para poder se ver os pares
				
				if (trechos[i].equals(aux)) //Testa a igualdade, já que o operador '==' não funciona
					ocorrencias++;
			}
		}
		
		return ocorrencias;
	}
}
