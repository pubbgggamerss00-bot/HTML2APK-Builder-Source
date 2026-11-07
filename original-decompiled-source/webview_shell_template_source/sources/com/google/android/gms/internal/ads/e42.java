package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e42 extends d42 {

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f4118u;

    public e42(byte[] bArr) {
        bArr.getClass();
        this.f4118u = bArr;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public byte d(int i6) {
        return this.f4118u[i6];
    }

    @Override // com.google.android.gms.internal.ads.g42
    public byte e(int i6) {
        return this.f4118u[i6];
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g42) && g() == ((g42) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (!(obj instanceof e42)) {
                return obj.equals(this);
            }
            e42 e42Var = (e42) obj;
            int i6 = this.s;
            int i7 = e42Var.s;
            if (i6 == 0 || i7 == 0 || i6 == i7) {
                return u(e42Var, 0, g());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public int g() {
        return this.f4118u.length;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public void h(int i6, byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f4118u, i6, bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final int k(int i6, int i7, int i8) {
        int iV = v() + i7;
        Charset charset = s52.f8801a;
        for (int i9 = iV; i9 < iV + i8; i9++) {
            i6 = (i6 * 31) + this.f4118u[i9];
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final g42 l(int i6, int i7) {
        int iP = g42.p(i6, i7, g());
        if (iP == 0) {
            return g42.f4896t;
        }
        return new c42(this.f4118u, v() + i6, iP);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final k42 m() {
        return k42.e(v(), g(), this.f4118u);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.f4118u, v(), g()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final void o(p42 p42Var) {
        p42Var.e(v(), g(), this.f4118u);
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final boolean u(d42 d42Var, int i6, int i7) {
        if (i7 > d42Var.g()) {
            throw new IllegalArgumentException("Length too large: " + i7 + g());
        }
        int i8 = i6 + i7;
        if (i8 > d42Var.g()) {
            int iG = d42Var.g();
            StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Ran off end of other: ", i6, ", ", i7, ", ");
            sbA.append(iG);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (!(d42Var instanceof e42)) {
            return d42Var.l(i6, i8).equals(l(0, i7));
        }
        e42 e42Var = (e42) d42Var;
        byte[] bArr = e42Var.f4118u;
        int iV = v() + i7;
        int iV2 = v();
        int iV3 = e42Var.v() + i6;
        while (iV2 < iV) {
            if (this.f4118u[iV2] != bArr[iV3]) {
                return false;
            }
            iV2++;
            iV3++;
        }
        return true;
    }

    public int v() {
        return 0;
    }
}
