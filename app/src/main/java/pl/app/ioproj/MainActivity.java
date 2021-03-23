package pl.app.ioproj;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {

        };

        setContentView(R.layout.activity_main);
    }

    /** "Wyjdź" button onClick method */
    public void exit(View view) {
        this.finishAndRemoveTask();
    }
}

// public void sendMessage(View view) {
//   Intent intent = new Intent(this, NewDB.class);
//EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
//String message = editText.getText().toString();
//intent.putExtra(EXTRA_MESSAGE, message);


// startActivity(intent);
//}




//public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";