package Day15;

class Animal {
	private String name; //이름
	private String category; //종
	
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	//printInfo()
	public void printInfo() {
		System.out.println("-------------");
		System.out.println("이름 :"+name);
		System.out.println("분류 :"+category);
	}
	//울음소리 howl()
	public void howl() {
		System.out.println("=="+name+" 울음소리"+"==");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

class Dog extends Animal {
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal {
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹");
	}
	
	
}

class Tiger extends Animal {
	public Tiger(String name, String category) {
		super(name, category);
		
	}
	
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
	
}

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의 하는 것
		 * - 부모클래스의 메서드와 선언부가 일치해야 한다.
		 * - 접근제한자도 더 넓은 범위는 가능 => 접근제한자의 축소는 안됨.
		 * */
		Dog d = new Dog();
		d.printInfo();
		d.howl();
		d.setName("뽀삐");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("나비", "고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("랑이", "고양이과");
		t.printInfo();
		t.howl();
	}

}

