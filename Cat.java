public class Cat extends Animals { //#3 another subclass of animals superclass
	private String farm;
	
	public Cat(String name, double weight, String farm){
		//call the superclass constructor and pass the name and weight parameters
		super(name, weight);
		this.farm = farm;
	}
	@Override
	public String makeSound(){//overriding the superclass method  'MakeSound'
		return "\nMeow meow,";
		}
		public String getFarm(){
			return farm;
		}
		public void setfarm(String farm){
			this.farm = farm;
		}
}
