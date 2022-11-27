package Project01;

import java.util.Objects;

class C {
	
	String stuID ;
	String name ;
	int age ;
	
	// c1.equals(c2) // stuID필드를 재정의 해서 stuID가 같으면 true, 아니면 false
	C() {}
	
	public C (String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((C)obj).stuID) {
			return true;
		}else {
			return false;
		}
	}
}

public class P_11_26_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
