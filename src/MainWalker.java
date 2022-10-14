import maze.MazeTest;
import maze.RoomMaker;

public class MainWalker {
    public static void main(String[] args) {
        System.out.println("This is the main Walker class.");
        RoomMaker.roomMaker();
        MazeTest.mazeTest();
    }
}
