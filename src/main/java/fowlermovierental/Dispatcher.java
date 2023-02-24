package fowlermovierental;

import java.util.ArrayList;
import java.util.*;

public class Dispatcher {
    ArrayList<Interceptor> listInter = new ArrayList<Interceptor>();
    public void Attach(Interceptor inter){
        listInter.add(inter);
    }
    public void dispatch(ContextObject contextObj){
        Iterator iterate = listInter.iterator();
        while (iterate.hasNext()){
            Interceptor currentInter = (Interceptor) iterate.next();
            currentInter.intercept(contextObj);
        }
    }
}
