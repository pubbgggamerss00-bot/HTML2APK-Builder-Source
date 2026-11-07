package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qe0 extends gd0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.jc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        int i7 = this.f4994b.f11243c;
        if (i7 == 3) {
            i6 += i6;
        } else if (i7 == 4) {
            i6 /= 2;
        } else {
            if (i7 != 21) {
                if (i7 != 22) {
                    if (i7 != 268435456) {
                        if (i7 != 1342177280) {
                            if (i7 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            i6 /= 2;
                        }
                    }
                }
            }
            i6 /= 3;
            i6 += i6;
        }
        ByteBuffer byteBufferD = d(i6);
        int i8 = this.f4994b.f11243c;
        if (i8 == 3) {
            while (iPosition < iLimit) {
                byteBufferD.put((byte) 0);
                byteBufferD.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i8 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferD.put((byte) (sMax & 255));
                byteBufferD.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i8 == 21) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i8 == 22) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 2));
                byteBufferD.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i8 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i8 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferD.put(byteBuffer.get(iPosition + 1));
                byteBufferD.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final za0 c(za0 za0Var) throws pb0 {
        int i6 = za0Var.f11243c;
        if (i6 != 3) {
            if (i6 == 2) {
                return za0.f11240e;
            }
            if (i6 != 268435456 && i6 != 21 && i6 != 1342177280 && i6 != 22 && i6 != 1610612736 && i6 != 4) {
                throw new pb0(za0Var);
            }
        }
        return new za0(za0Var.f11241a, za0Var.f11242b, 2);
    }
}
