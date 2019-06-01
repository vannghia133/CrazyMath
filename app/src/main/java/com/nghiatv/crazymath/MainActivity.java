package com.nghiatv.crazymath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtGameName;
    private TextView txtBestScore;
    private Button btnPlay;
    private Button btnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponent();
    }

    private void initializeComponent() {
        txtGameName = (TextView) findViewById(R.id.txtGameName);
        txtBestScore = (TextView) findViewById(R.id.txtBestScore);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnMore = (Button) findViewById(R.id.btnMore);

        btnPlay.setOnClickListener(this);
        btnMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                clickPlay();
                break;

            case R.id.btnMore:
                clickMore();
                break;

            default:
                break;
        }
    }

    private void clickPlay() {
        Intent itent = new Intent(this, PlayActivity.class);
        startActivity(itent);
    }

    private void clickMore() {
    }
}
