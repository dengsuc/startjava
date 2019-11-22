public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if(age > 20) {
			System.out.println("Вы проходите по возрасту");
		}

		boolean isMan = true;
		if(isMan == true) {
			System.out.println("Это мужской пол");
		}
		if(isMan == false) {
			System.out.println("Это женский пол");
		}

		double height = 1.70d; 
		if(height < 1.80) {
			System.out.println("Вы слишком малы ростом");
		} else {
			System.out.println("Рост подходящий");
		}

		char symbol = 'M';
		char symb = 'I';
		char firstName = 'M';
		if(firstName == symbol) {
			System.out.println("Первая буква имени верная");
		} else if(firstName == symb) {
			System.out.println("Первая буква имени неверная");
		} else {
			System.out.println("Неверный ответ");
		}
	}
}