package chapter06;

public class TeamGroup {

	//field
	private TeamMember member[] = new TeamMember[6];
	
	
	//method
	public void init() {
		member[0] = new TeamMember("박창훈", "M");
		member[1] = new TeamMember("이석진", "M");
		member[2] = new TeamMember("박찬우", "M");
		member[3] = new TeamMember("이세정", "F");
		member[4] = new TeamMember("장준근", "M");
		member[5] = new TeamMember("한성무", "M");
	}
	
	//printout method
	public void Disp() {
		
		for(int i = 0; i < member.length; i++) {
			System.out.println("이름 : " + member[i].getName() + " | 성별 : " + member[i].getGender());
		}
	}
}
