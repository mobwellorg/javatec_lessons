package online.mobwell.exercises.module_5;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

public class Challenge_M05L02_1 extends Exercise {

	/*
Java
public class CH_M05L02 {
    public static void main(String[] args) {
     
	 Scanner sc = new Scanner(System.in);
	 
	 String greeting_1 = "Hi, my name is ";
	 String name = null;
	 String greeting_2 = " and I was born in ";
	 int year = null;
	 
	 
	 
	 System.out.println("Insert your name:");
	 //Fill as required
	 name = sc.nextLine();

	 System.out.println("Insert your year of birth:");
	//Fill as required
	 year = sc.nextInt();
	
	//In this code segment, we add all of the components into a single *String*
	 String final = greeting_1 + name +  greeting_2 + year;
	 
	 //Print the *final* String;
		System.out.println(final);
    }
}

#### Criteria
| Criteria | Mark |
|---|---|
|Run with no errors        | 5|
|Correct scanning of input| 5*2|
|Correct Final sentence displayed| 5|

###TESTING STRING###

{	"name": "M05L02_1",
	"userId": "ID4",
	"files": [{	"filename": "Greeting",
	"code": "public class CH_M05L02 {
    public static void main(String[] args) {
     
	 Scanner sc = new Scanner(System.in);
	 
	 String greeting_1 = \"Hi, my name is \";
	 String name = null;
	 String greeting_2 = \" and I was born in \";
	 int year = null;

	 System.out.println(\"Insert your name:\");
	 name = sc.nextLine();

	 System.out.println(\"Insert your year of birth:\");
	 year = sc.nextInt();

	 String final = greeting_1 + name +  greeting_2 + year;
		System.out.println(final);
    }
}"
		}
	]
}

*/
	
	
	double[] current_criteria = {0,0,0,0};
	double[] correct_criteria = {5,5,5,5};
	String code;
	
	public Challenge_M05L02_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}

	/**
	 *
	 */
	public Challenge_M05L02_1() {
		super();
	}


	public void reviewExercise() {
		
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();
		
	    String crit1 	= "name(.|)=(.|)sc.(nextLine|next)..;";
	    String crit2 	= "year(.|)=(.|)sc.nextInt..;";
	    String crit3 	= "System.out.(print|println).final.;";

		
		if(ex!=null)
		{current_criteria[0] = correct_criteria[0];}
		
		
			pat = Pattern.compile(crit1);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[1] = correct_criteria[1];	}
		    
		    pat = Pattern.compile(crit2);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[2] = correct_criteria[2];	}
		    
		    pat = Pattern.compile(crit3);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[3] = correct_criteria[3];	}
		

	    
		//..... after matching
		setMarks(current_criteria);
	}

}
