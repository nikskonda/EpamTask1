package by.epam.java.training.entity.criteria;

import by.epam.java.training.entity.criteria.SearchCriteria.ProductLine;
import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	
	private ProductLine productLine;
	private Map<E, Object> criteria = new HashMap<E, Object>();
	
	public Criteria() {
        criteria = new HashMap<E, Object>();
    }
	
	public Criteria(ProductLine productLine) {
		this.productLine = productLine;
	}
	
	public Criteria(ProductLine productLine, Map<E, Object> criteria) {
		this.productLine = productLine;
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

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Criteria<?> c = (Criteria<?>) obj;

        if (this.productLine != null) {
            if (!this.productLine.equals(c.productLine)) return false; }
        else if (c.productLine == null) return false;

        if (this.criteria != null) {
            if (!this.criteria.equals(c.criteria)) return false; }
        else if (c.criteria == null) return false;

        return false;
    }

    @Override
    public int hashCode() {
	    final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + (productLine != null ? productLine.hashCode() : 0);
        hashCode = prime * hashCode + (criteria != null ? criteria.hashCode() : 0);
        return hashCode;
    }
}
