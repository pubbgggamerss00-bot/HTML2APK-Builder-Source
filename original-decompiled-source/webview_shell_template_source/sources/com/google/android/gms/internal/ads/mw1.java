package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class mw1 {

    /* renamed from: a, reason: collision with root package name */
    public final kw1 f7230a;

    /* renamed from: b, reason: collision with root package name */
    public final kw1 f7231b;

    public mw1(byte[] bArr) throws GeneralSecurityException {
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f7230a = a(1, bArr);
        this.f7231b = a(0, bArr);
    }

    public abstract kw1 a(int i6, byte[] bArr);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f7231b.c(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i6 = length & 15;
            int i7 = i6 == 0 ? length : (length + 16) - i6;
            int iRemaining = byteBuffer.remaining();
            int i8 = iRemaining % 16;
            int i9 = (i8 == 0 ? iRemaining : (iRemaining + 16) - i8) + i7;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i7);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i9);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(sj1.j(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            kw1 kw1Var = this.f7230a;
            kw1Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != kw1Var.a()) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(kw1Var.a(), "The nonce length (in bytes) must be "));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = iRemaining2 / 64;
            for (int i11 = 0; i11 < i10 + 1; i11++) {
                ByteBuffer byteBufferC = kw1Var.c(kw1Var.f6517b + i11, bArr);
                if (i11 == i10) {
                    yz1.c(byteBufferAllocate, byteBuffer, byteBufferC, iRemaining2 % 64);
                } else {
                    yz1.c(byteBufferAllocate, byteBuffer, byteBufferC, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e6) {
            throw new AEADBadTagException(e6.toString());
        }
    }
}
