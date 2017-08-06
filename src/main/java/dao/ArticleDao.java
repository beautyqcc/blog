package dao;

import domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by li on 17-8-6.
 */
public interface ArticleDao extends JpaRepository<Article,Integer>{
}
