package th;

import java.util.Iterator;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import ph.e0;
import ph.i0;
import ph.k0;

/* loaded from: classes2.dex */
public final class l<T> extends g<T> {

    /* renamed from: d, reason: collision with root package name */
    public final Object f28816d;

    @vg.e(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {HeaderItem.METHOD_START_OFFSET}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28817a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sh.f<T> f28818b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y<T> f28819c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(sh.f<? extends T> fVar, y<T> yVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f28818b = fVar;
            this.f28819c = yVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f28818b, this.f28819c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28817a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f28817a = 1;
                if (this.f28818b.b(this.f28819c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public l(Iterable<? extends sh.f<? extends T>> iterable, tg.h hVar, int i10, rh.a aVar) {
        super(hVar, i10, aVar);
        this.f28816d = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // th.g
    public final Object e(rh.u<? super T> uVar, tg.e<? super f0> eVar) {
        y yVar = new y(uVar);
        Iterator it = this.f28816d.iterator();
        while (it.hasNext()) {
            ph.h.c(uVar, null, null, new a((sh.f) it.next(), yVar, null), 3);
        }
        return f0.f21461a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // th.g
    public final g<T> f(tg.h hVar, int i10, rh.a aVar) {
        return new l(this.f28816d, hVar, i10, aVar);
    }

    @Override // th.g
    public final rh.w<T> h(i0 i0Var) {
        eh.p fVar = new f(this, null);
        rh.a aVar = rh.a.f23576a;
        k0 k0Var = k0.f21553a;
        rh.t tVar = new rh.t(e0.b(i0Var, this.f28790a), rh.k.a(this.f28791b, 4, aVar));
        tVar.b0(k0Var, tVar, fVar);
        return tVar;
    }
}
