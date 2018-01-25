package nyc.c4q.mustafizurmatin.mid_unit5practicalassement;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by c4q on 1/24/18.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListViewHolder> {
    private static final String KEY_NAME = "name";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_URL = "url";
    private List<Results> resultsList;

    private Context context;

    public UserListAdapter(List<Results> resultsList, Context context) {
        this.resultsList = resultsList;
        this.context = context;
    }

    @Override
    public UserListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.users_list, parent ,false);

        return new UserListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UserListViewHolder holder, final int position) {
        final Results results = resultsList.get(position);
        holder.login.setText(results.getName());
        Picasso.with(context)
                .load(results.getFirst())
                .into(holder.avatar_url);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results results1 = resultsList.get(position);
                Intent intent = new Intent(v.getContext(), ProfileActivity.class);
                intent.putExtra(KEY_NAME, results1.getName());
                intent.putExtra(KEY_URL,results1.getFirst());
                intent.putExtra(KEY_IMAGE,results1.getPicture());
                v.getContext().startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }
}
