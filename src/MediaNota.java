
public class MediaNota {

	public static void main(String[] args) {
		float nota1 = 5.2f;
		float nota2 = 9.3f;
		float media = (nota1 + nota2)/2;
		
		if(media >= 7)
			System.out.println("Aprovado");
		else if(media < 7)
			System.out.println("Reprovado");
	}

}
