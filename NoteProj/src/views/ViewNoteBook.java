package views;

import java.util.Scanner;

public class ViewNoteBook {



    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
