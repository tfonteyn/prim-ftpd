package org.primftpd.ui;


import android.os.Bundle;
import android.view.Menu;

public class LeanbackActivity extends MainTabsActivity {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        vm.setLeanBack(true);
    }

    @Override
    protected PftpdFragment createPftpdFragment() {
        return new LeanbackFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // no menu for leanback
        return true;
    }
}
