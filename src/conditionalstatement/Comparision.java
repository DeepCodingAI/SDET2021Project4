package conditionalstatement;

public class Comparision {

	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 200;
		if(num1>num2) {
			System.out.println("num1 "+ num1+" which is greater than num2 "+ num2);
		}else if(num1<num2){
			System.out.println("num1 "+ num1+" which is less than num2 "+ num2);
		}else if(num1 == num2) {
			System.out.println("num1 "+ num1+" is equal to num2 "+ num2);
		}

	}

}
