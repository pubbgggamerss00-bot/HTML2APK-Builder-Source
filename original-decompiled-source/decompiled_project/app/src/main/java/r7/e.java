package r7;

import pg.f0;
import r7.c;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final h f23225a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23226b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23227c = new Object();

    public e(h hVar, i iVar) {
        this.f23225a = hVar;
        this.f23226b = iVar;
    }

    @Override // r7.c
    public final c.C0257c a(c.b bVar) {
        c.C0257c c0257cA;
        synchronized (this.f23227c) {
            try {
                c0257cA = this.f23225a.a(bVar);
                if (c0257cA == null) {
                    c0257cA = this.f23226b.a(bVar);
                }
                if (c0257cA != null && !c0257cA.f23222a.b()) {
                    synchronized (this.f23227c) {
                        this.f23225a.d(bVar);
                        this.f23226b.d(bVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0257cA;
    }

    @Override // r7.c
    public final void b(long j10) {
        synchronized (this.f23227c) {
            this.f23225a.b(j10);
            f0 f0Var = f0.f21461a;
        }
    }

    @Override // r7.c
    public final void c(c.b bVar, c.C0257c c0257c) {
        synchronized (this.f23227c) {
            long size = c0257c.f23222a.getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f23225a.c(bVar, c0257c.f23222a, c0257c.f23223b, size);
            f0 f0Var = f0.f21461a;
        }
    }

    @Override // r7.c
    public final void clear() {
        synchronized (this.f23227c) {
            this.f23225a.clear();
            this.f23226b.clear();
            f0 f0Var = f0.f21461a;
        }
    }

    @Override // r7.c
    public final long getSize() {
        long size;
        synchronized (this.f23227c) {
            size = this.f23225a.getSize();
        }
        return size;
    }
}
