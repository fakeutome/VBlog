package org.sang.controller.admin;

import org.sang.bean.Article;
import org.sang.bean.RespBean;
import org.sang.controller.controllerIn.AdminControllerIn;
import org.sang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 超级管理员专属Controller
 */
@RestController
@RequestMapping("/admin")//接受来自网络端到/admin的访问
public class AdminController implements AdminControllerIn {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/article/all", method = RequestMethod.GET)//admin/article/all
    public Map<String, Object> getArticleByStateByAdmin(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "count", defaultValue = "6") Integer count, String keywords) {
        List<Article> articles = articleService.getArticleByState(-2, page, count, keywords);
        Map<String, Object> map = new HashMap<>();
        map.put("articles", articles);
        map.put("totalCount", articleService.getArticleCountByState(1, null, keywords));
        return map;
    }//调用articleservice接口

    @RequestMapping(value = "/article/dustbin", method = RequestMethod.PUT)
    public RespBean updateArticleState(Long[] aids, Integer state) {
        if (articleService.updateArticleState(aids, state) == aids.length) {
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }
}
