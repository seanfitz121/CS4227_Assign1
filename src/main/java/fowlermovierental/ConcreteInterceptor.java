package fowlermovierental;

public class ConcreteInterceptor implements Interceptor {
    public void intercept(ContextObject contextObj){
        System.out.println(contextObj.getPriceCode());
        System.out.println(contextObject.getMovieTitle());
    }
}
