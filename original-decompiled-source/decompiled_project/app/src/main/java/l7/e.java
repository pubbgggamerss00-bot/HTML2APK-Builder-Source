package l7;

import hi.l0;
import hi.m0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f16744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16745b;

    public e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f16744a = byteBufferSlice;
        this.f16745b = byteBufferSlice.capacity();
    }

    @Override // hi.l0
    public final m0 b() {
        return m0.f13094d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // hi.l0
    public final long y(long j10, hi.g gVar) {
        ByteBuffer byteBuffer = this.f16744a;
        int iPosition = byteBuffer.position();
        int i10 = this.f16745b;
        if (iPosition == i10) {
            return -1L;
        }
        int iPosition2 = (int) (byteBuffer.position() + j10);
        if (iPosition2 <= i10) {
            i10 = iPosition2;
        }
        byteBuffer.limit(i10);
        return gVar.write(byteBuffer);
    }
}
