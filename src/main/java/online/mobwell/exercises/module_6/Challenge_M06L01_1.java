package online.mobwell.exercises.module_6;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;
/*
 * import java.util.concurrent.ThreadLocalRandom;

public class CH_M06L01 {
    public static void main(String[] args) {
    
    int min = 0;
    int max = 9;
    int numA,numB,numC,numD;
     
    numA = ThreadLocalRandom.current().nextInt(min, max + 1);
    numB = ThreadLocalRandom.current().nextInt(min, max + 1);
    numC = ThreadLocalRandom.current().nextInt(min, max + 1);
    numD = ThreadLocalRandom.current().nextInt(min, max + 1);
    
    //Don't forget to delete the comments from inside the conditional brackets
    
    if(numA > numB)
    {System.out.println("NumA: " + numA + " is bigger than NumB: "+numB);}
    
    if(numD < numA)
    {System.out.println("NumD: " + numD + " is smaller than NumA: " +  numA);}
    
    if(numC > numA && numC < numD))
    {System.out.println("NumC: " + numC + " is bigger than NumA: "+numA + "and is smaller than NumD: " + numD);}
    
    if(numB >= numC)
    {System.out.println("NumB: " + numB + " is equals to or bigger than NumC: " + numC);}
    
    if(numC != numD)
    {System.out.println("NumC: " + numC + " is not equal to NumD: " + numD);}

    }
}

###TESTING STRING###

{	"name": "M06L01_1",
	"userId": "ID6",
	"files": [{	"filename": "Verify",
	"code": "import java.util.concurrent.ThreadLocalRandom;

public class CH_M06L01 {
    public static void main(String[] args) {
    
    int min = 0;
    int max = 9;
    int numA,numB,numC,numD;
     
    numA = ThreadLocalRandom.current().nextInt(min, max + 1);
    numB = ThreadLocalRandom.current().nextInt(min, max + 1);
    numC = ThreadLocalRandom.current().nextInt(min, max + 1);
    numD = ThreadLocalRandom.current().nextInt(min, max + 1);
    
    if(numA > numB)
    {System.out.println(\"NumA: \" + numA + \" is bigger than NumB: \"+numB);}
    
    if(numD < numA)
    {System.out.println(\"NumD: \" + numD + \" is smaller than NumA: \" +  numA);}
    
    if(numC > numA && numC < numD))
    {System.out.println(\"NumC: \" + numC + \" is bigger than NumA: \"+numA + \"and is smaller than NumD: \" + numD);}
    
    if(numB >= numC)
    {System.out.println(\"NumB: \" + numB + \" is equals to or bigger than NumC: \" + numC);}
    
    if(numC != numD)
    {System.out.println(\"NumC: \" + numC + \" is not equal to NumD: \" + numD);}

    }
}"
		}
	]
}


 * */
public class Challenge_M06L01_1 extends Exercise {

	double[] current_criteria = {0,0,0,0,0,0};
	double[] correct_criteria = {5,3,3,3,3,3};
	String code;
	
	
	public Challenge_M06L01_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M06L01_1() {
		super();
	}

	
	@Override
	public void reviewExercise() {
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();
		
	    String crit1 	= "if(.|)((.|)numA(.|)>(.|)numB(.|))";
	    String crit2 	= "if(.|)((.|)numD(.|)<(.|)numA(.|))";
	    String crit3 	= "if(.|)((.|)numC(.|)>(.|)numA(.| )&&(.|)numC(.|)<(.|)numD(.|))";
	    String crit4 	= "if(.|)((.|)numB(.|)>(.|)=(.|)numC(.|))";
	    String crit5	= "if(.|)((.|)numC(.|)!(.|)=(.|)numD(.|))";

		
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
