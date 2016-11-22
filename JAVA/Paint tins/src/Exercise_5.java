
public class Exercise_5 {

	public static void main(String[] args) {
		paintSupplier cheapoMax = new paintSupplier("Cheapomax",19.99,20,200,10);
		paintSupplier averageJoes = new paintSupplier("AvererageJoes",17.99,15,165,11);
		paintSupplier duluxourousPaints = new paintSupplier("DuluxourousPaints",25.00,10,200,20);
		
		paintWizard BQ = new paintWizard();
		BQ.addPaint(cheapoMax);
		BQ.addPaint(averageJoes);
		BQ.addPaint(duluxourousPaints);
		
		BQ.listPaints();
		BQ.leastWaste(170);
	}

}
