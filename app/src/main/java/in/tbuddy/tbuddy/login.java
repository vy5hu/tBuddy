package in.tbuddy.tbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Animation r = AnimationUtils.loadAnimation(login.this, R.anim.shake);
        Animation s = AnimationUtils.loadAnimation(login.this, R.anim.shake2);
        //Animation t = AnimationUtils.loadAnimation(login.this, R.anim.top_down);
        findViewById(R.id.editText).setAnimation(r);
        findViewById(R.id.editText2).setAnimation(s);
//        findViewById(R.id.imageView2).setAnimation(t);
        findViewById(R.id.regtotype).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(login.this, studortea.class);
                startActivity(a);
                overridePendingTransition(R.anim.slidein_right, R.anim.slideout_left);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this, "Work On Progress", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
