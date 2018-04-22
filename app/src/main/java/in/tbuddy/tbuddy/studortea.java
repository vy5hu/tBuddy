package in.tbuddy.tbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class studortea extends AppCompatActivity {
    int reference = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studortea);
        Animation q = AnimationUtils.loadAnimation(studortea.this, R.anim.shake);
        findViewById(R.id.textView2).setAnimation(q);
        findViewById(R.id.submit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topro_stud = new Intent(studortea.this, profileinfo.class);
                if (reference == 1) {
                    startActivity(topro_stud);
                    overridePendingTransition(R.anim.slidein_right, R.anim.slideout_left);
                } else if (reference == 2) {
                    Toast.makeText(studortea.this, "Work On Progress", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(studortea.this, "Select Any Option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slidein_left, R.anim.slideout_right);
    }

    public void studlogo(View view) {
        ImageView a = findViewById(R.id.stud_logo);
        a.setImageResource(R.drawable.stud_logo_tick);
        ImageView b = findViewById(R.id.facu_logo);
        b.setImageResource(R.drawable.teach_logo);
        reference = 1;
    }

    public void faculogo(View view) {
        ImageView a = findViewById(R.id.stud_logo);
        a.setImageResource(R.drawable.stud_logo);
        ImageView b = findViewById(R.id.facu_logo);
        b.setImageResource(R.drawable.teach_logo_tick);
        reference = 2;
    }


}
