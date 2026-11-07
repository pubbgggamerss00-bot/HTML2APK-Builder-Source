package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7992a;

    /* renamed from: b, reason: collision with root package name */
    public int f7993b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7994c;

    /* renamed from: d, reason: collision with root package name */
    public int f7995d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7996e;

    public p9(ic2 ic2Var) {
        this.f7996e = ic2Var;
    }

    public void a(int i6) {
        this.f7992a = 1 == ((this.f7992a ? 1 : 0) | i6);
        this.f7993b += i6;
    }

    public void b(int i6, int i7, byte[] bArr) {
        if (this.f7992a) {
            int i8 = i7 - i6;
            byte[] bArr2 = (byte[]) this.f7996e;
            int length = bArr2.length;
            int i9 = this.f7995d + i8;
            if (length < i9) {
                this.f7996e = Arrays.copyOf(bArr2, i9 + i9);
            }
            System.arraycopy(bArr, i6, (byte[]) this.f7996e, this.f7995d, i8);
            this.f7995d += i8;
        }
    }

    public void c() {
        this.f7992a = false;
        this.f7994c = false;
    }

    public void d(int i6) {
        y5.r(!this.f7992a);
        boolean z6 = i6 == this.f7993b;
        this.f7992a = z6;
        if (z6) {
            this.f7995d = 3;
            this.f7994c = false;
        }
    }

    public boolean e(int i6) {
        if (!this.f7992a) {
            return false;
        }
        this.f7995d -= i6;
        this.f7992a = false;
        this.f7994c = true;
        return true;
    }

    public p9(int i6) {
        this.f7993b = i6;
        byte[] bArr = new byte[131];
        this.f7996e = bArr;
        bArr[2] = 1;
    }
}
