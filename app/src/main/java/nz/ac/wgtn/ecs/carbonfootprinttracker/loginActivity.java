package nz.ac.wgtn.ecs.carbonfootprinttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void setupBTN(View view){
        Intent intent = new Intent(this, setupActivity.class);
        startActivity(intent);
    }
}