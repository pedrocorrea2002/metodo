import java.util.Scanner;


public class Metodo1 {
	public static void main(String[] args){
		int X=0,Y=0;
		
		Scanner code = new Scanner(System.in);	
		
		System.out.println("Digite um valor para X");
		{while(X == 0){	
			try{
			 X = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor!!");
			}}

		System.out.println("Digite um valor para Y");
		{while(Y == 0){	
			try{
			 Y = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números maiores que "+X+" ,por favor!!");
			}}
		
		int multiplicacao = multiplicacao(X,Y);
		
		System.out.println("A multiplicação entre "+X+" e "+Y+" é igual a "+multiplicacao);
}}}
	public static int multiplicacao(int X,int Y){
	
		return (X*Y);
}}