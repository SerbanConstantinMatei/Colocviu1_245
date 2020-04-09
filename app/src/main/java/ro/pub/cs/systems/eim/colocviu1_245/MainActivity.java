package ro.pub.cs.systems.eim.colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button add, compute;
    EditText text, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText)findViewById(R.id.editText);
        result = (EditText)findViewById(R.id.editText3);
        add = (Button)findViewById(R.id.button);
        compute = (Button)findViewById(R.id.button2);

        text.setText(String.valueOf(0));
    }
}
