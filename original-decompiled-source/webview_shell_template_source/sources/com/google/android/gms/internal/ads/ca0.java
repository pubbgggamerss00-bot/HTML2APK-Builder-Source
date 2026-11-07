package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ca0 implements rb2 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f3495a = new u1();

    /* renamed from: b, reason: collision with root package name */
    public long f3496b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f3497c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f3498d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f3499e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f3500f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3501g;

    @Override // com.google.android.gms.internal.ads.rb2
    public final boolean a(qb2 qb2Var) {
        int i6;
        long j6 = qb2Var.f8300b;
        boolean z6 = true;
        char c7 = j6 > this.f3497c ? (char) 0 : j6 < this.f3496b ? (char) 2 : (char) 1;
        u1 u1Var = this.f3495a;
        synchronized (u1Var) {
            i6 = u1Var.f9422b * 65536;
        }
        int i7 = this.f3500f;
        if (c7 != 2 && (c7 != 1 || !this.f3501g || i6 >= i7)) {
            z6 = false;
        }
        this.f3501g = z6;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void b(hd2 hd2Var) {
        this.f3500f = 0;
        this.f3501g = false;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void c(hd2 hd2Var) {
        this.f3500f = 0;
        this.f3501g = false;
        u1 u1Var = this.f3495a;
        synchronized (u1Var) {
            u1Var.d(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void d(qb2 qb2Var, ak2[] ak2VarArr) {
        int i6;
        this.f3500f = 0;
        for (ak2 ak2Var : ak2VarArr) {
            if (ak2Var != null) {
                int i7 = this.f3500f;
                int i8 = ak2Var.zzg().f2533c;
                if (i8 == 0) {
                    i6 = 144310272;
                } else if (i8 == 1) {
                    i6 = 13107200;
                } else if (i8 != 2) {
                    i6 = 131072;
                    if (i8 != 3 && i8 != 5 && i8 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i6 = 131072000;
                }
                this.f3500f = i7 + i6;
            }
        }
        this.f3495a.d(this.f3500f);
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final boolean e(qb2 qb2Var) {
        long j6 = qb2Var.f8302d ? this.f3499e : this.f3498d;
        return j6 <= 0 || qb2Var.f8300b >= j6;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final void f(hd2 hd2Var) {
        this.f3500f = 0;
        this.f3501g = false;
        u1 u1Var = this.f3495a;
        synchronized (u1Var) {
            u1Var.d(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final long zzb() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final /* synthetic */ boolean zzi() {
        qs0.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rb2
    public final u1 zzk() {
        return this.f3495a;
    }
}
