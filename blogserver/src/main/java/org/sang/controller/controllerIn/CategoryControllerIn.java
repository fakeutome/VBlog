package org.sang.controller.controllerIn;

import org.sang.bean.Category;
import org.sang.bean.RespBean;

import java.util.List;

public interface CategoryControllerIn {
    public List<Category> getAllCategories();
    public RespBean addNewCate(Category category);

    public RespBean updateCate(Category category);
}
