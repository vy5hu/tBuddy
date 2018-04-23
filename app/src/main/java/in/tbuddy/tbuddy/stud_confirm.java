package in.tbuddy.tbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class stud_confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_confirm);
        Animation p= AnimationUtils.loadAnimation(stud_confirm.this, R.anim.fade_in);
        findViewById(R.id.tick).setAnimation(p);
        Animation q = AnimationUtils.loadAnimation(stud_confirm.this, R.anim.shake);
        findViewById(R.id.confirm).setAnimation(q);
        Animation r = AnimationUtils.loadAnimation(stud_confirm.this, R.anim.shake2);
        findViewById(R.id.conf_continue).setAnimation(q);

    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slidein_left, R.anim.slideout_right);
    }
}
