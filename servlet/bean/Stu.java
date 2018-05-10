package bean;

public class Stu {
	
	//Parameter define
	private String id=null;		//stu id
	private String name=null;	//stu name
	private String sex=null;
	private String group_number=null;
	private int age=0;
	private String tel=null;
	private String level=null;
	

	//others information
	private String pwd=null;		//stu pwd
	private boolean flag;	// the flag to login
	
	public Stu(){	
	}
	public Stu(String _id,String _pwd){
		setId(_id);
		setPwd(_pwd);
	}
	
	//method
	public String getId(){
		return this.id;		
	}
	public String getName(){
		return this.name;
	}
	public String getPwd(){
		return this.pwd;
	}
	//public String getkind(){}
	public int setId(String _id){
		if(_id!=null){
			this.id=_id;
			return 1;
		}
		else{
			return 0;
		}
	}
	public int setPwd(String _pwd){
		if(_pwd!=null){
			this.pwd=_pwd;
			return 1;
		}
		else{
			return 0;
		}
	}
	public int setName(String _name){
		if(_name!=null){
			this.name=_name;
			return 1;
		}
		else{
			return 0;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGroup_number() {
		return group_number;
	}
	public void setGroup_number(String group_number) {
		this.group_number = group_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
