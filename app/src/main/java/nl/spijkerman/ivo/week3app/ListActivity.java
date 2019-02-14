package nl.spijkerman.ivo.week3app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView contacts = findViewById(R.id.listViewContacts);
        contacts.setAdapter(new ContactAdapter<>(
                this,
                R.layout.listview_row,
                ContactRepository.getInstance().getAll()
        ));

        contacts.setOnItemClickListener((parent, view, position, id) ->
                Log.i("grep", position + ": " + id));
    }
}
