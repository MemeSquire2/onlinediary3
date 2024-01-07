package MainPage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinediary.R;
import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    private android.view.MotionEvent MotionEvent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        radioGroup = findViewById(R.id.radioGroup);
        TextView Email = findViewById(R.id.Email);
        TextView Password = findViewById(R.id.Password);
        MaterialButton loginbtn = findViewById(R.id.saveGroup);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if (Email.getText().toString().equals("admin@test.com") &&
                        Password.getText().toString().equals("admin") &&
                        radioButton.isChecked() &&
                        radioButton.getId() == R.id.radio_teachers) {
                    // Correct
                    Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                    loginbtn();
                } else {
                    // Wrong
                    Toast.makeText(MainActivity.this, "Wrong email, password, or user type", Toast.LENGTH_SHORT).show();
                }
            }

            public void loginbtn() {
                Intent intent = new Intent(MainActivity.this, Mainpage.class);
                startActivity(intent);
            }
        });
    }
    public void checkButton(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}