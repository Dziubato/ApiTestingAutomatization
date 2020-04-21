import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.http.Query;

import java.io.IOException;

public class TrelloTests {
    private String id;
    private RetrofitBuilder retrofitBuilder;

    @Test (priority = 1)
    public void checkCreateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card();
        String idList = "5e9d97753913687feeaf9e47";
        Card createdCard = retrofitBuilder.getTrelloApi().createCard(card, idList).execute().body();
        id = createdCard.getId();

        Assert.assertEquals(createdCard.getIdList(), idList);
    }

    @Test (priority = 2)
    public void checkUpdateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card ();
        String updatedName = "updatedName";
        card.setName(updatedName);

        Card updatedCard = retrofitBuilder.getTrelloApi().updateCard(card, id).execute().body();

        Assert.assertEquals(updatedCard.getName(), updatedName);
    }

    @Test (priority = 3)
        public void checkGetCard() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Card card = new Card();

            int code = retrofitBuilder.getTrelloApi().getCard(id, card.getKey(), card.getToken()).execute().code();

            Assert.assertEquals(code, 200);

        }

    @Test (priority = 4)
    public void deleteCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Card card = new Card();

        int code = retrofitBuilder.getTrelloApi().getCard(id, card.getKey(), card.getToken()).execute().code();
        Assert.assertEquals(code, 200);
    }
    }
