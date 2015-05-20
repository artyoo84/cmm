package oop03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		// 일반적인 객체생성
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		// 부모 타입 = new 자식타입
		Aclass a2 = new Bclass();
		// Aclass 타입 a2 객체 는 Bclass()를 가져다 쓴다. 
		
		Aclass aaa = new Aclass();
	  //Bclass a3 = new Aclass();
		
		// 오버라이딩시 자식클래스 메소드 우선 출력
		a2.over(1);
		// 오버라이딩 하지 않으면 부모클래스 우선 호출
		a2.noOver(1);
		
		// 부모클래스 타입을 자식클래스로 강제 형변환
		Bclass b2 = (Bclass) a2;
		b2.over(1);
		b2.noOver("AAA");
	}
}

class Aclass {
	void over(int i) {
		System.out.println("Aclass-over() :" + (i * 10));
	}

	void noOver(int i) {
		System.out.println("Aclass-noOver() :" + i);
	}

}

class Bclass extends Aclass{
	
	public Bclass() {
		super();
	}
	
	void over(int i) {
		System.out.println("Bclass-over() :" + (i * 10000));
	}

	void noOver(String s) {
		System.out.println("Bclass-noOver() :" + s);
	}

	void onlyB() {
		System.out.println("onlyB()");
	}
}
