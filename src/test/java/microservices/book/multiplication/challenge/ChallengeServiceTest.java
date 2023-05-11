package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {
    private ChallengeService challengeService;

    @BeforeEach
    public void setUp() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest() {
        // given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "johhn_doe", 5000);

        // when
        ChallengeAttempt results = challengeService.verifyAttempt(attemptDTO);

        // then
        then(results.isCorrect()).isFalse();
    }
}
