public class Usuario {
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.println( "TV ligada? " + smartTv.ligado);
        System.out.println( "Qual canal? " + smartTv.canal);
        System.out.println( "Qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println( "novo status apos metodo - TV ligada? " + smartTv.ligado);

        smartTv.desligar();
        System.out.println( "novo status apos metodo - TV ligada? " + smartTv.ligado);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println( "Qual volume? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.mudarCanal(300);
        System.out.println( "Qual canal? " + smartTv.canal);


    }
}
