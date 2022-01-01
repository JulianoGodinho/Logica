package view;

import java.util.Scanner;
import model.EvenOdd;
import model.BiggerSmaller;
import model.Password;
import model.SchoolAverage;

public class ConsoleLogicJava {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);

		byte option = -1;
		int number;
		float number1 = 0;
		float number2 = 0;
		float number3 = 0;
		String login;
		String password;
		short absent;

		while (option != 0) {
			System.out.println("******************************************");
			System.out.println("BEM VINDO AO ESTUDO DE L�GICA COM JAVA!");
			System.out.println("Escolha um exemplo a baixo \n");
			System.out.println("0- Encerrar o programa");
			System.out.println("1- Exemplo de n�mero par ou �mpar");
			System.out.println("2- Exemplo comparando dois n�meros");
			System.out.println("3- Exemplo login e senha");
			System.out.println("4- Exemplo m�dia");
			System.out.println("5- Exemplo comparando 3 n�meros");
			option = Byte.parseByte(keyboard.nextLine());
			System.out.println("******************************************");

			switch (option) {
			case 0:
				System.out.println("Volte sempre!!!");
				break;
			case 1:
				System.out.println("Exemplo de n�mero par ou �mpar");
				System.out.println("Digite o n�mero: ");
				number = Integer.parseInt(keyboard.nextLine());
				
				EvenOdd e1 = new EvenOdd(number);
				System.out.println(e1.evenOrOdd());
				break;
			case 2:
				System.out.println("Exemplo n�mero maior e menor");
				System.out.println("Digite o primeiro n�mero: ");
				number1 = Float.parseFloat(keyboard.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				number2 = Float.parseFloat(keyboard.nextLine());
				
				BiggerSmaller b1 = new BiggerSmaller(number1, number2);
				System.out.println(b1.bigger());
				System.out.println(b1.smaller());
				break;
			case 3:
				System.out.println("Exemplo Login e senha");
				System.out.println("login: Logica, senha: javaLogica");
				System.out.println("Digite o login: ");
				login = keyboard.nextLine();
				System.out.println("Digite a senha: ");
				password = keyboard.nextLine();
				
				Password p1 = new Password(login, password);
				System.out.println(p1.loginAndSum(number1, number2, keyboard));	
				break;
			case 4:
				System.out.println("Exemplo nota m�dia");
				System.out.println("Digite a mat�ria: ");
				login = keyboard.nextLine();
				System.out.println("Digite a nota 1: ");
				number1 = Float.parseFloat(keyboard.nextLine());
				System.out.println("Digite a nota 2: ");
				number2 = Float.parseFloat(keyboard.nextLine());
				System.out.println("Informe o n�mero de faltas: ");
				absent = Short.parseShort(keyboard.nextLine());
				
				SchoolAverage s1 = new SchoolAverage(login, number1, number2, absent);
				s1.verifyAverage();
				System.out.println(s1.verifyApprovals());
				break;
			case 5: 
				System.out.println("Exemplo comparando tr�s n�meros!");
				System.out.println("Digite o primeiro n�mero: ");
				number1 = Float.parseFloat(keyboard.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				number2 = Float.parseFloat(keyboard.nextLine());
				System.out.println("Digite o terceiro n�mero: ");
				number3 = Float.parseFloat(keyboard.nextLine());
				
				BiggerSmaller b2 = new BiggerSmaller(number1, number2, number3);
				System.out.println(b2.biggerWithThreeNumbers());
				System.out.println(b2.smallerWithThreeNumbers());
				break;
			default:
				System.out.println("Op��o inv�lida!!");
				break;
			}
		}
		
	}

}
