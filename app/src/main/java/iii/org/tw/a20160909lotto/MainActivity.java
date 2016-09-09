package iii.org.tw.a20160909lotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button)findViewById(R.id.btnClick);
        showText = (TextView)findViewById(R.id.showText);

        Log.i("Abner","Test");

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText("樂透號碼:" + (int)(Math.random()*49+1));
            }
        });
    }
    public void click(View v) {
        Log.i("Abner","Click()");
    }
}
