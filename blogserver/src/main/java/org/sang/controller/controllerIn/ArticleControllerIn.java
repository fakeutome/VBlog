package org.sang.controller.controllerIn;

import org.sang.bean.Article;
import org.sang.bean.RespBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ArticleControllerIn {
    public RespBean addNewArticle(Article article);
    public RespBean uploadImg(HttpServletRequest req, MultipartFile image);
    public Map<String, Object> getArticleByState(@RequestParam(value = "state", defaultValue = "-1") Integer state, @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "count", defaultValue = "6") Integer count, String keywords);
    public Article getArticleById(@PathVariable Long aid);
    public RespBean updateArticleState(Long[] aids, Integer state);
    public RespBean restoreArticle(Integer articleId);
    public Map<String,Object> dataStatistics();
}
