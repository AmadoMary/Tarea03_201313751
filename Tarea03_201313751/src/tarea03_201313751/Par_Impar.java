/**
 * 
 */
package tarea03_201313751;

/**
 * @author 1963
 *
 */
public class Par_Impar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		a=Integer.parseInt(args[0].toString());
		if (a%2==0){
			System.out.println("El número es Par");
		}
		else {
			System.out.println("El número es Impar");
		}
	}

}
