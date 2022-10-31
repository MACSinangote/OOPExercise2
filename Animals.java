public abstract class Animals { // This is the superclass
	protected String name; //attributes are protected
	protected double weight;
	
	//constructor
	public Animals(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
//this method will be overriden by its subclasses
	public abstract String  makeSound();
	
	public String getName(){
		return name;
	}
	public double getWeight(String name){
		return weight;
	}
	public  void setweight(double weight){
		this.weight = weight;
		}
	}
