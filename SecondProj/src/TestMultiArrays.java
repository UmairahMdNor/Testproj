import java.lang.reflect.Array;
import java.util.Arrays;

/**
 
/**
 * This is test Java Arrays
 * @author User
 *
 */
public class TestMultiArrays {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects [][] = new String [2][2];
		course_subjects [0][0] = "PHY-Quantum";
		course_subjects [0][1] = "PHY-Solid State";
		course_subjects [1][0] = "PHY-Modern Physics";
		course_subjects [1][1] = "PHY-Non-destructive Testing";

		String course_subjects2 [][] = {{"PHY-Quantum", "PHY-Solid State"}, {"PHY-Modern Physics", "PHY-Non-destructive Testing"}};  
		
		for(int i=0;i < course_subjects.length; i++) {
			for(int j=0;j < course_subjects.length; j++) {
				System.out.println("Course of " + i + " Subject of " + j + " is " + course_subjects[i][j]);
			}

		}
		/*
		for(int i=0;i < salaries.length;i++) {
			System.out.println("Salary of "+i + " is " + salaries[i]);
		}
		*/
		
		//int i=0;
		
		
		for(String [] courses:course_subjects) {
			for(String subject:courses) {
			System.out.println("Subject " + subject);
		
		
		}

		

	}

}
}
