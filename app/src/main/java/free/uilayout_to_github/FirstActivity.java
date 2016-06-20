package free.uilayout_to_github;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by luweiling on 2016/6/20.
 */
public class FirstActivity extends Activity {
    private EditText account;
    private EditText password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        account = (EditText)findViewById(R.id.account);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountstr = account.getText().toString();
                String passwordstr = password.getText().toString();
                if(accountstr.equals("test")){
                    if(passwordstr.equals("123")){
                        Toast.makeText(FirstActivity.this, "Access Success", Toast.LENGTH_SHORT).show();
                    }
                }
                Toast.makeText(FirstActivity.this, "No This Account", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
