
public class title extends Status {

	String [] title;
	int titleCount=0;	//Īȣ ��
	
	Player player = new Player();
	
	public title(Status status) {
		
		if(iFat > 95 &&  iMuscle > 45  ) 
			System.out.print(player.name+ "��(��) ����� ������ ���� ��������");
		else if(iFat> 95 && iMuscle <5)
			System.out.print(player.name+"��(��) �� ���̸�");
		else if(iFat< 55 && iMuscle > 45)
			System.out.print(player.name+"��(��) �̻����� ���� ��������");
		else if(iFat< 55 && iMuscle <5)
			System.out.print(player.name+"��(��) �ʹ� ��������");
		else 
			System.out.print(player.name+"��(��) ������� ���� ������ ������");
		
		if(iSatiety > 70 && iFatigue > 70 )
			System.out.print(" �ٻ����� ������ �ϻ��");
		else if(iSatiety > 70 && iFatigue < 30 )
			System.out.print(" ���������� �ϻ��");
		else if(iSatiety < 30 && iFatigue > 70 )
			System.out.print(" �ǰ��ϱ⸸ �� �ϻ��");
		else if(iSatiety < 30 && iFatigue < 30 )
			System.out.print(" ������ �ϻ��");
		else
			System.out.print(" ����� �ϻ��");
			
		if(iPleasure > 10 )
			System.out.print(" �ູ�� ���� ����ִ�.");
			else 
				System.out.print(" ������ ���� ����ִ�.");
		
	}
	
	





}
