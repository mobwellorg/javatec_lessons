package online.mobwell.exercises.module_7;

import java.util.ArrayList;
import java.util.regex.*;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

/*public class CH_M07L01 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);

		String username =;
        String password =;
        
        String userInput = null;
        boolean a = false;
        boolean b = false;

		System.out.println("Enter your username:");
		userInput = sc.nextLine();
		if ()    {	a = true;    } 
        else     {  a = false;   }
        
        System.out.println("Enter your password:");
		userInput = sc.nextLine();
        if ()    {	b = true;    } 
        else     {  b = false;   }
        
        
        if(){   System.out.println("Entered successfully.");}
        else {        System.out.println("Failed to login.");}
        
        
	}
}

###TESTING STRING###

{	"name": "M07L01_1",
	"userId": "ID8",
	"files": [{	"filename": "Decision",
	"code": "public class CH_M07L01 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);

		String username =\"testuser\";
        String password =\"testpass\";
        
        String userInput = null;
        boolean a = false;
        boolean b = false;

		System.out.println(\"Enter your username:\");
		userInput = sc.nextLine();
		if (userInput == username)    {	a = true;    } 
        else     {  a = false;   }
        
        System.out.println(\"Enter your password:\");
		userInput = sc.nextLine();
        if (userInput == password)    {	b = true;    } 
        else     {  b = false;   }
        
        
        if(a && b){   System.out.println(\"Entered successfully\");}
        else {        System.out.println(\"Failed to login.\");}
  
	}
}"
		}
	]
}

 * 
 * */
public class Challenge_M07L01_1 extends Exercise{

	double[] current_criteria = {0,0,0,0};
	double[] correct_criteria = {5,5,5,5};
	String code;
	
	
	public Challenge_M07L01_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
		code = files.get(0).getCode();
	}
	
	public Challenge_M07L01_1() {
		super();
	}
	
	@Override
	public void reviewExercise() {
		Pattern pat		=null;
	    Matcher mat		= null;
	    
		String ex 		= executionResult();

		String crit1 = "if(.|).(.|)userInput(.|)==(.|)username(.|).";
		String crit2 = "if(.|).(.|)userInput(.|)==(.|)password(.|).";
		String crit3 = "if(.|).(.|)a(.|)&&(.|)b(.|).";
		
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
