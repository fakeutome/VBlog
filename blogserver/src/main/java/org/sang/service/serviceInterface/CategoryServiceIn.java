package org.sang.service.serviceInterface;

import org.sang.bean.Category;

import java.util.List;

public interface CategoryServiceIn {
    public List<Category> getAllCategories();
    public boolean deleteCategoryByIds(String ids);
    public int updateCategoryById(Category category);
    public int addCategory(Category category);
}
