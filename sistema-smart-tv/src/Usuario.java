public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume: " + smartTv.volume);
        
        smartTv.passarCanal();
        System.out.println("Novo Status-> Canal: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal Selecionado: " + smartTv.canal);
    }
}
