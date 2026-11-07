package gd;

import androidx.lifecycle.c1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import wc.a;

/* loaded from: classes2.dex */
public final class f implements sc.c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f11962c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11963d = new byte[16];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f11964e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final q f11965a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11966b;

    public f(byte[] bArr) throws GeneralSecurityException {
        if (!a.EnumC0318a.f31490a.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f11962c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(x0.a.a(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f11966b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f11965a = new q(bArrCopyOfRange);
    }

    @Override // sc.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = k.f11974b.f11976a.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipherA.init(1, new SecretKeySpec(this.f11966b, "AES"), new IvParameterSpec(bArr3));
        return h.a(bArrC, cipherA.doFinal(bArr));
    }

    @Override // sc.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipherA = k.f11974b.f11976a.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipherA.init(2, new SecretKeySpec(this.f11966b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipherA.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrD;
        int length = bArr.length;
        q qVar = this.f11965a;
        if (length == 0) {
            return qVar.a(16, f11964e);
        }
        byte[] bArrA = qVar.a(16, f11963d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = h.d(c1.b(bArrA), qVar.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrA.length;
            bArrD = Arrays.copyOf(bArr3, bArr3.length);
            for (int i11 = 0; i11 < bArrA.length; i11++) {
                int i12 = length2 + i11;
                bArrD[i12] = (byte) (bArrD[i12] ^ bArrA[i11]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = Byte.MIN_VALUE;
            bArrD = h.d(bArrCopyOf, c1.b(bArrA));
        }
        return qVar.a(16, bArrD);
    }
}
