/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.TextBook;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class TextBookConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        TextBook textBook = new TextBook();
        textBook.setAuthor((String)properties.get(SearchCriteria.TextBook.AUTHOR));
        textBook.setSubject((String)properties.get(SearchCriteria.TextBook.SUBJECT));
        textBook.setTitle((String)properties.get(SearchCriteria.TextBook.TITLE));
        textBook.setNumberOfPages(Integer.parseInt((String)properties.get(SearchCriteria.TextBook.NUMBER_OF_PAGES)));
        return textBook;
    }
    
}
