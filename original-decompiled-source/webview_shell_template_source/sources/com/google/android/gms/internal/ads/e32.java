package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e32 implements ys1 {

    /* renamed from: f, reason: collision with root package name */
    public static final qy1 f4101f = new qy1(1);

    /* renamed from: g, reason: collision with root package name */
    public static final d32 f4102g = new d32(0);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4103a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4104b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4105c;

    /* renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f4106d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4107e;

    public e32(int i6, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i6 != 12 && i6 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4107e = i6;
        q32.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4106d = secretKeySpec;
        Cipher cipher = (Cipher) f4101f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f4103a = bArrB;
        this.f4104b = b(bArrB);
        this.f4105c = bArr2;
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i6]);
        }
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 15) {
            byte b7 = bArr[i6];
            int i7 = i6 + 1;
            bArr2[i6] = (byte) (((b7 + b7) ^ ((bArr[i7] & 255) >>> 7)) & 255);
            i6 = i7;
        }
        byte b8 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b8 + b8));
        return bArr2;
    }

    public final byte[] c(Cipher cipher, int i6, byte[] bArr, int i7, int i8) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i6;
        byte[] bArr3 = this.f4103a;
        if (i8 == 0) {
            a(bArr2, bArr3);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr4 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr4);
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr4;
        int i9 = 0;
        while (i8 - i9 > 16) {
            for (int i10 = 0; i10 < 16; i10++) {
                bArr6[i10] = (byte) (bArr[(i7 + i9) + i10] ^ bArr6[i10]);
            }
            cipher.doFinal(bArr6, 0, 16, bArr5);
            i9 += 16;
            byte[] bArr7 = bArr5;
            bArr5 = bArr6;
            bArr6 = bArr7;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i9 + i7, i7 + i8);
        if (bArrCopyOfRange.length == 16) {
            a(bArrCopyOfRange, bArr3);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f4104b, 16);
            int i11 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i11 >= length) {
                    break;
                }
                bArrCopyOf[i11] = (byte) (bArrCopyOf[i11] ^ bArrCopyOfRange[i11]);
                i11++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        a(bArr6, bArrCopyOfRange);
        cipher.doFinal(bArr6, 0, 16, bArr5);
        return bArr5;
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f4105c;
        int length2 = length - bArr3.length;
        int i6 = this.f4107e;
        int i7 = (length2 - i6) - 16;
        if (i7 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f4101f.get();
        SecretKeySpec secretKeySpec = this.f4106d;
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher, 0, bArr, bArr3.length, this.f4107e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrC3 = c(cipher, 2, bArr, bArr3.length + i6, i7);
        int i8 = length - 16;
        byte b7 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            b7 = (byte) (b7 | (((bArr[i8 + i9] ^ bArrC2[i9]) ^ bArrC[i9]) ^ bArrC3[i9]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f4102g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, bArr3.length + i6, i7);
    }
}
