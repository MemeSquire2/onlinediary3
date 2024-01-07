package MainPage;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinediary.R;

public abstract class Mainpage extends RecyclerView.Adapter<AdminView> {
    ImageView imageView;
    TextView nameView,emailView;
    EditText numberView;
    public Mainpage () {
        super();
        imageView = imageView.findViewById(R.id.image);
        nameView = nameView.findViewById(R.id.name);
        emailView = emailView.findViewById(R.id.email);
        numberView = numberView.findViewById(R.id.num);
    }
}