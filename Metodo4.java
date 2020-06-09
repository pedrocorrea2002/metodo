import java.util.Scanner;


public class Metodo4 {
	public static void main(String[] args){
		int num1=0,num2=0;
		
		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		{while(num1 == 0){	
			try{
			 num1 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor!!");
			}}
		System.out.println("Digite o segundo número");
		{while(num2 == 0){	
			try{
			 num2 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor!!");
			}}
		
		int simbolo = simbolo(0);
		
		if (simbolo == 1){
		System.out.println(num1+num2);}
		else if(simbolo == 2){
		System.out.println(num1-num2);}
		else if(simbolo == 3){
		System.out.println(num1/num2);}
		else if(simbolo == 4){
		System.out.println(num1*num2);}
		
}}}
	public static int simbolo(int simbolo){
		Scanner code = new Scanner(System.in);
		
			do{
				simbolo=0;
			System.out.println("Digite o número da operação que deseja fazer:");
			System.out.println("1 soma");
			System.out.println("2 subtração");
			System.out.println("3 divisão");
			System.out.println("4 multiplicação");
			while(simbolo == 0){	
				try{
				 simbolo = Integer.parseInt(code.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Só números, por favor!!");
				}}}while ((simbolo>=5)&(simbolo<=0));
		return simbolo;
		}}
