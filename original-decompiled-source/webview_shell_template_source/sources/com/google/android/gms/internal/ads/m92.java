package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class m92 implements sc {

    /* renamed from: z, reason: collision with root package name */
    public static final me f7004z = me.g(m92.class);
    public final String s;

    /* renamed from: v, reason: collision with root package name */
    public ByteBuffer f7007v;

    /* renamed from: w, reason: collision with root package name */
    public long f7008w;

    /* renamed from: y, reason: collision with root package name */
    public b90 f7010y;

    /* renamed from: x, reason: collision with root package name */
    public long f7009x = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7006u = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7005t = true;

    public m92(String str) {
        this.s = str;
    }

    @Override // com.google.android.gms.internal.ads.sc
    public final void a(b90 b90Var, ByteBuffer byteBuffer, long j6, pc pcVar) {
        this.f7008w = b90Var.b();
        byteBuffer.remaining();
        this.f7009x = j6;
        this.f7010y = b90Var;
        b90Var.s.position((int) (b90Var.b() + j6));
        this.f7006u = false;
        this.f7005t = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f7006u) {
                return;
            }
            try {
                me meVar = f7004z;
                String str = this.s;
                meVar.f(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                b90 b90Var = this.f7010y;
                long j6 = this.f7008w;
                long j7 = this.f7009x;
                ByteBuffer byteBuffer = b90Var.s;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j6);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j7);
                byteBuffer.position(iPosition);
                this.f7007v = byteBufferSlice;
                this.f7006u = true;
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            me meVar = f7004z;
            String str = this.s;
            meVar.f(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f7007v;
            if (byteBuffer != null) {
                this.f7005t = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f7007v = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
