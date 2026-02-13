package JavaCLI;

// 명령어가 띄어스기로 들어왔을때 파싱 하는 클래스
// 명령어 예시) detail 1 
public class Rq {
    String cmd;
    
    public Rq(String cmd) {
        this.cmd = cmd;
    }
    
    // 명령어만 추출 (예: "detail 1" → "detail")
    public String getCmd() {
        return cmd.split(" ")[0];
    }
    
    // 파라미터 추출 (예: "detail 1" → 1)
    public int getIntParam(int defaultValue) {
        try {
            return Integer.parseInt(cmd.split(" ")[1]);
        } catch(Exception e) {
            return defaultValue;
        }
    }
}

