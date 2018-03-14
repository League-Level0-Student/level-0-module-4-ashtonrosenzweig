

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 1;) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String num1 = JOptionPane.showInputDialog("Say your first number. (i.e.: 93, 78");
String num2 = JOptionPane.showInputDialog("Say your second number. (i.e.: 93, 78");
double numone = Double.parseDouble(num1);
double numtwo = Double.parseDouble(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which operation do you want to use?", "OPERATION", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation == 0) {add(numone, numtwo);}
if(operation == 1) {subtract(numone, numtwo);}
if(operation == 2) {multiply(numone, numtwo);}
if(operation == 3) {divide(numone, numtwo);}
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(double numone, double numtwo) {
double answer;
answer = numone + numtwo;
JOptionPane.showMessageDialog(null, "Your answer is " + answer + "!");
}

static void subtract(double numone, double numtwo) {
double answer;
answer = numone - numtwo;
JOptionPane.showMessageDialog(null, "Your answer is " + answer + "!");
}

static void multiply(double numone, double numtwo) {
double answer;
answer = numone * numtwo;
JOptionPane.showMessageDialog(null, "Your answer is " + answer + "!");
}

static void divide(double numone, double numtwo) {
double answer;
answer = numone / numtwo;
JOptionPane.showMessageDialog(null, "Your answer is " + answer + "!");
}}
