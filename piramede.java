public class Piramide {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java Piramide <base> <alturaTriangulo>");
            return;
        }
        double base = Double.parseDouble(args[0]);
        double alturaTriangulo = Double.parseDouble(args[1]);
        double areaBase = Math.pow(base, 2);
        double areaLateral = 4 * (base * alturaTriangulo) / 2;
        double areaTotal = areaBase + areaLateral;
        System.out.println("Área da pirâmide: " + areaTotal);
    }
}