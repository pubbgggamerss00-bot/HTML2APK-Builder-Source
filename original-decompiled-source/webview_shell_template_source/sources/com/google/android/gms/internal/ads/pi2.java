package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pi2 extends zy {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8081g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f8082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8083c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8084d;

    /* renamed from: e, reason: collision with root package name */
    public final tc f8085e;

    /* renamed from: f, reason: collision with root package name */
    public final t7 f8086f;

    static {
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        List list = Collections.EMPTY_LIST;
        cp1 cp1Var2 = cp1.f3636w;
        ga gaVar = ga.f4956a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new q8(uri, cp1Var2);
        }
        new l5();
        lf lfVar = lf.f6679z;
    }

    public pi2(long j6, long j7, boolean z6, tc tcVar, t7 t7Var) {
        this.f8082b = j6;
        this.f8083c = j7;
        this.f8084d = z6;
        tcVar.getClass();
        this.f8085e = tcVar;
        this.f8086f = t7Var;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int a(Object obj) {
        return f8081g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final jx d(int i6, jx jxVar, boolean z6) {
        y5.f(i6, 1);
        Object obj = z6 ? f8081g : null;
        dj djVar = dj.f3948b;
        jxVar.b(null, obj, 0, this.f8082b, false);
        return jxVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final cy e(int i6, cy cyVar, long j6) {
        y5.f(i6, 1);
        Object obj = cy.f3686m;
        cyVar.a(this.f8085e, this.f8084d, false, this.f8086f, this.f8083c);
        return cyVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final Object f(int i6) {
        y5.f(i6, 1);
        return f8081g;
    }
}
