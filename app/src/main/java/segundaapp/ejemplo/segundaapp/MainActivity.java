package segundaapp.ejemplo.segundaapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static String TAG = MainActivity.class.getSimpleName();


    Button btnSimple, btnMixto;
    ImageButton btnImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnImagen = (ImageButton) findViewById(R.id.btnImagen);
        btnMixto = (Button) findViewById(R.id.btnMixto);

        btnSimple.setOnClickListener(this);
        btnImagen.setOnClickListener(this);
        btnMixto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimple:
                Log.d(TAG, "oncClick: Boton Simple");
                break;
            case R.id.btnImagen:
                Log.d(TAG, "oncClick: Boton con Imagen");
                break;
            case R.id.btnMixto:
                Log.d(TAG, "oncClick: Boton Mixto, 5 y le marcan ");
                break;
        }
    }
}
