public  class MainProgram{ //#1 main class
	
	public static void main (String[] args){
		
		Animals animals; //superclass object
		Tiger tiger = new Tiger("Lilly", 65, "Tall\n"); //subclass object
		Cat cat = new Cat("Orange", 5, "small\n"); //another subclass object
		
		animals = tiger;
		//calling tge accessors from the superclass object
		System.out.print(animals.makeSound()+" " + " My name is " + animals.getName());
		
		animals = cat;
		System.out.print(animals.makeSound()+ " " + "My name is " + animals.getName());
	}
}

