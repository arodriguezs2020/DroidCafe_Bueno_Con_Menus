package jesuitas.dam.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showDonutOrder(View view) {

        toast = getString(R.string.donut_order_message);
        displayToast(getString(R.string.donut_order_message));
    }

    public void showIceCreamOrder(View view) {
        toast = getString(R.string.ice_cream_order_message);
        displayToast(getString(R.string.ice_cream_order_message));
    }

    public void showFroyoOrder(View view) {

        toast = getString(R.string.froyo_order_message);
        displayToast(getString(R.string.froyo_order_message));
    }


    public void mostrar(View view) {
        Intent intent = new Intent(this,MostrarTexto.class);
        intent.putExtra("Texto", toast.toString());
        startActivity(intent);
    }
}