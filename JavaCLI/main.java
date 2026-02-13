package JavaCLI;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("안녕하세요 게시판 프로그램 입니다.");
		
		Scanner input = new Scanner ( System.in );
		while(true) {
			System.out.print("명령어를 입력하세요 : ");
			String cmd = input.next();
			if (cmd.equals("exit")) {
				return;
			}
		}
	}

}
