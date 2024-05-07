
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(new Multiplica());

        calculadora.setA(10);
        calculadora.setB(5);

        System.out.println("Resultado 1: "+ calculadora.Calculo());
        calculadora.setOper(new Adicao());
        System.out.println("Resultado 2: "+ calculadora.Calculo());

    }
}