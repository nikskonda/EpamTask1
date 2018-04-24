/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor;

import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.criteria.Criteria;

/**
 *
 * @author niksk
 */
public interface ProductConstructor {
    <E> Product createProduct(Criteria<E> criteria);
}
