/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.impl.util;

import by.epam.java.training.entity.criteria.Criteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public interface ProductParser {
    void execute(Map<String, String> properties, Criteria criteria);
}
