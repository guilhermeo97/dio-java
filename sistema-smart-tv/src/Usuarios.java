public class Usuarios {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SmartTV2 smartTV = new SmartTV2();

        System.out.println("a TV está " + smartTV.ligada);
        System.out.println("O canal atual é " + smartTV.canal);
        System.out.println("O volume TV está" + smartTV.volume);

        smartTV.ligar();
        System.out.println("a TV está " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("a TV está " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("O volume TV está" + smartTV.volume);
        
        smartTV.mudarCanal(13);
        System.out.println("O canal atual é " + smartTV.canal);
    }
}
