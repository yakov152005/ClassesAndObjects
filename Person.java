import java.util.Scanner;

public class Person {
	Scanner s = new Scanner(System.in);
	private String name;
	private int height;
	private double weight;
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public void setWeight(double w) {
		this.weight = w;
	}
	public void show(){
		System.out.println();
		System.out.print("Name: " + name);
		System.out.println();
		System.out.print("Height: " + height);
		System.out.println();
		System.out.print("Weight " + weight);
	}
	public int[] createArray(int size){
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}return arr;
	}
	public int getInput(){
		return s.nextInt();
	}
	public String getString(){
		return s.nextLine();
	}
}
