public class MainDemo {
    public static void main(String[] args) throws InterruptedException {
        CallApi obj=new CallApi();
//        obj.getRates();
//        Thread t=new Thread();

        obj.run();
        while (true){
        System.out.println(CallApi.res);
        Thread.sleep(1222);
        }
    }
}
