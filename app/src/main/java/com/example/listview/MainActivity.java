package com.example.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] teacher = {"Paragol", "Daniel", "Sakku"};

    ListView listView;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listv);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.mycontentlistv,R.id.label, teacher){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                btn = view.findViewById(R.id.btn);
                btn.setTag(position);
                return view;
            }
        };


        listView.setAdapter(adapter);

    }
    public  void Onclickbtn(View view){
        int pos = (int) view.getTag();
        String teachername = teacher[pos];
        Toast.makeText(this, teachername, Toast.LENGTH_SHORT).show();
    }
}