public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Estado da Tv: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Estado da Tv: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Volume da Tv: " + smartTv.volume);
        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        System.out.println("Novo Volume da Tv: " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal da Tv: " + smartTv.canal);
        smartTv.mudarCanal(11);
        System.out.println("Novo Canal da Tv: " + smartTv.canal);
    }
}
