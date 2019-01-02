
public class MilitaryArts extends Exercise {
	
	public void DoMilitaryArts(Status status){
		this.DoExercise(status);
		this.ChangeChangeSet();
		status.ChangeStatus(0, (1+changeSet), 0, 0, (2+changeSet));	//status °´Ã¼
		count++;
	}

}
