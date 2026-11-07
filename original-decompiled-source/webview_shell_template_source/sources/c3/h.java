package c3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.g0;
import com.htmltoapk.template.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2183a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f2184b;

    static {
        AtomicBoolean atomicBoolean = k.f2186a;
        f2183a = 12451000;
        f2184b = new h();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = k.f2186a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, String str, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && i3.d.b(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f2183a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(j3.d.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0288 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i6) {
        boolean z6;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = k.f2186a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z7 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !k.f2187b.get()) {
            synchronized (g0.f2449a) {
                try {
                    if (!g0.f2450b) {
                        g0.f2450b = true;
                        try {
                            bundle = j3.d.a(context).a(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e6);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            g0.f2451c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i7 = g0.f2451c;
            if (i7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i7 != 12451000) {
                int i8 = f2183a;
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 104 + String.valueOf(i7).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i8);
                sb.append(" but found ");
                sb.append(i7);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (i3.d.b(context)) {
            z6 = false;
        } else {
            if (i3.d.f13367d == null) {
                i3.d.f13367d = Boolean.valueOf(i3.g.a() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!i3.d.f13367d.booleanValue()) {
                z6 = true;
            }
        }
        com.google.android.gms.common.internal.l.b(i6 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i9 = 9;
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            synchronized (n.class) {
                if (n.f2188a == null) {
                    w wVar = c0.f2175a;
                    synchronized (c0.class) {
                        if (c0.f2177c == null) {
                            c0.f2177c = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    n nVar = new n();
                    context.getApplicationContext();
                    n.f2188a = nVar;
                }
            }
            if (!n.a(packageInfo2)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z6) {
                com.google.android.gms.common.internal.l.f(packageInfo);
                if (!n.a(packageInfo)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (!z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    int i10 = packageInfo2.versionCode;
                    if ((i10 == -1 ? -1 : i10 / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL) < (i6 != -1 ? i6 / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i6).length() + 11 + String.valueOf(i10).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i6);
                        sb2.append(" but found ");
                        sb2.append(i10);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i9 = 2;
                    } else {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                i9 = 1;
                                if (i9 != 18) {
                                }
                                if (z7) {
                                }
                            }
                        }
                        i9 = !applicationInfo.enabled ? 3 : 0;
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i9 != 18) {
            if (i9 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z7 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                            break;
                        }
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                }
            } else {
                z7 = false;
            }
        }
        if (z7) {
            return i9;
        }
        return 18;
    }
}
