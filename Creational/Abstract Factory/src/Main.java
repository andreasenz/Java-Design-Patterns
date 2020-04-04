public class Main {
    public static void main(String[] args){
        MazeFactory factory = new MazeFactory();
        Maze myMaze = createMaze(factory);
        /*
            This code is really easy to extend and modify: if we want and EnchantedMaze, i.e a Maze with some kind of spells,
            we can:
            - create an EnchantedMazeFactory that is a subclass of EnchantedMazeFactory
            - override the methods for creating Room, Wall, and everything can be enchanted
            Then just replace the factory:
            EnchantedMazeFactory factory = new EnchantedMazeFactory();
            Maze myMaze = createMaze(factory);

            And that's it, no other changes are needed :)
        */
    }

    public static Maze createMaze(MazeFactory factory){
        Maze  aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door aDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Orientation.North, factory.makeWall());
        r1.setSide(Orientation.East, factory.makeWall());
        r1.setSide(Orientation.South, factory.makeWall());
        r1.setSide(Orientation.West, factory.makeWall());

        r2.setSide(Orientation.North, factory.makeWall());
        r2.setSide(Orientation.East, factory.makeWall());
        r2.setSide(Orientation.South, factory.makeWall());
        r2.setSide(Orientation.West, factory.makeWall());

        return aMaze;
    }
}
