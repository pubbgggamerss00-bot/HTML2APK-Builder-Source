package ka;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.auth.api.signin.RevocationBoundService;

/* loaded from: classes2.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f16243a;

    public s(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f16243a = revocationBoundService;
    }

    public final void b() {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.f16243a;
        ya.c cVarA = ya.d.a(revocationBoundService);
        cVarA.getClass();
        try {
            appOpsManager = (AppOpsManager) cVarA.f34356a.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            pa.j jVarA = pa.j.a(revocationBoundService);
            jVarA.getClass();
            if (packageInfo != null) {
                if (pa.j.c(packageInfo, false)) {
                    return;
                }
                if (pa.j.c(packageInfo, true)) {
                    Context context = jVarA.f21398a;
                    try {
                        if (!pa.i.f21395c) {
                            try {
                                PackageInfo packageInfo2 = ya.d.a(context).f34356a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                pa.j.a(context);
                                if (packageInfo2 == null || pa.j.c(packageInfo2, false) || !pa.j.c(packageInfo2, true)) {
                                    pa.i.f21394b = false;
                                } else {
                                    pa.i.f21394b = true;
                                }
                                pa.i.f21395c = true;
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                                pa.i.f21395c = true;
                            }
                        }
                        if (pa.i.f21394b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th2) {
                        pa.i.f21395c = true;
                        throw th2;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        throw new SecurityException(ad.b.b(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }
}
