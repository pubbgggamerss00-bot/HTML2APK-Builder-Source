package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ee2 extends gd0 {

    /* renamed from: i, reason: collision with root package name */
    public int[] f4261i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4262j;

    @Override // com.google.android.gms.internal.ads.jc0
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f4262j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f4994b.f11244d) * this.f4995c.f11244d);
        while (iPosition < iLimit) {
            for (int i6 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i6 + i6 + iPosition));
            }
            iPosition += this.f4994b.f11244d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final za0 c(za0 za0Var) throws pb0 {
        int[] iArr = this.f4261i;
        if (iArr == null) {
            return za0.f11240e;
        }
        int i6 = za0Var.f11243c;
        int i7 = za0Var.f11242b;
        if (i6 != 2) {
            throw new pb0(za0Var);
        }
        boolean z6 = i7 != iArr.length;
        int i8 = 0;
        while (true) {
            int length = iArr.length;
            if (i8 >= length) {
                return z6 ? new za0(za0Var.f11241a, length, 2) : za0.f11240e;
            }
            int i9 = iArr[i8];
            if (i9 >= i7) {
                throw new pb0(za0Var);
            }
            z6 |= i9 != i8;
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e() {
        this.f4262j = this.f4261i;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void g() {
        this.f4262j = null;
        this.f4261i = null;
    }
}
