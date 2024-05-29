package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Registration extends AppCompatActivity {
    EditText name, age, job;
    List<User> mylist;
    UserAdapter adapter;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        job = findViewById(R.id.job);
        submit = findViewById(R.id.btn2);
        ListView listView = findViewById(R.id.listv2);
        mylist = new ArrayList<>();

        User u1 = new User("pargol", 10,"teacher");
        mylist.add(u1);
        adapter = new UserAdapter(this, mylist);
        listView.setAdapter(adapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String userage = (age.getText().toString());
                String userjob = job.getText().toString();

                if(username.isEmpty() || userjob.isEmpty()){
                    Toast.makeText(Registration.this, "Add user details", Toast.LENGTH_SHORT).show();
                }else{
                    int uage = Integer.parseInt(userage);
                    User user = new User(username, uage, userjob);

                    mylist.add(user);
                    adapter.notifyDataSetChanged();
                    name.setText("");
                    age.setText("");
                    job.setText("");
                }


            }
        });






    }
}
