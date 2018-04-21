package in.tbuddy.tbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Animation frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
//        findViewById(R.id.button_a).setAnimation(frombottom);
    }
}
