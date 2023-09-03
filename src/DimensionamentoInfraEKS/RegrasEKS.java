package DimensionamentoInfraEKS;

import java.util.Scanner;

/* Descrição
	Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo 
	de nodes e servidores necessários para suportar seus aplicativos no cluster do EKS..

	Regras Básicas:

	Cada node pode suportar até 10 pods.
	Cada servidor (EC2) pode suportar até 4 pods.
	Seu objetivo é desenvolver um programa em Java que permita ao usuário fazer uma consulta de dimensionamento. 
	O programa deve receber o número total de pods do aplicativo e calcular o número mínimo de nodes 
	e servidores necessários com base nas regras de dimensionamento.   */

public class RegrasEKS {

	public static void main(String[] args) {

		// Definindo as regras básicas
		int podsPorNode = 10;
		int podsPorServidor = 4;

		// Criando um objeto Scanner para receber as entradas do usuário
		Scanner scanner = new Scanner(System.in);

		// Recebendo as informações do usuário
		int numeroTotalPods = scanner.nextInt();

		// TODO: Calcule o número mínimo de nodes necessários
		int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);

		// TODO: Calcule o número mínimo de servidores necessários
		int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

		// TODO: Exiba o resultado com as recomendações de quantidades de servidores e
		// nodes.

		if (numeroMinimoNodes <= 1) {
			System.out.println("1.Recomendamos usar um unico node");
		} else {
			System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
		}
		if (numeroMinimoServidores <= 1) {
			System.out.println("2.Recomendamos utilizar um unico servidor");
		} else {
			System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
		}

		// Fechando o Scanner
		scanner.close();

	}

}
