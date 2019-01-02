
public class Status {
	
	double fat;
	double muscle;
	//double luck	
	double satiety;	//공복도 -> 포만감 바꿈
	double fatigue;
	double pleasure;
	int iFat;
	int iMuscle;
	//int iLuck;
	int iSatiety;
	int iPleasure;
	int iFatigue;
	
	public Status() {
		fat=75;
		muscle=25;
		satiety=75;
		fatigue=25;
		pleasure=0;
		this.StatusToInt(this);
	}
	
	public void ChangeStatus(double fat, double muscle, double satiety, double fatigue, double pleasure){//스테이터스 값 변화
		this.fat+=fat;
		this.muscle+=muscle;
		this.satiety+=satiety;
		this.fatigue+=fatigue;
		this.pleasure+=pleasure;
	}
	
	public int Integer(double value) {	//실수를 0~100 사이 정수로 변환
		if(value<0) return 0;
		else if(value>101) return 100;
		else return (int)value;
	}
	
	public void StatusToInt(Status status) {	//스테이터스 정수화
		iFat=Integer(status.fat);
		iMuscle=Integer(status.muscle);
		//iLuck=Integer(status.luck);
		iSatiety=Integer(status.satiety);
		iPleasure=Integer(status.pleasure);
		iFatigue=Integer(status.fatigue);
	}

}
