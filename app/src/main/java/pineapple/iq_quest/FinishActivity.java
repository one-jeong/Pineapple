package pineapple.iq_quest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import pineapple.for_future.R;

/**
 * Created by jk on 2016. 11. 16..
 */

public class FinishActivity extends Activity{


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Intent intent = getIntent();

        TextView pr_input_id = (TextView)findViewById(R.id.printname);
        TextView pr_input_age = (TextView)findViewById(R.id.age);
        TextView pr_ok = (TextView)findViewById(R.id.ok);
        TextView pr_no = (TextView)findViewById(R.id.no);

        pr_input_id.setText(LoginActivity.one.getName());
        pr_input_age.setText(LoginActivity.one.getAge());

        String s1 = String.valueOf(LoginActivity.one.getOk());
        pr_ok.setText(s1);
        String s2 = String.valueOf(LoginActivity.one.getNo());
        pr_no.setText(s2);



    }

    public void onClick(View view){
        Intent intent = new Intent(this, Survey1Activity.class);


        switch (view.getId()){
            case R.id.back:
                finish();
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}
