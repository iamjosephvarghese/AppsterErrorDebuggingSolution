package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText userName,passWord;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;




    String[] user = {"one","two","three"};
    String[] pass = {"a","b","c"};

    Button login;

    int flag = 0;

    String u,p;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);



        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();



        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);

        login = findViewById(R.id.button);



        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                u = userName.getText().toString();
                p = passWord.getText().toString();




                if(u != "" && p != "") {

                    flag = 0;


                    for (int i = 0; i < user.length; i++) {

                        if(u.equals(user[i])){

                            flag = 1;

                            if(p.equals(pass[i])){

                                editor.putString("userName",u);
                                editor.putBoolean("isFirstLogin",false);

                                Intent successIntnet = new Intent(Login.this, Home.class);
                                startActivity(successIntnet);
                                finish();

                                break;
                            }else{
                                Toast.makeText(Login.this, "Wrong password", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }

                    }


                    if(flag == 0){
                        Toast.makeText(Login.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });



    }


    @Override
    protected void onPause() {
        super.onPause();
        editor.commit();
    }


    @Override
    protected void onStop() {
        super.onStop();
        editor.commit();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        editor.commit();
    }
}