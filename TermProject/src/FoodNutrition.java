
public class FoodNutrition extends Study {
	
	public void DoFoodNutrition(Status status){
		this.DoStudy(status);
		status.ChangeStatus(0, 0, (0.5*count), 0, 0);	//status의 객체 / 식사 포만감 증가
	}

}
