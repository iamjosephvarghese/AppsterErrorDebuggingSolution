package techkshetra18.appster.appstererror;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;


public class Home extends AppCompatActivity {

    TextView textView;
    Integer string_one = 100;

    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        textView = findViewById(R.id.txt);
        b1 = findViewById(R.id.button1);
//        textView.setText(Integer.parseInt(Integer.toString(string_one)));
         textView.setText("100");


         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 getDate();

             }
         });



    }


//    TODO import java.sql.Date;


    public void getDate(){
//        TODO to fetch current timestamp and show in snackbar
        String date = new Date().toString();

    }
}
