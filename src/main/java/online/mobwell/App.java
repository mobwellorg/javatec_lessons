package online.mobwell;

import org.json.JSONArray;

import online.mobwell.ex_solutions.Exercicio4;
import online.mobwell.ex_solutions.MockupData;
import online.mobwell.network.Comm;
import online.mobwell.util.PropertyValues;

/**
 * Hello world!
 *
 */
public class App 
{
	public static PropertyValues properties;

    public static void main( String[] args )
    {
		properties = new PropertyValues();

		Comm c = new Comm();
		c.startServer();
/*		
		String code = MockupData.inputEx4;
		int[] results = new Exercicio4(code).review(code);
		JSONArray jr = new JSONArray(results);

		System.out.println(jr.toString());
		*/
    }
}
