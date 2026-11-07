package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h32 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final c32 f5241a;

    /* renamed from: b, reason: collision with root package name */
    public final p32 f5242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5243c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5244d;

    public h32(c32 c32Var, p32 p32Var, int i6, byte[] bArr) {
        this.f5241a = c32Var;
        this.f5242b = p32Var;
        this.f5243c = i6;
        this.f5244d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f5244d;
        int length = bArr3.length;
        int length2 = bArr.length;
        int i6 = this.f5243c;
        if (length2 < length + i6) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zy1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i7 = length2 - i6;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, i7);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i7, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrG = yz1.g(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        p32 p32Var = this.f5242b;
        int i8 = p32Var.f7928b;
        e02 e02Var = p32Var.f7927a;
        byte[] bArr4 = p32Var.f7929c;
        byte[] bArr5 = p32Var.f7930d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? yz1.g(bArr4, e02Var.a(i8, yz1.g(bArrG, bArr5))) : yz1.g(bArr4, e02Var.a(i8, bArrG)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        c32 c32Var = this.f5241a;
        int i9 = c32Var.f3390b;
        if (length3 < i9) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i9];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i9);
        int i10 = c32Var.f3390b;
        int i11 = length3 - i10;
        byte[] bArr7 = new byte[i11];
        Cipher cipher = (Cipher) c32.f3388d.get();
        byte[] bArr8 = new byte[c32Var.f3391c];
        System.arraycopy(bArr6, 0, bArr8, 0, i9);
        cipher.init(2, c32Var.f3389a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i10, i11, bArr7, 0) == i11) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
