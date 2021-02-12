import java.util.Scanner;
import java.lang.reflect.Field;
public class ProcessamentoTemperatura {

	
	/* Declaração das variáveis relativas a cada um dos meses dentro do intervalo de interesse
	   public para que seja acessada por todos os métodos
	 */
	public double[] jan2011 = new double[31], fev2011 = new double[28], mar2011 = new double[31], abr2011 = new double[30],
			 mai2011 = new double[31], jun2011 = new double[30], jul2011 = new double[31], ago2011 = new double[31], 
			 set2011 = new double[30], out2011 = new double[31], nov2011 = new double[30], dez2011 = new double[31], 
			 jan2012 = new double[31], fev2012 = new double[29], mar2012 = new double[31], abr2012 = new double[30], 
			 mai2012 = new double[31], jun2012 = new double[30], jul2012 = new double[31], ago2012 = new double[31], 
			 set2012 = new double[30], out2012 = new double[31], nov2012 = new double[30], dez2012 = new double[31],
			 jan2013 = new double[31], fev2013 = new double[28], mar2013 = new double[31], abr2013 = new double[30], 
			 mai2013 = new double[31], jun2013 = new double[30], jul2013 = new double[31], ago2013 = new double[31], 
			 set2013 = new double[30], out2013 = new double[31], nov2013 = new double[30], dez2013 = new double[31],
			 jan2014 = new double[31], fev2014 = new double[28], mar2014 = new double[31], abr2014 = new double[30], 
			 mai2014 = new double[31], jun2014 = new double[30], jul2014 = new double[31], ago2014 = new double[31], 
			 set2014 = new double[30], out2014 = new double[31], nov2014 = new double[30], dez2014 = new double[31],
			 jan2015 = new double[31], fev2015 = new double[28], mar2015 = new double[31], abr2015 = new double[30], 
			 mai2015 = new double[31], jun2015 = new double[30], jul2015 = new double[31], ago2015 = new double[31], 
			 set2015 = new double[30], out2015 = new double[31], nov2015 = new double[30], dez2015 = new double[31],
			 jan2016 = new double[31], fev2016 = new double[29], mar2016 = new double[31], abr2016 = new double[30], 
			 mai2016 = new double[31], jun2016 = new double[30], jul2016 = new double[31], ago2016 = new double[31], 
			 set2016 = new double[30], out2016 = new double[31], nov2016 = new double[30], dez2016 = new double[31],
			 jan2017 = new double[31], fev2017 = new double[28], mar2017 = new double[31], abr2017 = new double[30], 
			 mai2017 = new double[31], jun2017 = new double[30], jul2017 = new double[31], ago2017 = new double[31], 
			 set2017 = new double[30], out2017 = new double[31], nov2017 = new double[30], dez2017 = new double[31],
			 jan2018 = new double[31], fev2018 = new double[28], mar2018 = new double[31], abr2018 = new double[30], 
			 mai2018 = new double[31], jun2018 = new double[30], jul2018 = new double[31], ago2018 = new double[31], 
			 set2018 = new double[30], out2018 = new double[31], nov2018 = new double[30], dez2018 = new double[31],
			 jan2019 = new double[31], fev2019 = new double[28], mar2019 = new double[31], abr2019 = new double[30], 
			 mai2019 = new double[31], jun2019 = new double[30], jul2019 = new double[31], ago2019 = new double[31], 
			 set2019 = new double[30], out2019 = new double[31], nov2019 = new double[30], dez2019 = new double[31],
			 jan2020 = new double[31], fev2020 = new double[29], mar2020 = new double[31], abr2020 = new double[30], 
			 mai2020 = new double[31], jun2020 = new double[30], jul2020 = new double[31], ago2020 = new double[31], 
			 set2020 = new double[30], out2020 = new double[31], nov2020 = new double[30], dez2020 = new double[31];
	public static void entradaTemperatura(){
		String[] prefixo = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
		int mesEntrada;
		int anoEntrada;
		String oi = "jan2013";
		
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
		
		ProcessamentoTemperatura s1 = new ProcessamentoTemperatura();
        //Field[]  f1 = s1.getClass().getDeclaredFields();
        Field f1 = s1.getClass().getField("jan2020");
        
		
		
		
		
		
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
		
		
		
		
		// TODO Auto-generated method stub

	}

}
