public class Tubo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java Tubo <raio> <altura>");
            return;
        }
        double raio = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);
        double area = 2 * Math.PI * raio * (raio + altura);
        System.out.println("Área do tubo: " + area);
    }
}