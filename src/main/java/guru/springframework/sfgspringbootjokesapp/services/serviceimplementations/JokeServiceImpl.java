package guru.springframework.sfgspringbootjokesapp.services.serviceimplementations;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.sfgspringbootjokesapp.services.JokeService;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}