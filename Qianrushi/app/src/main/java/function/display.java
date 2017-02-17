package function;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import cn.qtp000.qianrushi.MainActivity;
import cn.qtp000.qianrushi.R;

/**
 * Created by 祁天培 on 2017/2/12.
 */

public class display {
    public static void tosi()
    {
        setContentView(R.layout.minor);
//        Toast.makeText(display,"调用成功",Toast.LENGTH_SHORT).show();
//        Toast.makeText(, "", Toast.LENGTH_SHORT).show();
//        Toast toast =Toast.makeText(MainActivity.this,"aaabbhgyuk",Toast.LENGTH_SHORT);
//        toast.show();
//        Toast.makeText(getApplicationContext().this, "正华", Toast.LENGTH_SHORT).show();
        System.out.println("调用tosi成功");
    }




    public void saays()
    {
        System.out.println("调用sys成功");

    }

}
