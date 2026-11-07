package v4;

import eh.p;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.q;
import s4.i;

/* loaded from: classes.dex */
public final class c implements i<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i<e> f30610a;

    @vg.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<e, tg.e<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30611a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f30612b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg.i f30613c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super e, ? super tg.e<? super e>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f30613c = (vg.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f30613c, eVar);
            aVar.f30612b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(e eVar, tg.e<? super e> eVar2) {
            return ((a) create(eVar, eVar2)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [eh.p, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30611a;
            if (i10 == 0) {
                q.b(obj);
                e eVar = (e) this.f30612b;
                this.f30611a = 1;
                obj = this.f30613c.invoke(eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            e eVar2 = (e) obj;
            r.c(eVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((b) eVar2).f30608b.f30606a.set(true);
            return eVar2;
        }
    }

    public c(i<e> iVar) {
        this.f30610a = iVar;
    }

    @Override // s4.i
    public final Object a(p<? super e, ? super tg.e<? super e>, ? extends Object> pVar, tg.e<? super e> eVar) {
        return this.f30610a.a(new a(pVar, null), eVar);
    }

    @Override // s4.i
    public final sh.f<e> getData() {
        return this.f30610a.getData();
    }
}
