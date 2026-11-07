package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m32 implements e02 {

    /* renamed from: d, reason: collision with root package name */
    public static final d32 f6919d = new d32(1);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f6920a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6921b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6922c;

    public m32(byte[] bArr) throws GeneralSecurityException {
        q32.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f6920a = secretKeySpec;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f6919d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrL = aa1.l(cipher.doFinal(new byte[16]));
        this.f6921b = bArrL;
        this.f6922c = aa1.l(bArrL);
    }

    @Override // com.google.android.gms.internal.ads.e02
    public final byte[] a(int i6, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrI;
        if (i6 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f6919d.get();
        cipher.init(1, this.f6920a);
        int length = bArr.length;
        int i7 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i8 = i7 - 1;
        int i9 = i8 * 16;
        if (i7 * 16 == length) {
            bArrI = yz1.i(i9, bArr, this.f6921b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i9, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = Byte.MIN_VALUE;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrI = yz1.i(0, bArrCopyOf, this.f6922c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 * 16;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[i12] = (byte) (bArr2[i12] ^ bArr[i12 + i11]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i13 = 0; i13 < 16; i13++) {
            bArr3[i13] = (byte) (bArr2[i13] ^ bArrI[i13]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i6 == 16 ? bArr2 : Arrays.copyOf(bArr2, i6);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
