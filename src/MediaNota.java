import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		scan.close();
		
		double media = (nota1 + nota2)/2;
		
		if(media == 10)
			System.out.println("Aprovado com Distin��o");
		if(media >= 7 && media < 10)
			System.out.println("Aprovado");
		else if(media < 7)
			System.out.println("Reprovado");
	}

}
