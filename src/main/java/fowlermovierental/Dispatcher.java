package main.java.movierental;

import java.util.ArrayList;
import java.util.*;

public class Dispatcher {
    ArrayList<Interceptor> listInter = new ArrayList<Interceptor>();
    public void Attach(Interceptor inter){
        listInter.add(inter);
    }
    public void dispatch(ContextObject contextObj){
        for (Interceptor currentInter : listInter) {
            currentInter.intercept(contextObj);
        }
    }
}
