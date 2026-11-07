package de;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7893a;

    /* renamed from: b, reason: collision with root package name */
    public String f7894b;

    /* renamed from: c, reason: collision with root package name */
    public String f7895c;

    /* renamed from: d, reason: collision with root package name */
    public int f7896d;

    /* renamed from: e, reason: collision with root package name */
    public int f7897e = 0;

    public n(Context context) {
        this.f7893a = context;
    }

    public static String b(id.e eVar) {
        eVar.a();
        id.l lVar = eVar.f14482c;
        String str = lVar.f14496e;
        if (str != null) {
            return str;
        }
        eVar.a();
        String str2 = lVar.f14493b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f7894b == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7894b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f7893a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String strValueOf = String.valueOf(e10);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized void d() {
        PackageInfo packageInfoC = c(this.f7893a.getPackageName());
        if (packageInfoC != null) {
            this.f7894b = Integer.toString(packageInfoC.versionCode);
            this.f7895c = packageInfoC.versionName;
        }
    }
}
