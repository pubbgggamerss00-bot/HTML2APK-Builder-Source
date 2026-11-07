package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c42 extends e42 {

    /* renamed from: v, reason: collision with root package name */
    public final int f3400v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3401w;

    public c42(byte[] bArr, int i6, int i7) {
        super(bArr);
        g42.p(i6, i6 + i7, bArr.length);
        this.f3400v = i6;
        this.f3401w = i7;
    }

    @Override // com.google.android.gms.internal.ads.e42, com.google.android.gms.internal.ads.g42
    public final byte d(int i6) {
        g42.t(i6, this.f3401w);
        return this.f4118u[this.f3400v + i6];
    }

    @Override // com.google.android.gms.internal.ads.e42, com.google.android.gms.internal.ads.g42
    public final byte e(int i6) {
        return this.f4118u[this.f3400v + i6];
    }

    @Override // com.google.android.gms.internal.ads.e42, com.google.android.gms.internal.ads.g42
    public final int g() {
        return this.f3401w;
    }

    @Override // com.google.android.gms.internal.ads.e42, com.google.android.gms.internal.ads.g42
    public final void h(int i6, byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f4118u, this.f3400v + i6, bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final int v() {
        return this.f3400v;
    }
}
