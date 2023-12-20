package Pack1;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		General Algorithm:
//			In general your program should:
//			1. Display a welcome message with your name on it (i.e. “W_e_l_c_o_m_e_ _t_o_ _M_i_k_e_ _T_r_i_a_n_g_l_e_/_D_i_a_m_o_n_d_ _P_r_i_n_t_e_r_”).
		System.out.println("“W_e_l_c_o_m_e_ _t_o_ _M_i_k_e_ _T_r_i_a_n_g_l_e_/_D_i_a_m_o_n_d_ _P_r_i_n_t_e_r_”");
		
//			2. Prompt the user for the pattern they want to display. Make sure the pattern requested is a legal one.
		//print patterns
				System.out.println("54321      1   12345     1");
				System.out.println("5432      12    2345    123");
				System.out.println("543      123     345   12345");
				System.out.println("54      1234      45    123");
				System.out.println("5      12345       5     1");
		
//			3. Prompt the user for the input value. The input value should be greater than 0 and less than 10. Keep prompting the user until the input value is valid.
				//user choice [1-4]
				Scanner kb = new Scanner(System.in);
					System.out.println("which pattern do you want to print?");
					
					//5 to quit
							System.out.print("enter your choice (5 to quit)");
							int pattern = kb.nextInt();
							System.out.println();
							//the user must choose between 1 and 5
					while (pattern <1 || pattern > 5) {
						System.out.println("woops! " + pattern + " is an illegal choice. Try again");
						System.out.println("please enter a number between 1 and 5 inclusively");
						
					}
					
//			4. Display the requested pattern.
					
					
					switch pattern:
	case 1:
		
	case 2:
		
	case 3:
		
	case 4:
		
	case 5:
		System.exit(0);
		
		default
		
		//input value of certain range of number of lines
System.out.println("how many rows you would like to print? (more than 1 please)");
		int rows = kb.nextInt();
		while (rows<=1) {
			System.out.println("how many rows you would like to print? (more than 1 please)");
		}



//check if the input if it is odd or even
	if (rows % 2 == 0) {
		//even
		
	}else {
		//odd
	}
	
	
//			5. As long as the user wants to display another pattern your program repeats steps 2 to 4
//			6. Display a closing message
		

		
		
		
			
			
		
		
//*******************************************************************************************************************************************************************
//If the user enters an odd number, then the program would draw a pattern that is similar to the following (i.e. the shown pattern is drawn if the user enters 5. 
//You should notice that this is only an example; your program must allow for the general case for different appropriate values as indicated above.) 
//You should notice that the patterns are actually quite similar whether the input is odd or even, with the exception of pattern # 4
//*******************************************************************************************************************************************************************
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
