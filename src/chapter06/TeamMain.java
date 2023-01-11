package chapter06;

public class TeamMain {

	public static void main(String[] args) {
	
		TeamGroup tg = new TeamGroup();
		TeamMember tm = new TeamMember();
		//메서드를 통해 팀명 초기화
		
		tm.setTeamName("7전8D");
		System.out.println("팀명 : " + tm.getTeamName());// private이면 
		System.out.println("-------------------------");
		System.out.println("-------[팀원 명단]-------");
		tg.init();//초기화
		tg.Disp();//출력

		System.out.println("-------------------------");
		
		tm.setmName("박창훈");
		tm.setmPhone("010-9186-0744");
		tm.setsName("이석진");
		
		System.out.println("팀장 : " + tm.getmName() + " | 팀장 전화번호 : " + tm.getmPhone() + " | 부팀장 : " + tm.getsName());
		
	}//m

}//c
