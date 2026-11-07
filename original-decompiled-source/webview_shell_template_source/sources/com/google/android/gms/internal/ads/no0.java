package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class no0 implements pk0, dn0 {
    public final z50 s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f7479t;

    /* renamed from: u, reason: collision with root package name */
    public final b60 f7480u;

    /* renamed from: v, reason: collision with root package name */
    public final View f7481v;

    /* renamed from: w, reason: collision with root package name */
    public String f7482w;

    /* renamed from: x, reason: collision with root package name */
    public final ok f7483x;

    public no0(z50 z50Var, Context context, b60 b60Var, WebView webView, ok okVar) {
        this.s = z50Var;
        this.f7479t = context;
        this.f7480u = b60Var;
        this.f7481v = webView;
        this.f7483x = okVar;
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b60 b60Var = this.f7480u;
        Context context = this.f7479t;
        if (b60Var.e(context)) {
            try {
                b60Var.d(context, b60Var.a(context), this.s.f11179u, y30Var.s, y30Var.f10823t);
            } catch (RemoteException e6) {
                zzo.zzk("Remote Exception to get reward item.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
        this.s.a(false);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f7481v;
        if (view != null && this.f7482w != null) {
            Context context = view.getContext();
            String str = this.f7482w;
            b60 b60Var = this.f7480u;
            ConcurrentHashMap concurrentHashMap = b60Var.h;
            AtomicReference atomicReference = b60Var.f2941g;
            if (b60Var.e(context) && (context instanceof Activity) && b60Var.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        concurrentHashMap.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        b60Var.l("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    b60Var.l("setCurrentScreen", false);
                }
            }
        }
        this.s.a(true);
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzl() {
        ok okVar = ok.APP_OPEN;
        ok okVar2 = this.f7483x;
        if (okVar2 == okVar) {
            return;
        }
        b60 b60Var = this.f7480u;
        AtomicReference atomicReference = b60Var.f2940f;
        Context context = this.f7479t;
        boolean zE = b60Var.e(context);
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (zE && b60Var.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            try {
                String str2 = (String) b60Var.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                if (str2 == null) {
                    str2 = (String) b60Var.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                }
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception unused) {
                b60Var.l("getCurrentScreenName", false);
            }
        }
        this.f7482w = str;
        this.f7482w = String.valueOf(str).concat(okVar2 == ok.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.dn0
    public final void zzk() {
    }
}
