public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if(age > 20) {
			System.out.println("Вы проходите по возрасту");
		}

		boolean isMan = true;
		if(isMan) {
			System.out.println("Это мужской пол");
		}
		if(!isMan == false) {
			System.out.println("Это женский пол");
		}

		double height = 1.70d; 
		if(height < 1.80) {
			System.out.println("Вы слишком малы ростом");
		} else {
			System.out.println("Рост подходящий");
		}

		char firstLetterOfName = 'M';
		if(firstLetterOfName == 'M') {
			System.out.println("Первая буква имени М");
		} else if(firstLetterOfName == 'I') {
			System.out.println("Это не первая буква имени");
		} else {
			System.out.println("Неверный ответ");
		}
	}
}