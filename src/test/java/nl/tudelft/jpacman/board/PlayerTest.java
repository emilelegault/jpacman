package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;


public class PlayerTest {
    @Test
    void WhenPlayerIsCreate_IsAliveIsTrue() {
        PacManSprites pacManSprites = new PacManSprites();
        PlayerFactory playerFactory = new PlayerFactory(pacManSprites);

        Player player = playerFactory.createPacMan();

        assertThat(player.isAlive()).isTrue();
    }

}
