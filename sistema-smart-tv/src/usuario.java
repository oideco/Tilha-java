public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(" TV ligada ? " + smartTv.ligada);
        System.out.println(" Volume atual : " + smartTv.volume);
        System.out.println(" Canal atual : " + smartTv.canal);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(" Volume atual : " + smartTv.volume);
       
       
        smartTv.mudarCanal(13);
        System.out.println(" Canal atual : " + smartTv.canal);
       
       
        smartTv.ligar ();
        System.out.println(" TV ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println(" TV ligada ? " + smartTv.ligada);
    }

}
