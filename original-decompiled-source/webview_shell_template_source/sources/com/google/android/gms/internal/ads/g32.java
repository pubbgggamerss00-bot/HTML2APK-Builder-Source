package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g32 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4890a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4891b;

    /* renamed from: c, reason: collision with root package name */
    public final mw1 f4892c;

    public g32(int i6, byte[] bArr, byte[] bArr2) {
        this.f4890a = i6;
        switch (i6) {
            case 1:
                this.f4892c = new ow1(bArr);
                this.f4891b = bArr2;
                break;
            default:
                this.f4892c = new lw1(bArr);
                this.f4891b = bArr2;
                break;
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((lw1) this.f4892c).b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((ow1) this.f4892c).b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f4890a) {
            case 0:
                byte[] bArr3 = this.f4891b;
                if (bArr3.length == 0) {
                    return a(bArr, bArr2);
                }
                if (!zy1.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return a(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
            default:
                byte[] bArr4 = this.f4891b;
                if (bArr4.length == 0) {
                    return b(bArr, bArr2);
                }
                if (!zy1.c(bArr4, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
    }
}
