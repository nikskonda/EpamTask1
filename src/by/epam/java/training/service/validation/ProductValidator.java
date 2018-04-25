/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.service.validation;

import by.epam.java.training.entity.criteria.Criteria;

/**
 *
 * @author niksk
 */
public interface ProductValidator {
    
    <E> boolean isValid(Criteria<E> criteria);
    
}
