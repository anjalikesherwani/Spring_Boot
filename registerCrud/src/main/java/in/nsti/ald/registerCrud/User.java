package in.nsti.ald.registerCrud;



import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Data;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	String mail;
	String password;
	String Cpassword;
	String phone;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Data dob;
	boolean gender;
	boolean male;
	boolean female;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Data getDob() {
		return dob;
	}
	public void setDob(Data dob) {
		this.dob = dob;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
	    boolean f = false;
		boolean m = false;
		if (gender = f)
	    {
	        System.out.print("female");
	    }

	    else if (gender = m)
	    {
	        System.out.print("male");
	    }
	}
	
	
	public User(Long id, String name, String mail, String password, String cpassword, String phone, Data dob,
			boolean gender, boolean male, boolean female) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
		Cpassword = cpassword;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		
		boolean f = female;
	    boolean m = male;

	    if (gender = f)
	    {
	        System.out.print("female");
	    }

	    else if (gender = m)
	    {
	        System.out.print("male");
	    }
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password + ", Cpassword="
				+ Cpassword + ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + ", male=" + male
				+ ", female=" + female + "]";
	}
	
	

}
