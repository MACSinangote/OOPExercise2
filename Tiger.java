public class Tiger extends Animals{// #3 subclass of animals superclass
	private String height;
	
	public Tiger(String name, double weight, String height){
		//call the superclass constructor and pass the name and weight parameters
		super(name, weight);
		this.height = height;
	}
	@Override
	public String makeSound(){//overiding the superclass method 'MakeSound'
		return "Roar roar,";
		}
	public String getHeight(){
		return height;
	}
	public void setHeight(String height){
		this.height = height;
	}
}
