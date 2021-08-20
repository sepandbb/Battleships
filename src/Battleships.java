import java.util.Scanner;

public class Battleships
{

    public static void main(String args[])
    {
        Board b = new Board();
        System.out.println("Welcome to Battleships");
        assessTurn(takeTurn());
    }
    private static byte takeTurn()
    {
        Board.showBoard();
        System.out.println("select a tile by entering the corresponding number:");
        Scanner reader = new Scanner(System.in);
        byte selectedTile = reader.nextByte();
        return selectedTile;
    }
    private static void assessTurn(byte selectedTile)
    {
        if (selectedTile == Board.shipCoordinates())
        {
        }
    }
}
