package online.mobwell.exercises.module_6;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;


/*
 * public class CH_M06L02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int input = 0;
        String month ="";
        System.out.println("Introduce your Month number (1 to 12):");
        input = sc.nextInt();
        
        switch(input)
        { 	default: monthString = "Invalid month";break;
          //Complete the switch, with cases from 1 to 12
            case 1: monthString = "January";break;
            
            case 12:monthString = "December";break;
            
        }
        
        System.out.println("You introduced: "+  month);
    }
}

###TESTING STRING###

{	"name": "M06L02_1",
	"userId": "ID6",
	"files": [{	"filename": "Verify",
	"code": "public class CH_M06L02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int input = null;
        String month =\"\";
        System.out.println(\"Introduce your Month number (1 to 12):\");
        input = sc.nextInt();
        
        switch(input)
        { 	default: monthString = \"Invalid month\";break;
          //Complete the switch, with cases from 1 to 12
			case 1: monthString = \"January\";break;
            case 2: monthString = \"February\";break;
            case 3: monthString = \"March\";break;
            case 4: monthString = \"April\";break;
            case 5: monthString = \"May\";break;
            case 6: monthString = \"June\";break;
            case 7: monthString = \"July\";break;
            case 8: monthString = \"August\";break;
            case 9: monthString = \"September\";break;
            case 10: monthString = \"October\";break;
            case 11: monthString = \"November\";break;
            case 12: monthString = \"December\";break;
            
        }
        
        System.out.println(\"You introduced: \"+  month);
    }
}"
		}
	]
}
 * 
 * 
 * */
public class Challenge_M06L02_1 extends Exercise{

	double[] current_criteria = {0,0,0,0,0,0,0,0,0,0,0};
	double[] correct_criteria = {5,1.5,1.5,1.5,1.5,1.5,1.5,1.5,1.5,1.5,1.5};
	String code;
	
	
	public Challenge_M06L02_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M06L02_1() {
		super();
	}

	
	@Override
	public void reviewExercise() {		
		Pattern pat		=null;
	    Matcher mat		= null;
	    int i=1;
	    
		String ex 		= executionResult();
		
	    String crit1 	= "case(.|)2(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"February\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit2 	= "case(.|)3(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"March\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit3 	= "case(.|)4(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"April\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit4 	= "case(.|)5(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"May\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit5	= "case(.|)6(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"June\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit6 	= "case(.|)7(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"July\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit7 	= "case(.|)8(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"August\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit8 	= "case(.|)9(.|):(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s| )(.|)monthString(.|)=(.|)\"September\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit9 	= "case(.|)10(.|):(.| )(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)monthString(.| )=(.|)\"October\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
	    String crit10	= "case(.|)11:(.|)(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)monthString(.| )=(.|)\"November\";(\\s\\s\\s\\s\\s|\\s\\s\\s\\s|\\s\\s\\s|\\s\\s|\\s|)break;(.|)";
		
		if(ex!=null)
		{current_criteria[0] = correct_criteria[0];}
		
		pat = Pattern.compile(crit1);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit2);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit3);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit4);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit5);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
		pat = Pattern.compile(crit6);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit7);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit8);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit9);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    i++;
	    
	    pat = Pattern.compile(crit10);
	    mat = pat.matcher(code);
	    if(mat.find())
	    {current_criteria[i] = correct_criteria[i];	}
	    
	  //..... after matching
	  		setMarks(current_criteria);
		
	}

}
