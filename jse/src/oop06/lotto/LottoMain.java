package oop06.lotto;

import java.util.Scanner;

import javax.swing.text.SimpleAttributeSet;

public class LottoMain {
	public static void main(String[] args) {
		System.out.println("������ �� �� �� �� ������");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("��ġ�� �����մϱ�?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		lotto.extractLottos(money);
		System.out.println("�ζǹ�ȣ ���");
		lotto.printLotto();
		
	}
}