public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        drawingTriangle();
    }


    public static void drawingTriangle(){
        int col = 0;
        int row = 0;
        int SIZE = 5;
        while(row < SIZE & col< SIZE){
            row = 0;
            while(row <= col){
                System.out.print("*");
                row = row + 1;
            }
            col = col + 1;
            System.out.println();

        }
    }
}