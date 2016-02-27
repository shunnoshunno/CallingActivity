package mfh.layout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import and.mfh.callingactivity.R;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView= (TextView) findViewById(R.id.msg);
        Bundle bundle=getIntent().getExtras();

        String firstMsg=bundle.getString("firstMsg");
        textView.setText(firstMsg);


    }

}
