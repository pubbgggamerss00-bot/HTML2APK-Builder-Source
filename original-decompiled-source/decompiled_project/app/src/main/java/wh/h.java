package wh;

import ph.m0;
import x0.s1;

/* loaded from: classes2.dex */
public final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f31570c;

    public h(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f31570c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31570c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f31570c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(m0.a(runnable));
        sb.append(", ");
        sb.append(this.f31568a);
        sb.append(", ");
        return s1.a(sb, this.f31569b ? "Blocking" : "Non-blocking", ']');
    }
}
