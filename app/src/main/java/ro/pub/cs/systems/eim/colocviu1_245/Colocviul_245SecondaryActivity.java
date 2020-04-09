package ro.pub.cs.systems.eim.colocviu1_245;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Colocviul_245SecondaryActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("sequence")) {
            String seq = intent.getStringExtra("sequence");
            String[] arr = seq.split(" ");
            int n = arr.length;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].equals("+")) {
                    continue;
                }

                sum += Integer.valueOf(arr[i]);
            }
            setResult(sum);
            finish();
        }
    }

}
