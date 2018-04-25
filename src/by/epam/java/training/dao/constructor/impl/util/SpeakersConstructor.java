/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.dao.constructor.impl.util;

import by.epam.java.training.dao.constructor.impl.Constructor;
import by.epam.java.training.entity.Product;
import by.epam.java.training.entity.Speakers;
import by.epam.java.training.entity.criteria.SearchCriteria;
import java.util.Map;

/**
 *
 * @author niksk
 */
public class SpeakersConstructor implements Constructor{

    @Override
    public <E> Product execute(Map<E, Object> properties) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt((String)properties.get(SearchCriteria.Speakers.POWER_CONSUMPTION)));
        speakers.setNumberOfSpeakers(Integer.parseInt((String)properties.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)));
        speakers.setCordLength(Integer.parseInt((String)properties.get(SearchCriteria.Speakers.CORD_LENGTH)));
        speakers.setFrequencyRange((String)properties.get(SearchCriteria.Speakers.FREQUENCY_RANGE));
        return speakers;    }
    
}
