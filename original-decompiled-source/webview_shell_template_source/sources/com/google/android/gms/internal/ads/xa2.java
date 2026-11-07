package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xa2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10455a;

    /* renamed from: b, reason: collision with root package name */
    public final hy0 f10456b;

    /* renamed from: c, reason: collision with root package name */
    public final v31 f10457c;

    /* renamed from: d, reason: collision with root package name */
    public final yn f10458d;

    /* renamed from: e, reason: collision with root package name */
    public em1 f10459e;

    /* renamed from: f, reason: collision with root package name */
    public em1 f10460f;

    /* renamed from: g, reason: collision with root package name */
    public final xj0 f10461g;
    public final Looper h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10462i;

    /* renamed from: j, reason: collision with root package name */
    public final gy0 f10463j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10464k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10465l;

    /* renamed from: m, reason: collision with root package name */
    public final tc2 f10466m;

    /* renamed from: n, reason: collision with root package name */
    public final long f10467n;

    /* renamed from: o, reason: collision with root package name */
    public final long f10468o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f10469p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10470q;

    /* renamed from: r, reason: collision with root package name */
    public final String f10471r;
    public final sa2 s;

    public xa2(Context context, xj0 xj0Var) {
        v31 v31Var = new v31(18, xj0Var);
        yn ynVar = new yn(context, 3);
        wg1 wg1Var = new wg1(context);
        ov1 ov1Var = new ov1(9);
        xj0 xj0Var2 = new xj0(16, context);
        context.getClass();
        this.f10455a = context;
        this.f10457c = v31Var;
        this.f10458d = ynVar;
        this.f10459e = wg1Var;
        this.f10460f = ov1Var;
        this.f10461g = xj0Var2;
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f10463j = gy0.f5187b;
        this.f10464k = 1;
        this.f10465l = true;
        this.f10466m = tc2.f9228c;
        this.s = new sa2(j31.s(20L), j31.s(500L));
        this.f10456b = el0.f4333a;
        this.f10467n = 500L;
        this.f10468o = 2000L;
        this.f10469p = true;
        this.f10471r = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f10462i = -1000;
    }
}
