package x;

import java.util.ArrayList;
import pg.f0;
import pg.q;
import ph.i0;
import x0.n1;

@vg.e(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f31592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f31593c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f31594a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f31595b;

        public a(ArrayList arrayList, n1 n1Var) {
            this.f31594a = arrayList;
            this.f31595b = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            k kVar = (k) obj;
            boolean z10 = kVar instanceof e;
            ArrayList arrayList = this.f31594a;
            if (z10) {
                arrayList.add(kVar);
            } else if (kVar instanceof f) {
                arrayList.remove(((f) kVar).f31590a);
            }
            this.f31595b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, n1<Boolean> n1Var, tg.e<? super g> eVar) {
        super(2, eVar);
        this.f31592b = lVar;
        this.f31593c = n1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new g(this.f31592b, this.f31593c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31591a;
        if (i10 == 0) {
            q.b(obj);
            ArrayList arrayList = new ArrayList();
            sh.f<k> fVarB = this.f31592b.b();
            a aVar2 = new a(arrayList, this.f31593c);
            this.f31591a = 1;
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
