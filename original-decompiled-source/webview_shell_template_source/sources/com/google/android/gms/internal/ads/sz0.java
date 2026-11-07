package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sz0 implements tz0 {
    public static gg1 g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return gg1.f5040u;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return gg1.f5042w;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return gg1.f5041v;
        }
        return null;
    }

    public static ig1 h(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return ig1.f5752w;
                }
            } else if (str.equals("definedByJavascript")) {
                return ig1.f5749t;
            }
        } else if (str.equals("beginToRender")) {
            return ig1.f5751v;
        }
        return ig1.f5750u;
    }

    public static mg1 i(String str) {
        return "native".equals(str) ? mg1.f7150t : "javascript".equals(str) ? mg1.f7151u : mg1.f7152v;
    }

    public static final void j(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e6) {
            zzv.zzp().g("omid exception", e6);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.qz0] */
    public final vz0 a(final int i6, final int i7, final WebView webView, final String str, final String str2, final String str3) {
        Object objA = null;
        if (!((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() || !bq.D.f3169a) {
            return null;
        }
        try {
            objA = new Object() { // from class: com.google.android.gms.internal.ads.qz0
                public final Object a() {
                    mo moVarA = mo.a("Google", str);
                    mg1 mg1VarI = sz0.i("javascript");
                    int i8 = i7;
                    gg1 gg1VarG = sz0.g(androidx.camera.view.g.b(i8));
                    mg1 mg1Var = mg1.f7152v;
                    if (mg1VarI == mg1Var) {
                        zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (gg1VarG == null) {
                        zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(androidx.camera.view.g.g(i8)));
                        return null;
                    }
                    String str4 = str2;
                    mg1 mg1VarI2 = sz0.i(str4);
                    if (gg1VarG == gg1.f5042w && mg1VarI2 == mg1Var) {
                        zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                        return null;
                    }
                    dg1 dg1Var = new dg1(moVarA, webView, str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, eg1.f4279t);
                    py0 py0VarA = py0.a(gg1VarG, sz0.h(androidx.camera.core.t.b(i6)), mg1VarI, mg1VarI2, true);
                    if (bq.D.f3169a) {
                        return new vz0(new fg1(py0VarA, dg1Var, UUID.randomUUID().toString()), dg1Var);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            }.a();
        } catch (RuntimeException e6) {
            zzv.zzp().g("omid exception", e6);
        }
        return (vz0) objA;
    }

    public final t31 b(VersionInfoParcel versionInfoParcel, WebView webView) {
        try {
            return new t31(mo.a("Google", versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion), webView);
        } catch (RuntimeException e6) {
            zzv.zzp().g("omid exception", e6);
            return null;
        }
    }

    public final String c() {
        if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public final void d(fg1 fg1Var, View view) {
        j(new ow(5, fg1Var, view));
    }

    public final void e(fg1 fg1Var) {
        if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() && bq.D.f3169a) {
            j(new t(10, fg1Var));
        }
    }

    public final boolean f(Context context) {
        Object objB;
        if (!((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue()) {
            zzo.zzj("Omid flag is disabled");
            return false;
        }
        try {
            objB = new cl0(context).b();
        } catch (RuntimeException e6) {
            zzv.zzp().g("omid exception", e6);
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        return bool != null && bool.booleanValue();
    }
}
