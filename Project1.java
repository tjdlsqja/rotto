package Lottoprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 6개를 입력하세요");

		int[] mynum = new int[6];

		for (int i = 0; i < mynum.length; i++) {
			mynum[i] = in.nextInt();
			if (mynum[i] > 45 || mynum[i] < 0) {
			
				System.out.println("숫자를 다시 입력하세요 0~45사이의 숫자만 입력가능");
				i--;
			}
			for (int j = 0; j < i; j++) {
				if (mynum[i] == mynum[j]) {
				
					System.out.println("중복숫자를 입력하였습니다.");
					i--;
				}
			}

		}
		
		Arrays.sort(mynum);

		
		System.out.print("나의 번호 ");
		for (int i = 0; i < 6; i++) {
			System.out.print(mynum[i] + " ");
		}
		System.out.println();

		
		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				
				if (lotto[i] == lotto[j]) {
					i--;
					break;
					
				}

			}

		}
		
		Arrays.sort(lotto);
		
		System.out.print("복권 당첨 번호 ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		int cont = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (mynum[i] == lotto[j]) {
					cont++;
				}
			}
		}

		switch (cont) {
		case 6: {
			System.out.println("1등 당첨입니다.");
		}
		case 5: {
			System.out.println("2등 당첨입니다.");
		}
		case 4: {
			System.out.println("3등 당첨입니다");
		}
		case 3: {
			System.out.println("4등 당첨입니다");
		}
		default: {
			System.out.println("낙첨 입니다");
		}

		}

		System.out.println("맞은 갯수:" + cont);

	}
}

		