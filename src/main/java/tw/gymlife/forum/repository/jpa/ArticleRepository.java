package tw.gymlife.forum.repository.jpa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tw.gymlife.forum.model.ArticleBean;

public interface ArticleRepository extends JpaRepository<ArticleBean, Integer> {

	List<ArticleBean> findByStatus(String status);
//	
    List<ArticleBean> findByArticleTypeAndStatus(String articleType, String status);
    
    Page<ArticleBean> findByArticleTypeAndStatus(String articleType, String status, Pageable pageable);
    
    List<ArticleBean> findAllByMemberUserId(int userId);
    
    Page<ArticleBean> findByMemberUserId(int userId, Pageable pageable);
    
    ArticleBean findByMemberUserIdAndArticleId(int userId, int articleId);
    
    //以下是論壇首頁的篩選器
    Page<ArticleBean> findByStatus(String status, Pageable pageable);

    Page<ArticleBean> findByStatusOrderByViewCountDesc(String status, Pageable pageable);

    Page<ArticleBean> findByStatusOrderByLikeCountDesc(String status, Pageable pageable);

    Page<ArticleBean> findByStatusOrderByArticleTimeDesc(String status, Pageable pageable);

    Page<ArticleBean> findByStatusOrderByArticleTimeAsc(String status, Pageable pageable);

    //模糊查詢
 // 使用LIKE实现模糊搜索
    @Query("SELECT a FROM ArticleBean a WHERE a.articleTitle LIKE %?1% OR a.articleContent LIKE %?1%")
    List<ArticleBean> findByArticleTitleContainingOrArticleContentContaining(String keyword);

}
