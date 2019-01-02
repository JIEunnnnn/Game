
public class HealthCare extends Study {
	
	public void DoHealthCare(Status status){
		this.DoStudy(status);
		status.ChangeStatus(0, 0, 0, -(0.5*count), 0);	//status 객체 / 피로감소 증가
	}

}
