public class GamePlayer{ 
  public String playername; 
  public GamePlayer(String name){ 
    playername = name; 
  } 
  public String toString(){ 
    return "[player:" + playername + "]"; 
  } 
  public static void main(String[] args){ 
    GamePlayer[] players = new 
    GamePlayer[3]; 
      players[0] = new GamePlayer("Mad Hatter"); 
      players[1] = new GamePlayer("March Hare"); 
      players[2] = new GamePlayer("Alice"); 
        for (GamePlayer player : players){ 
          System.out.println(player); 
        } 
  } 
}
  