
public class Status {
	
	double fat;
	double muscle;
	//double luck	
	double satiety;	//������ -> ������ �ٲ�
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
	
	public void ChangeStatus(double fat, double muscle, double satiety, double fatigue, double pleasure){//�������ͽ� �� ��ȭ
		this.fat+=fat;
		this.muscle+=muscle;
		this.satiety+=satiety;
		this.fatigue+=fatigue;
		this.pleasure+=pleasure;
	}
	
	public int Integer(double value) {	//�Ǽ��� 0~100 ���� ������ ��ȯ
		if(value<0) return 0;
		else if(value>101) return 100;
		else return (int)value;
	}
	
	public void StatusToInt(Status status) {	//�������ͽ� ����ȭ
		iFat=Integer(status.fat);
		iMuscle=Integer(status.muscle);
		//iLuck=Integer(status.luck);
		iSatiety=Integer(status.satiety);
		iPleasure=Integer(status.pleasure);
		iFatigue=Integer(status.fatigue);
	}

}
