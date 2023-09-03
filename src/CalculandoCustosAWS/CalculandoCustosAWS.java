package CalculandoCustosAWS;

import java.util.Locale;
import java.util.Scanner;

/* 	Descrição
	você é um jovem engenheiro de software recém-contratado pela empresa "TechCloud". 
	Sua equipe é responsável por desenvolver aplicativos e serviços que serão implantados na Amazon Web Services (AWS), 
	a principal plataforma de computação em nuvem do mercado.

	Sua primeira tarefa é desenvolver um programa simples em Java que auxilie os desenvolvedores a 
	calcular os custos de execução de seus aplicativos na AWS. Para isso, você precisa coletar algumas informações 
	e aplicar uma fórmula para determinar o custo total.   */

public class CalculandoCustosAWS {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Definindo as taxas
		double custoPorHoraServidor = 0.15;
		double custoPorHoraBancoDados = 0.05;

		// Criando um objeto Scanner para receber as entradas do usuário
		Scanner scanner = new Scanner(System.in);

		// Recebendo as informações do usuário
		int quantidadeServidores = scanner.nextInt();

		int quantidadeBancosDados = scanner.nextInt();

		// TODO: Calcule os custos

		double custoTotal = (quantidadeServidores * custoPorHoraServidor)
				+ (quantidadeBancosDados * custoPorHoraBancoDados);			

		System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

		// Fechando o Scanner
		scanner.close();

	}

}
