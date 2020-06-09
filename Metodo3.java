import java.text.DecimalFormat;
import java.util.Scanner;


public class Metodo3 {
	public static void main(String[] args){
		int num=1,nota=0;
		double media=0;
		
		Scanner code = new Scanner(System.in);	
		DecimalFormat df =  new DecimalFormat("0.00");
		
		do{
			System.out.println("Digite o valor da "+num+"° nota");
		
		{while(nota == 0){	
			try{
			 nota = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor!!");
			}}}
		System.out.println("Você registrou uma nota de R$"+df.format(nota));
	
		media=media+nota;
		nota=0;
		num++;
			
		}while(num!=5);

		System.out.println("A média dos valor das suas notas precisa ser R$7,00!");
		
		if (media==28){
			System.out.println("APROVADO");	
		}
		else{
			System.out.println("REPROVADO");	
		}
}}
