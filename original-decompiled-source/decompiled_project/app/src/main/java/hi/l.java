package hi;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class l implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13080a;

    /* renamed from: b, reason: collision with root package name */
    public int f13081b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f13082c = new ReentrantLock();

    public static final class a implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final l f13083a;

        /* renamed from: b, reason: collision with root package name */
        public long f13084b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13085c;

        public a(l lVar, long j10) {
            this.f13083a = lVar;
            this.f13084b = j10;
        }

        @Override // hi.l0
        public final m0 b() {
            return m0.f13094d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f13085c) {
                return;
            }
            this.f13085c = true;
            l lVar = this.f13083a;
            ReentrantLock reentrantLock = lVar.f13082c;
            reentrantLock.lock();
            try {
                int i10 = lVar.f13081b - 1;
                lVar.f13081b = i10;
                if (i10 == 0 && lVar.f13080a) {
                    pg.f0 f0Var = pg.f0.f21461a;
                    reentrantLock.unlock();
                    lVar.h();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // hi.l0
        public final long y(long j10, g sink) throws IOException {
            long j11;
            long j12;
            kotlin.jvm.internal.r.e(sink, "sink");
            if (this.f13085c) {
                throw new IllegalStateException("closed");
            }
            long j13 = this.f13084b;
            if (j10 < 0) {
                throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
            }
            long j14 = j10 + j13;
            long j15 = j13;
            while (true) {
                if (j15 >= j14) {
                    j11 = -1;
                    break;
                }
                g0 g0VarG0 = sink.g0(1);
                j11 = -1;
                long j16 = j14;
                int iL = this.f13083a.l(j15, g0VarG0.f13063a, g0VarG0.f13065c, (int) Math.min(j14 - j15, 8192 - r10));
                if (iL == -1) {
                    if (g0VarG0.f13064b == g0VarG0.f13065c) {
                        sink.f13060a = g0VarG0.a();
                        h0.a(g0VarG0);
                    }
                    if (j13 == j15) {
                        j12 = -1;
                    }
                } else {
                    g0VarG0.f13065c += iL;
                    long j17 = iL;
                    j15 += j17;
                    sink.f13061b += j17;
                    j14 = j16;
                }
            }
            j12 = j15 - j13;
            if (j12 != j11) {
                this.f13084b += j12;
            }
            return j12;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f13082c;
        reentrantLock.lock();
        try {
            if (this.f13080a) {
                return;
            }
            this.f13080a = true;
            if (this.f13081b != 0) {
                return;
            }
            pg.f0 f0Var = pg.f0.f21461a;
            reentrantLock.unlock();
            h();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void h() throws IOException;

    public abstract int l(long j10, byte[] bArr, int i10, int i11) throws IOException;

    public abstract long p() throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f13082c;
        reentrantLock.lock();
        try {
            if (this.f13080a) {
                throw new IllegalStateException("closed");
            }
            pg.f0 f0Var = pg.f0.f21461a;
            reentrantLock.unlock();
            return p();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final a z(long j10) throws IOException {
        ReentrantLock reentrantLock = this.f13082c;
        reentrantLock.lock();
        try {
            if (this.f13080a) {
                throw new IllegalStateException("closed");
            }
            this.f13081b++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
