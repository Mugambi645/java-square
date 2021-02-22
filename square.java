import java.util.Scanner;
class SquareFinder {
    static void _squareFind() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length:");
        int _length = myObj.nextInt();
        System.out.println("Enter the width: ");
        int _width = myObj.nextInt();
        if (_length == _width) {
            System.out.println("This is a square");

        } else {
            System.out.println("This is not a square.\nA square must have equal both sides!");

        }
        System.out.println("Width is: " + _width);
        System.out.println("Height is: " + _length);

    }

    public static void main(String[] args) {
        _squareFind();
    }
}