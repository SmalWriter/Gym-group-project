//package tw.gymlife.forum.repository.elasticsearch;
//
//import java.util.List;
//
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import tw.gymlife.forum.model.ArticleBean;
//import tw.gymlife.forum.model.ArticleEs;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ArticleSearchRepository extends ElasticsearchRepository<ArticleEs, String> {
//    List<ArticleEs> findByArticleTitleContainingOrArticleContentContaining(String title, String content);
//}
