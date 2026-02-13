package JavaCLI.TEST;

import JavaCLI.Rq;

public class RqTest {
    public static void main(String[] args) {
        // 테스트 데이터
        String[] testInputs = {
            "write",        // 파라미터 없음
            "list",         // 파라미터 없음
            "detail 1",     // 파라미터: 1
            "update 5",     // 파라미터: 5
            "delete 10",    // 파라미터: 10
            "detail abc",   // 잘못된 입력
            "exit"          // 파라미터 없음
        };
        
        System.out.println("입력 | 명령어 | 파라미터");
        System.out.println("--------------------------------");
        
        for(String input : testInputs) {
            Rq rq = new Rq(input);
            String cmd = rq.getCmd();
            int param = rq.getIntParam(0);
            
            String paramStr = (cmd.equals("write") || cmd.equals("list") || cmd.equals("exit")) 
                ? "불필요" 
                : String.valueOf(param);
            
            System.out.println(input + " → " + cmd + " | " + paramStr);
        }
    }
}
