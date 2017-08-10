package com.example.kamil.arrayadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  private ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RowBean RowBean_data[] = new RowBean[] {

        new RowBean(R.drawable.merc, "Mercedes"),
        new RowBean(R.drawable.volks, "Volkswagen"),
        new RowBean(R.drawable.bmw, "BMW"),
        new RowBean(R.drawable.aston, "Aston Martin"),
        new RowBean(R.drawable.merc, "Mercedes"),
        new RowBean(R.drawable.volks, "Volkswagen"),
        new RowBean(R.drawable.bmw, "BMW"),
        new RowBean(R.drawable.aston, "Aston Martin"),
        new RowBean(R.drawable.merc, "Mercedes"),
        new RowBean(R.drawable.volks, "Volkswagen"),
        new RowBean(R.drawable.bmw, "BMW"),
        new RowBean(R.drawable.aston, "Aston Martin"),
        new RowBean(R.drawable.merc, "Mercedes"),
        new RowBean(R.drawable.volks, "Volkswagen"),
        new RowBean(R.drawable.bmw, "BMW"),
        new RowBean(R.drawable.aston, "Aston Martin")
    };

    CustomAdapter adapter = new CustomAdapter(this,
        R.layout.custom_row, RowBean_data);

    listView = (ListView)findViewById(R.id.Lista);

    listView.setAdapter(adapter);
  }
}
