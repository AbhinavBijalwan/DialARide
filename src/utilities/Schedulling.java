package utilities;

import constants.Constants;

public class Schedulling {
    /*public void schedule(Car car[], Request r[], int loc[][]){
    	//To send car to destination
    	
    	for(int i=0;i<r.length;i++){
    		int carNumber=0;
    		//Loop to find car who will serve first
    		for(int k=0;i<car.length;i++){
    			if(car[k].getCap()>0){
    				carNumber=k;
    			}
    		}
    		if(car[carNumber].getLocation()!=r[i].getSrc()){
    			int srtDist=loc[((car[carNumber].getLocation())-1)][((r[i].getSrc())-1)];
				car[carNumber].setLocation(r[i].getSrc());
				car[carNumber].setCarTime(2*srtDist);
    		}
    		//Wait Car
    		if(car[carNumber].getCarTime()<r[i].getSrtTime()){
				car[carNumber].setCarTime(r[i].srtTime);
			}
    			System.out.println("in set rev"+car[carNumber].getCap());
    		//Schedulling a request
    		if(car[carNumber].getCap()!=0 && (car[carNumber].getCarTime()>=r[i].getSrtTime()) && car[carNumber].getCarTime()<=r[i].endTime){
    			car[carNumber].setRevenue(car[carNumber].getRevenue()+loc[(car[carNumber].getLocation()-1)][r[i].getDest()-1]);
    			car[carNumber].setCap(car[carNumber].getCap()-1);
    			int indeces[] = car[carNumber].getPassengerLocation();
    			System.out.println(Constants.requestServed+r[i].getSrc()+" "+r[i].getDest()+" "+r[i].getSrtTime() +" "+r[i].getEndTime());
    			//int index=0;
    			try{
    				for(int j=0;j<5;j++){
    					if(indeces[j]==0){
    						indeces[j]=r[i].getDest();
    						break;
    					}
    				}
    			}catch(NullPointerException e){
    				System.out.println("Not Served : "+(i+1));
    			}
    			car[carNumber].setPassengerLocation(indeces);
    		}
    		if(car[carNumber].getCap()==5){
    			int[] dropLocations = car[carNumber].getPassengerLocation();
    			for(int j=0;j<dropLocations.length;j++){
    				if(car[carNumber].getLocation()!=dropLocations[i]){
    					int srtDist=loc[(car[carNumber].getLocation())-1][dropLocations[i]-1];
    					car[carNumber].setLocation(dropLocations[i]);
    					car[carNumber].setCarTime(car[carNumber].getCarTime()+(2*srtDist));
    				}
    				car[carNumber].setCap(car[carNumber].getCap()-1);
    				car[carNumber].passengerLocationReset();
    			}
    		}
    	}
    }*/
	public void schedule(Car car[],Request r[],int loc[][]){
		for(int i=0;i<r.length;i++){
			int carNumber=0;
			for(int k=0;k<car.length;k++){
				if(car[k].getCap()>0){
					carNumber=k;
				}
			}
			if(car[carNumber].getLocation()!=r[i].getSrc()){
				int srtDist=loc[((car[carNumber].getLocation())-1)][(r[i].getSrc())-1];
				car[carNumber].setLocation(r[i].getSrc());
				car[carNumber].setCarTime(2*srtDist);
			}
			//wait car
			if(car[carNumber].getCarTime()<r[i].getSrtTime()){
				car[carNumber].setCarTime(r[i].srtTime);
			}
			//scheduling a request
			if(car[carNumber].getCap()!=0 && (car[carNumber].getCarTime()>=r[i].getSrtTime()) && car[carNumber].getCarTime()<=r[i].endTime){	
				car[carNumber].setRevenue(car[carNumber].getRevenue()+(loc[(car[carNumber].getLocation())-1][(r[i].getDest())-1]));
				car[carNumber].setCap(car[carNumber].getCap()-1);
				int []indeces=car[carNumber].getPassengerLocation();
				System.out.println(Constants.requestServed+r[i].getSrc()+" "+r[i].getDest()+" "+r[i].getSrtTime() +" "+r[i].getEndTime());
				for(int j=0;j<5;j++){
					if(indeces[j]==0){
						indeces[j]=r[i].getDest();
						break;
					}
				}
				car[carNumber].setPassengerLocation(indeces);
			}
			//drop passenger respective locations
			if(car[carNumber].getCap()==5){
				int []dropLocations=car[carNumber].getPassengerLocation();
				for(int j=0;j<dropLocations.length;j++){
					if(car[carNumber].getLocation()!=dropLocations[i]){
						int srtDist=loc[(car[carNumber].getLocation())-1][(dropLocations[i])-1];
						car[carNumber].setLocation(dropLocations[i]);
						car[carNumber].setCarTime(car[carNumber].getCarTime()+(2*srtDist));
					}
					car[carNumber].setCap(car[carNumber].getCap()-1);
					car[carNumber].passengerLocationReset();
				}
			}
		}
	}
}

