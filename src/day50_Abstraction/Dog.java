package day50_Abstraction;

public class Dog extends Animal {

	public Dog(char gender, byte age, String color, String nickname) {
		super(gender, age, color, nickname);
		
	}

	@Override
	public void speak(String language) {
		System.out.println(nickname +" speacks "+language);
	}

	@Override
	public void eat(String food) {
	System.out.println(nickname+" eats "+food);
	}
	
    @Override
	public void sleep(int hour) {
		System.out.println(nickname+" sleeps "+ hour + " hours a day");
	}

	@Override
	public void drink(String drink) {
		System.out.println(nickname+" drinks "+drink);
	}

	

}

