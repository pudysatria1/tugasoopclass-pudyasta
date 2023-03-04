public class AppPagar {
    public static void main(String[] args) {
        double ling1 = new Circle(4).getKeliling();
        double ling2 = new Circle(7.5).getKeliling();
        double ling3 = new Circle(5).getKeliling();
        double ling4 = new Circle(10).getKeliling();
        int kotak = new Rectangle(35,30).getKeliling();
        double luasPagar = kotak+ling2+ling3+ling4+ling1;
        System.out.println(luasPagar);
    }
}
