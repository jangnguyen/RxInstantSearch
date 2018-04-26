package vn.mb360.rxsearch.network;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.mb360.rxsearch.network.model.Contact;

/**
 * Created by ravi on 31/01/18.
 */

public interface ApiService {

    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}
