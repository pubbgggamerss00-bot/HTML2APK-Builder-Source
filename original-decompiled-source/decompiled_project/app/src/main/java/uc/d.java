package uc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f29700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29701b;

    public d(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f29700a = a.c(bArr);
        this.f29701b = i10;
    }

    public final ByteBuffer a(int i10, byte[] bArr) {
        int[] iArrB = b(a.c(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        a.b(iArr);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] b(int[] iArr, int i10);

    public abstract int c();

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(this.f29701b + i12, bArr);
            if (i12 == i10) {
                gd.h.b(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                gd.h.b(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }
}
