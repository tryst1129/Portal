package com.tristan.portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {

        String url = "https://google.com";


        if (findViewById(R.id.viMusic) == view) {
            url = "https://github.com/vfsfitvnm/ViMusic/releases";
        }
        if (findViewById(R.id.newPipe) == view) {
            url = "https://github.com/TeamNewPipe/NewPipe/releases";
        }
        if (findViewById(R.id.onStream) == view) {
            url = "https://onstream.so/#section-download";
        }
        if (findViewById(R.id.soul) == view) {
            url = "https://play.google.com/store/apps/details?id=com.mycompany.app.soulbrowser&pcampaignid=web_share";
        }
        if (findViewById(R.id.pdnsqs) == view) {
            url = "https://play.google.com/store/apps/details?id=com.draco.pdnsqs&pcampaignid=web_share";
        }
        if (findViewById(R.id.repainter) == view) {
            url = "https://play.google.com/store/apps/details?id=dev.kdrag0n.dyntheme&pcampaignid=web_share";
        }
        if (findViewById(R.id.skit) == view) {
            url = "https://play.google.com/store/apps/details?id=com.pavelrekun.skit.premium&pcampaignid=web_share";
        }
        if (findViewById(R.id.ladb) == view) {
            url = "https://play.google.com/store/apps/details?id=com.draco.ladb&pcampaignid=web_share";
        }



        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
        view.setVisibility(View.INVISIBLE);

    }
}