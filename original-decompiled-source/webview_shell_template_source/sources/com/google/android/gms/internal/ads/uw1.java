package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uw1 implements ys1 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9648c = rj1.k("7a806c");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9649d = rj1.k("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9650e = rj1.k("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9651f = rj1.k("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9652g = rj1.k("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public static final oc h = new oc(1);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f9653a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9654b;

    public uw1(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f9654b = bArr2;
        q32.a(bArr.length);
        this.f9653a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean a(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = f9651f;
            cipher.init(2, new SecretKeySpec(f9650e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f9649d);
            byte[] bArr2 = f9652g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f9648c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f9653a, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f9654b;
        if (bArr3.length == 0) {
            return b(bArr, bArr2);
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
    }
}
