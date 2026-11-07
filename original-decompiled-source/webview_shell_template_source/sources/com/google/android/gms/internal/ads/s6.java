package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s6 {

    /* renamed from: b, reason: collision with root package name */
    public s1 f8805b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f8806c;

    /* renamed from: d, reason: collision with root package name */
    public q6 f8807d;

    /* renamed from: e, reason: collision with root package name */
    public long f8808e;

    /* renamed from: f, reason: collision with root package name */
    public long f8809f;

    /* renamed from: g, reason: collision with root package name */
    public long f8810g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f8811i;

    /* renamed from: k, reason: collision with root package name */
    public long f8813k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8814l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8815m;

    /* renamed from: a, reason: collision with root package name */
    public final o6 f8804a = new o6();

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.gms.ads.mediation.customevent.a f8812j = new com.google.android.gms.ads.mediation.customevent.a(1);

    public abstract long a(ex0 ex0Var);

    public void b(boolean z6) {
        int i6;
        if (z6) {
            this.f8812j = new com.google.android.gms.ads.mediation.customevent.a(1);
            this.f8809f = 0L;
            i6 = 0;
        } else {
            i6 = 1;
        }
        this.h = i6;
        this.f8808e = -1L;
        this.f8810g = 0L;
    }

    public abstract boolean c(ex0 ex0Var, long j6, com.google.android.gms.ads.mediation.customevent.a aVar);

    public void d(long j6) {
        this.f8810g = j6;
    }
}
