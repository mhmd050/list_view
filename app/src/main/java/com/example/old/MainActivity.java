package com.example.old;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.old.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private  ArrayList<Integer> imageList;
    private ImageView image;
    private  ArrayList<String> list;
    private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok();
            }
        });
    }
    public void ok (){
        ListView lv=findViewById(R.id.lvSimple);
        image=findViewById(R.id.imageView);
        imageList=new ArrayList<Integer>();
        list=new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("pineapple");
        list.add("carrot");
        list.add("cucumber");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
        imageList.add(R.drawable.img);
        imageList.add(R.drawable.img_1);
        imageList.add(R.drawable.img_2);
        imageList.add(R.drawable.img_3);
        imageList.add(R.drawable.img_4);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Toast.makeText(MainActivity.this, "click : "+list.get(i), Toast.LENGTH_SHORT).show();
        image.setImageResource(imageList.get(i));
    }
}