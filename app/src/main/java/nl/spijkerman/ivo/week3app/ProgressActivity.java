package nl.spijkerman.ivo.week3app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Bundle extras = getIntent().getExtras();
        int progress = extras.getInt(getString(R.string.EXTRA_PROGRESS));

        TextView text = findViewById(R.id.textViewProgress);
        text.setText("" + progress);
    }
}
