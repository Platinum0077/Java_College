/*
	4. WAP to create classes with the help of constructors
*/
class Box {
	int length;
	int breadth;
	int height;
	Box(){
		length = 10;
		breadth = 20;
		height = 30;
	}
	Box(int l, int b, int h){
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	
	int volume(){
		return this.length*this.breadth*this.height;
	}
}
class BoxDemo {
	public static void main(String[] args) {;
		Box mybox = new Box(100,200,34);
		int volume = mybox.volume();
		System.out.println("volumr of the box is "+volume);
	}
}