package tw.gymlife.forum.repository.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import tw.gymlife.forum.model.ArticleBean;

public interface ArticleSearchRepository extends ElasticsearchRepository<ArticleBean, Integer> {
    List<ArticleBean> findByArticleTitleContainingOrArticleContentContaining(String title, String content);
}
