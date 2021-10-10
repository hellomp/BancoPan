import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade:");
		int age = scan.nextInt();
		scan.close();
		
		if(age >= 18) 
			System.out.println("Você deve votar");
		else if(age <= 17 && age >= 16)
			System.out.println("Você pode votar se quiser");
		else
			System.out.println("Você não pode votar");
		
	}

}
