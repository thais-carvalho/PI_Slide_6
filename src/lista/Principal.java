package lista;


import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			int matriz1[][] = null, matriz2[][] = null,matrizres[][] = null,operacao=1, lin=0, col=0;
			//int matrizpos[][];
			//int matriztrans[][];
			
			Scanner scan = new Scanner(System.in);
			
			while(operacao != 0) {
				System.out.println("Escolha a operação:\n1-Soma\n2-Subtração\n3-Translação\n0-Sair\n");
				operacao = scan.nextInt();
				
				if(operacao > 0 && operacao < 3) {
					System.out.println("Insira a quantidade de linhas e a quantidade de colunas");
					lin = scan.nextInt();
					col = scan.nextInt();
					matriz1 = new int[lin][col];
					matriz2 = new int[lin][col];
					matrizres = new int[lin][col];
					
					System.out.println("Insira os valores da matriz 1");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							matriz1[i][j] = scan.nextInt();
						}
					}
					System.out.println("Matriz 1 preenchida");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							System.out.print(matriz1[i][j] + " ");
						}
						System.out.println();
					}
					
					System.out.println("Insira os valores da matriz 2");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							matriz2[i][j] = scan.nextInt();
						}
					}
					System.out.println("Matriz 2 preenchida");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							System.out.print(matriz2[i][j] + " ");
						}
						System.out.println();
					}
						
				}
				if (operacao == 3)
				{
					System.out.println("Insira a quantidade de linhas e a quantidade de colunas");
					lin = scan.nextInt();
					col = scan.nextInt();
					matriz1 = new int[lin][col];
					System.out.println("Insira os valores da matriz 1");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							matriz1[i][j] = scan.nextInt();
						}
					}
					
				}
				switch(operacao) {
					case 1: for(int i = 0; i < lin; i++) {
								for(int j = 0; j < col; j++) {
									matrizres[i][j] = matriz1[i][j] + matriz2[i][j];
								}
							}
							System.out.println("Resultado da matriz soma");
							for(int i = 0; i < lin; i++) {
								for(int j = 0; j < col; j++) {
									System.out.print(matrizres[i][j] + " ");
								}
								System.out.println();
							}
							break;
					case 2:	for(int i = 0; i < lin; i++) {
								for(int j = 0; j < col; j++) {
									matrizres[i][j] = matriz1[i][j] - matriz2[i][j];
								}
							}
					System.out.println("Resultado da matriz subtração");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							System.out.print(matrizres[i][j] + " ");
						}
						System.out.println();
					}
							
						break;
						
					case 3: System.out.println();
						for (int i = 0; i < 15; i++)
						{
							for (int j = 0; j < 15; j++)
							{
								if (i < lin && j < col)
									System.out.print(matriz1[i][j] + " ");
								else
									System.out.print("* ");
							}
							System.out.println();
						}
						System.out.println();
												
						int matriztrans[][] = 
						{
								{1, 0, -1},
								{0, 1, -1},
								{0, 0, 1}

						};
						int matrizpos[][] = {
								{0},
								{0},
								{1}
						};
						matrizres = new int[3][1];
						
						System.out.println("\nQuantas unidades de deslocamento à direita:\n");
						matriztrans[1][2] = scan.nextInt();
						System.out.println("\nQuantas unidades de deslocamento para baixo:\n");
						matriztrans[0][2] = scan.nextInt();
						
						  for(int i = 0; i < 3; i++)
						  {
						    for(int j = 0; j < 1; j++){
						      int soma = 0;
						      for(int k = 0; k < 3; k++) {
						        soma += matriztrans[i][k] * matrizpos[k][j];
						        matrizres[i][j]=soma;
						      }
						    }
						  }
						  System.out.println("Resultado da multiplicação de matrizes:");
							for(int i = 0; i < 3; i++) {
								for(int j = 0; j < 1; j++) {
									System.out.print(matrizres[i][j] + " ");
								}
								System.out.println();			
						  
						  }
						System.out.println();
						int m = 0;
						
						for (int i = 0; i < (15); i++)
						{
							int n = 0;
							for (int j = 0; j < (15); j++)
							{
								if (i >= matrizres[0][0] && i < (matrizres[0][0] + lin) && j >= matrizres[1][0] && j < (matrizres[1][0] + col))
								{
									System.out.print(matriz1[m][n] + " ");
									n++;
									if (n >=col)
										m++;
								}
								else
									System.out.print("* ");
								
							}
							System.out.println();
						}
						System.out.println();
						
						break;
					case 0: System.out.println("Operação finalizada");
							break;
					default: System.out.println("Opção inválida");
				}	
			}
			scan.close();
		}
		
	}

