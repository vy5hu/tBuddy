package in.tbuddy.tbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

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
                EditText name_stud =findViewById(R.id.in_name);
                EditText mail_stud= findViewById(R.id.in_email);
                EditText num_stu= findViewById(R.id.in_num);
                EditText pass_stud=findViewById(R.id.in_pass);

                final String stud_name=name_stud.getText().toString();
                final String stud_mail=mail_stud.getText().toString();
                final String stud_num=num_stu.getText().toString();
                final String stu_pass=pass_stud.getText().toString();

                Intent to_stu_info_2=new Intent(profileinfo.this, stud_profile_info_2.class);

                if(stud_name.isEmpty() || stud_mail.isEmpty() || stud_num.isEmpty() || stu_pass.isEmpty()) {
                    Toast.makeText(profileinfo.this, "Enter All Fields", Toast.LENGTH_SHORT).show();
                }else if(!isValidEmail(stud_mail) || (stud_num.length()<10) || (stu_pass.length()<6)){
                    if(!isValidEmail(stud_mail)  && (stud_num.length()<10)) {
                        Toast.makeText(profileinfo.this, "Invalid Email & Number", Toast.LENGTH_SHORT).show();
                    }else if(stud_num.length()<10){
                        Toast.makeText(profileinfo.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                    }else if(!isValidEmail(stud_mail)){
                        Toast.makeText(profileinfo.this, "Invalid Email ", Toast.LENGTH_SHORT).show();
                    }
                    else if(stu_pass.length()<6){
                        Toast.makeText(profileinfo.this, "Password must have atleast 6 Characters", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    startActivity(to_stu_info_2);
                    overridePendingTransition(R.anim.slidein_right, R.anim.slideout_left);

                }
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slidein_left, R.anim.slideout_right);
    }
    public final static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}
