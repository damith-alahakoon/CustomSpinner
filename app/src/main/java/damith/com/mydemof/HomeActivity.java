package damith.com.mydemof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String[] list = {"Saman", "Kamal", "Nimal", "Sunil", "Supun", "Chamara"};
       // int flags[]={};


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,
//                list);
//        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(spinnerArrayAdapter);


        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),list);
        spinner.setAdapter(customAdapter);
    }
}
