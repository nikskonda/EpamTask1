/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Newspaper;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class NewspaperConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        Newspaper newspaper = new Newspaper();
        newspaper.setPaidOfFree((String)properties.get(SearchCriteria.Newspaper.PAID_OR_FREE));
        newspaper.setPeriodicity((String)properties.get(SearchCriteria.Newspaper.PERIODICITY));
        newspaper.setTitle((String)properties.get(SearchCriteria.Newspaper.TITLE));
        return newspaper;    }
    
}
