
public class Main {
    public static void main(String[] args) {

        Cliente Savio = new Cliente();

        Savio.setNomeCliente("savio");

        Conta cc = new ContaCorrente(Savio );
        Conta cc2 = new ContaCorrente(Savio);
        Conta poupanca = new ContaPoupanca(Savio);



        System.out.println(cc);
        System.out.println(cc2);
        System.out.println(poupanca);

        cc.depositar(1000);
        System.out.println(cc);

        cc.sacar(500);
        System.out.println(cc);
        System.out.println(cc2);


        cc.transferir(200, cc2);
        System.out.println(cc);
        System.out.println(cc2);



    }
}