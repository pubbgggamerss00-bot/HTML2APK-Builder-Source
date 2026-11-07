package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qw1 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8473b;

    /* renamed from: c, reason: collision with root package name */
    public final m32 f8474c;

    public qw1(byte[] bArr, r32 r32Var, int i6) {
        this.f8474c = new m32(bArr);
        this.f8472a = r32Var.b();
        this.f8473b = i6;
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f8472a;
        int length2 = bArr3.length;
        int i6 = this.f8473b;
        if (length < length2 + i6 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length;
        int i7 = i6 + length3;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i7);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length4 = bArrCopyOfRange.length;
        if (length4 > 12 || length4 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length4);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length4);
        byte[] bArr6 = new byte[32];
        m32 m32Var = this.f8474c;
        System.arraycopy(m32Var.a(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(m32Var.a(16, bArr5), 0, bArr6, 16, 16);
        if (!aa1.j(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        bw1 bw1Var = cw1.f3676a;
        q32.a(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i8 = i7 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i7, i8);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i7 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) cw1.f3676a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i8, length - i8);
    }
}
