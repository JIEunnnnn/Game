
public class HealthPT extends Exercise {
	
	public void DoHealthPT(Status status){
		this.DoExercise(status);
		this.ChangeChangeSet();
		status.ChangeStatus(-(1+changeSet), (2+changeSet), 0, 0, 0);	//status °´Ã¼
		count++;
	}

}
