//package tw.gymlife.forum.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import tw.gymlife.forum.model.ArticleEs;
//import tw.gymlife.forum.service.ArticleEsService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/articles")
//public class ArticleEsController {
//
//    private final ArticleEsService articleEsService;
//
//    @Autowired
//    public ArticleEsController(ArticleEsService articleEsService) {
//        this.articleEsService = articleEsService;
//    }
//
//    @GetMapping("/search")
//    public List<ArticleEs> searchArticles(@RequestParam("text") String text) {
//        return articleEsService.searchByTitleContentAndComments(text);
//    }
//}
