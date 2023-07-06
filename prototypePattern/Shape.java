package prototypePattern;

public abstract class Shape implements Cloneable{
	private String name;
	protected String type;
	
	abstract void draw();
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}


