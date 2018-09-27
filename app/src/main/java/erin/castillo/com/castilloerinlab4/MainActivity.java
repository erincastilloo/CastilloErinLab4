package erin.castillo.com.castilloerinlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE", "OnCreate() has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "OnStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "OnResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "OnPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "OnStop() has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "OnRestart() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "OnDestroy() has been executed");
    }
    public void showSnackbarmes (View v){
        Snackbar.make(v, "You clicked Next Button", Snackbar.LENGTH_LONG).show();
    }
    public void showToastmes (View v){
        Toast.makeText(this, "You clicked Back Button!", Toast.LENGTH_LONG).show();
    }
}
