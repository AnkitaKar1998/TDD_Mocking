public class Player {
    int playerId;
    String playerName;
    int playerJerseyNo;

    public Player(int playerId, String playerName, int playerJerseyNo) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerJerseyNo = playerJerseyNo;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerJerseyNo() {
        return playerJerseyNo;
    }
}
