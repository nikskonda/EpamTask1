package by.epam.java.training.entity;

import java.io.Serializable;

public class TabletPC extends Computers implements Serializable {

    private static final long serialVersionUID = 1L;
	public static final String TAG = TabletPC.class.getSimpleName();
	
	private String color;

	private int flashMemoryCapacity;

	public TabletPC() {
		
	}

	public TabletPC(double batteryCapacity, int memoryRom, double displayInchs, String color, int flashMemoryCapacity) {
		super(batteryCapacity, memoryRom, displayInchs);
		this.color = color;
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	
	public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        if (flashMemoryCapacity > 0) {
            this.flashMemoryCapacity = flashMemoryCapacity;
        } else {
        	throw new IllegalArgumentException();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }	
    
    public String getProprties(){
            StringBuilder sb = new StringBuilder(super.getProprties());
            sb.append(", COLOR=").append(this.color)
			.append(", FLASH_MEMORY_CAPACITY=").append(this.flashMemoryCapacity);
            return sb.toString();
        }
        
	@Override
	public String asString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        TabletPC tabletPC = (TabletPC) obj;

        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;

        if (this.color != null) {
            if (!this.color.equals(tabletPC.color)) return false; }
        else if (tabletPC.color == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
	    final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + (color != null ? color.hashCode() : 0);
        hashCode = prime * hashCode + flashMemoryCapacity;
        return hashCode;
    }
}
