package online.mobwell.exercises.module_7;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;
/*
 * ###TESTING STRING###
 * 
 * {	"name": "M07L02_1",
	"userId": "ID8",
	"files": [{	"filename": "Array1",
	"code": "public class CH_M07L02 {

	public static void main(String[] args) {
    
    int sum=0;
    
    ArrayList<Integer> L1 = new ArrayList<Integer>();
    
    L1.add(1);
    //Add the remaining numbers
    L1.add(2);
    L1.add(3);
    L1.add(4);
    L1.add(5);

    ArrayList<Integer> L2 = new ArrayList<Integer>();
    
    for(int i=0;i<L1.size();i++)
    {   L2.add(L1.get(i)); }
    
    for(int i=0;i<L2.size();i++)
    {  sum+=L2.get(i);  }
    
	  
	}
}"
		}
	]
}
 * 
 * */

public class Challenge_M07L02_1 extends Exercise{

	double[] current_criteria = {0,0,0,0,0,0};
	double[] correct_criteria = {6,10,1,1,1,1};
	String code;
	
	
	public Challenge_M07L02_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M07L02_1() {
		super();
	}
	
	public void reviewExercise() {
		
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();

		String crit1 = "ArrayList.Integer.(.|)(.|)L1(.|)=(.|)new ArrayList<Integer>";
		String crit2 = "L1.add.2.;";
		String crit3 = "L1.add.3.;";
		String crit4 = "L1.add.4.;";
		String crit5 = "L1.add.5.;";
		
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
	    
	    pat = Pattern.compile(crit4);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[4] = correct_criteria[4];	}
	    
	    pat = Pattern.compile(crit5);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[5] = correct_criteria[5];	}
	    
	    //..... after matching
  		setMarks(current_criteria);
		
		
	}
	
	
}
