package com.example.nhathan.bt_tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    ArrayList<ThongTin> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new Adapter(this,R.layout.dongtt,arrayList);
        listView.setAdapter(adapter);
    }

    private void AnhXa(){
        textView = (TextView) findViewById(R.id.txtND);
        listView = (ListView) findViewById(R.id.LW_DS);
        arrayList = new ArrayList<>();
        arrayList.add(new ThongTin("Nguyễn Văn A","0989897873",R.drawable.image1,R.drawable.image6));
        arrayList.add(new ThongTin("Lê Thị B","0967995843",R.drawable.image2,R.drawable.image7));
        arrayList.add(new ThongTin("Trần Văn C","0907955843",R.drawable.image3,R.drawable.image8));
        arrayList.add(new ThongTin("Phan Văn C","0967885811",R.drawable.image4,R.drawable.image9));
        arrayList.add(new ThongTin("Đinh Văn D","0988885231",R.drawable.image5,R.drawable.image10));
    }
}
