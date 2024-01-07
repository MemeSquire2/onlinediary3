package MainPage;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinediary.R;

import java.util.ArrayList;
import java.util.List;

public class AdminActivity extends AdminActivity2 {
    @Override
    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleact);
        RecyclerView recycleview = findViewById(R.id.recycleview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Jogg DEs", "joggbob@email.com", R.drawable.approved, 5));
        recycleview.setLayoutManager(new LinearLayoutManager(this));
        recycleview.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}
