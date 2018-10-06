package joshua.deguzman.com.deguzmanjoshualab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button previous = findViewById(R.id.previousButton);
        Button map = findViewById(R.id.mapButton2);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), Activity1.class);
                startActivity(next);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = null, chooser = null;
                map = new Intent(Intent.ACTION_VIEW);
                map.setData(Uri.parse("geo:14.593079, 120.971999"));
                chooser = Intent.createChooser(map, "Choose Map Application");
                startActivity(chooser);
            }
        });
    }
}
