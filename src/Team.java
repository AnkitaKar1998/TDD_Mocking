import java.util.List;

public class Team {

    private ScoreService scoreService;
    private List<Player> playerList;

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int getTotal() {
        int total = 0;
        for(Player player : playerList) {
            total += scoreService.getScore(player);
        }
        return total;
    }

    public int getPlayerScore(Player player) {
        return scoreService.getScore(player);
    }
}
