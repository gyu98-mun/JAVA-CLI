package JavaCLI.TEST;

import JavaCLI.Article;
import java.util.List;
import java.util.ArrayList;

public class ArticleTest_1 {
    public static void main(String[] args) {
        // 데모 DATA 선언
        Article article_1 = new Article(1, "가", "가가");
        Article article_2 = new Article(2, "나", "나나");
        Article article_3 = new Article(3, "다", "다다");
        Article article_4 = new Article(4, "라", "라라");
        
        // article 리스트 생성 및 데모 DATA 입력
        List<Article> articleList = new ArrayList<>();
        articleList.add(article_1);
        articleList.add(article_2);
        articleList.add(article_3);
        articleList.add(article_4);
        
        // DATA 출력 테스트
        System.out.println("====== DATA 출력 테스트 ======");
        for(Article a : articleList) {
            System.out.println(a);
        }
    }
}