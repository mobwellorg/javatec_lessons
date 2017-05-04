package online.mobwell.exercises.module_5;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

public class Challenge_M05L01_1 extends Exercise {

	/*
Java
public class CH_M05L01 {
    public static void main(String[] args) {
     Complete the type of variable BEFORE the variable name
     eggs                        = 2;
     salt_teaspoon               = 1;
     flour_grams                 = 300;
     milk_mliters                = 200;
    }
}

#### Criteria
| Criteria | Mark |
|---|---|
|Run with no errors        | 6|
|Correct, working variables| 7|
|Fully optimized variables | 7|

###TESTING STRING###

{	"name": "M05L01_1",
	"userId": "test",
	"files": [{	"filename": "Cake",
	"code": "public class CH_M05L01 {
    public static void main(String[] args) {
     byte eggs = 2;
     byte salt_teaspoon = 1;
     short flour_grams = 300;
     short milk_mliters = 200;
    }
}"
		}
	]
}



*/
	
	
	double[] current_criteria = {0,0,0,0,0,0,0,0,0};
	double[] correct_criteria = {6,1.75,1.75,1.75,1.75,1.75,1.75,1.75,1.75};
	String code;
	
	public Challenge_M05L01_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}

	/**
	 *
	 */
	public Challenge_M05L01_1() {
		super();
	}


	public void reviewExercise() {
		
		String ex = executionResult();
		
	    String crit1 = "(byte|short|int|float|double)(.|)eggs(.|)=(.|)2;";
	    String crit2 = "(byte|short|int|float|double)(.|)salt_teaspoon(.|)=(.|)1;";
	    String crit3 = "(short|int|float|double)(.|)flour_grams(.|)=(.|)300;";
	    String crit4 = "(short|int|float|double)(.|)milk_mliters(.|)=(.|)200;";
	    String crit5 = "byte(.|)eggs(.|)=(.|)2;";
	    String crit6 = "byte(.|)salt_teaspoon(.|)=(.|)1";
	    String crit7 ="short(.|)flour_grams(.|)=(.|)300;";
	    String crit8 = "short(.|)milk_mliters(.|)=(.|)200;";
		
		if(ex!=null)
		{current_criteria[0] = correct_criteria[0];}
		Pattern pat;
	    Matcher mat;
		
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
		    
		    pat = Pattern.compile(crit4);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[4] = correct_criteria[4];	}
		    
		    pat = Pattern.compile(crit5);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[5] = correct_criteria[5];	}
		
		    pat = Pattern.compile(crit6);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[6] = correct_criteria[6];	}
		    
		    pat = Pattern.compile(crit7);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[7] = correct_criteria[7];	}
		    
		    pat = Pattern.compile(crit8);
		    mat = pat.matcher(code);
		    if(mat.find())
		    {current_criteria[8] = correct_criteria[8];	}
	    
		//..... after matching
		setMarks(current_criteria);
	}

}
