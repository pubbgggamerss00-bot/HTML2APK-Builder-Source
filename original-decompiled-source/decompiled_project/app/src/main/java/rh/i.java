package rh;

import java.util.concurrent.CancellationException;
import pg.f0;
import ph.t1;
import ph.y1;
import rh.c;
import th.n;

/* loaded from: classes2.dex */
public class i<E> extends ph.a<f0> implements h<E> {

    /* renamed from: d, reason: collision with root package name */
    public final c f23624d;

    public i(tg.h hVar, c cVar) {
        super(hVar, true);
        this.f23624d = cVar;
    }

    @Override // rh.w
    public final xh.e<l<E>> a() {
        return this.f23624d.a();
    }

    @Override // rh.w
    public final Object b(vg.i iVar) {
        return this.f23624d.b(iVar);
    }

    @Override // rh.w
    public final Object c() {
        return this.f23624d.c();
    }

    @Override // ph.y1, ph.s1
    @pg.d
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // ph.y1, ph.s1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new t1(q(), null, this);
        }
        n(cancellationException);
    }

    @Override // ph.y1, ph.s1
    @pg.d
    public final /* synthetic */ boolean cancel(Throwable th2) {
        throw null;
    }

    @Override // rh.x
    public final Object d(E e10, tg.e<? super f0> eVar) {
        return this.f23624d.d(e10, eVar);
    }

    @Override // rh.w
    public final Object e(n.a aVar) throws Throwable {
        c cVar = this.f23624d;
        cVar.getClass();
        Object objD = c.D(cVar, aVar);
        ug.a aVar2 = ug.a.f29706a;
        return objD;
    }

    @Override // rh.x
    public final void f(r rVar) {
        this.f23624d.f(rVar);
    }

    @Override // rh.x
    public final Object g(E e10) {
        return this.f23624d.g(e10);
    }

    @Override // rh.x
    public final boolean h() {
        return this.f23624d.h();
    }

    @Override // rh.w
    public final j<E> iterator() {
        c cVar = this.f23624d;
        cVar.getClass();
        return new c.a();
    }

    @Override // ph.y1
    public final void n(CancellationException cancellationException) {
        CancellationException cancellationExceptionV = y1.V(this, cancellationException);
        this.f23624d.n(true, cancellationExceptionV);
        l(cancellationExceptionV);
    }
}
