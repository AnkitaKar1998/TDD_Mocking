import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMock {

    Team team;
    ScoreService scoreService;

    public void setTeam() {
        team = new Team();
        scoreService = mock(ScoreService.class);
        team.setScoreService(scoreService);
    }

    public boolean test() {
        List<Player> playerList = new ArrayList<>();
        Player p1 = new Player(1, "ankita", 111);
        Player p2 = new Player(2, "arpita", 222);
        playerList.add(p1);
        playerList.add(p2);

        team.setPlayerList(playerList);

        when(scoreService.getScore(p1)).thenReturn(10);
        when(scoreService.getScore(p2)).thenReturn(20);

        int total = team.getTotal();
        System.out.println(total);
        if(total == 30){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        TestMock testMock = new TestMock();
        testMock.setTeam();
        System.out.println("result: "+testMock.test());
    }
}
