package Rules_Of_The_game;

public class Instanciate_Owned_Places_To_False {
	
	public Instanciate_Owned_Places_To_False() {
		// TODO Auto-generated constructor stub
	}
	public Instanciate_Owned_Places_To_False(PlayerArea Gamer) {
		for(int i=1;i<=40;i++) {
			Gamer.getPlayers_owned_places()[i]=false;
		}
	}

}
