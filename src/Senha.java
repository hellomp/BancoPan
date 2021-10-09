import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		int senha = 1234;
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senhaUsuario = scanner.nextInt();
		scanner.close();
		
		if(senhaUsuario == senha)
			System.out.println("ACESSO PERMITIDO");
		else
			System.out.println("ACESSO NEGADO");
	}

}
