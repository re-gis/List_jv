import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws MyException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner cs = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter " + (i+1) + " number:");
                Integer in = cs.nextInt();
                list.add(in);
            }

            // get the index
            System.out.println("Enter index: ");
            int i = cs.nextInt();
            if(i > 5) {
                cs.close();
                throw new MyException("Size of array is 5, Try number less than 5!");
            }

            System.out.println("Number at index " + i + " is " + list.get(i));
            cs.close();
        }catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        catch(MyException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}