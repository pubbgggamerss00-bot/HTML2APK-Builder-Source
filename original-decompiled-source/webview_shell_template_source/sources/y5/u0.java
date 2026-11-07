package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 extends d {
    public final kotlin.jvm.internal.k s;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(p5.l<? super Throwable, d5.j> lVar) {
        this.s = (kotlin.jvm.internal.k) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.k, p5.l] */
    @Override // y5.d
    public final void a(Throwable th) {
        this.s.invoke(th);
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return d5.j.f12745a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.s.getClass().getSimpleName() + '@' + b0.e(this) + ']';
    }
}
