package chapter06;

public class TeamMember {

	//멤버변수
	String teamName;
	String mName; //팀장
	String mPhone;
	String sName; //부팀장
	String Name; //팀원
	String gender; //팀원성별
	
	public TeamMember() {
		// TODO Auto-generated constructor stub
	}//dc
	
	public TeamMember(String name, String gender) {
		this.Name = name;
		this.gender = gender;
	}//olC

	//method
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getmName() {
		return mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public String getsName() {
		return sName;
	}

	public String getName() {
		return Name;
	}

	public String getGender() {
		return gender;
	}


	
}//c
