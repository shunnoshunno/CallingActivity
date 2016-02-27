package and.mfh.callingactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import mfh.layout.SecondActivity;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton = (Button) findViewById(R.id.pressButton);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callingActivity();
            }
        });

    }
    private void callingActivity()
    {
        Intent intent= new Intent(this, SecondActivity.class);
        intent.putExtra("firstMsg", "This is first Message");
        startActivity(intent);
    }


}
