package docFile;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	public String name;
	public String adress;
	public String gender;
	public String birthday ;
	
	public Person(String name, String adress, String gender, String df) {
		super();
		this.name = name;
		this.adress = adress;
		this.gender = gender;
		this.birthday  = df;
	}
	public Person()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday ;
	}
	public void setDf( String df) {
		this.birthday  = df;
	}
	public void showInfor()
	{
		System.out.println("name:" + this.name);
		System.out.println("adress:" + this.adress);
		System.out.println("gender:" + this.gender);
		System.out.println("birthday:" + this.birthday);
	}
}
