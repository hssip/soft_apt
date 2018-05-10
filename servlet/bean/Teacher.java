package bean;

public class Teacher {
	//Parameter define
	private String id=null;		//stu id
	private String name=null;	//stu name
	private String sex=null;
	private String dep_number=null;
	private int age=0;
	private String rank=null;
	private String tel=null;
	private String pwd=null;		//stu pwd
	//private String kind="";
	//private boolean flag;	// the flag to login
	
	public Teacher(){

		
	}
	public Teacher(String _id,String _pwd){
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
	public String getSex() {
		return sex;
	}
	public String getDep_number() {
		return dep_number;
	}
	public int getAge() {
		return age;
	}
	public String getRank() {
		return rank;
	}
	public String getTel() {
		return tel;
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
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setDep_number(String dep_number) {
		this.dep_number = dep_number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}


}
