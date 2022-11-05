package Activities;
import static com.example.myapp.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapp.R;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button btn = findViewById(button);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Context context = getApplicationContext();
                Toast toast= Toast.makeText(context,"Clicked", Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent (Activity1.this , Activity2.class);
                startActivity(intent);

            }

        });
    }
}