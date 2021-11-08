package prototypePattern;

public abstract class Animal implements Cloneable{

	public int id;
	public String name;
	
	abstract void sound();
	
	public Object cloningMethod() {
		Object clone = null;
		
		try {
			clone = super.clone();
			
		}catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return clone;
	}
}
