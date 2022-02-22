package testeCapgemini.questoes;

import java.text.MessageFormat;
import java.util.Scanner;

public class AtividadeDois 
{
	public static void atividadeDois()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Informe uma senha : ");
			String senha = sc.next();
				
			verificarSenha(senha);
				
			char opc = 'a';
				
			while (opc != 's' && opc != 'n')
			{
				System.out.println("Deseja digitar outra senha?");
				opc = (sc.next().toLowerCase()).charAt(0); //Coleta o primeiro carácter do que foi digitado
				
				if (opc != 'n' && opc != 's')
					System.out.println("Opção Inválida!");
			}
				
			if (opc == 'n')
				break; //Sai do programa
		}
		
	}
	
	public static void verificarSenha(String senha)
	{
		int caracteres = 6 - senha.length();//Diferença de 6 pelo tamanho da senha
		
		String[] erros = verificarErros(senha);
		
		boolean temErros = erros.length > 0;
		
		if (caracteres > 0)
		{
			System.out.print(MessageFormat.format("A senha precisa de mais {0} dígitos", caracteres));
			if (temErros)
				System.out.println(", e");
		} else {
			System.out.print("A senha está com o número certo de carácteres");
			if (temErros)
				System.out.println(", mas");
		}
		
		if (temErros)
		{
			for (String erro : erros)	
			{
				if (erro != null)
					System.out.println(erro);
			}
		}
		
	}
	
	public static String[] verificarErros(String senha)
	{
		boolean[] errosDicionario = {true, true, true, true}; 
		//Cada indice representa um erro possível, iniciado com true em todas as posições
		
		for (int i = 0; i < senha.length(); i++)
		{
			char c = senha.charAt(i);
			
			if (Character.isDigit(c))
				errosDicionario[0] = false;
			
			if (Character.isLowerCase(c))
				errosDicionario[1] = false;
			
			if (Character.isUpperCase(c)) 
				errosDicionario[2] = false; 
			
			String sp = "!@#$%^&*()-+"; //Verifica caractéres especiais
			if (sp.contains(Character.toString(c)))
				errosDicionario[3] = false;
		}
		String[] erros = new String[4];

		//O trecho a seguir adicona os erros à lista de String
		if (errosDicionario[0])
			erros[0] = ("Precisa de um número");
		if (errosDicionario[1])
			erros[1] = ("Precisa de uma letra minúscula");
		if (errosDicionario[2])
			erros[2] = ("Precisa de uma letra maiúscula");
		if (errosDicionario[3])
			erros[3] = ("Precisa de um carácter especial(!@#$%^&*()-+)");
		return erros;
	}
}
