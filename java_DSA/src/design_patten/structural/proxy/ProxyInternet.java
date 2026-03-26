package design_patten.structural.proxy;

public class ProxyInternet implements Internet{
    Internet internet = new RealInternet();
    @Override
    public void connectTo(String site) {
        if(site.equals("blocked.com")){
            System.out.println("Access denied");
        }else{
            internet.connectTo(site);
        }
    }
}
