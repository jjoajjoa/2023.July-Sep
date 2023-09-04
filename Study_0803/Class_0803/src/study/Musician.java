package study;
// 가수 설계도
public class Musician {

	String groupName;
	int groupMem;
	String song;
	
	Musician() {
		
	}
	
	Musician(String groupName, int groupMem, String song) {
		this.groupName = groupName;
		this.groupMem = groupMem;
		this.song = song;
	}

	
	void singer() {
		System.out.println("그룹명: " + groupName);
	}
	
	void whatSong() {
		System.out.println(groupName + "가 부릅니다. " + song);
	}
	
	void member() {
		System.out.println(groupName + "의 멤버수는 " + groupMem +"명 이에용");
	}
}
