package practice.application.basiclistviewonclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Mitch on 2016-04-03.
 */
public class Simpsons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        String[] simpsons = {"Bart", "Lisa", "Homer", "Marge"};
        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, simpsons);

        final ListView theListView = (ListView) findViewById(R.id.theListView2);

        theListView.setAdapter(theAdapter);

    }
}
