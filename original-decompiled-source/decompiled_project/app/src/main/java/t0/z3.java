package t0;

import java.util.ArrayList;
import x.o;

@vg.e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f27510a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.l f27512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4 f27513d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27514a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f27515b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d4 f27516c;

        public a(ArrayList arrayList, ph.i0 i0Var, d4 d4Var) {
            this.f27514a = arrayList;
            this.f27515b = i0Var;
            this.f27516c = d4Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            x.k kVar = (x.k) obj;
            boolean z10 = kVar instanceof x.i;
            ArrayList arrayList = this.f27514a;
            if (z10) {
                arrayList.add(kVar);
            } else if (kVar instanceof x.j) {
                arrayList.remove(((x.j) kVar).f31596a);
            } else if (kVar instanceof x.e) {
                arrayList.add(kVar);
            } else if (kVar instanceof x.f) {
                arrayList.remove(((x.f) kVar).f31590a);
            } else if (kVar instanceof o.b) {
                arrayList.add(kVar);
            } else if (kVar instanceof o.c) {
                arrayList.remove(((o.c) kVar).f31600a);
            } else if (kVar instanceof o.a) {
                arrayList.remove(((o.a) kVar).f31598a);
            }
            ph.h.c(this.f27515b, null, null, new y3(this.f27516c, (x.k) qg.x.K(arrayList), null), 3);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(x.l lVar, d4 d4Var, tg.e<? super z3> eVar) {
        super(2, eVar);
        this.f27512c = lVar;
        this.f27513d = d4Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z3 z3Var = new z3(this.f27512c, this.f27513d, eVar);
        z3Var.f27511b = obj;
        return z3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f27510a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f27511b;
            ArrayList arrayList = new ArrayList();
            sh.f<x.k> fVarB = this.f27512c.b();
            a aVar2 = new a(arrayList, i0Var, this.f27513d);
            this.f27510a = 1;
            if (fVarB.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
