package utilities;

public class SortRequest {
	private Request r;

	public void sortReq(Request[] req) {
		r = new Request();
		for (int i = 0; i < req.length; i++) {
			for (int j = i+1; j < req.length; j++) {
				if (req[i].getEndTime() > req[j].getEndTime()) {
					r = req[i];
					req[i] = req[j];
					req[j] = r;
				}
			}
		}
	/*	for(int i=0;i<req.length;i++){
			System.out.println(""+req[i]);
		}*/
	}
}
