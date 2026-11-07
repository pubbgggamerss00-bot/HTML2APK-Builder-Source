package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class g6 extends f6 {

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f11757u;

    public g6(byte[] bArr) {
        bArr.getClass();
        this.f11757u = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public byte c(int i6) {
        return this.f11757u[i6];
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public byte d(int i6) {
        return this.f11757u[i6];
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public int e() {
        return this.f11757u.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public final int f(int i6, int i7) {
        Charset charset = e7.f11716a;
        for (int i8 = 0; i8 < i7; i8++) {
            i6 = (i6 * 31) + this.f11757u[i8];
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public final e6 g() {
        h6.j(e());
        byte[] bArr = this.f11757u;
        e6 e6Var = new e6(bArr);
        h6.j(bArr.length);
        return e6Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public final void h(k6 k6Var) {
        k6Var.a(e(), this.f11757u);
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public final boolean i(h6 h6Var) {
        if (!(h6Var instanceof g6)) {
            return h6Var.i(this);
        }
        int iE = e();
        if (iE > h6Var.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > h6Var.e()) {
            throw new IllegalArgumentException(androidx.camera.view.g.e("Ran off end of other: 0, ", iE, h6Var.e(), ", "));
        }
        byte[] bArr = ((g6) h6Var).f11757u;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iE) {
            if (this.f11757u[i6] != bArr[i7]) {
                return false;
            }
            i6++;
            i7++;
        }
        return true;
    }
}
