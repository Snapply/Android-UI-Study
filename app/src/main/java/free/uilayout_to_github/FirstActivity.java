package free.uilayout_to_github;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by luweiling on 2016/6/20.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
    }
}
