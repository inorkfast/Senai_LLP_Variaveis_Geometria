public class Retangulo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java Retangulo <base> <altura>");
            return;
        }
        double base = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
    }
}