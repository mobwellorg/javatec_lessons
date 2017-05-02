package online.mobwell.exercises.module_4;

import java.util.ArrayList;

import online.mobwell.exercises.Exercise;
import online.mobwell.exercises.TraineeCode;

public class Challenge_M04L01_1 extends Exercise {

	/**
	 * @param name
	 * @param files
	 * @param date
	 */
	public Challenge_M04L01_1(String name, String userId, ArrayList<TraineeCode> files) {
		super(name, userId, files);
	}

	/**
	 *
	 */
	public Challenge_M04L01_1() {
		super();
	}

	public void reviewExercise() {
//		marks = new marks[tamanho_criteria]
		String ex = executionResult();
		
		setMarks(new double[]{3.41, 5.6, 7, 3}); 
	}
}
