package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t20 implements u20 {
    public static final Object C = new Object();
    public static u20 D;
    public static u20 E;
    public static u20 F;
    public static Boolean G;
    public boolean B;

    /* renamed from: t, reason: collision with root package name */
    public final Context f9077t;

    /* renamed from: w, reason: collision with root package name */
    public final VersionInfoParcel f9080w;

    /* renamed from: x, reason: collision with root package name */
    public final PackageInfo f9081x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9082y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9083z;
    public final Object s = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final WeakHashMap f9078u = new WeakHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final ExecutorService f9079v = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    public final AtomicBoolean A = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t20(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfoB;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9077t = context;
        this.f9080w = versionInfoParcel;
        String string = null;
        if (((Boolean) zzbe.zzc().a(zn.G7)).booleanValue()) {
            Handler handler = zzf.zza;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoB = null;
            } else {
                try {
                    packageInfoB = j3.d.a(context).b(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        this.f9081x = packageInfoB;
        nn nnVar = zn.E7;
        this.f9082y = ((Boolean) zzbe.zzc().a(nnVar)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
            Context context2 = this.f9077t;
            Handler handler2 = zzf.zza;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoB2 = j3.d.a(context2).b(128, "com.android.vending");
                    if (packageInfoB2 != null) {
                        string = Integer.toString(packageInfoB2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.f9083z = string;
    }

    public static u20 a(Context context) {
        synchronized (C) {
            try {
                if (D == null) {
                    if (i(context)) {
                        D = new t20(context, VersionInfoParcel.forPackage());
                    } else {
                        D = new me0(17);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return D;
    }

    public static u20 d(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (C) {
            try {
                if (F == null) {
                    boolean z6 = false;
                    if (((Boolean) lp.f6808c.c()).booleanValue()) {
                        if (!((Boolean) zzbe.zzc().a(zn.z7)).booleanValue() || ((Boolean) lp.f6806a.c()).booleanValue()) {
                            z6 = true;
                        }
                    }
                    if (i(context)) {
                        t20 t20Var = new t20(context, versionInfoParcel);
                        t20Var.h();
                        Thread.setDefaultUncaughtExceptionHandler(new r20(t20Var, Thread.getDefaultUncaughtExceptionHandler()));
                        F = t20Var;
                    } else if (!z6 || context == null) {
                        F = new me0(17);
                    } else {
                        t20 t20Var2 = new t20(context, versionInfoParcel);
                        t20Var2.B = true;
                        t20Var2.h();
                        Thread.setDefaultUncaughtExceptionHandler(new r20(t20Var2, Thread.getDefaultUncaughtExceptionHandler()));
                        F = t20Var2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return F;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0042), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u20 e(Context context) {
        synchronized (C) {
            try {
                if (E == null) {
                    if (((Boolean) zzbe.zzc().a(zn.A7)).booleanValue()) {
                        if (((Boolean) zzbe.zzc().a(zn.z7)).booleanValue()) {
                            E = new me0(17);
                        } else {
                            E = new t20(context, VersionInfoParcel.forPackage());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return E;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(Context context) {
        if (context != null) {
            if (((Boolean) zzbe.zzc().a(zn.Ec)).booleanValue()) {
                synchronized (C) {
                    try {
                        if (G == null) {
                            G = Boolean.valueOf(zzbc.zze().nextInt(100) < ((Integer) zzbe.zzc().a(zn.Bc)).intValue());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (G.booleanValue()) {
                    if (!((Boolean) zzbe.zzc().a(zn.z7)).booleanValue()) {
                    }
                }
            } else if (((Boolean) aq.f2822e.c()).booleanValue()) {
                if (!((Boolean) zzbe.zzc().a(zn.z7)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void b(String str, Throwable th) {
        if (this.B) {
            return;
        }
        c(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void c(Throwable th, String str, float f6) {
        Throwable th2;
        boolean zC;
        String packageName;
        PackageInfo packageInfoB;
        ActivityManager.MemoryInfo memoryInfoZzc;
        String strZzg;
        Context context = this.f9077t;
        if (this.B) {
            return;
        }
        Handler handler = zzf.zza;
        int i6 = 1;
        if (((Boolean) aq.f2823f.c()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z6 = ((Boolean) zzbe.zzc().a(zn.f11474s2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && zzf.zzo(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z6 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z6) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strF = f(th);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.I8)).booleanValue();
            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zBooleanValue && (strZzg = zzf.zzg(f(th))) != null) {
                str2 = strZzg;
            }
            double d7 = f6;
            double dRandom = Math.random();
            int i7 = f6 > 0.0f ? (int) (1.0f / f6) : 1;
            if (dRandom < d7) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zC = j3.d.a(context).c();
                } catch (Throwable th4) {
                    zzo.zzh("Error fetching instant app info", th4);
                    zC = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzj("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zC)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i8 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i8));
                String str3 = Build.MANUFACTURER;
                String strD = Build.MODEL;
                if (!strD.startsWith(str3)) {
                    strD = androidx.activity.m.d(str3, " ", strD);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strD);
                VersionInfoParcel versionInfoParcel = this.f9080w;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strF).appendQueryParameter("eids", TextUtils.join(",", zzbe.zza().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i7)).appendQueryParameter("pb_tm", String.valueOf(aq.f2820c.c()));
                c3.h.f2184b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(c3.h.a(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", str2);
                }
                if (((Boolean) zzbe.zzc().a(zn.F7)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZzc.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZzc.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZzc.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzbe.zzc().a(zn.E7)).booleanValue()) {
                    String str4 = this.f9082y;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.f9083z;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str5);
                    }
                    if (i8 >= 26) {
                        packageInfoB = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoB = null;
                    } else {
                        try {
                            packageInfoB = j3.d.a(context).b(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoB != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoB.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoB.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoB.packageName);
                    }
                }
                PackageInfo packageInfo = this.f9081x;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    this.f9079v.execute(new wx(i6, new zzu(null), (String) obj));
                }
            }
        }
    }

    public final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= t20.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.B) {
                b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
            if (this.A.getAndSet(true) || !((Boolean) lp.f6808c.c()).booleanValue() || (sharedPreferences = (context = this.f9077t).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", mn.b(context, "crash_without_write") + 1).commit();
        }
    }

    public final void h() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.s) {
            this.f9078u.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new s20(this, thread.getUncaughtExceptionHandler()));
    }
}
