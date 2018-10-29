package main;
/**
 * <h1>CALCULATOR</h1>
 * This is very simple calculator which calculate just addition,
 * subtraction,division @ multiplication.
 * @author Arifujjaman
 * @version 1.0
 * @date 2018-11-29
 */

public class Calculator {
	
	/**
	 * this method is used for addition.
	 * @param n1 First number.
	 * @param n2 Second number
	 * @return sum will be return
	 */
	public int add(int n1,int n2){
		return n1+n2;
	}
	
	/**
	 * this method is used for subtraction
	 * @param n1 First number.
	 * @param n2 Second number
	 * @return sub will be return
	 */
	
	public int sub(int n1,int n2){
		return n1-n2;
	}
	
	/**
	 * this method used for multiplication.
	 * @param n1 First number
	 * @param n2 Second number
	 * @return ml will be return
	 */
	
	public int mul(int n1,int n2){
		return n1*n2;
	}
	/**
	 * this method used division
	 * @param n1 First number
	 * @param n2 Second number
	 * @return division will be return
	 */
	
	public double div(int n1,int n2){
		return n1/n2;
	}
	
	public static void main(String[] args) {

		Calculator obj=new Calculator();
		System.out.println(obj.add(5,5));
		System.out.println(obj.sub(5,4));
		System.out.println(obj.mul(5,5));
		System.out.println(obj.div(5,5));
	}
}

