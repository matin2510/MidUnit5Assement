package nyc.c4q.mustafizurmatin.mid_unit5practicalassement;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 1/24/18.
 */

public interface ApiInterface {
    @GET("api/?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<Results> getUserInfo();
}
