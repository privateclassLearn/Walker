package maze;

import java.util.Objects;
import java.util.Scanner;

public class MazeTest {
    public static void mazeTest() {
        int x;
        int y;
        // Initialization of the starting point 0,0 / down left of the grid
        x = 0;
        y = 0;
        System.out.println("Room at: " + x + "," + y);
        System.out.println("Direction n,e,s,w: ");
        Scanner userInput = new Scanner(System.in);
        String[] roomArray = new String[1000];
        String direction;
        int room = 0;

        do {
            direction = (userInput.nextLine());
            System.out.println("Entered direction: " + direction);
            if (Objects.equals(direction, "n")) {
                y = y + 1;
                room = x * 100 + y;
                roomArray[room] = String.valueOf(room);
            } else if (Objects.equals(direction, "e")) {
                x = x + 1;
                room = x * 100 + y;
                roomArray[room] = String.valueOf(room);
            } else if (Objects.equals(direction, "s")) {
                y = y - 1;
                room = x * 100 + y;
                roomArray[room] = String.valueOf(room);
            } else if (Objects.equals(direction, "w")) {
                x = x - 1;
                room = x * 100 + y;
                roomArray[room] = String.valueOf(room);
            }

            System.out.println("Room at: " + x + "," + y);
            System.out.println("You are in room number " + room);
            System.out.println("This is the roomArray: " + roomArray[room]);
 /*         System.out.println(java.util.Arrays.toString(roomArray));
          for(String zahl : roomArray) {
                System.out.print(zahl + " ");
            }*/


        } while (true);
/*        {
            System.out.println("End of the input loop.");

            room = x + 100 + y bei 0,0 room =100
            room = 1 + 100 + 2 = room = 103 List
            1 * 1000 + 2 = 1002 Array Room[1002]

            String[][] salutation = { {"Mr. ", "Mrs. ", "Ms. "}, {"Kumar"} };




        }*/
    }
}

