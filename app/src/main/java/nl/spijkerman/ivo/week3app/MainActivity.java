package nl.spijkerman.ivo.week3app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar dragMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.buttonClickMe);
        clickMe.setOnClickListener(this::openProgressActivity);

        Button dontClick = findViewById(R.id.buttonDontClick);
        dontClick.setOnClickListener(this::openListActivity);




        dragMe = findViewById(R.id.seekBarDragMe);
        dragMe.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("grep", "" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.i("grep", "Stop touching me");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("grep", "Finally");
            }
        });
    }

    private void openListActivity(View view) {
        Log.i("grep", "Boo");
        Intent listIntent = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(listIntent);
    }

    private void openProgressActivity(View view) {

            Log.i("grep", "Yay");

            Intent progress = new Intent(getApplicationContext(), ProgressActivity.class);

            progress.putExtra(getString(R.string.EXTRA_PROGRESS), dragMe.getProgress());

            startActivity(progress);

    }
}
