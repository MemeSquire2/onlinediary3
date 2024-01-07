package MainPage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinediary.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<AdminView> {
    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public AdminView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdminView(LayoutInflater.from(context).inflate(R.layout.mainpage,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdminView holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
        holder.number.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
