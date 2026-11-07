package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p0 implements y0 {

    /* renamed from: b, reason: collision with root package name */
    public final gc2 f7906b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7907c;

    /* renamed from: d, reason: collision with root package name */
    public long f7908d;

    /* renamed from: f, reason: collision with root package name */
    public int f7910f;

    /* renamed from: g, reason: collision with root package name */
    public int f7911g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7909e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7905a = new byte[4096];

    static {
        id.a("media3.extractor");
    }

    public p0(gc2 gc2Var, long j6, long j7) {
        this.f7906b = gc2Var;
        this.f7908d = j6;
        this.f7907c = j7;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void a(int i6) throws EOFException, InterruptedIOException {
        k(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void b(int i6) throws EOFException, InterruptedIOException {
        l(i6);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final int e(int i6, int i7, byte[] bArr) throws EOFException, InterruptedIOException {
        p0 p0Var;
        int iMin;
        n(i7);
        int i8 = this.f7911g;
        int i9 = this.f7910f;
        int i10 = i8 - i9;
        if (i10 == 0) {
            p0Var = this;
            iMin = p0Var.m(this.f7909e, i9, i7, 0, true);
            if (iMin == -1) {
                return -1;
            }
            p0Var.f7911g += iMin;
        } else {
            p0Var = this;
            iMin = Math.min(i7, i10);
        }
        System.arraycopy(p0Var.f7909e, p0Var.f7910f, bArr, i6, iMin);
        p0Var.f7910f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final boolean f(byte[] bArr, int i6, int i7, boolean z6) throws EOFException, InterruptedIOException {
        int iMin;
        int i8 = this.f7911g;
        if (i8 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i8, i7);
            System.arraycopy(this.f7909e, 0, bArr, i6, iMin);
            o(iMin);
        }
        int iM = iMin;
        while (iM < i7 && iM != -1) {
            iM = m(bArr, i6, i7, iM, z6);
        }
        if (iM != -1) {
            this.f7908d += iM;
        }
        return iM != -1;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final boolean g(byte[] bArr, int i6, int i7, boolean z6) {
        if (!k(i7, z6)) {
            return false;
        }
        System.arraycopy(this.f7909e, this.f7910f - i7, bArr, i6, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void h(int i6, int i7, byte[] bArr) {
        g(bArr, i6, i7, false);
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void i(int i6, int i7, byte[] bArr) throws EOFException, InterruptedIOException {
        f(bArr, i6, i7, false);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws EOFException, InterruptedIOException {
        p0 p0Var;
        int i8 = this.f7911g;
        int iM = 0;
        if (i8 != 0) {
            int iMin = Math.min(i8, i7);
            System.arraycopy(this.f7909e, 0, bArr, i6, iMin);
            o(iMin);
            iM = iMin;
        }
        if (iM == 0) {
            p0Var = this;
            iM = p0Var.m(bArr, i6, i7, 0, true);
        } else {
            p0Var = this;
        }
        if (iM != -1) {
            p0Var.f7908d += iM;
        }
        return iM;
    }

    public final boolean k(int i6, boolean z6) throws EOFException, InterruptedIOException {
        n(i6);
        int iM = this.f7911g - this.f7910f;
        while (iM < i6) {
            int i7 = i6;
            boolean z7 = z6;
            iM = m(this.f7909e, this.f7910f, i7, iM, z7);
            if (iM == -1) {
                return false;
            }
            this.f7911g = this.f7910f + iM;
            i6 = i7;
            z6 = z7;
        }
        this.f7910f += i6;
        return true;
    }

    public final void l(int i6) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f7911g, i6);
        o(iMin);
        int iM = iMin;
        while (iM < i6 && iM != -1) {
            iM = m(this.f7905a, -iM, Math.min(i6, iM + 4096), iM, false);
        }
        if (iM != -1) {
            this.f7908d += iM;
        }
    }

    public final int m(byte[] bArr, int i6, int i7, int i8, boolean z6) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iJ = this.f7906b.j(i6 + i8, i7 - i8, bArr);
        if (iJ != -1) {
            return i8 + iJ;
        }
        if (i8 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    public final void n(int i6) {
        int i7 = this.f7910f + i6;
        int length = this.f7909e.length;
        if (i7 > length) {
            this.f7909e = Arrays.copyOf(this.f7909e, Math.max(65536 + i7, Math.min(length + length, i7 + 524288)));
        }
    }

    public final void o(int i6) {
        int i7 = this.f7911g - i6;
        this.f7911g = i7;
        this.f7910f = 0;
        byte[] bArr = this.f7909e;
        byte[] bArr2 = i7 < bArr.length + (-524288) ? new byte[65536 + i7] : bArr;
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        this.f7909e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final int zzc() throws EOFException, InterruptedIOException {
        p0 p0Var;
        int iMin = Math.min(this.f7911g, 1);
        o(iMin);
        if (iMin == 0) {
            p0Var = this;
            iMin = p0Var.m(this.f7905a, 0, Math.min(1, 4096), 0, true);
        } else {
            p0Var = this;
        }
        if (iMin != -1) {
            p0Var.f7908d += iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zzd() {
        return this.f7907c;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zze() {
        return this.f7908d + this.f7910f;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final long zzf() {
        return this.f7908d;
    }

    @Override // com.google.android.gms.internal.ads.y0
    public final void zzj() {
        this.f7910f = 0;
    }
}
