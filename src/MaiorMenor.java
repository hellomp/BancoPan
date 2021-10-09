
public class MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 3;
		int number2 = 5;
		int number3 = 10;
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("O maior número é: " + number1);
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("O maior número é: " + number2);
		}else {
			System.out.println("O maior número é: " + number3);
		}
		
		if(number1 < number2 && number1 < number3) {
			System.out.println("O menor número é: " + number1);
		}else if(number2 < number1 && number2 < number3) {
			System.out.println("O menor número é: " + number2);
		}else {
			System.out.println("O menor número é: " + number3);
		}
		
	}

}
