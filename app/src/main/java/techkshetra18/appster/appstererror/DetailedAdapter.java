package techkshetra18.appster.appstererror;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joseph on 09/02/18.
 */

public class DetailedAdapter extends RecyclerView.Adapter<DetailedAdapter.ViewHolder>  {
    private List<Users> userList;

    private Context context;


    public ArrayList<Boolean> status;


    public ArrayList<Boolean> fetchSelected(){
        return status;
    }

    public String fetchString(){
        return "Hello";
    }

    public DetailedAdapter() {

    }

    public DetailedAdapter(List<Users> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView event_name;


        public TextView p1;

        public View layout;


        public ViewHolder(View v) {
            super(v);
            layout = v;


            v.setOnClickListener(this);


            LayoutInflater layoutInflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            event_name = (TextView) v.findViewById(R.id.event_name);


            p1 = (TextView) v.findViewById(R.id.p1);


            status = new ArrayList<Boolean>();

            for (int i =0; i<getItemCount();i++){
                status.add(i,false);
                Log.d("i",Integer.toString(i));
            }

        }

        @Override
        public void onClick(View view) {
//            Log.d("clicked", "onClick ");

            Log.d("position",Integer.toString(getAdapterPosition()));



            if(status.get(getAdapterPosition()) == false){

                Log.d("if","....." + status.get(getAdapterPosition()).toString());

                status.set(getAdapterPosition(),true);

                view.setBackgroundColor(0xFF00FF00);

                for(int i = 0;i<status.size();i++){

                    Log.d(Integer.toString(i),(status.get(i)).toString());
                }

            }else{

                Log.d("else","......");
                status.set(getAdapterPosition(),false);
                view.setBackgroundColor(0xFFFFFFFF);

                for(int i = 0;i<status.size();i++){

                    Log.d(Integer.toString(i),(status.get(i)).toString());
                }

            }

        }
    }


    @Override
    public DetailedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.row_layout2, parent, false);
        ViewHolder vh = new ViewHolder(v);


        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        Users u = userList.get(position);

        holder.event_name.setText(u.getUserName());
        holder.p1.setText(u.getTimestamp());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

}