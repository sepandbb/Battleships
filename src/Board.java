import java.util.ArrayList;
import java.util.Random;

public class Board
{
    private ArrayList shipCoordinates;

    public static void showBoard()
    {
        System.out.println("| 1| 2| 3| 4| 5|\r\n" +
                           " -- -- -- -- -- \r\n" +
                           "| 6| 7| 8| 9|10|\r\n" +
                           " -- -- -- -- -- \r\n" +
                           "|11|12|13|14|15|\r\n" +
                           " -- -- -- -- -- \r\n" +
                           "|16|17|18|19|20|\r\n" +
                           " -- -- -- -- -- \r\n" +
                           "|21|22|23|24|25|");
    }

    public static int getRandomCoordinate()
    {
        byte min = 1;
        byte max = 25;
        int coordinate = (int) ((Math.random()*((max-min)+1))+min);

        return coordinate;
    }

    public static ArrayList shipCoordinates()
    {
        ArrayList <Integer> shipCoordinates = new ArrayList<>();
        int i;
        for(i=0; i==5; i++)
        {
            shipCoordinates.add(getRandomCoordinate());
        }
        return shipCoordinates;
    }
}
