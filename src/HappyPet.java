import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 1000; i++) {
	
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What does your " + pet + " need to make it happy?", "DECISION", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go for a Walk", "Food", "Water", "Poop", "Play" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {walk();}
if(task == 1) {food();}
if(task == 2) {water();}
if(task == 3) {poop();}
if(task == 4) {play();}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel >= 100) {
	i = 1000;
	JOptionPane.showMessageDialog(null, "You definitely love your pet! They are very happy!");
	break;
}
	}
	}

	// 4. Create methods to handle each of your user selections.
static void walk() {
	happinessLevel = happinessLevel + 25;
}
static void food() {
	happinessLevel = happinessLevel + 40;
}
static void water() {
	happinessLevel = happinessLevel + 10;
}
static void poop() {
	happinessLevel = happinessLevel + 5;
}
static void play() {
	happinessLevel = happinessLevel + 30;
}

	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}