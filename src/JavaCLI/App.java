package JavaCLI;

import java.util.ArrayList;
import java.util.Scanner;

// 메인 로직 클래스
public class App {
	// ArrayList 정의
	ArrayList<Article> articles = new ArrayList<>();
	// 사용자 명령어 받는곳 정의
	Scanner sc = new Scanner ( System.in );
	
	// 프로그램 시작
	public void run() {
		System.out.println("==게시판 프로그램 시작==");
		
		// 명령어 받는 Loop
		while(true) {

			// 사용자 명령어 받기
			System.out.print("명령어를 입력하세요 : ");
			String input = sc.nextLine();
			
	        Rq rq = new Rq(input);
	        String cmd = rq.getCmd();
			
			// 명령어 받아 처리 하는 곳
			if (cmd.equals("exit")) {
				break;
			} else if (cmd.equals("write")) {
				write();
	        } else if (cmd.equals("list")) {
	        	list();
	        } else if (cmd.equals("detail")) {
	        	detail(rq.getIntParam(0));
	        } else if (cmd.equals("update")) {
	        	update(rq.getIntParam(0));
	        } else if (cmd.equals("delete")) {
	        	delete(rq.getIntParam(0));
	        } else { // 없는 명령어 입력시 답변
	            System.out.println("존재하지 않는 명령어입니다.");
	        }
			
		}
	}
	
	// 진짜 메소드들 구현은 여기에
	void write() {
	 // TODO: A
	}

	void list() {
	 // TODO: A
	}

	void detail(int id) {
	 // TODO: B
	}

	void update(int id) {
	 // TODO: C
	}

	void delete(int id) {
	 // TODO: D
	}

	// Article 에 저장된 것을 id로 찾아오는 함수 구현
	Article findById(int id) {
	    for(Article a : articles) {
	        if(a.getId() == id) return a; 
	    }
	    return null;
	}
}


