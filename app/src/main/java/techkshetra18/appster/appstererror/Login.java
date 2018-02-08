package techkshetra18.appster.appstererror;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText userName,passWord;




    String[] user = {"one","two","three"};
    String[] pass = {"a","b","c"};

    Button login;

    int flag = 0;

    String u,p;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);




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
                                Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();
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
}