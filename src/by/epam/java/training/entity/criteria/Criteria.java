package by.epam.java.training.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	
	private String groupSearchName;
	private Map<E, Object> criteria = new HashMap<E, Object>();
	
	public Criteria() {
        criteria = new HashMap<E, Object>();
    }
	
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public Criteria(String groupSearchName, Map<E, Object> criteria) {
		this.groupSearchName = groupSearchName;
		this.criteria = criteria;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

    public Map<E, Object> getCriteria() {
        return criteria;        
    }
    
    public void setCriteria(Map<E, Object> criteria) {
        this.criteria = criteria;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void setGroupSearchName(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }
	
}
