package in.tbuddy.tbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class profileinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileinfo);
        Animation p = AnimationUtils.loadAnimation(profileinfo.this, R.anim.shake);
        Animation q = AnimationUtils.loadAnimation(profileinfo.this, R.anim.shake2);
        findViewById(R.id.in_name).setAnimation(p);
        findViewById(R.id.in_email).setAnimation(q);
        findViewById(R.id.in_num).setAnimation(p);
        findViewById(R.id.in_pass).setAnimation(q);
        findViewById(R.id.from_profile_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_stu_info_2=new Intent(profileinfo.this, stud_profile_info_2.class);
                startActivity(to_stu_info_2);
                overridePendingTransition(R.anim.slidein_right, R.anim.slideout_left);
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slidein_left, R.anim.slideout_right);
    }
}
