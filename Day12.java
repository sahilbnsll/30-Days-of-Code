import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

   Student(String firstName, String lastName, int identification, int[] testScores){
       super(firstName, lastName, identification);
       this.testScores= testScores;
   }
   char calculate()
   {
       int avg=0;
       for(int i=0;i<testScores.length;i++)
       {
           avg= avg + testScores[i];
       }
       avg= avg/ (testScores.length);
       return(avg>89 ? 'O' : avg>79 ? 'E' : avg>69 ? 'A' : avg>54 ? 'P' : avg>39 ? 'D' : 'T');
   }
}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
