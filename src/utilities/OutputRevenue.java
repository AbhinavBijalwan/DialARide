package utilities;

public class OutputRevenue {
	int totalRevenue=0;
    public void writeOutput(Car car[]){
    	int i;
    	for(i=0;i<car.length;i++){
    		totalRevenue+=car[i].getRevenue();
    	}
    	System.out.println("total Revenue : "+totalRevenue);
    }
}
