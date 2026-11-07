package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xe2 extends gd0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f10551i = Float.floatToIntBits(Float.NaN);

    public static void h(int i6, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i6 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f10551i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        int i7 = this.f4994b.f11243c;
        if (i7 == 21) {
            byteBufferD = d((i6 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else if (i7 == 22) {
            byteBufferD = d(i6);
            while (iPosition < iLimit) {
                int i8 = byteBuffer.get(iPosition) & 255;
                int i9 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                h(i8 | i9 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        } else if (i7 == 1342177280) {
            byteBufferD = d((i6 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else {
            if (i7 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferD = d(i6);
            while (iPosition < iLimit) {
                int i10 = byteBuffer.get(iPosition + 3) & 255;
                int i11 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                h(i10 | i11 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final za0 c(za0 za0Var) throws pb0 {
        int i6 = za0Var.f11243c;
        int i7 = j31.f5914a;
        if (i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736) {
            return new za0(za0Var.f11241a, za0Var.f11242b, 4);
        }
        if (i6 == 4) {
            return za0.f11240e;
        }
        throw new pb0(za0Var);
    }
}
