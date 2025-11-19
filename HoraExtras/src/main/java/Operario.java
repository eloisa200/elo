public class Operario {
    private String nome;
    private int hoastrabalhadas;
    private double salario;

    public Operario(String nome, int hoastrabalhadas){
        this.nome = nome;
        this.hoastrabalhadas = hoastrabalhadas;
    }

    public int calcularHoraExtra(int hoastrabalhadas){
        if (hoastrabalhadas <= 50){
            return 0;
        } else {
            return hoastrabalhadas -50;
        }
    }
    public double calcularSalario(){
        if (this.calcularHoraExtra(hoastrabalhadas)==0){
            salario = hoastrabalhadas * 10;
            return salario;

        }else {
            salario = this.calcularHoraExtra(hoastrabalhadas) * 20 + 500;
            return salario;
        }
    }
}
