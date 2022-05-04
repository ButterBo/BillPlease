package sg.edu.rp.c346.id21044912.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView endTotal;
    TextView endSplit;
    Button splitButton;
    Button resetButton;
    EditText etInput1;
    EditText etInput2;
    EditText etInput3;
    ToggleButton tbtn1;
    ToggleButton tbtn2;
    RadioGroup rgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        endTotal = findViewById(R.id.totalBill);
        endSplit = findViewById(R.id.splitBill);
        splitButton = findViewById(R.id.split);
        resetButton = findViewById(R.id.reset);
        etInput1 = findViewById(R.id.numOfKirb);
        etInput2 = findViewById(R.id.numOfPPL);
        etInput3 = findViewById(R.id.discount_input);
        tbtn1 = findViewById(R.id.toggleSvs);
        tbtn2 = findViewById(R.id.toggleGST);
        rgPayment = findViewById(R.id.rgPay);

        String total = etInput1.getText().toString();
        int total_cost = Integer.parseInt(total);

        String ppl = etInput2.getText().toString();
        int num_of_ppl = Integer.parseInt(ppl);

        String stringdiscount = etInput3.getText().toString();
        int discount = Integer.parseInt(stringdiscount);

        rgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkPay = rgPayment.getCheckedRadioButtonId();
                if ((checkPay == R.id.cash)||(checkPay == R.id.paynow)){
                    splitButton.setEnabled(true);
                } else {
                    splitButton.setEnabled(false);
                }
            }
        });

        splitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (total_cost > 0){
                    if (num_of_ppl > 0){
                        if ()
                    }
                }
            }
        });
    }
}