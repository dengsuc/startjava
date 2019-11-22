public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		int num = 20;
		boolean isMan = true;
		double height = 1.60d;
		double heightt = 1.80d; 
		char symbol = 'M';
		char symb = 'I';
		char firstName = 'M';

		if(age > num) {
			System.out.println("Вы проходите по возрасту");
		}

		if(isMan == true) {
			System.out.println("Это мужской пол");
		}

		if(isMan == false) {
			System.out.println("Это женский пол");
		}

		if(height < heightt) {
			System.out.println("Вы слишком малы ростом");
		} else {
			System.out.println("Рост подходящий");
		}

		if(firstName == symbol) {
			System.out.println("Первая буква имени верная");
		} else if(firstName == symb) {
			System.out.println("Первая буква имени неверная");
		} else {
			System.out.println("Неверный ответ");
		}
	}
}