package JavaCLI;

import java.time.LocalDate;

// Article 클래스
public class Article {
    private int id;
    private String title;
    private String content;
    private String regDate;
    
    // 생성자
    public Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.regDate = LocalDate.now().toString(); // 자동으로 현재 날짜 들어가게 구현
    }
    
    // Getter 메서드
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getContent() {
        return content;
    }
    
    public String getRegDate() {
        return regDate;
    }
    
    // Setter 메서드 (update에서 필요)
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
	public String toString() { //toString 메소드 오버라이딩
		return id + "|" + title + "|" + content + "|" + regDate;
	}
    
    
    
}
