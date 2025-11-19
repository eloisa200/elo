public class TesteManualModelo {
    public static void main(String[] args){
        //objeto
        Modelo modelo = new Modelo("Masculino","Joelcio",2);
        System.out.println("Teste 1: Teste para verificar sala para modelo"
                + "masculino senha par" + modelo.verificarSala());

        //objeto
        Modelo modelo2 = new Modelo("Feminio","Marivalda",2);
        System.out.println("Teste 2: Teste para verificar sala para modelo"
                + "feminino senha par" + modelo2.verificarSala());

        //objeto
        Modelo modelo3 = new Modelo("Masculino","Astrubol",1);
        System.out.println("Teste 1: Teste para verificar sala para modelo"
                + "masculino senha impar" + modelo3.verificarSala());

        //objeto
        Modelo modelo4 = new Modelo("Feminino","Jucelia",1);
        System.out.println("Teste 1: Teste para verificar sala para modelo"
                + "feminino senha impar" + modelo4.verificarSala());
    }
}
