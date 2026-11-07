package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mg {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f7139e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f7140a;

    /* renamed from: b, reason: collision with root package name */
    public long f7141b;

    /* renamed from: c, reason: collision with root package name */
    public long f7142c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7143d;

    public static mg a(Context context, Executor executor) {
        String[] strArr = f7139e;
        mg mgVar = new mg();
        mgVar.f7140a = 0L;
        mgVar.f7141b = 0L;
        mgVar.f7142c = -1L;
        mgVar.f7143d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new kg(mgVar));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return mgVar;
    }
}
