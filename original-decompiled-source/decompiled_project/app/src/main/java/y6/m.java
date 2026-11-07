package y6;

import androidx.work.impl.model.WorkSpec;
import eh.p;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.q;
import ph.i0;
import qg.x;
import y6.l;

@vg.e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f33995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkSpec f33996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f33997d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f33998a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f33999b;

        public a(h hVar, WorkSpec workSpec) {
            this.f33998a = hVar;
            this.f33999b = workSpec;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            this.f33998a.a(this.f33999b, (b) obj);
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, WorkSpec workSpec, h hVar, tg.e<? super m> eVar) {
        super(2, eVar);
        this.f33995b = lVar;
        this.f33996c = workSpec;
        this.f33997d = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new m(this.f33995b, this.f33996c, this.f33997d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((m) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33994a;
        if (i10 == 0) {
            q.b(obj);
            l lVar = this.f33995b;
            lVar.getClass();
            WorkSpec spec = this.f33996c;
            r.e(spec, "spec");
            ArrayList arrayList = lVar.f33987a;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((z6.e) obj2).a(spec)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(qg.p.h(arrayList2, 10));
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                arrayList3.add(((z6.e) obj3).b(spec.f3176j));
            }
            sh.f fVarD = gg.a.d(new l.b((sh.f[]) x.c0(arrayList3).toArray(new sh.f[0])));
            a aVar2 = new a(this.f33997d, spec);
            this.f33994a = 1;
            if (fVarD.b(aVar2, this) == aVar) {
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
