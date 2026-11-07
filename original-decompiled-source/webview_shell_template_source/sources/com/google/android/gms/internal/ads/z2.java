package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z2 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11130b;

    public z2(y0 y0Var, long j6) {
        this.f11129a = y0Var;
        y5.n(y0Var.zzf() >= j6);
        this.f11130b = j6;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void a(int i6) {
        this.f11129a.a(i6);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void b(int i6) {
        this.f11129a.b(i6);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final int e(int i6, int i7, byte[] bArr) {
        return this.f11129a.e(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final boolean f(byte[] bArr, int i6, int i7, boolean z6) {
        return this.f11129a.f(bArr, 0, i7, z6);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final boolean g(byte[] bArr, int i6, int i7, boolean z6) {
        return this.f11129a.g(bArr, 0, i7, z6);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void h(int i6, int i7, byte[] bArr) {
        this.f11129a.h(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void i(int i6, int i7, byte[] bArr) {
        this.f11129a.i(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        return this.f11129a.j(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final int zzc() {
        return this.f11129a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zzd() {
        return this.f11129a.zzd() - this.f11130b;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zze() {
        return this.f11129a.zze() - this.f11130b;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zzf() {
        return this.f11129a.zzf() - this.f11130b;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void zzj() {
        this.f11129a.zzj();
    }
}
