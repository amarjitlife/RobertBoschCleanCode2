
//________________________________________________________

interface Superpower {
	public void fly();
	public void saveWorld();
}

class Spiderman implements Superpower {
	public void fly() 	{ System.out.println("Fly Like Spiderman!"); }
	public void saveWorld() { System.out.println("Save World Like Spiderman!"); }
}

class Superman implements Superpower {
	public void fly() 	{ System.out.println("Fly Like Superman!"); }
	public void saveWorld() { System.out.println("Save World Like Superman!"); }
}

class Heman {
	public void fly() 	{ System.out.println("Fly Like Heman!"); }
	public void saveWorld() { System.out.println("Save World Like Heman!"); }
}

class Wonderwoman {
	public void fly() 	{ System.out.println("Fly Like Wonderwoman!"); }
	public void saveWorld() { System.out.println("Save World Like Wonderwoman!"); }
}

//________________________________________________________
// Code Reuse
// 	Using Mechanism Inheritance
//class Human extends Spiderman {
//class Human extends Superman {
//class Human extends Heman {
class Human extends Wonderwoman {
	public void fly() 	{ super.fly(); 	    }//{ System.out.println("Fly Like Human!"); }
	public void saveWorld() { super.saveWorld(); }//{ System.out.println("Save World Like Human!"); }
}

//________________________________________________________

// Code Reuse
// 	Using Mechanism Composition
class HumanBetter  {
	//Spiderman power = new Spiderman();
	//Superman power = new Superman();
	Wonderwoman power = new Wonderwoman();
	public void fly() 	{ power.fly(); 	    }//{ System.out.println("Fly Like Human!"); }
	public void saveWorld() { power.saveWorld(); }//{ System.out.println("Save World Like Human!"); }
}

//________________________________________________________

// Code Reuse
// 	Using Mechanism Composition

class HumanBest  {
	//Spiderman power = new Spiderman();
	//Superman power = new Superman();
	//Wonderwoman power = new Wonderwoman();
	Superpower power = null;
	public void fly() 	{ if ( power != null ) power.fly(); 	   }//{ System.out.println("Fly Like Human!"); }
	public void saveWorld() { if ( power != null ) power.saveWorld();  }//{ System.out.println("Save World Like Human!"); }
}

//________________________________________________________
//________________________________________________________
//________________________________________________________
//________________________________________________________
//________________________________________________________
//________________________________________________________


//________________________________________________________

public class Experiments {
	public static void playWithHuman() {
		Human h = new Human();
		h.fly();
		h.saveWorld();
	}

	public static void playWithHumanBetter() {
		HumanBetter hb = new HumanBetter();
		hb.fly();
		hb.saveWorld();
	}
	
	public static void playWithHumanBest() {
		HumanBest hb = new HumanBest();
		hb.fly();
		hb.saveWorld();

		hb.power = new Spiderman();
		hb.fly();
		hb.saveWorld();
		
		hb.power = new Superman();
		hb.fly();
		hb.saveWorld();
	}

	public static void main( String[] args ) {
		System.out.println("Welcome Boschler!!!");

		System.out.println("\nFunction: playWithHuman");
		playWithHuman();

		System.out.println("\nFunction: playWithHumanBetter");
		playWithHumanBetter();

		System.out.println("\nFunction: playWithHumanBest");
		playWithHumanBest();
/*
		System.out.println("\nFunction: ");
		System.out.println("\nFunction: ");
		System.out.println("\nFunction: ");
*/	
	}
}

//________________________________________________________


