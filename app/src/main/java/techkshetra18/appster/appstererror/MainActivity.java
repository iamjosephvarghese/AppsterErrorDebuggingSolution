package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    TextView textView2222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView2222 = findViewById(R.id.hi);

        Typeface bebas = Typeface.createFromAsset(getAssets(),  "fonts/bebasneue.ttf");

        textView2222.setTypeface(bebas);

        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(sharedPreferences.getBoolean("isFirstLogin",true)){


                    firstLogin();


                }else{


                    Intent homeIntent = new Intent(MainActivity.this,Home.class);
                    startActivity(homeIntent);
                    finish();


                }


            }
        },3000);
    }



    public void firstLogin(){
        Intent firstIntent = new Intent(this,Login.class);
        startActivity(firstIntent);
        finish();

    }
}
