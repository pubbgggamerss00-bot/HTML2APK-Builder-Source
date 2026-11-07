package x;

import java.util.ArrayList;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.q;
import ph.i0;
import x0.n1;

@vg.e(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", l = {EACTags.HISTORICAL_BYTES}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f31586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f31587c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f31588a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f31589b;

        public a(ArrayList arrayList, n1 n1Var) {
            this.f31588a = arrayList;
            this.f31589b = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            k kVar = (k) obj;
            boolean z10 = kVar instanceof b;
            ArrayList arrayList = this.f31588a;
            if (z10) {
                arrayList.add(kVar);
            } else if (kVar instanceof c) {
                arrayList.remove(((c) kVar).f31584a);
            } else if (kVar instanceof x.a) {
                arrayList.remove(((x.a) kVar).f31583a);
            }
            this.f31589b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, n1<Boolean> n1Var, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f31586b = lVar;
        this.f31587c = n1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new d(this.f31586b, this.f31587c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31585a;
        if (i10 == 0) {
            q.b(obj);
            ArrayList arrayList = new ArrayList();
            sh.f<k> fVarB = this.f31586b.b();
            a aVar2 = new a(arrayList, this.f31587c);
            this.f31585a = 1;
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
