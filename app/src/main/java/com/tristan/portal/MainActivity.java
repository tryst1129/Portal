package com.tristan.portal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
        window.setStatusBarColor(getColor(R.color.transparent));
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed(){
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {

        Window window;
        if (findViewById(R.id.good) == view) {
            setContentView(R.layout.good_apps);
            window = this.getWindow();
            window.setStatusBarColor(getColor(R.color.green));
            return;
        }
        if (findViewById(R.id.bad) == view) {
            setContentView(R.layout.bad_apps);
            window = this.getWindow();
            window.setStatusBarColor(getColor(R.color.blue));
            return;
        }
        if (findViewById(R.id.ugly) == view) {
            setContentView(R.layout.ugly_apps);
            window = this.getWindow();
            window.setStatusBarColor(getColor(R.color.red));
            return;
        }


        if (findViewById(R.id.backG) == view) {
            setContentView(R.layout.activity_main);
            return;
        }
        if (findViewById(R.id.backB) == view) {
            setContentView(R.layout.activity_main);
            return;
        }
        if (findViewById(R.id.backU) == view) {
            setContentView(R.layout.activity_main);
            return;
        }




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




        if (findViewById(R.id.chase) == view) {
            url = "https://play.google.com/store/apps/details?id=com.chase.sig.android&pcampaignid=web_share";
        }
        if (findViewById(R.id.one) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.subscriptions.red&pcampaignid=web_share";
        }
        if (findViewById(R.id.drive) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.docs&pcampaignid=web_share";
        }
        if (findViewById(R.id.files) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.nbu.files&pcampaignid=web_share";
        }
        if (findViewById(R.id.keyboard) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.inputmethod.latin&pcampaignid=web_share";
        }
        if (findViewById(R.id.sengled) == view) {
            url = "https://play.google.com/store/apps/details?id=com.sengled.life2&pcampaignid=web_share";
        }
        if (findViewById(R.id.goodreads) == view) {
            url = "https://play.google.com/store/apps/details?id=com.goodreads&pcampaignid=web_share";
        }
        if (findViewById(R.id.books) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.books&pcampaignid=web_share";
        }
        if (findViewById(R.id.messages) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.messaging&pcampaignid=web_share";
        }
        if (findViewById(R.id.voice) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.googlevoice&pcampaignid=web_share";
        }
        if (findViewById(R.id.clock) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.deskclock&pcampaignid=web_share";
        }
        if (findViewById(R.id.contacts) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.contacts&pcampaignid=web_share";
        }
        if (findViewById(R.id.calendar) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.calendar&pcampaignid=web_share";
        }
        if (findViewById(R.id.sheets) == view) {
            url = "https://play.google.com/store/apps/details?id=com.google.android.apps.docs.editors.sheets&pcampaignid=web_share";
        }



        if (findViewById(R.id.infiniteCampus) == view) {
            url = "https://play.google.com/store/apps/details?id=com.infinitecampus.student.campusportalhybrid&pcampaignid=web_share";
        }
        if (findViewById(R.id.schoology) == view) {
            url = "https://play.google.com/store/apps/details?id=com.schoology.app&hl=en_ZA";
        }
        if (findViewById(R.id.hotSchedules) == view) {
            url = "https://play.google.com/store/apps/details?id=com.tdr3.hs.android&pcampaignid=web_share";
        }
        if (findViewById(R.id.life360) == view) {
            url = "https://play.google.com/store/apps/details?id=com.life360.android.safetymapd&pcampaignid=web_share";
        }






        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
        view.setVisibility(View.INVISIBLE);

    }
}