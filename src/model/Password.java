package model;

import java.util.Scanner;

public class Password {

	private String login;
	private String password;
	
	public Password(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String loginAndSum(float value1, float value2, Scanner keyboard) {
		if ((this.login.equals("Logica")) && (this.password.equals("javaLogica"))) {
			System.out.println("Login efetuado com sucesso!");
			System.out.println("Soma de valores");
			System.out.println("Digite o valor 1: ");
			value1 = Float.parseFloat(keyboard.nextLine());
			System.out.println("Digite o valor 2: ");
			value2 = Float.parseFloat(keyboard.nextLine());
			float sum = value1 + value2;
			return "A soma dos valores é " + sum;
		} else {
			return "ERRO! login e senha inválidos!!";
		}
	}
	
}
