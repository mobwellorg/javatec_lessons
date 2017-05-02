package online.mobwell.exercises;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import online.mobwell.exercises.module_4.Challenge_M04L01_1;

public class ChaSwitch {

	Exercise ex;


	/**
	 *
	 */
	public ChaSwitch(Exercise ex) {

		this.ex = ex;
	}

	public static ChaSwitch getSwitch(String exercise) {

		JSONObject jobj = new JSONObject(exercise);

		String name = jobj.getString("name");
		String userId = jobj.getString("userId");
		JSONArray jar = jobj.getJSONArray("files");

		ArrayList<TraineeCode> arcode = new ArrayList<TraineeCode>();
		for (int i=0; i < jar.length(); i++) {
			JSONObject jobj_ar = jar.getJSONObject(i);

			arcode.add(new TraineeCode(jobj_ar.getString("filename"),
						jobj_ar.getString("code")
						));
		}

		Exercise ex_certo = null;

		switch (name) {
			case "M04L01_1" : { ex_certo = new Challenge_M04L01_1(name, userId, arcode); break;}
		}

		return new ChaSwitch(ex_certo);
	}

	/**
	 * @return the ex
	 */
	public Exercise getEx() {
		return ex;
	}

	/**
	 * @param ex the ex to set
	 */
	public void setEx(Exercise ex) {
		this.ex = ex;
	}
}
