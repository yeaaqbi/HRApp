package hr.com.hrapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;

import utils.CommonUtils;

public class FirstTimeActivity extends AppCompatActivity {
    private TextView txtFirstTimeDesc;
    private TextView txtFirstTimeChooseLang;
    private RadioButton rbArabic;
    private RadioButton rbEnglish;
    private Button btnTakeMeToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);
        // get views
        txtFirstTimeDesc = (TextView)findViewById(R.id.txtFirstTimeDesc);
        txtFirstTimeChooseLang = (TextView)findViewById(R.id.txtFirstTimeChooseLang);
        rbArabic = (RadioButton)findViewById(R.id.rdArabic);
        rbEnglish = (RadioButton)findViewById(R.id.rdEnglish);
        btnTakeMeToLogin = (Button)findViewById(R.id.btnChooseLanguage);
        // change font type
        CommonUtils.SetFontFaceTypeForViews(txtFirstTimeDesc,this);
        CommonUtils.SetFontFaceTypeForViews(txtFirstTimeChooseLang,this);
        CommonUtils.SetFontFaceTypeForViews(btnTakeMeToLogin,this);
        CommonUtils.SetFontFaceTypeForViews(rbArabic,this);
        CommonUtils.SetFontFaceTypeForViews(rbEnglish,this);

        // add actions
        btnTakeMeToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(loginIntent);
                finish();



            }
        });

    }

}
