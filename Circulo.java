public class Circulo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Circulo <raio>");
            return;
        }
        double raio = Double.parseDouble(args[0]);
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
    }
}