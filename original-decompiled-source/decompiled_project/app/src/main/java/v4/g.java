package v4;

import eh.p;
import pg.f0;
import pg.q;
import qg.k0;
import vg.i;

/* loaded from: classes.dex */
public final class g {

    @vg.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    public static final class a extends i implements p<e, tg.e<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30618a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f30619b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f30620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super b, ? super tg.e<? super f0>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f30620c = (i) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f30620c, eVar);
            aVar.f30619b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(e eVar, tg.e<? super e> eVar2) {
            return ((a) create(eVar, eVar2)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [eh.p, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30618a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b bVar = (b) this.f30619b;
                q.b(obj);
                return bVar;
            }
            q.b(obj);
            b bVar2 = new b(k0.k(((e) this.f30619b).a()), false);
            this.f30619b = bVar2;
            this.f30618a = 1;
            return this.f30620c.invoke(bVar2, this) == aVar ? aVar : bVar2;
        }
    }

    public static final Object a(s4.i<e> iVar, p<? super b, ? super tg.e<? super f0>, ? extends Object> pVar, tg.e<? super e> eVar) {
        return iVar.a(new a(pVar, null), eVar);
    }
}
