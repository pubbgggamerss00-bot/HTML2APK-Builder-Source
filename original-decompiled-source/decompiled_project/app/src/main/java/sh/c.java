package sh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class c<T> extends th.g<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24948f = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final rh.w<T> f24949d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24950e;

    public /* synthetic */ c(rh.w wVar, boolean z10) {
        this(wVar, z10, tg.i.f28768a, -3, rh.a.f23576a);
    }

    @Override // th.g, sh.f
    public final Object b(g<? super T> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        if (this.f28791b != -3) {
            Object objB = super.b(gVar, eVar);
            return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
        }
        boolean z10 = this.f24950e;
        if (z10 && f24948f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object objA = i.a(gVar, this.f24949d, z10, eVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    @Override // th.g
    public final String c() {
        return "channel=" + this.f24949d;
    }

    @Override // th.g
    public final Object e(rh.u<? super T> uVar, tg.e<? super pg.f0> eVar) throws Throwable {
        Object objA = i.a(new th.y(uVar), this.f24949d, this.f24950e, eVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    @Override // th.g
    public final th.g<T> f(tg.h hVar, int i10, rh.a aVar) {
        return new c(this.f24949d, this.f24950e, hVar, i10, aVar);
    }

    @Override // th.g
    public final f<T> g() {
        return new c(this.f24949d, this.f24950e);
    }

    @Override // th.g
    public final rh.w<T> h(ph.i0 i0Var) {
        if (this.f24950e && f24948f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f28791b == -3 ? this.f24949d : super.h(i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rh.w<? extends T> wVar, boolean z10, tg.h hVar, int i10, rh.a aVar) {
        super(hVar, i10, aVar);
        this.f24949d = wVar;
        this.f24950e = z10;
    }
}
