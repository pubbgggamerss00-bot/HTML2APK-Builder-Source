package th;

import f9.nh;
import pg.f0;
import ph.e0;
import tg.f;

/* loaded from: classes2.dex */
public abstract class i<S, T> extends g<T> {

    /* renamed from: d, reason: collision with root package name */
    public final sh.f<S> f28796d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(sh.f<? extends S> fVar, tg.h hVar, int i10, rh.a aVar) {
        super(hVar, i10, aVar);
        this.f28796d = fVar;
    }

    @Override // th.g, sh.f
    public final Object b(sh.g<? super T> gVar, tg.e<? super f0> eVar) {
        if (this.f28791b == -3) {
            tg.h context = eVar.getContext();
            Boolean bool = Boolean.FALSE;
            ph.b0 b0Var = new ph.b0();
            tg.h hVar = this.f28790a;
            tg.h hVarPlus = !((Boolean) hVar.fold(bool, b0Var)).booleanValue() ? context.plus(hVar) : e0.a(context, hVar, false);
            if (kotlin.jvm.internal.r.a(hVarPlus, context)) {
                Object objI = i(gVar, eVar);
                return objI == ug.a.f29706a ? objI : f0.f21461a;
            }
            f.a aVar = f.a.f28767a;
            if (kotlin.jvm.internal.r.a(hVarPlus.get(aVar), context.get(aVar))) {
                tg.h context2 = eVar.getContext();
                if (!(gVar instanceof y) && !(gVar instanceof t)) {
                    gVar = new b0(gVar, context2);
                }
                Object objA = nh.a(hVarPlus, gVar, uh.b0.b(hVarPlus), new h(this, null), eVar);
                return objA == ug.a.f29706a ? objA : f0.f21461a;
            }
        }
        Object objB = super.b(gVar, eVar);
        return objB == ug.a.f29706a ? objB : f0.f21461a;
    }

    @Override // th.g
    public final Object e(rh.u<? super T> uVar, tg.e<? super f0> eVar) {
        Object objI = i(new y(uVar), eVar);
        return objI == ug.a.f29706a ? objI : f0.f21461a;
    }

    public abstract Object i(sh.g<? super T> gVar, tg.e<? super f0> eVar);

    @Override // th.g
    public final String toString() {
        return this.f28796d + " -> " + super.toString();
    }
}
