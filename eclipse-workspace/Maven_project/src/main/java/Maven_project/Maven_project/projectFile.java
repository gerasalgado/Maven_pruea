package Maven_project.Maven_project;

class Animal {
	
	public Animal(){
		System.out.println("Test");
	}
	
	public String colors ="Black";
	
	public void disp() {
		System.out.println("This is a print");
	}

}

class Dog extends Animal {
	
	public Dog(){
		super();
		super.disp();
		System.out.println(super.colors);
	}

	public String colors ="White";
	
	public void disp() {
		System.out.println("This is a child print");
		disp2();
	}
	public void disp2() {
		System.out.println("This is a child print");
		disp3();
	}
	public void disp3() {
		System.out.println("This is a child print");
	}
}


public class projectFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog husky = new Dog();
		husky.disp();
		
	}

}
