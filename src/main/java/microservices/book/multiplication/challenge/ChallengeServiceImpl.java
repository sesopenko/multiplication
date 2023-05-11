package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService{
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
        boolean isCorrect = attemptDTO.getGuess() == attemptDTO.getFactorA() * attemptDTO.getFactorB();
        // We don't use identifiers for now.
        Long userId = null;
        ChallengeAttempt checkedAttempt = new ChallengeAttempt(null,
                userId,
                attemptDTO.getFactorA(),
                attemptDTO.getFactorB(),
                attemptDTO.getGuess(),
                isCorrect);
        return checkedAttempt;
    }
}
