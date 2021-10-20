package nz.ac.wgtn.ecs.carbonfootprinttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStartedButtonClick(View view) {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }


}