package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vc extends m92 {
    public int A;
    public Date B;
    public Date C;
    public long D;
    public long E;
    public double F;
    public float G;
    public t92 H;
    public long I;

    @Override // com.google.android.gms.internal.ads.m92
    public final void c(ByteBuffer byteBuffer) {
        int i6 = byteBuffer.get();
        if (i6 < 0) {
            i6 += 256;
        }
        this.A = i6;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f7005t) {
            d();
        }
        if (this.A == 1) {
            this.B = yz1.a(y5.q(byteBuffer));
            this.C = yz1.a(y5.q(byteBuffer));
            this.D = y5.o(byteBuffer);
            this.E = y5.q(byteBuffer);
        } else {
            this.B = yz1.a(y5.o(byteBuffer));
            this.C = yz1.a(y5.o(byteBuffer));
            this.D = y5.o(byteBuffer);
            this.E = y5.o(byteBuffer);
        }
        this.F = y5.h(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.G = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        y5.o(byteBuffer);
        y5.o(byteBuffer);
        this.H = new t92(y5.h(byteBuffer), y5.h(byteBuffer), y5.h(byteBuffer), y5.h(byteBuffer), y5.b(byteBuffer), y5.b(byteBuffer), y5.b(byteBuffer), y5.h(byteBuffer), y5.h(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.I = y5.o(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.B + ";modificationTime=" + this.C + ";timescale=" + this.D + ";duration=" + this.E + ";rate=" + this.F + ";volume=" + this.G + ";matrix=" + this.H + ";nextTrackId=" + this.I + "]";
    }
}
