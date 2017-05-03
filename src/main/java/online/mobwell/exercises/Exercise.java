package online.mobwell.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


import online.mobwell.util.PropertyValues;
import online.mobwell.util.Util;

public abstract class Exercise {

	private String name;
	private ArrayList<TraineeCode> files;
	private String date;
	private String userId;
	private double[] marks;
	

	private String executionError;

	public Exercise() {}


	/**
	 * @param name
	 * @param files
	 * @param date
	 */
	public Exercise(String name, String userId, ArrayList<TraineeCode> files) {
		this.name = name;
		this.userId = userId;
		this.files = files;
		this.date = Util.getDate();
		marks = new double[0];
	}

	/**
	 * Set the value for the marks, according to the criteria
	 */
	public abstract void reviewExercise();


	public String writeExecute() {
		save2Disk();
		executionResult();
		

		return "error saving file"; // TODO: Error code couldn't save file
	}

	protected void saveDb() {
	// TODO: Save to mongoDB the attempt
	}

	protected boolean save2Disk() {
		PropertyValues properties = new PropertyValues();
		String filesdir =(String) properties.getProp().get("javafilesdir") + "ex" + userId + "/";
		String errorsdir = (String) properties.getProp().get("errorfilesdir");
		String errorsfile  = errorsdir + "errors_" + userId + ".txt";
		FileOutputStream fop = null;
		File file;

		try {
			File dir = new File(filesdir);
			if (!dir.exists())
				dir.mkdirs();
				

			file = new File(filesdir + files.get(0).getFilename() + ".java");
			fop = new FileOutputStream(file);		

			// if file doesnt exists, then create it
			if (!file.exists()) {		
				file.createNewFile();
			}

			// get the content in bytes
			byte[] contentInBytes = files.get(0).getCode().getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	* Executes de program and shows the output
	*/
	protected String executionResult() {
		PropertyValues properties = new PropertyValues();
		String filesdir =(String) properties.getProp().get("javafilesdir") + "ex" + userId + "/";
		String errorsdir = (String) properties.getProp().get("errorfilesdir");
		String errorsfile  = errorsdir + "errors_" + userId + ".txt";

		
// TODO: multiple files

		ProcessBuilder probuilder = null;

		String s="javac "+ filesdir + files.get(0).getFilename() + ".java > "+ errorsfile + " 2>&1";
		try {
	//	String[] command = {"CMD", "/C", s};
		String[] command = {"/bin/sh", "-c", s};
						
			probuilder = new ProcessBuilder(command);

			probuilder.directory(new File(errorsdir));

			Process shell = probuilder.start();
			InputStream shellIn = shell.getInputStream();
			 
			// Wait for the shell to finish and get the return code
			int shellExitStatus = shell.waitFor();
			//System.out.println("Exit status: " + shellExitStatus);
			
///			String response = Util.convertStreamToStr(shellIn);
			 
			shellIn.close();

		} catch (IOException t) {
			System.out.println("ERROR listErrors");
		} catch (InterruptedException e) {
			// TODO CHUTAR ERRO PARA LOG
			e.printStackTrace();
		}

/*
		try {
			StringBuilder sb = new StringBuilder();
//			Files.readAllLines(Paths.get(errorsfile)).forEach(line -> sb.append(line));
			Files.lines(Paths.get(errorsfile));
			
			System.out.println("errors:" + sb.toString());
			executionError = sb.toString();
		}
	   	catch(IOException e) {}
	   	*/
		executionError = Util.readFile(errorsfile);
		System.out.println("errors:" + executionError);

		return executionError;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the files
	 */
	public ArrayList<TraineeCode> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 */
	public void setFiles(ArrayList<TraineeCode> files) {
		this.files = files;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the marks
	 */
	public double[] getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	/**
	 * @return the executionError
	 */
	public String getExecutionError() {
		return executionError;
	}

	/**
	 * @param executionError the executionError to set
	 */
	public void setExecutionError(String executionError) {
		this.executionError = executionError;
	}
}
