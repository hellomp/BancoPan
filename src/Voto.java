
public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		
		if(age >= 18) 
			System.out.println("Voc� deve votar");
		else if(age <= 17 && age >= 16)
			System.out.println("Voc� pode votar se quiser");
		else
			System.out.println("Voc� n�o pode votar");
		
	}

}
