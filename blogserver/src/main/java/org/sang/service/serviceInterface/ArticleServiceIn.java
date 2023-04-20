package org.sang.service.serviceInterface;

import org.sang.bean.Article;

import java.util.List;

public interface ArticleServiceIn {
    public int addNewArticle(Article article);
    public String stripHtml(String content);

    public List<Article> getArticleByState(Integer state, Integer page, Integer count, String keywords);

    public int getArticleCountByState(Integer state, Long uid,String keywords);
    public int updateArticleState(Long[] aids, Integer state);

    public int restoreArticle(Integer articleId);
    public Article getArticleById(Long aid);
    public void pvStatisticsPerDay();
    public List<String> getCategories();

    public List<Integer> getDataStatistics();
}
