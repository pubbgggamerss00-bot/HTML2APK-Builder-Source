package x;

import java.util.ArrayList;
import pg.f0;
import pg.q;
import ph.i0;
import x.o;
import x0.n1;

@vg.e(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f31602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f31603c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f31604a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f31605b;

        public a(ArrayList arrayList, n1 n1Var) {
            this.f31604a = arrayList;
            this.f31605b = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            k kVar = (k) obj;
            boolean z10 = kVar instanceof o.b;
            ArrayList arrayList = this.f31604a;
            if (z10) {
                arrayList.add(kVar);
            } else if (kVar instanceof o.c) {
                arrayList.remove(((o.c) kVar).f31600a);
            } else if (kVar instanceof o.a) {
                arrayList.remove(((o.a) kVar).f31598a);
            }
            this.f31605b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar, n1<Boolean> n1Var, tg.e<? super p> eVar) {
        super(2, eVar);
        this.f31602b = lVar;
        this.f31603c = n1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new p(this.f31602b, this.f31603c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((p) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31601a;
        if (i10 == 0) {
            q.b(obj);
            ArrayList arrayList = new ArrayList();
            sh.f<k> fVarB = this.f31602b.b();
            a aVar2 = new a(arrayList, this.f31603c);
            this.f31601a = 1;
            if (fVarB.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
