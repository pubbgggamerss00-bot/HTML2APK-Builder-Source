package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pw1 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final ys1 f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8169b;

    public pw1(ys1 ys1Var, byte[] bArr) {
        this.f8168a = ys1Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f8169b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f8169b;
        int length = bArr3.length;
        ys1 ys1Var = this.f8168a;
        if (length == 0) {
            return ys1Var.e(bArr, bArr2);
        }
        if (zy1.c(bArr3, bArr)) {
            return ys1Var.e(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
