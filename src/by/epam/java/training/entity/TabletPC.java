package by.epam.java.training.entity;

public class TabletPC extends Computers {

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
	public String toString() {
		StringBuilder sb = new StringBuilder(TAG);
		sb.append(": ").append(getProprties()).append(";");
		return sb.toString();               
	}
	
}
