import java.util.Scanner;

public class Player {
	
	Scanner scan=new Scanner(System.in);
	String name;
	String [] title=new String[3];
	int titleCount=0;	//Īȣ ��
	int day=30;	//����
	
	String weightString1="����� ������ ���� ��������";
	String weightString2="�� ���̸�";
	String weightString3="�̻����� ���� ��������";
	String weightString4="�ʹ� ��������";
	String weightString5="������� ���� ������ ������";
	
	String lifeString1=" �ٻ����� ������ �ϻ��";
	String lifeString2=" ���������� �ϻ��";
	String lifeString3=" �ǰ��ϱ⸸ �� �ϻ��";
	String lifeString4=" ������ �ϻ��";
	String lifeString5=" ����� �ϻ��";
	
	String happyString1=" �ູ�� ���� ����ִ�.";
	String happyString2=" ������ ���� ����ִ�.";
	
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
