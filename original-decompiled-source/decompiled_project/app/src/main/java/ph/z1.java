package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ph.y1.d;

/* loaded from: classes2.dex */
public final /* synthetic */ class z1 extends kotlin.jvm.internal.p implements eh.q<y1, xh.j<?>, Object, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f21634a = new z1(3, y1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // eh.q
    public final pg.f0 b(y1 y1Var, xh.j<?> jVar, Object obj) {
        y1 y1Var2 = y1Var;
        xh.j<?> jVar2 = jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y1.f21611a;
        y1Var2.getClass();
        while (true) {
            Object objA = y1.f21611a.get(y1Var2);
            if (!(objA instanceof n1)) {
                if (!(objA instanceof y)) {
                    objA = b2.a(objA);
                }
                jVar2.e(objA);
            } else if (y1Var2.T(objA) >= 0) {
                jVar2.a(v1.g(y1Var2, y1Var2.new d(jVar2)));
                break;
            }
        }
        return pg.f0.f21461a;
    }
}
