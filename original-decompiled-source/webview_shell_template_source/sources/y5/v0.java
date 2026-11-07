package y5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v0 extends z0 {

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15374x = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: w, reason: collision with root package name */
    public final p5.l<Throwable, d5.j> f15375w;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(p5.l<? super Throwable, d5.j> lVar) {
        this.f15375w = lVar;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ d5.j invoke(Throwable th) {
        j(th);
        return d5.j.f12745a;
    }

    @Override // y5.n
    public final void j(Throwable th) {
        if (f15374x.compareAndSet(this, 0, 1)) {
            this.f15375w.invoke(th);
        }
    }
}
