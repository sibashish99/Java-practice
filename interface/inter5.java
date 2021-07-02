interface myCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k........");
    }
}
interface myWifi{
    String[] getNetwork();
    void connectToNetwork(String network); 
}
class myCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }
   
}
class MySmartPhone extends myCellphone implements myWifi,myCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking video....");
    }
    public void record4kVideo(){
        System.out.println("Taking snap and Recording in 4k");
    }
    Public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList ={"Railwire","Jio Fibre","Airtel xtreme","BSNL FTTH"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting...."+ network);
    }
}
class inter5{
    public static void main(String[] args){
        MySmartPhone m1=new MySmartPhone();
        ms.record4kVideo();
        m1.takeSnap();
        m1.recordVideo();
        String[] arr=ms.getNetwork();
        for(String item : arr){
            System.out.println(item);
        }
        m1.connectToNetwork();
    }
}