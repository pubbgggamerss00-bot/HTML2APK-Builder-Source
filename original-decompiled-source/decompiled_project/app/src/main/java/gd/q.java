package gd;

import androidx.lifecycle.c1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import wc.a;

/* loaded from: classes2.dex */
public final class q implements dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11983a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11984b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11985c;

    public q(byte[] bArr) throws GeneralSecurityException {
        y.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f11983a = secretKeySpec;
        if (!a.EnumC0318a.f31490a.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipherA = k.f11974b.f11976a.a("AES/ECB/NoPadding");
        cipherA.init(1, secretKeySpec);
        byte[] bArrB = c1.b(cipherA.doFinal(new byte[16]));
        this.f11984b = bArrB;
        this.f11985c = c1.b(bArrB);
    }

    @Override // dd.a
    public final byte[] a(int i10, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrD;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!a.EnumC0318a.f31490a.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipherA = k.f11974b.f11976a.a("AES/ECB/NoPadding");
        cipherA.init(1, this.f11983a);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrD = h.c((iMax - 1) * 16, bArr, 0, this.f11984b, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = Byte.MIN_VALUE;
            bArrD = h.d(bArrCopyOf, this.f11985c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherA.doFinal(h.c(0, bArrDoFinal, i11 * 16, bArr, 16));
        }
        return Arrays.copyOf(cipherA.doFinal(h.d(bArrD, bArrDoFinal)), i10);
    }
}
