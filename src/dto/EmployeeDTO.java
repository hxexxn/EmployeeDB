package dto;

public class EmployeeDTO {
	
	private int eNumber;
	private String eName;
	private String eId;
	private String ePw;
	private String ePart;
	
	
	public int geteNumber() {
		return eNumber;
	}
	public void seteNumber(int eNumber) {
		this.eNumber = eNumber;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getePw() {
		return ePw;
	}
	public void setePw(String ePw) {
		this.ePw = ePw;
	}
	public String getePart() {
		return ePart;
	}
	public void setePart(String ePart) {
		this.ePart = ePart;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [eNumber=" + eNumber + ", eName=" + eName + ", eId=" + eId + ", ePw=" + ePw + ", ePart="
				+ ePart + "]";
	}
	
	
	
	
	
	
}
