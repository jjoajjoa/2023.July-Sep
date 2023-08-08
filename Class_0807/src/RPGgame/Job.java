package RPGgame;
import java.util.Scanner;
//직업 - 직업이름 직업별스킬
public class Job {
	Scanner scan = new Scanner(System.in);
	
	private String job;
	
	Job() {
		job = "";
	}
	
	Job(String job) {
		this.job = job;
	}
	
	String getJob() {
		return job;
	}
	
	void jobChoice () {		
		job = scan.next();
		if (job.equals("도적")) {
			System.out.println("[system] <도적>을 선택하셨슴미당");
		} else if(job.equals("법사")) {
			System.out.println("[system] <법사>를 선택하셨슴미당");
		} else {
			System.out.print("[system] 똑바로 입력하세용  ");
			this.jobChoice();
		}
	}
	
	
	
}
