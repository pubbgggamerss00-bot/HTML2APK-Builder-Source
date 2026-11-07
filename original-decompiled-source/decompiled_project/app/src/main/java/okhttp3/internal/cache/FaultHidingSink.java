package okhttp3.internal.cache;

import hi.g;
import hi.o;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class FaultHidingSink extends o {

    /* renamed from: b, reason: collision with root package name */
    public boolean f19407b;

    public FaultHidingSink() {
        throw null;
    }

    @Override // hi.o, hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19407b) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f19407b = true;
            throw null;
        }
    }

    @Override // hi.o, hi.j0, java.io.Flushable
    public final void flush() {
        if (this.f19407b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f19407b = true;
            throw null;
        }
    }

    @Override // hi.o, hi.j0
    public final void j(long j10, g source) throws EOFException {
        r.e(source, "source");
        if (this.f19407b) {
            source.skip(j10);
            return;
        }
        try {
            super.j(j10, source);
        } catch (IOException unused) {
            this.f19407b = true;
            throw null;
        }
    }
}
