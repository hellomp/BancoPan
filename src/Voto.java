
public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		
		if(age >= 18) 
			System.out.println("Você deve votar");
		else if(age <= 17 && age >= 16)
			System.out.println("Você pode votar se quiser");
		else
			System.out.println("Você não pode votar");
		
	}

}
