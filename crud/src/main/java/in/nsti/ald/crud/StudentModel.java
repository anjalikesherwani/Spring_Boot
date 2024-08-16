package in.nsti.ald.crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
	@Id
	long id;
	
	String fname;
	String lname;
	String mail;
	String password;
	String Cpassword;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return Cpassword;
	}
	public void setCpassword(String cpassword) {
		Cpassword = cpassword;
	}
	public StudentModel(String fname, String lname, String mail, String password, String cpassword) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
		this.password = password;
		Cpassword = cpassword;
	}
	public StudentModel(long id) {
		super();
		this.id = id;
	}
	public StudentModel() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mail=" + mail + ", password="
				+ password + ", Cpassword=" + Cpassword + "]";
	}
	
	
	
	

}
