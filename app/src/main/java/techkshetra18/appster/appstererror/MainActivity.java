package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    Boolean isFirstLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();


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
