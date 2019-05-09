package myapp;

public class Student {
	private int sid;

	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + "]";
	}
	
	

}
