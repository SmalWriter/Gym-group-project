package tw.gymlife.forum.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.gymlife.forum.model.ArticleLike;

public interface ArticleLikeRepository extends JpaRepository<ArticleLike, Integer> {

	// ArticleLike findByUserIdAndArticleId(Integer userId, Integer articleId);

	//ArticleLike findByMemberAndArticle(Member member, ArticleBean article);

	ArticleLike findByMemberUserIdAndArticleArticleId(Integer userId, Integer articleId);

	List<ArticleLike> findByArticleArticleId(Integer articleId);

}
