package main.java.movierental;

public class ConcreteInterceptor implements Interceptor {
    public void intercept(ContextObject contextObj){
        System.out.println(contextObj.getMoviePrice());
        System.out.println(contextObj.getMovieTitle());
    }
}
