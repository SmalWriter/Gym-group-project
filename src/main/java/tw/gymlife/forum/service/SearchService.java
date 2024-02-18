package tw.gymlife.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.gymlife.forum.model.ArticleBean;
import tw.gymlife.forum.model.CommentBean;
import tw.gymlife.forum.repository.elasticsearch.ArticleSearchRepository;
import tw.gymlife.forum.repository.elasticsearch.CommentSearchRepository;

@Service
public class SearchService {
    
    private final ArticleSearchRepository articleSearchRepository;
    private final CommentSearchRepository commentSearchRepository;

    @Autowired
    public SearchService(ArticleSearchRepository articleSearchRepository, CommentSearchRepository commentSearchRepository) {
        this.articleSearchRepository = articleSearchRepository;
        this.commentSearchRepository = commentSearchRepository;
    }

    // 修改此方法以匹配ArticleSearchRepository中的方法签名
    public List<ArticleBean> searchArticles(String keyword) {
        return articleSearchRepository.findByArticleTitleContainingOrArticleContentContaining(keyword, keyword);
    }

    // 这个方法看起来是正确的
    public List<CommentBean> searchComments(String keyword) {
        return commentSearchRepository.findByDocumentTypeAndCommentContentContaining("comment", keyword);
    }
}
