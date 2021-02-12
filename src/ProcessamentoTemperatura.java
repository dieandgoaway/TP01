import java.util.Scanner;
import java.lang.reflect.Field;
public class ProcessamentoTemperatura {	
	public static double[][][] data = new double[12][10][];
	public static void entradaTemperatura(){
		//Declaração da quantidade de dias para cada array de data
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
		System.out.println("Digite o mês que deseja cadastrar(1 a 12):");
		mesEntrada = ler.nextInt();
		System.out.println("Digite o ano de referência (2011 a 2020):");
		anoEntrada = ler.nextInt();
		
		if(mesEntrada<1 || mesEntrada>13) {
			System.out.println("Data Inválida");
			return;
			}else if(anoEntrada<2011 || anoEntrada>2020) {
			System.out.println("Data Inválida");
			return;
		}
		
		for (int i = 0; i<(data[mesEntrada-1][anoEntrada-2011].length); i++){
			System.out.println("Digite a média de temperatura do dia " + String.format("%02d", (i+1)) + "/" + String.format("%02d", mesEntrada) + "/" + anoEntrada);
			data[mesEntrada-1][anoEntrada-2011][i] = ler.nextDouble();
		}
        
		System.out.println("Dados do mês "+ String.format("%02d", mesEntrada) + "/" + anoEntrada + " cadastrados com sucesso!");
		return;
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		int opcaoMenu, mes, ano;
				
		Scanner ler = new Scanner(System.in);
		System.out.println("1. Entrada das temperaturas");
		System.out.println("2. Cálculo da temperatura média");
		System.out.println("3. Cálculo da temperatura mínima");
		System.out.println("4. Cálculo da temperatura máxima");
		System.out.println("5. Relatório meteorológico \n");
		System.out.println("Digite o número(1 a 5) correspondente à opção desejada");
		
		
		opcaoMenu = ler.nextInt();
		switch (opcaoMenu) {
		case 1:
			ProcessamentoTemperatura.entradaTemperatura();
			break;
			
		case 2: 
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
