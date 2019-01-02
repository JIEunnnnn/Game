
public class Eating extends Relax {
	
	 public void DoEating(Status status){
		 this.DoRelax(status);
		 status.ChangeStatus(1, -1, 5, 0, 0);	//status¿« ∞¥√º
	 }

}
