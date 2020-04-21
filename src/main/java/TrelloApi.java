import retrofit2.Call;
import retrofit2.http.*;
import sun.plugin.util.PluginSysUtil;

public interface TrelloApi {

    @POST("/1/cards")
    Call<Card> createCard(@Body Card card, @Query("idList") String idList);

    @PUT ("/1/cards/{id}")
    Call<Card> updateCard(@Body Card card, @Path("id") String id);

    @GET ("/1/cards/{id}")
    Call<Card> getCard(@Path("id") String id, @Query("key") String key, @Query("token") String token);

    @DELETE ("/1/cards/{id}")
    Call<Card> deleteCard(@Path("id") String id, @Query("key") String key, @Query("token") String token);

}