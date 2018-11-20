package damith.com.mydemof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myFirstButton =  findViewById(R.id.btn_click);
        myFirstButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_click :
                // Statements
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
             //   startActivity(new Intent(this,BlankFragment.class));

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);

                startActivity(intent);


                break; // optional


            // You can have any number of case statements.
            default : // Optional
                // Statements
            //handle multiple view click events
        }
    }
}
