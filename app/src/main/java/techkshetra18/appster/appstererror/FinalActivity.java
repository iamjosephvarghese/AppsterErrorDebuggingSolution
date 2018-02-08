package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FinalActivity extends AppCompatActivity {

    Integer count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent dataCollect = getIntent();

//        count = dataCollect.getStringExtra("noSelected");
//        TODO heeerreeee

    }
}
