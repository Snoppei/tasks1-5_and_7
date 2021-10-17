package vsu.negulyaevPavelNikolaevich;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static final Line L1 = new Line(0,  -0.8, 0.6); // проверено
    public static final Line L2 = new Line(0, -3.4, 0.6); // проверено
    public static final HorizontalParabola P1 = new HorizontalParabola(-1, 4, 0.25 ); // проверено
    public static final HorizontalParabola P2 = new HorizontalParabola(-3, 2,0.5); // проверено
    public static final HorizontalParabola P3 = new HorizontalParabola(-5, -6, 0.5); // проверено

    public static SimpleColor getColor(double x, double y) {

        if (y > 3 && P1.isPointRightOfParabola(x, y) && !P2.isPointRightOfParabola(x, y)) {
            return SimpleColor.GRAY; }

        if (P1.isPointRightOfParabola(x, y) && P2.isPointRightOfParabola(x, y) && L1.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW; }

        if (!P1.isPointRightOfParabola(x, y) && P2.isPointRightOfParabola(x, y) && L1.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE; }

        if(!P1.isPointRightOfParabola(x, y) && P2.isPointRightOfParabola(x, y) &&
                !L1.isPointAboveLine(x, y) && L2.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW; }

        if (P2.isPointRightOfParabola(x, y) && P1.isPointRightOfParabola(x, y) && !P3.isPointRightOfParabola(x, y)
            && !L2.isPointAboveLine(x, y)){
            return SimpleColor.ORANGE; }

        if (P1.isPointRightOfParabola(x, y) && P2.isPointRightOfParabola(x, y) && P3.isPointRightOfParabola(x, y)) {
            return SimpleColor.YELLOW; }

        if (P3.isPointRightOfParabola(x, y) && L2.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW; }

        else { return SimpleColor.WHITE; }
    }


    public static void printColorForPoint(double x, double y) {
        if(x > 10 || x < -10 || y < -10 || y >10 ) {
            System.out.println("Неверные значения X или Y");
        } else {
        System.out.println("("+x+", " +y+") -> " + getColor(x, y)); }
    }

    public static void Input()
    {
        System.out.print("Input X: ");
        double x = scanner.nextDouble();
        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }



    public static void main(String[] args) {

	printColorForPoint(1,6);
    printColorForPoint(1,2);
    printColorForPoint(1,0);
    printColorForPoint(1,-0.5);
    printColorForPoint(8,0);
    printColorForPoint(8,-2);
    printColorForPoint(0,-3);
    printColorForPoint(-8,-1);

    Input();
    }
}
