package online.mobwell.exercises;

public class TraineeCode {
	private String filename;
	private String code;

	/**
	 * @param filename
	 * @param code
	 */
	public TraineeCode(String filename, String code) {
		this.filename = filename;
		this.code = code;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		this.filename = code.substring(code.indexOf("class") + 5, code.indexOf("{")).trim();
		
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
}


