package org.materialos.icons.launchers;

import android.content.Context;
import android.content.Intent;

public class SmartproLauncher {
    public SmartproLauncher(Context context) {
        Intent smartlauncherIntent = new Intent("ginlemon.smartlauncher.setGSLTHEME");
        smartlauncherIntent.putExtra("package", context.getPackageName());
        context.startActivity(smartlauncherIntent);
    }
}
