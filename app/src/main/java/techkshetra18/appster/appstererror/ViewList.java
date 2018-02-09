package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewList extends AppCompatActivity {

    List<Users> userList;
    ArrayList<Boolean> status;
    Button pay;
    Integer count=0;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);


        pay = findViewById(R.id.pay);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        userList = new ArrayList<Users>();

        for (int i =0;i< 5;i++){
            userList.add(new Users(Integer.toString(i),new Date().toString()));

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                }
            },1000);
        }



        mAdapter = new DetailedAdapter(userList,getApplicationContext());
        recyclerView.setAdapter(mAdapter);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                status = ((DetailedAdapter)mAdapter).fetchSelected();
                Log.d("status",status.toString());



                for(int i = 0;i<status.size();i++){

                    Log.d(Integer.toString(i),(status.get(i)).toString());
                    if (status.get(i)){

                        count++;

                    }
                }


                Intent finalIntent = new Intent(ViewList.this,FinalActivity.class);
                finalIntent.putExtra("noSelected",count);
                startActivity(finalIntent);
                finish();


            }
        });






    }
}
