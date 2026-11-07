package ve;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f30888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30889b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f30890c;

    public o0(File file) throws IOException {
        h0 h0Var = new h0(file);
        this.f30888a = h0Var;
        if (!new String(h0Var.z(4), xe.a.f33564d).equals("ttcf")) {
            throw new IOException("Missing TTC header");
        }
        float fE = h0Var.E();
        int iG0 = (int) h0Var.g0();
        this.f30889b = iG0;
        if (iG0 <= 0 || iG0 > 1024) {
            throw new IOException(j2.y.a(iG0, "Invalid number of fonts "));
        }
        this.f30890c = new long[iG0];
        for (int i10 = 0; i10 < this.f30889b; i10++) {
            this.f30890c[i10] = h0Var.g0();
        }
        if (fE >= 2.0f) {
            h0Var.i0();
            h0Var.i0();
            h0Var.i0();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30888a.close();
    }

    public final p0 h(int i10) throws IOException {
        long[] jArr = this.f30890c;
        long j10 = jArr[i10];
        h0 h0Var = this.f30888a;
        h0Var.seek(j10);
        l0 b0Var = new String(h0Var.z(4), xe.a.f33564d).equals("OTTO") ? new b0(false, true) : new l0(false, true);
        h0Var.seek(jArr[i10]);
        return b0Var.c(new j0(h0Var));
    }
}
