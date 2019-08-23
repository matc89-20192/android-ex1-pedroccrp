package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private Button btn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (TextView)findViewById(R.id.labelMensagem);
        btn = (Button)findViewById(R.id.btnCumprimentar);
        editText = (EditText)findViewById(R.id.editNome);
    }

    public void cumprimentar(View v) {
        String text = editText.getText().toString();

        text = "Alô, " + text + "!";

        message.setText(text);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("editText", editText.getText().toString());
        outState.putString("message", message.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String text = savedInstanceState.getString("editText");
        editText.setText(text);

        text = savedInstanceState.getString("message");
        message.setText(text);
    }
}
