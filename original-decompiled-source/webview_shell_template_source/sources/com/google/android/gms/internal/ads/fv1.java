package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fv1 implements ys1 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4803c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Set f4804d;

    /* renamed from: a, reason: collision with root package name */
    public final String f4805a;

    /* renamed from: b, reason: collision with root package name */
    public final ys1 f4806b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f4804d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public fv1(x12 x12Var, ys1 ys1Var) throws GeneralSecurityException {
        if (!f4804d.contains(x12Var.H())) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.v0.b("Unsupported DEK key type: ", x12Var.H(), ". Only Tink AEAD key types are supported."));
        }
        this.f4805a = x12Var.H();
        w12 w12VarC = x12.C(x12Var);
        w12VarC.j(q22.RAW);
        rj1.c(((x12) w12VarC.g()).i());
        this.f4806b = ys1Var;
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i6 = byteBufferWrap.getInt();
            if (i6 <= 0 || i6 > 4096 || i6 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i6];
            byteBufferWrap.get(bArr3, 0, i6);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrE = this.f4806b.e(bArr3, f4803c);
            String str = this.f4805a;
            e42 e42Var = g42.f4896t;
            return ((ys1) vx1.f9959b.b(wx1.f10304b.a(oy1.a(str, g42.s(0, bArrE.length, bArrE), 2, q22.RAW, null)), ys1.class)).e(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
