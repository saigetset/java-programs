package com.arrays.sai;
class A{
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}

public class LaunchArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("Hello");
		A a=new A();
		a.setA(10);
		System.out.println(a.getA());
		a.setB(20);
		System.out.println(a.getB());
		System.out.println("Second Commit")
	}

}
