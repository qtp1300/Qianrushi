package cn.qtp000.qianrushi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import function.*;

import static cn.qtp000.qianrushi.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton upbtn = (ImageButton) findViewById(R.id.upButton);
        ImageButton leftbtn = (ImageButton) findViewById(R.id.leftButton);
        ImageButton rightbtn = (ImageButton) findViewById(R.id.RIGHTButton);
        ImageButton downbtn = (ImageButton) findViewById(R.id.downButton);
        upbtn.setOnClickListener(new anjian());
        leftbtn.setOnClickListener(new anjian());
        rightbtn.setOnClickListener(new anjian());
        downbtn.setOnClickListener(new anjian());

    }
    class anjian implements android.view.View.OnClickListener{
        @Override
        public void onClick(android.view.View view) {
            switch (view.getId())
            {
                case R.id.upButton:
                    Toast.makeText(MainActivity.this,"上键",Toast.LENGTH_SHORT).show();
                    System.out.println("阿萨德");
                    display.tosi();
                    display dis = new display();
                    dis.saays();

                    break;
                case R.id.leftButton:
                    Toast.makeText(MainActivity.this,"左键",Toast.LENGTH_LONG).show();
                    break;
                case R.id.RIGHTButton:
                    Toast.makeText(MainActivity.this,"右键",Toast.LENGTH_LONG).show();
                    break;
                case R.id.downButton:
                    Toast.makeText(MainActivity.this,"下键",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

}
