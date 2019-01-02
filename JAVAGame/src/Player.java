import java.util.Scanner;

public class Player {
	
	Scanner scan=new Scanner(System.in);
	String name;
	String [] title=new String[3];
	int titleCount=0;	//칭호 수
	int day=30;	//디데이
	
	String weightString1="운동에만 열중한 몸을 가졌으며";
	String weightString2="고도 비만이며";
	String weightString3="이상적인 몸을 가졌으며";
	String weightString4="너무 말랐으며";
	String weightString5="평균적인 몸를 가지고 있으며";
	
	String lifeString1=" 바쁘지만 괜찮은 일상과";
	String lifeString2=" 만족스러운 일상과";
	String lifeString3=" 피곤하기만 한 일상과";
	String lifeString4=" 조용한 일상과";
	String lifeString5=" 평범한 일상과";
	
	String happyString1=" 행복한 삶을 살고있다.";
	String happyString2=" 불행한 삶을 살고있다.";
	
	String nextLine="\n";
	
	public Player() {
		
	}
	
	public void title(Status status) {
		if(status.iFat > 95 &&  status.iMuscle > 45  ) 
			title[0]=weightString1;
		else if(status.iFat> 95 && status.iMuscle <5)
			title[0]=weightString2;
		else if(status.iFat< 55 && status.iMuscle > 45)
			title[0]=weightString3;
		else if(status.iFat< 55 && status.iMuscle <5)
			title[0]=weightString4;
		else 
			title[0]=weightString5;
		
		if(status.iSatiety > 70 && status.iFatigue > 70 )
			title[1]=lifeString1;
		else if(status.iSatiety > 70 && status.iFatigue < 30 )
			title[1]=lifeString2;
		else if(status.iSatiety < 30 && status.iFatigue > 70 )
			title[1]=lifeString3;
		else if(status.iSatiety < 30 && status.iFatigue < 30 )
			title[1]=lifeString4;
		else
			title[1]=lifeString5;
		
		if(status.iPleasure > 10 )
			title[2]=happyString1;
		else 
			title[2]=happyString2;
	}

}
