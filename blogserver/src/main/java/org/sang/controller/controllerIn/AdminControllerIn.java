package org.sang.controller.controllerIn;

import org.sang.bean.RespBean;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface AdminControllerIn {
    public Map<String, Object> getArticleByStateByAdmin(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "count", defaultValue = "6") Integer count, String keywords);
    public RespBean updateArticleState(Long[] aids, Integer state);
}
