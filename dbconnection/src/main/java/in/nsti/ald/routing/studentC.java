package in.nsti.ald.routing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table
public class studentC {

		@Id
		
		@Column(name="First name")
		private String fname;
		@Column(name="Last name")
		private String lname;
		@Column(name="E-MAIL")
		private String mail;
		@Column
		private String phone;
		
		public studentC(String fname, String lname, String mail, String phone) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.mail = mail;
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "studentC [fname=" + fname + ", lname=" + lname + ", mail=" + mail + ", phone=" + phone + "]";
		}
		
		
		}


