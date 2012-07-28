package henley.sean.androidspinningcube;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SpinningCubeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinning_cube);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_spinning_cube, menu);
        return true;
    }
}
