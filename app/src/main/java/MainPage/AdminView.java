package MainPage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinediary.R;

public class AdminView extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,emailView;
    EditText number;
    public AdminView(@NonNull View itemView) {
        super(itemView);
        number = itemView.findViewById(R.id.num);
        imageView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
    }
}
