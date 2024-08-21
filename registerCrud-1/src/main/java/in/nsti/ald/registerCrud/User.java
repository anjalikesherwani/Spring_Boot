package in.nsti.ald.registerCrud;

import java.util.Date;

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
  String phone;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  Date dob;
  String passwd;
  String cpasswd;
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
 public String getPhone() {
  return phone;
 }
 public void setPhone(String phone) {
  this.phone = phone;
 }
 public Date getDob() {
  return dob;
 }
 public void setDob(Date dob) {
  this.dob = dob;
 }
 public String getPasswd() {
  return passwd;
 }
 public void setPasswd(String passwd) {
  this.passwd = passwd;
 }
 public String getCpasswd() {
  return cpasswd;
 }
 public void setCpasswd(String cpasswd) {
  this.cpasswd = cpasswd;
 }
 public User(Long id, String name, String mail, String phone, Date dob, String passwd, String cpasswd) {
  super();
  this.id = id;
  this.name = name;
  this.mail = mail;
  this.phone = phone;
  this.dob = dob;
  this.passwd = passwd;
  this.cpasswd = cpasswd;
 }

 public User() {
  // TODO Auto-generated constructor stub
 }
 
 @Override
 public String toString() {
  return "User [name=" + name + ", mail=" + mail + ", phone=" + phone + ", dob=" + dob + ", passwd=" + passwd
    + ", cpasswd=" + cpasswd + "]";
 }
  
  
 
}
