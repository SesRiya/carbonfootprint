package nz.ac.wgtn.ecs.carbonfootprinttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class settingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);
    }

    public void avatarBTN(View view){
        Intent intent = new Intent(this, profileActivity.class);
        startActivity(intent);
    }
}