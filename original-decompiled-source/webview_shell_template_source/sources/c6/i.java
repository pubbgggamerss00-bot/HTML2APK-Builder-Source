package c6;

import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f2240u;

    public i(Runnable runnable, long j6, h hVar) {
        super(j6, hVar);
        this.f2240u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2240u.run();
        } finally {
            this.f2238t.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2240u;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(b0.e(runnable));
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.f2238t);
        sb.append(']');
        return sb.toString();
    }
}
