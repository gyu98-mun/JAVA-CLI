package JavaCLI.TEST;

// AssertJ의 핵심 기능을 가져옴
import static org.assertj.core.api.Assertions.assertThat;

// JUnit 5의 테스트 어노테이션 가져옴
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaCLI.Article;
import java.util.ArrayList;
import java.util.List;

public class ArticleTest_1 {

    @Test // 이 어노테이션이 있어야 JUnit으로 실행 가능
    @DisplayName("게시물 객체가 생성되고 리스트에 순서대로 담기는지 테스트")
    void t1() {
        // 1. Given: 데모 데이터 준비
        Article article_1 = new Article(1, "가", "가가", "2026-02-12");
        Article article_2 = new Article(2, "나", "나나", "2026-02-13");
        Article article_3 = new Article(3, "다", "다다", "2026-02-14");
        Article article_4 = new Article(4, "라", "라라", "2026-02-15");
        
        // 2. When: 리스트 생성 및 데이터 입력
        List<Article> articleList = new ArrayList<>();
        articleList.add(article_1);
        articleList.add(article_2);
        articleList.add(article_3);
        articleList.add(article_4);
        
        // 3. Then: AssertJ를 이용한 논리 검증 
        // 리스트의 크기가 정확히 4개인지 확인
        assertThat(articleList).hasSize(4);
        
        // 특정 객체들이 리스트에 모두 포함되어 있는지 확인
        assertThat(articleList).contains(article_1, article_4);
        
    }
}