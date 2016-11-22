import java.util.ArrayList;


public class paintWizard {
	
	paintWizard(){
		
	}
	
	ArrayList<paintSupplier> suppliers = new ArrayList<paintSupplier>();
	
	public void addPaint(paintSupplier paint){
		suppliers.add(paint);
	}
	
	public void listPaints(){
		for(paintSupplier paint : suppliers){
			System.out.println(paint.getBrand());
		}
		
	}
	
	public int [] noOfTins(int surfA){
				int[] noOfTins =new int [suppliers.size()];
				int counter = 0;
				for(paintSupplier paint : suppliers){
					if(surfA%paint.getCoverage()==0){
						noOfTins[counter++] = surfA/paint.getCoverage();
					}
					else{
					noOfTins[counter++] = (surfA/paint.getCoverage()) +1;
					}		
					}
				return noOfTins;
			}
	
	public int calculator(int surfA){
		
		double[] cost = new double [suppliers.size()];
		
		
		int [] array = noOfTins(surfA);
		int counter = 0;
		for(paintSupplier paint: suppliers){
			cost[counter] = array[counter] * paint.getPrice();
			counter++;
		}
		
		int minIndex = 0;
		for(int i=0, n=cost.length; i<n ; i++){
		minIndex = cost[minIndex]<cost[i] ? minIndex:i;
		}	
		
		return minIndex;
	
	}
	
	public void cheapest(int surfA){
		int cheap = calculator(surfA);
		paintSupplier paint = suppliers.get(cheap);
		System.out.println("The cheapest paint is "+ paint.getBrand());
	}
	
	public void leastWaste(double surfA){
		double [] waste  = new double[suppliers.size()];
		int counter = 0;
		for(paintSupplier paint: suppliers){
			if(surfA%paint.getCoverage()==0){
				waste[counter++] = 0;
			}
			else{
			waste[counter++] = ((paint.getCoverage() -surfA%paint.getCoverage())/paint.getLpm2());
					}
		}
		
		 int minIndex = 0;
		 for(int i=0, n=waste.length; i<n ; i++){
			 minIndex  = waste[minIndex]<waste[i] ? minIndex:i;
		 }
		 
		 paintSupplier paint = suppliers.get(minIndex);
		 System.out.println("The paint that wastes the least amount of paint is "+ paint.getBrand());
		
	}
	
	}

