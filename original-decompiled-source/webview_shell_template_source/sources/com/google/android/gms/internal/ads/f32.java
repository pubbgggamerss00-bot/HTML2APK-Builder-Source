package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f32 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4464b;

    public f32(byte[] bArr, r32 r32Var) throws GeneralSecurityException {
        if (!aa1.j(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        bw1 bw1Var = cw1.f3676a;
        q32.a(bArr.length);
        this.f4463a = new SecretKeySpec(bArr, "AES");
        this.f4464b = r32Var.b();
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f4464b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = bArr3.length;
        bw1 bw1Var = cw1.f3676a;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
        Cipher cipher = (Cipher) cw1.f3676a.get();
        cipher.init(2, this.f4463a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (length - r8) - 12);
    }
}
