package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class kw1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6517b;

    public kw1(int i6, byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f6516a = iw1.d(bArr);
        this.f6517b = i6;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i6);

    public final ByteBuffer c(int i6, byte[] bArr) {
        int[] iArrB = b(iw1.d(bArr), i6);
        int[] iArr = (int[]) iArrB.clone();
        iw1.b(iArr);
        for (int i7 = 0; i7 < 16; i7++) {
            iArrB[i7] = iArrB[i7] + iArr[i7];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }
}
