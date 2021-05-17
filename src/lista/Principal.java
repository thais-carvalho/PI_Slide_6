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
					System.out.println("Matriz 1 preenchida");
					for(int i = 0; i < lin; i++) {
						for(int j = 0; j < col; j++) {
							System.out.print(matriz1[i][j] + " ");
						}
						System.out.println();
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
						for (int i = 0; i < (2 * lin); i++)
						{
							for (int j = 0; j < (2 * col); j++)
							{
								if (i < lin && j < col)
									System.out.print(matriz1[i][j] + " ");
								else
									System.out.print("* ");
							}
							System.out.println();
						}
						System.out.println();
						
						//matriztrans = new int[3][3];
						int matriztrans[][] = 
						{
								{1, 2, 3},
								{3, 4, 5},
								{4, 5, 6}

						};
						int matrizpos[][] = {
								{1},
								{2},
								{3}
						};
						matrizres = new int[3][1];
						
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
						
						break;
					case 0: System.out.println("Operação finalizada");
							break;
					default: System.out.println("Opção inválida");
				}	
			}
			scan.close();
		}
		
	}

