package pa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static j f21397b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21398a;

    public j(Context context) {
        this.f21398a = context.getApplicationContext();
    }

    public static j a(Context context) {
        com.google.android.gms.common.internal.p.f(context);
        synchronized (j.class) {
            if (f21397b == null) {
                q qVar = w.f21409a;
                synchronized (w.class) {
                    if (w.f21411c == null) {
                        w.f21411c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f21397b = new j(context);
            }
        }
        return f21397b;
    }

    public static final s b(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            t tVar = new t(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < sVarArr.length; i10++) {
                if (sVarArr[i10].equals(tVar)) {
                    return sVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? b(packageInfo2, v.f21408a) : b(packageInfo2, v.f21408a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
