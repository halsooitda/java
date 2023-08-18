package Day17;

/* 객체지향프로그램의 4가지 특징
 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임.
 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리
 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
 * 
 * - 추상화(Abstraction) - 핵심적인 코드만 보여주기 / 인터페이스-목차
 *  - 인터페이스와 구현은 분리한다.
 *  - 불필요한 부분은 숨긴다.
 *  
 * - 캡슐화(encapsulation) - 데이터 보호(정보은닉)
 *  - 멤버변수(필드)는 숨기고 메서드로 접근
 *  - 멤버변수와 메서드를 하나로 묶는 것
 *  - 은닉화 : 객체의 내부의 정보는 숨겨 외부로 드러나지 않게 함.
 *                외부에서 데이터를 직접 접근하는 것을 방지
 * 
 * - 상속(inheritance) - 코드 재사용(확장)
 *  - 클래스를 상속받아 수정하여 사용하면 중복 코드를 줄일 수 있음.
 *  - 유지보수가 편함.
 *  
 * - 다형성(polymorphism) - 객체 형변환 용이
 *  - 하나의 코드가 여러 자료(객체)형으로 구현되어 실행되는 것
 *  - 코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
 *  - 다형성을 잘 활용하면 유연하고, 확장성있는, 유지보수가 편리한 프로그램을 만들 수 있음.
 * */

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() { // super method, 조상 상속받은 거
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void readBook() { // this method
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리는 날 수 있습니다.");
	}
	
}

class Dog { // Animal 상속X
	public void move() {
		System.out.println("강아지가 귀엽게 걷습니다.");
	}
}
//----------------------------------------------------
public class 다형성01 {

	public static void main(String[] args) {
		//클래스명 객체명 = new 생성자(매개변수);
		Animal hAnimal = new Human(); // 조상의 클래스로 자식의 객체 생성 가능 => 다형성
		//Human a = new Animal(); // 불가능
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		hAnimal.move();
		tAnimal.move();
		eAnimal.move();
		// 조상에서 제공하는 값만 자식이 구현해서 사용하는 형태, 자식거는 못 씀
		//hAnimal.readBook(); // 사용 불가능
		
		System.out.println("------------");
		Human h = new Human(); // 클래스를 기반으로 객체 생성, 클래스가 제공하는 것만 사용 가능
		h.readBook();
		
		System.out.println("------------");
		다형성01 test = new 다형성01();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(h); // 업케스팅. 객체 형변환이 자동으로 이루어져 출력 가능. 자손->조상
		
		Dog d = new Dog();
		//test.moveAnimal(d); // Animal을 상속받은 객체가 아니기 때문에 불가능
		
		System.out.println("--------------");
		Animal[] aniList = new Animal[5]; 
		int cnt = 0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;
		
		for(int i=0; i<cnt; i++) { 
			aniList[i].move(); // 한번에 모두 호출 가능
		}
		
		System.out.println("--------------");
		// Human을 담을 수 있는 자료형객체에 = Human 클래스의 객체를 담은 것.
		Human human = h; 
		human.readBook();
		// Human hu = hAnimal; // hAnimal은 Animal클래스를 기반으로 만들었기 때문에 Human하고 형이 안 맞음
		Human hu = (Human)hAnimal; // 다운 케스팅(형변환)
		//Human hu = (Human)tAnimal; // 작성시는 에러 안 나고 실행하면 에러남.
		
		System.out.println("---------------");
		// instanceof : 객체가 해당 클래스의 형이 맞는지 체크하는 연산자, (객체 instanceof 클래스)
		Animal downCastingTest = tAnimal; // hAnimal, eAnimal
		if(downCastingTest instanceof Human) { 
			Human hum = (Human)downCastingTest; // 다운 케스팅
			hum.readBook();
		}else if(downCastingTest instanceof Tiger) {
			Tiger ti = (Tiger)downCastingTest; // 다운 케스팅
			ti.hunting();
		}else if(downCastingTest instanceof Eagle) {
			Eagle ea = (Eagle)downCastingTest; // 다운 케스팅
			ea.flying();
		}else {
			System.out.println("error");
		}
		
	} 
	
	// 다형성의 예 (업케스팅:자동형변환)
	public void moveAnimal(Animal animal) { // 매개변수로 애니멀 객체를 받아서 무브를 호출
		animal.move(); // => 상위 클래스(Animal)로 무브를 다 처리하기 위해서 다형성을 이용
	}
	

}
