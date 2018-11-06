package com.sjs.edu.listviewsinglcolumn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] FRUITS = new String[] {"Apple", "Avocado", "Banana", "Blueberry"};
        ListView listView = (ListView)findViewById(R.id.resultList);
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,R.layout.listview_single_column,FRUITS);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleted = ((TextView)view).getText().toString();
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(view.getContext(),seleted+"  "+text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
