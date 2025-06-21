public class Bola {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Bola <raio>");
            return;
        }
        double raio = Double.parseDouble(args[0]);
        double area = 4 * Math.PI * Math.pow(raio, 2);
        System.out.println("Área da bola: " + area);
    }
}