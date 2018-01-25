package nyc.c4q.mustafizurmatin.mid_unit5practicalassement;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by c4q on 1/24/18.
 */

public class UserListViewHolder extends RecyclerView.ViewHolder {
    public TextView login;
    public ImageView avatar_url;
    public TextView htm_url;
    public LinearLayout linearLayout;

    public UserListViewHolder(View itemView) {
        super(itemView);
        login = itemView.findViewById(R.id.username);
        avatar_url = itemView.findViewById(R.id.imageView);
        linearLayout = itemView.findViewById(R.id.linearLayout);
    }
}
