
public class title extends Status {

	String [] title;
	int titleCount=0;	//칭호 수
	
	Player player = new Player();
	
	public title(Status status) {
		
		if(iFat > 95 &&  iMuscle > 45  ) 
			System.out.print(player.name+ "는(은) 운동에만 열중한 몸을 가졌으며");
		else if(iFat> 95 && iMuscle <5)
			System.out.print(player.name+"는(은) 고도 비만이며");
		else if(iFat< 55 && iMuscle > 45)
			System.out.print(player.name+"는(은) 이상적인 몸을 가졌으며");
		else if(iFat< 55 && iMuscle <5)
			System.out.print(player.name+"는(은) 너무 말랐으며");
		else 
			System.out.print(player.name+"는(은) 평균적인 몸를 가지고 있으며");
		
		if(iSatiety > 70 && iFatigue > 70 )
			System.out.print(" 바쁘지만 괜찮은 일상과");
		else if(iSatiety > 70 && iFatigue < 30 )
			System.out.print(" 만족스러운 일상과");
		else if(iSatiety < 30 && iFatigue > 70 )
			System.out.print(" 피곤하기만 한 일상과");
		else if(iSatiety < 30 && iFatigue < 30 )
			System.out.print(" 조용한 일상과");
		else
			System.out.print(" 평범한 일상과");
			
		if(iPleasure > 10 )
			System.out.print(" 행복한 삶을 살고있다.");
			else 
				System.out.print(" 불행한 삶을 살고있다.");
		
	}
	
	





}
