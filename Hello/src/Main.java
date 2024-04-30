//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("olá Mundo, Meu nome é Sávio");


        // valores e variaveis
        String meuNome = "Savio";
        String segundoNome = "Cunha";
        int idade = 28;
        String sexo = "Masculino";

        String nomeCompleto = nomeCompleto(meuNome, segundoNome);

        System.out.println(nomeCompleto);
    }


        //metodo

        public static String nomeCompleto (String meuNome, String segundoNome){
            String nomeCompleto = meuNome+segundoNome;
            System.out.println(nomeCompleto);

            return meuNome.concat(" ").concat(segundoNome);
        }

}