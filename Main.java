public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int somaInt = calc.somar(10, 5);
        System.out.println("Soma (int): 10 + 5 = " + somaInt);

        double somaDouble = calc.somar(10.5, 5.3);
        System.out.println("Soma (double): 10.5 + 5.3 = " + somaDouble);

        int subtrairInt = calc.subtrair(10, 5);
        System.out.println("Subtração (int): 10 - 5 = " + subtrairInt);

        double subtrairDouble = calc.subtrair(10.5, 5.3);
        System.out.println("Subtração (double): 10.5 - 5.3 = " + subtrairDouble);
    }
}
