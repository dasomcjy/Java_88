package Project01;

class Animal {
	
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
}

class Tiger extends Animal {
	String tigerSound;
	void tigerRun() {
		System.out.println("호랑이는 껑충껑충 달립니다.");
	}
}

class Eagle extends Animal {
	String eaglesSound;
	void eagleFly() {
		System.out.println("독수리는 날라다닙니다.");
	}
}
class Lion extends Animal {
	String lionSound;
	void lionRun() {
		System.out.println("사자는 껑충 달립니다.");
	}
}

class LionChild extends Lion {
	String lionChildSound ;
	void lionChildRun() {
		System.out.println("새끼 사자는 엉금엉금 달립니다.");
	}
}
public class P_11_27_01 {

	public static void main(String[] args) {
		//1. Tiger 객체 생성
		Tiger t1 = new Tiger();
		
		Eagle e1 = new Eagle();
		
		Lion l1 = new Lion();
		
		LionChild lc = new LionChild();
		
		t1.eat();
		t1.tigerRun();
		e1.eat();
		e1.eagleFly();
		l1.eat();
		l1.lionRun();
		lc.eat();
		lc.lionChildRun();
		
		System.out.println("================================");
		
		

	}

}
