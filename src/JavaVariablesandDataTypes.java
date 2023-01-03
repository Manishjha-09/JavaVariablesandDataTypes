public class JavaVariablesandDataTypes {
    public static void main(String[] args) {
        // Q1. Take 2 integer values in two variables x and y and print their product.
        int x = 2;
        int y = 4;
        System.out.println(x*y);

        // Q2. Print the ASCII value of character ‘U’.
        int ascii = 'U';
        System.out.println(ascii);

        // Q3. Write a Java program to take the length and breadth of a rectangle and print its area.
        int length = 7;
        int breadth = 4;
        int area = length*breadth;
        System.out.println(area);

        // Q4. Write a Java program to calculate the cube of a number.
        int n = 4;
        int cube = n*n*n;
        System.out.println(cube);

        //  Q5. Write a Java program to swap two numbers with the help of a third variable.
        int a = 2;
        int b = 3;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);


    }
}
