package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import b5.a;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.mx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final j f11787b;

    public j5(Application application, j jVar) {
        this.f11786a = application;
        this.f11787b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public final c0 a(Activity activity, b5.b bVar) throws PackageManager.NameNotFoundException, f2 {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        b5.a aVarA = bVar.f2007b;
        Application application = this.f11786a;
        if (aVarA == null) {
            aVarA = new a.C0024a(application).a();
        }
        c0 c0Var = new c0();
        c0Var.f11653e = Collections.EMPTY_MAP;
        c0Var.f11656i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new f2(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        c0Var.f11649a = string;
        if (aVarA.f2001a) {
            ArrayList arrayList = new ArrayList();
            int i6 = aVarA.f2002b;
            if (i6 == 1) {
                arrayList.add(a0.s);
            } else if (i6 == 2) {
                arrayList.add(a0.f11619v);
            } else if (i6 == 3) {
                arrayList.add(a0.f11617t);
            } else if (i6 == 4) {
                arrayList.add(a0.f11618u);
            }
            arrayList.add(a0.f11620w);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        c0Var.f11656i = list;
        c0Var.f11653e = this.f11787b.a();
        c0Var.f11652d = Boolean.valueOf(bVar.f2006a);
        c0Var.f11651c = Locale.getDefault().toLanguageTag();
        com.google.android.gms.internal.ads.m2 m2Var = new com.google.android.gms.internal.ads.m2();
        m2Var.s = 1;
        int i7 = Build.VERSION.SDK_INT;
        m2Var.f6906u = Integer.valueOf(i7);
        m2Var.f6905t = Build.MODEL;
        m2Var.s = 2;
        c0Var.f11650b = m2Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        mx mxVar = new mx(4);
        Object arrayList2 = Collections.EMPTY_LIST;
        mxVar.f7235w = arrayList2;
        mxVar.f7232t = Integer.valueOf(configuration.screenWidthDp);
        mxVar.f7233u = Integer.valueOf(configuration.screenHeightDp);
        mxVar.f7234v = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i7 >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        b0 b0Var = new b0();
                        b0Var.f11640b = Integer.valueOf(rect.left);
                        b0Var.f11641c = Integer.valueOf(rect.right);
                        b0Var.f11639a = Integer.valueOf(rect.top);
                        b0Var.f11642d = Integer.valueOf(rect.bottom);
                        arrayList2.add(b0Var);
                    }
                }
            }
        }
        mxVar.f7235w = arrayList2;
        c0Var.f11654f = mxVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        k00 k00Var = new k00();
        k00Var.s = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        k00Var.f6201t = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            k00Var.f6202u = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c0Var.f11655g = k00Var;
        c0Var.h = new p1();
        return c0Var;
    }
}
