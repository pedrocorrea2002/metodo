import java.util.Scanner;


public class Metodo2 {
	public static void main(String[] args){
		int X=0,Y=0,soma=0;
		
		Scanner code = new Scanner(System.in);	
		
		System.out.println("Digite um valor para X");
		{while(X == 0){	
			try{
			 X = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor!!");
			}}

		System.out.println("Digite um valor para Y");
		{while((Y == 0)|(Y<X)){	
			try{
			 Y = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números maiores que "+X+" ,por favor!!");
			}}
		
		soma = somas(soma,X,Y);
		
		System.out.println("A soma de todos os números entre "+X+" e "+Y+" é igual a "+(soma+Y));
}}}
	
	public static int somas(int soma,int X,int Y){
		
		for(int num=X;num!=Y;num++){
			soma=soma+num;
		}
		return soma;
	}
}