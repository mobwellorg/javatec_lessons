package online.mobwell.exercises.module_5;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

/*
 * 
 * public class CH_M05L03 {
    public static void main(String[] args) {
        
        int result = 1;
        // result is now 1
        System.out.println(result);

        // Without using a number, make the value of 'result' "0"
        System.out.println(result);

        // Without using a number, make the value of 'result' "1"
        System.out.println(result);
        
        // In one line, without using numbers, make the value of 'result' "-1"
        System.out.println(result);
        }
        }
 * 
 * 
 * ###TESTING STRING###

{	"name": "M05L03_1",
	"userId": "ID5",
	"files": [{	"filename": "Result",
	"code": "public class CH_M05L03 {
    public static void main(String[] args) {
        
        int result = 1;
        // result is now 1
        System.out.println(result);

        // Without using a number, make the value of 'result' \"0\"
		result--;
        System.out.println(result);

        // Without using a number, make the value of 'result' \"1\"
		result++;
        System.out.println(result);
        
        // In one line, without using numbers, make the value of 'result' \"-1\"
		result = -result;
        System.out.println(result);
        }
        }"
		}
	]
}
 * 
 * 
 * */


public class Challenge_M05L03_1 extends Exercise{
	
	
	double[] current_criteria = {0,0,0,0};
	double[] correct_criteria = {5,5,5,5};
	String code;
	
	
	public Challenge_M05L03_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M05L03_1() {
		super();
	}
	
	
	public void reviewExercise() {
		
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();
		
	    String crit1 	= "\"0\"(\\s\\s\\s|\\s\\s\\s\\s|\\s\\s|\\s| )(result[-][-]|[-][-]result);";
	    String crit2 	= "\"1\"(\\s\\s\\s|\\s\\s\\s\\s|\\s\\s|\\s| )(result[+][+]|[+][+]result);";
	    String crit3 	= "\"-1\"(\\s\\s\\s|\\s\\s\\s\\s|\\s\\s|\\s| )result(.|)=(.|)-(.|)result(.|);";

		
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
