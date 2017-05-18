package online.mobwell.exercises;

import java.util.ArrayList;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

/*
 * ###TESTING STRING###
 * 
 * {	"name": "M07L02_3",
	"userId": "ID10",
	"files": [{	"filename": "Array3",
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
public class Challenge_Template extends Exercise{
	double[] current_criteria = {0,0};
	double[] correct_criteria = {0,0};
	String code;
	
	
	public Challenge_Template(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_Template() {
		super();
	}
	
	@Override
	public void reviewExercise() {
		
//		Pattern pat		=null;
//	    Matcher mat		= null;
	    
		String ex 		= executionResult();

//		String crit1 = "(sum(.|).=(.|)L2.get.i..|sum(.|)=(.|)sum(.|).(.|)L2.get.i..)";

/*		if(ex!=null)
//		{current_criteria[0] = correct_criteria[0];}
		
		pat = Pattern.compile(crit1);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[1] = correct_criteria[1];	}
	    
	    
	  //..... after matching
  		setMarks(current_criteria);
*/
	}
}
