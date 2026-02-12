package JavaCLI;

public class Article {
    int id;
    String title;
    String content;
    String regDate;
    
    public Article(int id, String title, String content, String regDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
    }
    
    @Override
	public String toString() { //toString 메소드 오버라이딩
		return id + ":" + title + ":" + content + ":" + regDate;
	}
    
}
