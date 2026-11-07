package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeMap f2325c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public String f2326d;

    /* renamed from: e, reason: collision with root package name */
    public String f2327e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2328f;

    public e(Context context, String str) {
        String strConcat;
        this.f2323a = context.getApplicationContext();
        this.f2324b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + j3.d.a(context).b(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e6) {
            zzo.zzh("Unable to get package version name for reporting", e6);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f2328f = strConcat;
    }
}
