package wstelly.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/4/9.
 */

public class ExampleAActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Example A Activity生命周期","Example A Activity首次创建 onCreate()");

        setContentView(R.layout.activity_example_a);
        textView=(TextView)findViewById(R.id.start_b_activity);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExampleAActivity.this,ExampleBActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Example A Activity生命周期","Example A Activity onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Example A Activity生命周期","Example A Activity onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Example A Activity生命周期","Example A Activity onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Example A Activity生命周期","Example A Activity onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Example A Activity生命周期","Example A Activity onDestroy()");
    }

}
