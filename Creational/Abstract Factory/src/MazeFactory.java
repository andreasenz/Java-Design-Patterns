public class MazeFactory {

    public MazeFactory(){

    }

    Maze makeMaze() {
        return new Maze();
    }
    Wall makeWall() {
        return new Wall();
    }
    Room makeRoom() {
        return new Room();
    }
    Door makeDoor(Room r1, Room r2) {
        return new Door(r1,r2);
    }
}
