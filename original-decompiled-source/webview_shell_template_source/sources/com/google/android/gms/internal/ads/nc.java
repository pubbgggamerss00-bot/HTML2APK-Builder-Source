package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nc extends ByteArrayOutputStream {
    public final ec s;

    public nc(ec ecVar, int i6) {
        this.s = ecVar;
        ((ByteArrayOutputStream) this).buf = ecVar.b(Math.max(i6, 256));
    }

    public final void a(int i6) {
        int i7 = ((ByteArrayOutputStream) this).count;
        if (i7 + i6 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i8 = i7 + i6;
        ec ecVar = this.s;
        byte[] bArrB = ecVar.b(i8 + i8);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((ByteArrayOutputStream) this).count);
        ecVar.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.s.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.s.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i6) {
        a(1);
        super.write(i6);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i6, int i7) {
        a(i7);
        super.write(bArr, i6, i7);
    }
}
