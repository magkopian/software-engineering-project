
abstract public class User {

	
	int uid, sex, type;
	String username, password, firstname, surname, tin, adress, phone;
	
	
	public User(int uid, String username, String password, String firstname, String surname,String tin, String adress, String phone, int sex, int type){
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		this.tin = tin;
		this.adress = adress;
		this.phone = phone;
		this.sex = sex;
		this.type = type;
		
	}

}