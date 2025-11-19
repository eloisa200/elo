public class Modelo {
    private int senha;
    private String nome;
    private String genero;

    public Modelo(String genero, String nome, int senha) {
        this.genero = genero;
        this.nome = nome;
        this.senha = senha;
    }

    public String  verificarSala(){
        if (genero.equalsIgnoreCase("Masculino")) {

            if (senha%2 == 0) {
                return "Sala 1";
            } else {
                return "Sala 3";
            }
        } else {
            if (senha%2 == 0) {
                return "Sala 2";
            } else {
                return "Sala 4";
            }
        }
    }



}
