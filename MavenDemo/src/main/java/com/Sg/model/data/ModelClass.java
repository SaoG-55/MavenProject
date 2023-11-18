package com.Sg.model.data;

public class ModelClass 
{
	//data stored in a model class obj acc to MVC//
	private int uid;
	private String uname;
	private String pswd;
	private String uemail;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "ModelClass [uid=" + uid + ", uname=" + uname + ", pswd=" + pswd + ", uemail=" + uemail + "]";
	}
	
	
}
