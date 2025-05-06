public class Player {
	public static String totalplayers ="0";
	public String playerName;
	public Player(String name) {
		  this.playerName = name;
	}
	public static void main (String[] args ) {
		Player  player1=new Player("gopi");
		Player.totalplayers++;
		Player player2  =new Player("ramu");
		  Player.totalPlayers ++;
		  System.out.println("totalplayers:"+Player. totalplayers);
	
		
	}
	
	

}
