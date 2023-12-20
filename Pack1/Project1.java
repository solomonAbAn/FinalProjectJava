


package Pack1;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CASHEIR CALCULATOR

//1) The number of items;
		Scanner kb = new Scanner(System.in);
		int invalid = 0;
		System.out.print("Please enter the number of items bought [1...10]: ");
		int num = kb.nextInt();
		while (num < 1 || num > 10) {
			System.out.print("Please enter the number of items bought [1...10]: ");
			num = kb.nextInt();
			invalid++;
		}

// 2) The price of each item;

		int i;
		double subtotal = 0;

		for (i = 1; i <= num; i++) {
			System.out.print("Please enter the price of item " + i + " [1...1000]: ");
			double price = kb.nextDouble();

			while (price < 1 || price > 1000) {
				System.out.print("Please enter the price of item " + i + " [1...1000]: ");
				price = kb.nextDouble();
				invalid++;
			}

			subtotal += price;
		}

		System.out.println();
		

//3) The GRate in percentage;

		System.out.print("Please enter the tax rate of GST in % [0...14]: ");
		double GRate = kb.nextDouble();
		while (GRate < 0 || GRate > 14) {
			System.out.print("Please enter the tax rate of GST in % [0...14]: ");
			GRate = kb.nextDouble();
			invalid++;
		}
		System.out.println();

//4) The QRate in percentage.

		System.out.print("Please enter the tax rate of QST in % [0...17]: ");
		double QRate = kb.nextDouble();
		while (QRate < 0 || QRate > 17) {
			System.out.print("Please enter the tax rate of QST in % [0...17]: ");
			QRate = kb.nextDouble();
			invalid++;
		}
		System.out.println();
	
//invalid inputs
		if(invalid!=0) {
		System.out.println("You have entered " + invalid + " invalid inputs.");
		}
// the subtotal

		System.out.println("Sub Total: " + subtotal);

//The GST

		double GST = subtotal * GRate / 100;
		System.out.println("GST: " + GST);

//The QST

		double QST = (subtotal + GST) * QRate / 100;
		System.out.println("QST: " + QST);

		
		
//The total

		double Total = subtotal + GST + QST;

		System.out.println("Total: " + Total);
		kb.close();
	}
	

}
