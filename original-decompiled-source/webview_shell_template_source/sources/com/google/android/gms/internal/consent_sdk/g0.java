package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public final Application f11747b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f11748c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f11749d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11750e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f11751f = new AtomicReference(new ArrayDeque());

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f11752g = new AtomicReference(new ArrayDeque());
    public final AtomicReference h = new AtomicReference(new ArrayDeque());

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f11753i = new AtomicReference(new ArrayDeque());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f11754j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f11755k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f11756l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11746a = new AtomicReference(null);

    public g0(Application application, Executor executor, f0 f0Var, boolean z6) {
        this.f11750e = z6;
        this.f11747b = application;
        this.f11748c = f0Var;
        this.f11749d = executor;
    }

    public final void a(Queue queue, int i6, int i7, String str) {
        Bundle bundle;
        Long l4 = (Long) queue.poll();
        if (l4 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l4.longValue();
            if (str != null) {
                i6 = i7;
            }
            AtomicReference atomicReference = this.f11755k;
            Queue queue2 = (Queue) atomicReference.get();
            f0 f0Var = this.f11748c;
            Application application = f0Var.f11719a;
            k3 k3VarM = l3.m();
            q2 q2VarM = y2.m();
            t2 t2VarM = u2.m();
            t2VarM.d();
            u2.p((u2) t2VarM.f11925t, i6);
            if (str != null) {
                t2VarM.d();
                u2.n((u2) t2VarM.f11925t, str);
            }
            if (jCurrentTimeMillis > 0) {
                t2VarM.d();
                u2.o((u2) t2VarM.f11925t, jCurrentTimeMillis);
            }
            u2 u2Var = (u2) t2VarM.b();
            q2VarM.d();
            y2.r((y2) q2VarM.f11925t, u2Var);
            String str2 = f0Var.f11723e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    f0Var.f11723e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(f0Var.f11723e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = f0Var.f11723e;
            }
            if (str2 != null) {
                q2VarM.d();
                y2.o((y2) q2VarM.f11925t, str2);
            }
            x2 x2Var = f0Var.f11720b;
            if (x2Var == null) {
                v2 v2VarM = x2.m();
                v2VarM.d();
                x2.n((x2) v2VarM.f11925t);
                x2Var = (x2) v2VarM.b();
                f0Var.f11720b = x2Var;
            }
            q2VarM.d();
            y2.s((y2) q2VarM.f11925t, x2Var);
            s2 s2Var = f0Var.f11722d;
            if (s2Var == null) {
                r2 r2VarM = s2.m();
                int i8 = Build.VERSION.SDK_INT;
                r2VarM.d();
                s2.n((s2) r2VarM.f11925t, i8);
                String str3 = Build.MODEL;
                r2VarM.d();
                s2.o((s2) r2VarM.f11925t);
                r2VarM.d();
                s2.q((s2) r2VarM.f11925t);
                String str4 = Build.VERSION.RELEASE;
                r2VarM.d();
                s2.p((s2) r2VarM.f11925t);
                s2Var = (s2) r2VarM.b();
                f0Var.f11722d = s2Var;
            }
            q2VarM.d();
            y2.q((y2) q2VarM.f11925t, s2Var);
            p2 p2Var = f0Var.f11721c;
            if (p2Var == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    o2 o2VarM = p2.m();
                    String string = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    o2VarM.d();
                    p2.o((p2) o2VarM.f11925t, string);
                    o2VarM.d();
                    p2.n((p2) o2VarM.f11925t, packageName);
                    f0Var.f11721c = (p2) o2VarM.b();
                }
                p2Var = f0Var.f11721c;
            }
            if (p2Var != null) {
                q2VarM.d();
                y2.p((y2) q2VarM.f11925t, p2Var);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (string2 != null && !string2.isEmpty()) {
                r0 r0Var = new r0(string2);
                while (r0Var.hasNext()) {
                    String str5 = (String) r0Var.next();
                    q2VarM.d();
                    y2.n((y2) q2VarM.f11925t, str5);
                }
            }
            y2 y2Var = (y2) q2VarM.b();
            k3VarM.d();
            l3.n((l3) k3VarM.f11925t, y2Var);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            k3VarM.d();
            l3.o((l3) k3VarM.f11925t, jCurrentTimeMillis2);
            queue2.add((l3) k3VarM.b());
            if (this.f11750e) {
                ((ArrayDeque) this.f11756l.get()).addAll((Collection) atomicReference.get());
            }
            this.f11749d.execute(new com.google.android.gms.ads.internal.util.a(4, this));
        }
    }
}
