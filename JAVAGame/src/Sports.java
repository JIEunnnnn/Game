
public class Sports extends Exercise {
	
	public void DoSports(Status status){
		this.DoExercise(status);
		this.ChangeChangeSet();
		status.ChangeStatus(-(1+changeSet), (1+changeSet), 0, 0, (1+changeSet));	//status °´Ã¼ ÇÊ¿ä
		count++;
	}

}
