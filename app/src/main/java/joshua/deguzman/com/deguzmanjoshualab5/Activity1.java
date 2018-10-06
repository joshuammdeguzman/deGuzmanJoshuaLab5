package joshua.deguzman.com.deguzmanjoshualab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button next = findViewById(R.id.nextButton);
        Button map = findViewById(R.id.mapButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(), Activity2.class);
                startActivity(next);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = null, chooser = null;
                map = new Intent(Intent.ACTION_VIEW);
                map.setData(Uri.parse("geo:14.602843, 120.970385"));
                chooser = Intent.createChooser(map, "Choose Map Application");
                startActivity(chooser);
            }
        });
    }
}
