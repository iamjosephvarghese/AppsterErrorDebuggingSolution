package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView final2;
    Integer count;

    TextView final1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent dataCollect =  getIntent();
        count = dataCollect.getIntExtra("noSelected",0);


        final1 = findViewById(R.id.final1);
        final2 = findViewById(R.id.final2);


        final2.setText(count.toString());

    }
}
