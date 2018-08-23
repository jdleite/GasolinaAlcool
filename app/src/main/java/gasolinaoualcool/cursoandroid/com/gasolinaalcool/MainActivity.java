package gasolinaoualcool.cursoandroid.com.gasolinaalcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtGas;
    private EditText edtAlc;
    private Button btnVer;
    private TextView txtRes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGas = (EditText) findViewById(R.id.edtGasId);
        edtAlc = (EditText) findViewById(R.id.edtAlId);
        btnVer = (Button) findViewById(R.id.btnVeId);
        txtRes = (TextView) findViewById(R.id.txtResId);



        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prAl = edtAlc.getText().toString();
                String prGas = edtGas.getText().toString();

                Double vaAl = Double.parseDouble(prAl);
                Double vaGas = Double.parseDouble(prGas);

                Double res = vaAl / vaGas;

                if(res >= 0.7){
                    txtRes.setText("È melhor utilizar Gasolina");

                }else{
                    txtRes.setText("È melhor utilizar Álcool");
                }

            }
        });
    }
}
