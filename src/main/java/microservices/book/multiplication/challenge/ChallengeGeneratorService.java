package microservices.book.multiplication.challenge;

public interface ChallengeGeneratorService {
    /**
     * @return a randomly-generated challenge with factors between 11 and 19
     */
    Challenge randomChallenge();
}
