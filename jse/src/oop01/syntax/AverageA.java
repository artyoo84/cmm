package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	
	public static void main(String[] args) {
		AverageA a = new AverageA();
		a.name = "��ũ";
		a.kor = 80;
		a.eng = 73;
		int tot = a.kor + a.eng;
		double avg = tot/2d; //
		System.out.println("==="+a.name+"�� ����ǥ ===");
		System.out.println("���� : "+a.kor+"��");
		System.out.println("���� : "+a.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"�� ");
		System.out.println("");
		// ���̾� 
		a.name = "���̾�";
		a.kor = 80;
		a.eng = 80;
		tot = a.kor + a.eng;
		avg = tot/2;
		System.out.println("==="+a.name+"�� ����ǥ ===");
		System.out.println("���� : "+a.kor+"��");
		System.out.println("���� : "+a.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"�� ");
		System.out.println("");
		// �丣 
		a.name = "�丣";
		a.kor = 60;
		a.eng = 90;
		tot = a.kor + a.eng;
		avg = tot/2;
		System.out.println("==="+a.name+"�� ����ǥ ===");
		System.out.println("���� : "+a.kor+"��");
		System.out.println("���� : "+a.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"�� ");
		System.out.println("");
	}
}