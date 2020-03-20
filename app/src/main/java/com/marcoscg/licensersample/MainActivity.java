package com.marcoscg.licensersample;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.marcoscg.licenser.Library;
import com.marcoscg.licenser.License;
import com.marcoscg.licenser.LicenserDialog;
import com.marcoscg.licenser.Utils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LicenserDialog licenserDialog;
    private LicenserDialog licenserDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        licenserDialog = new LicenserDialog(this, R.style.DialogStyle)
                .setTitle("Licenses")
                .setCancelable(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setCustomNoticeTitle("Notices for files:")
                .setLibrary(new Library("Android Support Libraries",
                        "https://developer.android.com/topic/libraries/support-library/index.html",
                        License.APACHE))
                .setLibrary(new Library("Example Library",
                        "https://github.com/marcoscgdev",
                        License.APACHE))
                .setLibrary(new Library("Licenser",
                        "https://github.com/marcoscgdev/Licenser",
                        License.MIT))
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // TODO: 11/02/2018
                    }
                });

        licenserDialog2 = new LicenserDialog(this, R.style.DialogStyle)
                .setTitle("Licenses")
                .setCancelable(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setCustomNoticeTitle("Notices for files:")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // TODO: 11/02/2018
                    }
                });

                List<Library> libraries=new Utils().getNotices("notices.xml",getApplicationContext());
                for (int i=0;i<libraries.size();i++){
                    licenserDialog2.setLibrary(libraries.get(i));
                }           // Fin de ciclo

        findViewById(R.id.showDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licenserDialog.show();
            }
        });

        findViewById(R.id.showDialogFromAssets).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licenserDialog2.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_github:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/marcoscgdev/Licenser")));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
