package Project02;

 interface Animal{
	void cry();
	void fly();
	
}

//1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력

class Animal2 {
	Animal tiger = new Tiger();
	
	void abc () {
		tiger.cry();
		tiger.fly();
	}
	
	class Tiger implements Animal {
		@Override
		public void cry() {
			System.out.println("어흥");
			
		}
		@Override
		public void fly() {
			System.out.println("호랑이날아");
			
		}
	}
}

class Animal3 {
	Animal a1 = new Animal() {
		
	@Override
	public void cry() {
		System.out.println("끼이오");	}
	@Override
	public void fly() {
	System.out.println("독수리");}};
	
	void abc() {
		a1.cry();
		a1.fly();
			}
			
		}

class Animal4 {
	void abc (Animal a1) {
		a1.cry();
		a1.fly();
	}
}


public class P_11_29_10 {

	public static void main(String[] args) {
		
		//1.구현한 자식 클래스를 생성후 출력
		
		Animal2 a2 = new Animal2();
		a2.abc();
		System.out.println("============================");
		
		//2. 익명 클래스를 생성후 출력
		
		Animal3 a3 = new Animal3();
		a3.abc();
		
		System.out.println("============================");
		
		//3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력: 참조변수 생성
		Animal4 a4 = new Animal4();
			
		Animal a = new Animal() {
			@Override
			public void cry() {
					System.out.println("토끼는 웁니다.");
				
			}
			@Override
			public void fly() {
				 	System.out.println("토끼는 하늘을 날지 못합니다.");
				}
		};
		
		a4.abc(a);
		
		System.out.println("============================");
		
		a4.abc(new Animal() {
			@Override
			public void cry() {
					System.out.println("토끼는 웁니다.");
				
			}
			@Override
			public void fly() {
				 	System.out.println("토끼는 하늘을 날지 못합니다.");
				}
		});
	}
}
