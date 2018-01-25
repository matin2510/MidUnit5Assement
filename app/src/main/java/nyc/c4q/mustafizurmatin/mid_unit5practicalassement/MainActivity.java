package nyc.c4q.mustafizurmatin.mid_unit5practicalassement;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private final String URL_DATA = " https://randomuser.me/api/?nat=us&inc=name,location,cell,email,dob,picture&results=20";
    private static final String TAG = "In Main";
    private Context context;

    private RecyclerView recyclerView;
    private UserListAdapter userListAdapter;
    private List<Results> resultsList;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(userListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);





        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

            ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        Call<Results> resultsCall = apiInterface.getUserInfo();
        resultsCall.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                Log.d(TAG, "onResponse: " + response.body().getName());


            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.d(TAG, "onResponse: " + t.toString());

            }
        });







    }


}
