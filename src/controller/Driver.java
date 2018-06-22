package controller;
import utilities.Dijkstra;
import utilities.ReadInput;
import utilities.Schedulling;
import utilities.SortRequest;
import utilities.OutputRevenue;

import java.io.IOException;

public class Driver {
    public static void main(String argv[]) throws IOException {
        ReadInput ri = new ReadInput();
        ri.readBasic();
        SortRequest sr = new SortRequest();
        sr.sortReq(ri.getReq());
        Dijkstra dj = new Dijkstra();
        for(int i=0;i<ri.getN();i++){
        	dj.dj(ri.getLocation(), ri.getN(), i);
        }
        Schedulling sd = new Schedulling();
        sd.schedule(ri.getCar(), ri.getReq(), ri.getLocation());
        OutputRevenue o = new OutputRevenue();
        o.writeOutput(ri.getCar());
    }
}
