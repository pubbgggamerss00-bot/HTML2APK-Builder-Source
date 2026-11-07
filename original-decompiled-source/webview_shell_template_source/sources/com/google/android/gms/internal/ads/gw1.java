package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gw1 implements ys1 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f5172c = rj1.k("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f5173d = rj1.k("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f5174e = rj1.k("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    public static final fw1 f5175f = new fw1(0);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f5176a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5177b;

    public gw1(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (f5175f.get() == null) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5176a = new SecretKeySpec(bArr, "ChaCha20");
        this.f5177b = bArr2;
    }

    public static boolean a(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f5173d);
            byte[] bArr = f5172c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f5174e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f5177b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f5175f.get();
        cipher.init(2, this.f5176a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (length - r8) - 12);
    }
}
