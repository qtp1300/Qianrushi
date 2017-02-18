package cn.qtp000.socket2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ip;
    EditText editText;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip = (EditText) findViewById(R.id.editText);
        editText = (EditText) findViewById(R.id.editText2);
        text = (TextView) findViewById(R.id.textView);

        Button lian = (Button) findViewById(R.id.button);
        Button fa = (Button) findViewById(R.id.button2);
        lian.setOnClickListener(new Listener1());
        fa.setOnClickListener(new Listener1());

    }
    /*****************************发送接受操作*************************************/
    public void connect(){

    }
    public void send(){

    }
    /******************************按键监听部分***************************************/
    class Listener1 implements View.OnClickListener{
        public void onClick(View v){
            switch(v.getId()){
                case R.id.button:

                    break;
                case R.id.button2:

                    break;
            }
        }
    }
}
