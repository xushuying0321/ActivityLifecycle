package wstelly.example.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/4/9.
 */

public class ExampleBActivity extends Activity {

    TextView finishBTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Example B Activity生命周期","Example B Activity首次创建 onCreate()");

        setContentView(R.layout.activity_example_b);
        finishBTextView=(TextView)findViewById(R.id.finish_b);
         finishBTextView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();
             }
         });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Example B Activity生命周期","Example B Activity onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Example B Activity生命周期","Example B Activity  onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Example B Activity生命周期","Example B Activity  onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Example B Activity生命周期","Example B Activity  onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Example B Activity生命周期","Example B Activity  onDestroy()");
    }
}
