package ro.pub.cs.systems.eim.colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        text.setText("");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.button):
                        String val = text.getText().toString();
                        try {
                            int term = Integer.parseInt(val);
                            String seq = result.getText().toString();

                            if (seq.equals("")) {
                                seq = val;
                            } else {
                                seq = seq.concat(" + ");
                                seq = seq.concat(val);
                            }

                            result.setText(seq);
                        } catch (NumberFormatException e) {
                            break;
                        }

                        break;
                }
            }
        };

        add.setOnClickListener(listener);
        compute.setOnClickListener(listener);
    }
}
