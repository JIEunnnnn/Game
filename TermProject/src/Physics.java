
public class Physics extends Study {
	
	void DoPhysics(Status status, HealthPT healthPT, Sports sports, MilitaryArts militaryArts){
		this.DoStudy(status);
		healthPT.DoStudy();	//healthPT�� ��ü
		sports.DoStudy();	//sports�� ��ü
		militaryArts.DoStudy();	//militaryArts�� ��ü
	}
	{
	 
	}

}
