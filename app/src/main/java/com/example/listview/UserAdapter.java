package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter  extends BaseAdapter {
    private Context context;
    private List<User> users ;
    private LayoutInflater inflater;

    public UserAdapter(Context c, List<User> lu){
        context = c;
        users = lu;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if(convertView == null){
           convertView = inflater.inflate(R.layout.list_item_user,parent, false);
       }
        TextView nametxt = convertView.findViewById(R.id.nametxt);
        TextView agetxt = convertView.findViewById(R.id.agetxt);
        TextView jobtxt = convertView.findViewById(R.id.jobtxt);

        User user = users.get(position);
        nametxt.setText(user.getName());
        agetxt.setText(String.valueOf(user.getAge()));
        jobtxt.setText(user.getName());
        return convertView;
    }
}
