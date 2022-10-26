package homework.Module12_PR7.task2;

public class ConnectionManager {

    private static Connection[] connections = new Connection[6];

    private static int conCount = 0;


    public static Connection getConnection(int id){
        if (conCount < connections.length){
            connections[conCount] = new Connection(id);
            System.out.println("Access to " + conCount);
            return connections[conCount++];
        }
        else return null;
    }


}
