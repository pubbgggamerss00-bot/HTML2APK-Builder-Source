package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ja2 extends a82 {

    /* renamed from: b, reason: collision with root package name */
    public w f6001b;

    /* renamed from: c, reason: collision with root package name */
    public final n92 f6002c = new n92();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f6003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6004e;

    /* renamed from: f, reason: collision with root package name */
    public long f6005f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f6006g;
    public final int h;

    static {
        id.a("media3.decoder");
    }

    public ja2(int i6) {
        this.h = i6;
    }

    public void c() {
        this.f2614a = 0;
        ByteBuffer byteBuffer = this.f6003d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6006g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6004e = false;
    }

    public final void d(int i6) {
        ByteBuffer byteBuffer = this.f6003d;
        if (byteBuffer == null) {
            this.f6003d = g(i6);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i7 = i6 + iPosition;
        if (iCapacity >= i7) {
            this.f6003d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i7);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f6003d = byteBufferG;
    }

    public final void e() {
        ByteBuffer byteBuffer = this.f6003d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6006g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean f() {
        return a(1073741824);
    }

    public final ByteBuffer g(int i6) {
        int i7 = this.h;
        if (i7 == 1) {
            return ByteBuffer.allocate(i6);
        }
        if (i7 == 2) {
            return ByteBuffer.allocateDirect(i6);
        }
        ByteBuffer byteBuffer = this.f6003d;
        throw new ia2("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i6 + ")");
    }
}
