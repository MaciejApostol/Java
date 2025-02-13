package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.dao.CategoryDao;
import pl.coderslab.model.Category;

public class CategoryConverter implements Converter<String, Category> {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category convert(String categoryId) {
        Integer categoryIdNumber = Integer.valueOf(categoryId);
        return categoryDao.getById(categoryIdNumber);
    }
}
