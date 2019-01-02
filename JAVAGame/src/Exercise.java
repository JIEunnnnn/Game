
public class Exercise extends Activity {
	
	public void DoExercise(Status status) {
		status.ChangeStatus(-5, 5, -5, 5, 0);	//status °´Ã¼ ÇÊ¿ä
	}
	public void DoStudy() {
		this.changeSet+=1;
	}

}
