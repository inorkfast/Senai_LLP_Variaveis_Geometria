public class Caixa {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Caixa <largura> <altura> <profundidade>");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double area = 2 * (a*b + a*c + b*c);
        System.out.println("Área da caixa " + area);
    }
}