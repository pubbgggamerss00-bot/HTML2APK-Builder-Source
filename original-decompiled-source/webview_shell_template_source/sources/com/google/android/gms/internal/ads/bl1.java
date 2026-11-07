package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bl1 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public Uri f3214e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3215f;

    /* renamed from: g, reason: collision with root package name */
    public int f3216g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3217i;

    /* renamed from: j, reason: collision with root package name */
    public final fa0 f3218j;

    public bl1(byte[] bArr) {
        fa0 fa0Var = new fa0(bArr);
        super(false);
        this.f3218j = fa0Var;
        y5.n(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws dp1 {
        l(os1Var);
        Uri uri = os1Var.f7851a;
        long j6 = os1Var.f7854d;
        this.f3214e = uri;
        byte[] bArr = this.f3218j.s;
        this.f3215f = bArr;
        long j7 = os1Var.f7853c;
        int length = bArr.length;
        if (j7 > length) {
            throw new dp1();
        }
        int i6 = (int) j7;
        this.f3216g = i6;
        int i7 = length - i6;
        this.h = i7;
        if (j6 != -1) {
            this.h = (int) Math.min(i7, j6);
        }
        this.f3217i = true;
        m(os1Var);
        return j6 != -1 ? j6 : this.h;
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        if (i7 == 0) {
            return 0;
        }
        int i8 = this.h;
        if (i8 == 0) {
            return -1;
        }
        int iMin = Math.min(i7, i8);
        byte[] bArr2 = this.f3215f;
        y5.k(bArr2);
        System.arraycopy(bArr2, this.f3216g, bArr, i6, iMin);
        this.f3216g += iMin;
        this.h -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f3214e;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        if (this.f3217i) {
            this.f3217i = false;
            k();
        }
        this.f3214e = null;
        this.f3215f = null;
    }
}
