/*
 * Programa para processar médias de temperatura criado como Trabalho prático da disciplina de Orientação de Objetos em 12/02/2021
 */

import java.util.Scanner;

public class ProcessamentoTemperatura {	
	/* Declaração de Array tridimensional de valores double para armazenar as temperaturas em cada uma das datas
	 * com a terceira dimensão em aberto para ser ajustada de acordo com a quantidade de dias do referido mês
	 */
	public static double[][][] data = new double[12][10][];
	// Scanner público para que não seja necessário criar outros para cada método
	public static Scanner ler = new Scanner(System.in);
	// Flag para registrar o armazenamento de temperaturas (Valor padrão = falso), caso tal mes de tal ano for armazenado = true
	public static boolean[][] armazenado = new boolean[12][10];
	// Função para validar se a data inserida está dentro do intervalo permitido
	public static boolean validaData(int mesValida, int anoValida) {
		if(mesValida<1 || mesValida>12) {
			System.out.println("Data Inválida\n");
			return(false);
			}else if(anoValida<2011 || anoValida>2020) {
			System.out.println("Data Inválida\n");
			return(false);
			}
		return(true);
	}
	// Metodo de entrada de data para os demais métodos com verificação de data válida e de data armazenada
	public static void entradaData(int menu) {
		
		int mes;
		int ano;
				
		System.out.println("Digite o número correspondente ao mês(1 a 12): ");
		mes = ler.nextInt();
		System.out.println("Digite o ano de referência(2011-2020): ");
		ano = ler.nextInt();
		//Chamada da função booleana validaData que testa se a data é valida, caso seja inválida retorna.
		if(!ProcessamentoTemperatura.validaData(mes, ano)) {
			return;
		}
		//Teste da variável booleana armazenado para saber se o valor de temperaturas para um dado mes foi ou não cadastrado
		// "mes-1" e "ano-2011" se referem ao range dos arrays de mês [0-11] e ano [0-9]
		if(!armazenado[mes-1][ano-2011] && menu != 1) {
			System.out.println("A temperatura do mês " + String.format("%02d", mes) + "/" + ano + " ainda não foi cadastrada.\n");
			return;
		}
		// Escolhe a opção de menu inserida e informa com um print a decisão para o usuário
		switch (menu) {
		case 1:
			System.out.println("Opção 1. Entrada das temperaturas Selecionada\n");
			ProcessamentoTemperatura.entradaTemperatura(mes, ano);
			break;
		
		case 2:
			System.out.println("Opção 2. Cálculo da temperatura média Selecionada\n");
			ProcessamentoTemperatura.mediaTemperatura(mes, ano);
			break;
		case 3:
			System.out.println("Opção 3. Cálculo da temperatura mínima Selecionada\n");
			ProcessamentoTemperatura.minimaTemperatura(mes, ano);
			break;
		case 4:
			System.out.println("Opção 4. Cálculo da temperatura máxima Selecionada\n");
			ProcessamentoTemperatura.maximaTemperatura(mes, ano);
			break;
		case 5:
			System.out.println("Opção 5. Relatório meteorológico Selecionada\n");
			ProcessamentoTemperatura.relatorioTemperatura(mes, ano);
			break;
		default:
			System.out.println("Opção Inválida, entre com um número de 1 a 5.");
			break;
		}
		return;
		
	}
	//Método entradaTemperatura que registra as temperaturas na devida variável de mes e ano correspondente
	public static void entradaTemperatura(int mesEntrada, int anoEntrada){
		/*Declaração da quantidade de dias para cada array de data corretamente ajustados para anos bissextos
		 * Com a primeira variável do array responsável pelo mês(0 a 11) e a segunda pelo ano(0 a 9)
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
		 /*data[0][9] = new double[31]*/; data[1][9] = new double[29]; data[2][9] = new double[31]; data[3][9] = new double[30]; 
		 data[4][9] = new double[31]; data[5][9] = new double[30]; data[6][9] = new double[31]; data[7][9] = new double[31]; 
		 data[8][9] = new double[30]; data[9][9] = new double[31]; data[10][9] = new double[30]; data[11][9] = new double[31];
		
		//Loop para armazenar as temperaturas médias de cada dia do mês selecionado
		for (int i = 0; i<(data[mesEntrada-1][anoEntrada-2011].length); i++){
			System.out.println("Digite a média de temperatura do dia " + String.format("%02d", (i+1)) + "/" + String.format("%02d", mesEntrada) + "/" + anoEntrada);
			data[mesEntrada-1][anoEntrada-2011][i] = ler.nextDouble();
		}
        //flag que indicará que o valor desse mes e ano foi armazenado
		armazenado[mesEntrada-1][anoEntrada-2011] = true;
		System.out.println("Dados do mês "+ String.format("%02d", mesEntrada) + "/" + anoEntrada + " cadastrados com sucesso!\n");
		return;	
	}
	//Método para calcular a temperatura média do mes
	public static void mediaTemperatura(int mesMedia, int anoMedia) {
		double media = 0;
		
		for (int j = 0; j<(data[mesMedia-1][anoMedia-2011].length); j++){
			media += data[mesMedia-1][anoMedia-2011][j];
		}
		media /= data[mesMedia-1][anoMedia-2011].length;
		System.out.println("A média de temperaturas do mês " + String.format("%02d", mesMedia) + "/" + anoMedia + " é :" + media + "\n");
		return;
		
	}
	//Método para calcular a temperatura mínima do mes
	public static void minimaTemperatura(int mesMinima, int anoMinima) {
		
		double temperaturaMinima = 500;
		
		//Lopp que vai iterar as temperaturas de todos os dias do mes selecionado
		for(int k = 0; k<(data[mesMinima-1][anoMinima-2011].length);k++) {
			//se for o primeiro loop (k = 0) OU se a variável temperaturaMinima for maior que a leitura atual, temperaturaMinima recebe a leitura atual
			if (k == 0 || temperaturaMinima > data[mesMinima-1][anoMinima-2011][k]) {
				temperaturaMinima = data[mesMinima-1][anoMinima-2011][k];
				}
		}
		
		System.out.println("A Temperatúra media mínima registrada em "+ mesMinima + "/" + anoMinima + " foi de: " + temperaturaMinima + "\n");
		return;
		
	}
	//Método para calcular a temperatura máxima do mes
	public static void maximaTemperatura(int mesMaxima, int anoMaxima) {
		
		double temperaturaMaxima = 0;

		//Lopp que vai iterar as temperaturas de todos os dias do mes selecionado
		for(int l = 0; l<(data[mesMaxima-1][anoMaxima-2011].length);l++) {
			if (l == 0 || temperaturaMaxima < data[mesMaxima-1][anoMaxima-2011][l]) {
				temperaturaMaxima = data[mesMaxima-1][anoMaxima-2011][l];
				}
		}
		System.out.println("A Temperatúra media máxima registrada em "+ mesMaxima + "/" + anoMaxima + " foi de: " + temperaturaMaxima + "\n");
		return;
	}
	//Método para emitir um relatório com todas as temperaturas, media, mínima e máxima de determinado mes
	public static void relatorioTemperatura(int mesRelatorio, int anoRelatorio) {
		
		
		System.out.println("Início do Relatório de temperaturas para o mês "+ String.format("%02d", mesRelatorio) + "/" + anoRelatorio + "\n");
		
		for(int m = 0; m<(data[mesRelatorio-1][anoRelatorio-2011].length);m++ ) {
			System.out.println("Temperatura média em " + String.format("%02d", m+1) + "/" + String.format("%02d", mesRelatorio) + "/" + anoRelatorio + " foi de " + data[mesRelatorio-1][anoRelatorio-2011][m]);
		}
		System.out.println("\n");
		ProcessamentoTemperatura.mediaTemperatura(mesRelatorio, anoRelatorio);
		ProcessamentoTemperatura.minimaTemperatura(mesRelatorio, anoRelatorio);
		ProcessamentoTemperatura.maximaTemperatura(mesRelatorio, anoRelatorio);
		System.out.println("Fim do Relatório de temperaturas para o mês "+ String.format("%02d", mesRelatorio) + "/" + anoRelatorio + "\n");
		
		
		return;
	}
	//Método principal main
	public static void main(String[] args) {
		//Dados reais de janeiro de 2020 extraidos de https://www.accuweather.com/pt/br/bras%C3%ADlia/43348/january-weather/43348?year=2020
		data[0][9] = new double[31]; 
		data[0][9][0]  = 23.5; data[0][9][1]  = 24.5; data[0][9][2]  = 24.5; data[0][9][3]  = 23.0; data[0][9][4]  = 21.0;
		data[0][9][5]  = 23.0; data[0][9][6]  = 25.0; data[0][9][7]  = 24.5; data[0][9][8]  = 23.5; data[0][9][9]  = 25.0; 
		data[0][9][10] = 25.5; data[0][9][11] = 25.5; data[0][9][12] = 26.5; data[0][9][13] = 27.5; data[0][9][14] = 26.5; 
		data[0][9][15] = 26.5; data[0][9][16] = 26.0; data[0][9][17] = 24.0; data[0][9][18] = 26.0; data[0][9][19] = 26.0; 
		data[0][9][20] = 25.0; data[0][9][21] = 23.0; data[0][9][22] = 23.5; data[0][9][23] = 23.0; data[0][9][24] = 22.5; 
		data[0][9][25] = 23.5; data[0][9][26] = 24.5; data[0][9][27] = 23.5; data[0][9][28] = 25.0; data[0][9][29] = 26.0; 
		data[0][9][30] = 26.0;
		armazenado[0][9] = true;
		
		int opcaoMenu;
		
		while(true) {
				
			System.out.println("1. Entrada das temperaturas");
			System.out.println("2. Cálculo da temperatura média");
			System.out.println("3. Cálculo da temperatura mínima");
			System.out.println("4. Cálculo da temperatura máxima");
			System.out.println("5. Relatório meteorológico \n");
			System.out.println("Digite o número(1 a 5) correspondente à opção desejada");
			opcaoMenu = ler.nextInt();
			ProcessamentoTemperatura.entradaData(opcaoMenu);	
		}
		// TODO Auto-generated method stub
	}

}
