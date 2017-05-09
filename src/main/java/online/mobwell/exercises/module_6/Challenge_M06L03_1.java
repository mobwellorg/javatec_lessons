package online.mobwell.exercises.module_6;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

/*
 * public class CH_M06L03 {
    public static void main(String[] args) {
        
        int a = 0;
        int incre1 = 0;
        int incre2 = 0;
        
        do{
        
        for(int b=0;Complete this, using 'b';Use 'b')
        {      }
        
        }while(Use 'a');
        
        System.out.println(a);
        System.out.println(b);
    }
}

###TESTING STRING###

{	"name": "M06L03_1",
	"userId": "ID7",
	"files": [{	"filename": "Looped",
	"code": "public class CH_M06L03 {
    public static void main(String[] args) {
        
        int a = 0;
        int incre1 = 0;
        int incre2 = 0;
        
        do{    
            
        for(int b = 0;b<=10;b++)
        {	incre2++;}
        
        incre1++;
        }while(a<=10);
        
        System.out.println(a);
        System.out.println(b);
    }
}"
		}
	]
}
 * 
 * 
 * */
public class Challenge_M06L03_1 extends Exercise {

	double[] current_criteria = {0,0,0,0,0};
	double[] correct_criteria = {5,5,5,2.5,2.5};
	String code;
	
	
	public Challenge_M06L03_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M06L03_1() {
		super();
	}

	public void reviewExercise() {
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();
		
		String crit1 = "while(.|)(.|)a(.|)(<(.|)11|<(.|)=(.|)10)(.|).";
		String crit2 = "for(.|)(.|)int b(.|)=(.|)0(.|);(.|)b(.|)(<(.|)11|<(.|)=(.|)10)(.|);(.|)b..(.|)";
		String crit3 = "(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)incre2..;(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)";
		String crit4 = "(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)incre1..;(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)";
		
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
	    
	  //..... after matching
  		setMarks(current_criteria);
	}

}
