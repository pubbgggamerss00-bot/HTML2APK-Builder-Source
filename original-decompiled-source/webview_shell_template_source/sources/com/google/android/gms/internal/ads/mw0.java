package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class mw0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7229b;

    public /* synthetic */ mw0(int i6, Object obj) {
        this.f7228a = i6;
        this.f7229b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc A[Catch: IOException -> 0x00d1, TryCatch #3 {IOException -> 0x00d1, blocks: (B:37:0x0096, B:39:0x00b8, B:41:0x00ca, B:45:0x00d6, B:50:0x00fc, B:51:0x0121, B:60:0x012f, B:62:0x0141, B:64:0x0157, B:66:0x0160, B:71:0x0186, B:73:0x01a4, B:74:0x01c9, B:82:0x01dc, B:83:0x01e1, B:91:0x01f9, B:89:0x01f5, B:80:0x01da, B:69:0x0174, B:58:0x012d, B:48:0x00ea, B:84:0x01e2, B:85:0x01ee, B:75:0x01ca, B:76:0x01d6, B:53:0x0124, B:54:0x0128), top: B:134:0x0096, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186 A[Catch: IOException -> 0x00d1, TryCatch #3 {IOException -> 0x00d1, blocks: (B:37:0x0096, B:39:0x00b8, B:41:0x00ca, B:45:0x00d6, B:50:0x00fc, B:51:0x0121, B:60:0x012f, B:62:0x0141, B:64:0x0157, B:66:0x0160, B:71:0x0186, B:73:0x01a4, B:74:0x01c9, B:82:0x01dc, B:83:0x01e1, B:91:0x01f9, B:89:0x01f5, B:80:0x01da, B:69:0x0174, B:58:0x012d, B:48:0x00ea, B:84:0x01e2, B:85:0x01ee, B:75:0x01ca, B:76:0x01d6, B:53:0x0124, B:54:0x0128), top: B:134:0x0096, inners: #1, #2, #4 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        y2 y2Var;
        boolean z6;
        boolean z7;
        y2 y2Var2;
        boolean z8;
        boolean z9;
        y2 y2VarA;
        switch (this.f7228a) {
            case 0:
                CookieManager cookieManager = (CookieManager) this.f7229b;
                if (cookieManager == null) {
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                return cookieManager.getCookie((String) zzbe.zzc().a(zn.Y0));
            case 1:
                e71 e71Var = (e71) this.f7229b;
                Set set = e71Var.f4150d;
                ViewGroup viewGroup = e71Var.f4148b;
                if (((Boolean) zzbe.zzc().a(zn.M5)).booleanValue() && viewGroup != null && set.contains("banner")) {
                    return new j51(1, Boolean.valueOf(viewGroup.isHardwareAccelerated()));
                }
                if (((Boolean) zzbe.zzc().a(zn.N5)).booleanValue() && set.contains("native")) {
                    Context context = e71Var.f4149c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                serializableValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        } else {
                            serializableValueOf = Boolean.TRUE;
                        }
                        return new j51(1, serializableValueOf);
                    }
                }
                return new j51(1, null);
            case 2:
                p71 p71Var = (p71) this.f7229b;
                return new q71(p71Var.f7986b, p71Var.f7987c, p71Var.f7988d);
            case 3:
                y71 y71Var = (y71) this.f7229b;
                try {
                    Context context2 = y71Var.f10880a;
                    boolean zMatches = y71Var.f10882c.f4211f.matches((String) zzbe.zzc().a(zn.f11444n3));
                    y2 y2Var3 = new y2();
                    y2 y2Var4 = new y2();
                    if (zMatches) {
                        if (!((Boolean) zzbe.zzc().a(zn.f11411i3)).booleanValue()) {
                            return new z71(true);
                        }
                    }
                    if (!zMatches) {
                        if (!((Boolean) zzbe.zzc().a(zn.f11385e3)).booleanValue()) {
                            if (zMatches) {
                                if (((Boolean) zzbe.zzc().a(zn.f11399g3)).booleanValue()) {
                                    ak1 ak1VarF = ak1.f(context2);
                                    long jLongValue = ((Long) zzbe.zzc().a(zn.f11456p3)).longValue();
                                    boolean zZzN = zzv.zzp().d().zzN();
                                    ak1VarF.getClass();
                                    synchronized (ak1.class) {
                                        y2VarA = ak1VarF.a(null, null, jLongValue, zZzN);
                                    }
                                    y2Var = y2VarA;
                                }
                            }
                            y2Var = y2Var3;
                        }
                    }
                    if (((Boolean) zzbe.zzc().a(zn.f11438m3)).booleanValue()) {
                        if (y71Var.f10883d.clientJarVersion < ((Integer) zzbe.zzc().a(zn.f11432l3)).intValue()) {
                            bk1.g(context2).h();
                        }
                    }
                    if (!zMatches) {
                        if (!((Boolean) zzbe.zzc().a(zn.f11392f3)).booleanValue()) {
                            if (zMatches) {
                                if (((Boolean) zzbe.zzc().a(zn.f11404h3)).booleanValue()) {
                                    bk1 bk1VarG = bk1.g(context2);
                                    xj1 xj1VarD = xj1.d(context2);
                                    if (y71Var.f10883d.clientJarVersion >= ((Integer) zzbe.zzc().a(zn.f11432l3)).intValue()) {
                                        y2Var4 = bk1VarG.f(zzv.zzp().d().zzN(), ((Long) zzbe.zzc().a(zn.f11463q3)).longValue());
                                        xj1VarD.getClass();
                                        synchronized (xj1.class) {
                                            z8 = ((yj1) xj1VarD.f10619t).f11010b.getBoolean("paidv2_publisher_option", true);
                                        }
                                    } else {
                                        z8 = true;
                                    }
                                    xj1VarD.getClass();
                                    synchronized (xj1.class) {
                                        z9 = ((yj1) xj1VarD.f10619t).f11010b.getBoolean("paidv2_user_option", true);
                                    }
                                    z7 = z9;
                                    y2Var2 = y2Var4;
                                    z6 = z8;
                                }
                            }
                            z6 = true;
                            z7 = true;
                            y2Var2 = y2Var4;
                        }
                    }
                    return new z71(y2Var, y2Var2, z6, z7, zMatches);
                } catch (IOException e6) {
                    zzv.zzp().h("PerAppIdSignal", e6);
                    return new z71(y71Var.f10882c.f4211f.matches((String) zzbe.zzc().a(zn.f11444n3)));
                }
            case 4:
                i81 i81Var = (i81) this.f7229b;
                b60 b60Var = i81Var.f5599a;
                Context context3 = i81Var.f5601c;
                if (!b60Var.e(context3)) {
                    return new j81(null, null, null, null, null);
                }
                String strC = b60Var.c(context3);
                String str = strC == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strC;
                String strB = b60Var.b(context3);
                String str2 = strB == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strB;
                String strA = b60Var.a(context3);
                String str3 = strA == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strA;
                String str4 = true != b60Var.e(context3) ? null : "fa";
                return new j81(str, str2, str3, str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4, "TIME_OUT".equals(str2) ? (Long) zzbe.zzc().a(zn.f11477t0) : null);
            case 5:
                Context context4 = ((u81) this.f7229b).f9491a;
                return new v81(mn.b(context4, "init_without_write"), mn.b(context4, "crash_without_write"));
            default:
                String str5 = (String) ((ds1) this.f7229b).s;
                ds1 ds1Var = ds1.f4001t;
                return new n91(str5, null);
        }
    }

    public /* synthetic */ mw0(ds1 ds1Var) {
        this.f7228a = 6;
        ds1 ds1Var2 = ds1.f4001t;
        this.f7229b = ds1Var;
    }
}
