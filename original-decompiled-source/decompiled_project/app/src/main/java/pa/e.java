package pa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.basitce.htmltoapk.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.h1;
import com.google.android.gms.common.internal.p0;
import com.google.protobuf.DescriptorProtos;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21388a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f21389b;

    static {
        AtomicBoolean atomicBoolean = i.f21393a;
        f21388a = 12451000;
        f21389b = new e();
    }

    public Intent a(Context context, String str, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = h1.f6150a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && wa.b.a(context)) {
            int i12 = h1.f6150a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f21388a);
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
                ya.c cVarA = ya.d.a(context);
                sb.append(cVarA.f34356a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i13 = h1.f6150a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(PKIFailureInfo.signerNotTrusted);
        return intent3;
    }

    public int b(Context context) {
        return c(context, f21388a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = i.f21393a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f21396d.get()) {
            synchronized (p0.f6180a) {
                try {
                    if (!p0.f6181b) {
                        p0.f6181b = true;
                        try {
                            bundle = ya.d.a(context).f34356a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            p0.f6182c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i11 = p0.f6182c;
            if (i11 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(r1.f.a(f21388a, i11, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
            }
        }
        if (wa.b.a(context)) {
            z10 = false;
        } else {
            if (wa.b.f31481c == null) {
                wa.b.f31481c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!wa.b.f31481c.booleanValue()) {
                z10 = true;
            }
        }
        com.google.android.gms.common.internal.p.b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i12 = 9;
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            j.a(context);
            if (!j.c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z10) {
                com.google.android.gms.common.internal.p.f(packageInfo);
                if (!j.c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    int i13 = packageInfo2.versionCode;
                    if ((i13 == -1 ? -1 : i13 / DescriptorProtos.Edition.EDITION_2023_VALUE) < (i10 != -1 ? i10 / DescriptorProtos.Edition.EDITION_2023_VALUE : -1)) {
                        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(i10, "Google Play services out of date for ", packageName, ".  Requires ", " but found ");
                        sbA.append(i13);
                        Log.w("GooglePlayServicesUtil", sbA.toString());
                        i12 = 2;
                    } else {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i12 = 1;
                                if (i12 != 18 ? i12 == 1 ? i.a(context) : false : true) {
                                }
                            }
                        }
                        i12 = !applicationInfo.enabled ? 3 : 0;
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i12 != 18 ? i12 == 1 ? i.a(context) : false : true) {
            return i12;
        }
        return 18;
    }
}
