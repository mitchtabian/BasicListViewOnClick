package practice.application.basiclistviewonclick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] tvShows = {"SouthPark", "Naruto", "Simpsons"};
        String[] southPark = {"Stan", "Kyle", "Kenny", "Cartman"};
        String[] naruto = {"Naruto", "Sakura", "Kakashi", "Sasuke"};
        String[] simpsons = {"Bart", "Lisa", "Homer", "Marge"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tvShows);

        final ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String value = (String) theListView.getItemAtPosition(position);

                final int result = 1;
                switch(value){
                    case "SouthPark":
                        Intent southparkScreen = new Intent(MainActivity.this, SouthPark.class);
                        MainActivity.this.startActivity(southparkScreen);
                        break;
                    case "Naruto":
                        Intent narutoScreen = new Intent(MainActivity.this, Naruto.class);
                        MainActivity.this.startActivity(narutoScreen);
                        break;
                    case "Simpsons":
                        Intent simpsonsScreen = new Intent(MainActivity.this, Simpsons.class);
                        MainActivity.this.startActivity(simpsonsScreen);
                        break;
                }
            }
        });

    }
}