package in.tbuddy.tbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class stud_gender extends AppCompatActivity {
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_gender);
        findViewById(R.id.from_gender).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==1 || count==2){
                    Toast.makeText(stud_gender.this, "Work On Progress", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(stud_gender.this, "Select an Option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void male(View view) {
        ImageView a = findViewById(R.id.male);
        a.setImageResource(R.drawable.male_tick);
        ImageView b = findViewById(R.id.female);
        b.setImageResource(R.drawable.female);
        count = 1;
    }

    public void female(View view) {
        ImageView a = findViewById(R.id.female);
        a.setImageResource(R.drawable.female_tick);
        ImageView b = findViewById(R.id.male);
        b.setImageResource(R.drawable.male);
        count = 2;
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slidein_left, R.anim.slideout_right);
    }
}
