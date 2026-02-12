package JavaCLI.TEST;

import JavaCLI.Article ;
import java.util.ArrayList;
import java.util.List;

// Article 생성 Test
public class ArticleTest_1{
	public static void main (String[] args) {
		// 데모 DATA 선언
		Article article_1 = new Article(1, "가", "가가", "2026-02-12");
		Article article_2 = new Article(2, "나", "나나", "2026-02-13");
		Article article_3 = new Article(3, "다", "다다", "2026-02-14");
		Article article_4 = new Article(4, "라", "라라", "2026-02-15");
		
		// article 리스트 생성 및 데모 DATA 입력
		List<Article> articleList = new ArrayList<>();
		articleList.add(article_1);
		articleList.add(article_2);
		articleList.add(article_3);
		articleList.add(article_4);
		
		System.out.println(articleList);
		
	}
}
