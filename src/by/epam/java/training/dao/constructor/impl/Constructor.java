/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl;

import by.epam.java.training.entity.Product;
import java.util.Map;

/**
 *
 * @author niksk
 */
public interface Constructor {
    
    <E> Product execute(Map<E, Object> properties);
    
}
