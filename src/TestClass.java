import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class TestClass {

    @Mock
    ScoreService scoreService;

    @InjectMocks
    Team team = new Team();

    @Test
    public void testGetPlayerScoreMethod() {
        Player p1 = new Player(1, "ankita", 111);
        Player p2 = new Player(2, "arpita", 222);
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(p1);
        playerList.add(p2);

        team.setPlayerList(playerList);

        when(scoreService.getScore(p1)).thenReturn(10);
        when(scoreService.getScore(p2)).thenReturn(20);

        int expected = 30;
        int actual = team.getTotal();

        Assert.assertEquals(expected, actual);

    }

}
