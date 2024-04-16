/*2. Aim of the program -Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value of the interface data member thru an object of the class.
Input - mentioned in the program
Output - Capacity of the motor is -----*/


interface Motor {
	int capacity = 0;
	void run();
	void consume();
}

class WashingMachine implements Motor {
	private int capacity;

	public WashingMachine(int capacity){
		this.capacity = capacity;
	}

	public void run() {
		System.out.println("Washing machine is running");
	}
	public void consume() {
		System.out.println("Washing machine is consuming energy");
	}

	public int getCapacity() {
        	return capacity;
    }
}

class Check {
	public static void main(String[] args) {
		WashingMachine machine = new WashingMachine(10);
		
		System.out.println("Capacity of the motor(static) is " + Motor.capacity);
		System.out.println("Capacity of the washing machine(instance): " + machine.getCapacity());

		machine.run();
		machine.consume();
	}
}

