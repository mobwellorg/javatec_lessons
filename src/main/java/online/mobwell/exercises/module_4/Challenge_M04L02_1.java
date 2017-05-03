package online.mobwell.exercises.module_4;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

public class Challenge_M04L02_1 extends Exercise {

	/**
	 * @param name
	 * @param files
	 * @param date
	 */
	
/*
#### Criteria ####
| Criteria 													| Mark	|
|---														|---	|
|Run with no errors											| 4		|
|Each correct import 										| 4*3	|
|Import in the correct place 								| 4		|
*/	
	double[] current_criteria = {0,0,0,0,0};
	double[] correct_criteria = {4,4,4,4,4};
	String code;
	
	public Challenge_M04L02_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}

	/**
	 *
	 */
	public Challenge_M04L02_1() {
		super();
	}

	public void reviewExercise() {
//		marks = new marks[tamanho_criteria]
		String ex = executionResult();
		
	    String crit1 = "import equidae.(z|Z)ebra;";
	    String crit2 = "import felidae.(t|T)iger;";
		String crit3 = "import primate.(c|C)himp;";
		String crit4 = "import (.......)(.)(.....); import (.......)(.)(.....); import (.......)(.)(.....);";
		
		if(ex!=null)
		{current_criteria[0] = correct_criteria[0];}
		
	    Pattern pat = Pattern.compile(crit1);
	    Matcher mat = pat.matcher(code);
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
		
	    pat = Pattern.compile(crit4);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[4] = correct_criteria[4];		}
	    
		//..... after matching
		setMarks(current_criteria);
		
	}
}