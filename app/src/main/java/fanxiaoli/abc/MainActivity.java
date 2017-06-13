package fanxiaoli.abc;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView01;
    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView01 = (TextView)findViewById(R.id.myTextView01);
        mTextView02 = (TextView)findViewById(R.id.myTextView02);
        Resources resources = getBaseContext().getResources();
        mTextView01.setText("使用的是Drawable背景色文本");
        Drawable HippoDrawable = resources.getDrawable(R.drawable.white);
        mTextView01.setBackgroundDrawable(HippoDrawable);
        mTextView02 = (TextView)findViewById(R.id.myTextView02);
        mTextView02.setTextColor(Color.MAGENTA);
    }
}
