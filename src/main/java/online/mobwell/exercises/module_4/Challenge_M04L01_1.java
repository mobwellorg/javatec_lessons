package online.mobwell.exercises.module_4;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

public class Challenge_M04L01_1 extends Exercise {

	/**
	 * @param name
	 * @param files
	 * @param date
	 */
	
/*
#### Criteria ####
| Criteria 													| Mark 	|
|															|---	|
|Run with no errors											| 5		|
|The class name must be ChallengeOne 						| 5		|
|Message printed is 'I'm going to be a Java programmer!'	| 5		|
|Method main() properly declared  							| 5		| 
*/	
	double[] current_criteria = {0,0,0,0};
	double[] correct_criteria = {5,5,5,5};
	String code;
	
	public Challenge_M04L01_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}

	/**
	 *
	 */
	public Challenge_M04L01_1() {
		super();
	}

	public void reviewExercise() {
//		marks = new marks[tamanho_criteria]
		String ex = executionResult();
		 
	    String crit1 = "public class ChallengeOne";
	    String crit2 = "System(.)out(.)(print|printf|println).\"Im going to be a Java programmer!\"(.)";
		String crit3 = "public static void main.String..(.|)args.";
		
		System.out.println(code.toString());	  ///
		if(ex!=null)
		{current_criteria[0] = correct_criteria[0];}
		
	    Pattern pat = Pattern.compile(crit1);
	    Matcher mat = pat.matcher(code);
	    
	    if(mat.find())
	    {current_criteria[1] = correct_criteria[1];}
	    else{ System.out.println("match1failed");}///

	    pat = Pattern.compile(crit2);
	    mat = pat.matcher(code);

	    if(mat.find())
	    {current_criteria[2] = correct_criteria[2];	}
	    else{ System.out.println("match2failed");}///
	    
	    pat = Pattern.compile(crit3);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[3] = correct_criteria[3];	}
	    else{ System.out.println("match3failed");}///
		//..... after matching
		setMarks(current_criteria);
		
	}
}

/*
//if it runs
if(ex!=null)
{	setMarks(new double[]{5.0, 5.0, 5.0, 5.0}); 		}
else
{
	setMarks(new double[]{0.0, 5.0, 5.0, 5.0}); 
}
*/