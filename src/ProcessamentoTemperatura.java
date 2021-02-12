/*
 * Programa para processar m�dias de temperatura criado como Trabalho pr�tico da disciplina de Orienta��o de Objetos em 12/02/2021
 */

import java.util.Scanner;

public class ProcessamentoTemperatura {	
	/* Declara��o de Array tridimensional de valores double para armazenar as temperaturas em cada uma das datas
	 * com a terceira dimens�o em aberto para ser ajustada de acordo com a quantidade de dias do referido m�s
	 */
	public static double[][][] data = new double[12][10][];
	// Flag para registrar o armazenamento de temperaturas (Valor padr�o = falso)
	public static boolean[][] armazenado = new boolean[12][10];
	// Como � necess�rio validar todas as datas inseridas em todas as fun��es � melhor fazer um m�todo dedicado do que copiar o c�digo varias vezes
	public static boolean validaData(int mesValida, int anoValida) {
		if(mesValida<1 || mesValida>13) {
			System.out.println("Data Inv�lida\n");
			return(false);
			}else if(anoValida<2011 || anoValida>2020) {
			System.out.println("Data Inv�lida\n");
			return(false);
			}
		return(true);
	}
	
	//M�todo entradaTemperatura que registra as temperaturas na devida vari�vel de mes e ano correspondente
	public static void entradaTemperatura(){
		/*Declara��o da quantidade de dias para cada array de data corretamente ajustados para anos bissextos
		 * Com a primeira vari�vel do array respons�vel pelo m�s(0 a 11) e a segunda pelo ano(0 a 9)
		 */
		 data[0][0] = new double[31]; data[1][0] = new double[28]; data[2][0] = new double[31]; data[3][0] = new double[30];
		 data[4][0] = new double[31]; data[5][0] = new double[30]; data[6][0] = new double[31]; data[7][0] = new double[31]; 
		 data[8][0] = new double[30]; data[9][0] = new double[31]; data[10][0] = new double[30]; data[11][0] = new double[31]; 
		 data[0][1] = new double[31]; data[1][1] = new double[29]; data[2][1] = new double[31]; data[3][1] = new double[30]; 
		 data[4][1] = new double[31]; data[5][1] = new double[30]; data[6][1] = new double[31]; data[7][1] = new double[31]; 
		 data[8][1] = new double[30]; data[9][1] = new double[31]; data[10][1] = new double[30]; data[11][1] = new double[31];
		 data[0][2] = new double[31]; data[1][2] = new double[28]; data[2][2] = new double[31]; data[3][2] = new double[30]; 
		 data[4][2] = new double[31]; data[5][2] = new double[30]; data[6][2] = new double[31]; data[7][2] = new double[31]; 
		 data[8][2] = new double[30]; data[9][2] = new double[31]; data[10][2] = new double[30]; data[11][2] = new double[31];
		 data[0][3] = new double[31]; data[1][3] = new double[28]; data[2][3] = new double[31]; data[3][3] = new double[30]; 
		 data[4][3] = new double[31]; data[5][3] = new double[30]; data[6][3] = new double[31]; data[7][3] = new double[31]; 
		 data[8][3] = new double[30]; data[9][3] = new double[31]; data[10][3] = new double[30]; data[11][3] = new double[31];
		 data[0][4] = new double[31]; data[1][4] = new double[28]; data[2][4] = new double[31]; data[3][4] = new double[30]; 
		 data[4][4] = new double[31]; data[5][4] = new double[30]; data[6][4] = new double[31]; data[7][4] = new double[31]; 
		 data[8][4] = new double[30]; data[9][4] = new double[31]; data[10][4] = new double[30]; data[11][4] = new double[31];
		 data[0][5] = new double[31]; data[1][5] = new double[29]; data[2][5] = new double[31]; data[3][5] = new double[30]; 
		 data[4][5] = new double[31]; data[5][5] = new double[30]; data[6][5] = new double[31]; data[7][5] = new double[31]; 
		 data[8][5] = new double[30]; data[9][5] = new double[31]; data[10][5] = new double[30]; data[11][5] = new double[31];
		 data[0][6] = new double[31]; data[1][6] = new double[28]; data[2][6] = new double[31]; data[3][6] = new double[30]; 
		 data[4][6] = new double[31]; data[5][6] = new double[30]; data[6][6] = new double[31]; data[7][6] = new double[31]; 
		 data[8][6] = new double[30]; data[9][6] = new double[31]; data[10][6] = new double[30]; data[11][6] = new double[31];
		 data[0][7] = new double[31]; data[1][7] = new double[28]; data[2][7] = new double[31]; data[3][7] = new double[30]; 
		 data[4][7] = new double[31]; data[5][7] = new double[30]; data[6][7] = new double[31]; data[7][7] = new double[31]; 
		 data[8][7] = new double[30]; data[9][7] = new double[31]; data[10][7] = new double[30]; data[11][7] = new double[31];
		 data[0][8] = new double[31]; data[1][8] = new double[28]; data[2][8] = new double[31]; data[3][8] = new double[30]; 
		 data[4][8] = new double[31]; data[5][8] = new double[30]; data[6][8] = new double[31]; data[7][8] = new double[31]; 
		 data[8][8] = new double[30]; data[9][8] = new double[31]; data[10][8] = new double[30]; data[11][8] = new double[31];
		 data[0][9] = new double[31]; data[1][9] = new double[29]; data[2][9] = new double[31]; data[3][9] = new double[30]; 
		 data[4][9] = new double[31]; data[5][9] = new double[30]; data[6][9] = new double[31]; data[7][9] = new double[31]; 
		 data[8][9] = new double[30]; data[9][9] = new double[31]; data[10][9] = new double[30]; data[11][9] = new double[31];
		
		int mesEntrada;
		int anoEntrada;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o m�s que deseja cadastrar (1 a 12):");
		mesEntrada = ler.nextInt();
		System.out.println("Digite o ano de refer�ncia (2011 a 2020):");
		anoEntrada = ler.nextInt();
		ler.close();
		// Testa se a data � v�lida
		if(!ProcessamentoTemperatura.validaData(mesEntrada, anoEntrada)) {
			return;
		}
		
		//Loop para armazenar as temperaturas m�dias de cada dia do m�s selecionado
		for (int i = 0; i<(data[mesEntrada-1][anoEntrada-2011].length); i++){
			System.out.println("Digite a m�dia de temperatura do dia " + String.format("%02d", (i+1)) + "/" + String.format("%02d", mesEntrada) + "/" + anoEntrada);
			data[mesEntrada-1][anoEntrada-2011][i] = ler.nextDouble();
		}
        //flag que indicar� que o valor desse mes e ano foi armazenado
		armazenado[mesEntrada-1][anoEntrada-2011] = true;
		System.out.println("Dados do m�s "+ String.format("%02d", mesEntrada) + "/" + anoEntrada + " cadastrados com sucesso!\n");
		return;	
	}
	
	public static void mediaTemperatura() {
		int mesMedia;
		int anoMedia;
		double media = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o m�s do qual deseja a m�dia (1 a 12):");
		mesMedia = ler.nextInt();
		System.out.println("Digite o ano de refer�ncia (2011 a 2020):");
		anoMedia = ler.nextInt();
		ler.close();
		// Testa se a data � v�lida
		if(!ProcessamentoTemperatura.validaData(mesMedia, anoMedia)) {
			return;
		}
		if(!armazenado[mesMedia-1][anoMedia-2011]) {
			System.out.println("A temperatura do m�s " + String.format("%02d", mesMedia) + "/" + anoMedia + " ainda n�o foi cadastrada.\n");
			return;
		}
		for (int j = 0; j<(data[mesMedia-1][anoMedia-2011].length); j++){
			media += data[mesMedia-1][anoMedia-2011][j];
		}
		media /= data[mesMedia-1][anoMedia-2011].length;
		System.out.println("A m�dia de temperaturas do m�s " + String.format("%02d", mesMedia) + "/" + anoMedia + " � :" + media + "\n");
		return;
		
	}
	
	public static void minimaTemperatura() {
		double temperaturaMinima = 500;
		int mesMinima;
		int anoMinima;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o m�s do qual deseja a temperatura m�nima (1 a 12):");
		mesMinima = ler.nextInt();
		System.out.println("Digite o ano de refer�ncia (2011 a 2020):");
		anoMinima = ler.nextInt();
		ler.close();
		// Testa se a data � v�lida
		if(!ProcessamentoTemperatura.validaData(mesMinima, anoMinima)) {
			return;
		}
		//Lopp que vai iterar as temperaturas de todos os dias do mes selecionado
		for(int k = 0; k<(data[mesMinima-1][anoMinima-2011].length);k++) {
			//se for o primeiro loop (k = 0) OU se a vari�vel temperaturaMinima for maior que a leitura atual, temperaturaMinima recebe a leitura atual
			if (k == 0 || temperaturaMinima > data[mesMinima-1][anoMinima-2011][k]) {
				temperaturaMinima = data[mesMinima-1][anoMinima-2011][k];
				}
		}
		
		System.out.println("A Temperat�ra media m�nima registrada em "+ mesMinima + "/" + anoMinima + " foi de: " + temperaturaMinima + "\n");
		return;
		
	}
	
	public static void maximaTemperatura() {
		double temperaturaMaxima = 0;
		int mesMaxima;
		int anoMaxima;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o m�s do qual deseja a temperatura m�xima (1 a 12):");
		mesMaxima = ler.nextInt();
		System.out.println("Digite o ano de refer�ncia (2011 a 2020):");
		anoMaxima = ler.nextInt();
		ler.close();
		// Testa se a data � v�lida
		if(!ProcessamentoTemperatura.validaData(mesMaxima, anoMaxima)) {
			return;
		}
		//Lopp que vai iterar as temperaturas de todos os dias do mes selecionado
		for(int l = 0; l<(data[mesMaxima-1][anoMaxima-2011].length);l++) {
			if (l == 0 || temperaturaMaxima < data[mesMaxima-1][anoMaxima-2011][l]) {
				temperaturaMaxima = data[mesMaxima-1][anoMaxima-2011][l];
				}
		}
		System.out.println("A Temperat�ra media m�xima registrada em "+ mesMaxima + "/" + anoMaxima + " foi de: " + temperaturaMaxima + "\n");
		return;
	}
	
	public static void relatorioTemperatura() {
		return;
	}
	
	
	public static void main(String[] args) {
		
		int opcaoMenu;
				
		Scanner ler = new Scanner(System.in);
		
		while(true) {
		System.out.println("1. Entrada das temperaturas");
		System.out.println("2. C�lculo da temperatura m�dia");
		System.out.println("3. C�lculo da temperatura m�nima");
		System.out.println("4. C�lculo da temperatura m�xima");
		System.out.println("5. Relat�rio meteorol�gico \n");
		System.out.println("Digite o n�mero(1 a 5) correspondente � op��o desejada");
		opcaoMenu = ler.nextInt();
		ler.close();
		
		switch (opcaoMenu) {
		case 1:
			System.out.println("Op��o 1. Entrada das temperaturas Selecionada\n");
			ProcessamentoTemperatura.entradaTemperatura();
			break;
			
		case 2:
			System.out.println("Op��o 2. C�lculo da temperatura m�dia Selecionada\n");
			ProcessamentoTemperatura.mediaTemperatura();
			break;
		case 3:
			System.out.println("Op��o 3. C�lculo da temperatura m�nima Selecionada\n");
			ProcessamentoTemperatura.minimaTemperatura();
			break;
		case 4:
			System.out.println("Op��o 4. C�lculo da temperatura m�xima Selecionada\n");
			ProcessamentoTemperatura.maximaTemperatura();
			break;
		case 5:
			System.out.println("Op��o 5. Relat�rio meteorol�gico Selecionada\n");
			ProcessamentoTemperatura.relatorioTemperatura();
			break;
		default:
			System.out.println("Entrada Inv�lida, entre com um n�mero de 1 a 5.");
			break;
		}
		
		
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
