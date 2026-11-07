package ib;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.e;
import pa.f;
import pa.g;
import pa.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f14436a = e.f21389b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14437b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f14438c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f14439d = false;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x0053, TryCatch #1 {, blocks: (B:12:0x0045, B:15:0x004a, B:22:0x006d, B:23:0x0072, B:25:0x0074, B:27:0x0077, B:33:0x0083, B:35:0x0087, B:38:0x00b0, B:41:0x00c2, B:42:0x00c7, B:44:0x00c9, B:45:0x00d7, B:20:0x0057), top: B:50:0x0045, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9 A[Catch: all -> 0x0053, TryCatch #1 {, blocks: (B:12:0x0045, B:15:0x004a, B:22:0x006d, B:23:0x0072, B:25:0x0074, B:27:0x0077, B:33:0x0083, B:35:0x0087, B:38:0x00b0, B:41:0x00c2, B:42:0x00c7, B:44:0x00c9, B:45:0x00d7, B:20:0x0057), top: B:50:0x0045, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context) throws f, g {
        Context context2;
        Context contextCreatePackageContext;
        p.g(context, "Context must not be null");
        f14436a.getClass();
        AtomicBoolean atomicBoolean = i.f21393a;
        e eVar = e.f21389b;
        int iC = eVar.c(context, 11925000);
        if (iC != 0) {
            Intent intentA = eVar.a(context, "e", iC);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iC);
            if (intentA != null) {
                throw new g(iC);
            }
            throw new f(iC);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f14437b) {
            Context context3 = null;
            if (!f14439d) {
                try {
                    context2 = DynamiteModule.b(context, DynamiteModule.f6216b).f6227a;
                } catch (DynamiteModule.a e10) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
                boolean z10 = f14439d;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                if (contextCreatePackageContext != null) {
                    f14439d = true;
                    if (!z10) {
                        try {
                            zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextCreatePackageContext.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(jUptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                        } catch (Exception e11) {
                            Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e11.toString()));
                        }
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 == null) {
                    b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new f(8);
                }
            }
            boolean z102 = f14439d;
            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            if (contextCreatePackageContext != null) {
            }
            if (context3 == null) {
            }
        }
    }

    public static void b(Context context, String str) throws IllegalAccessException, IllegalArgumentException, f, InvocationTargetException {
        try {
            if (f14438c == null) {
                f14438c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f14438c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new f(8);
        }
    }
}
