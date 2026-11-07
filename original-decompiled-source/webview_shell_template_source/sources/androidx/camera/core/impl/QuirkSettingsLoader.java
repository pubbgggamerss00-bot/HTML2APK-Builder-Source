package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class QuirkSettingsLoader implements o.a<Context, QuirkSettings> {
    public static final String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final String TAG = "QuirkSettingsLoader";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    private static QuirkSettings buildQuirkSettings(Context context, Bundle bundle) {
        boolean z6 = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        String[] strArrLoadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        String[] strArrLoadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        Logger.d(TAG, "Loaded quirk settings from metadata:");
        Logger.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z6);
        Logger.d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrLoadQuirks));
        Logger.d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrLoadQuirks2));
        return new QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z6).forceEnableQuirks(resolveQuirkNames(strArrLoadQuirks)).forceDisableQuirks(resolveQuirkNames(strArrLoadQuirks2)).build();
    }

    private static String[] loadQuirks(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i6 = bundle.getInt(str, -1);
        if (i6 == -1) {
            Logger.w(TAG, "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i6);
        } catch (Resources.NotFoundException e6) {
            Logger.w(TAG, "Quirk class names resource not found: " + i6, e6);
            return new String[0];
        }
    }

    private static Class<? extends Quirk> resolveQuirkName(String str) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(str);
            if (Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            Logger.w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e6) {
            Logger.w(TAG, "Class not found: " + str, e6);
            return null;
        }
    }

    private static Set<Class<? extends Quirk>> resolveQuirkNames(String[] strArr) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends Quirk> clsResolveQuirkName = resolveQuirkName(str);
            if (clsResolveQuirkName != null) {
                hashSet.add(clsResolveQuirkName);
            }
        }
        return hashSet;
    }

    @Override // o.a
    public QuirkSettings apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return buildQuirkSettings(context, bundle);
            }
            Logger.w(TAG, "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
