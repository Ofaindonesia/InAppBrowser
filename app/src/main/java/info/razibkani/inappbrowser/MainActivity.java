package info.razibkani.inappbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText    mEditUrl;
    private Button      mBtnOpenInAppBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditUrl = (EditText) findViewById(R.id.edit_url);
        mBtnOpenInAppBrowser = (Button) findViewById(R.id.btn_in_app_browser);

        mBtnOpenInAppBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = mEditUrl.getText().toString();

                Intent intent = InAppBrowserActivity.Builder.getBuilder()
                        .withUrl(url)
                        .build(MainActivity.this);

                startActivity(intent);
            }
        });
    }
}
