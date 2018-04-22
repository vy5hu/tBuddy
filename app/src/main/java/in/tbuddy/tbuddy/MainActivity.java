package in.tbuddy.tbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation q = AnimationUtils.loadAnimation(MainActivity.this, R.anim.frombottom);
        findViewById(R.id.imageView).setAnimation(q);
        findViewById(R.id.to_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logscr = new Intent(MainActivity.this, login.class);

                startActivity(logscr);

            }
        });
    }
}
