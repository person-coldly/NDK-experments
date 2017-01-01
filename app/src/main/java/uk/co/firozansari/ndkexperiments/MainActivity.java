package uk.co.firozansari.ndkexperiments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by firoz on 31/12/2016.
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "NATIVE_APP";
    TextView textView;

    static {
        System.loadLibrary("native-lib");
    }

    private native String getndkstring(String value);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        textView.setText(getndkstring("World"));

    }
}
