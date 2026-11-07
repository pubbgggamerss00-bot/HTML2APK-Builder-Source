package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rc extends o92 {
    static {
        me.g(rc.class);
    }

    public rc(b90 b90Var, qc qcVar) {
        ByteBuffer byteBuffer = b90Var.s;
        long jLimit = byteBuffer.limit();
        this.f7658t = b90Var;
        this.f7660v = b90Var.b();
        byteBuffer.position((int) (b90Var.b() + jLimit));
        this.f7661w = b90Var.b();
        this.s = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.o92
    public final String toString() {
        String string = this.f7658t.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.o92, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
