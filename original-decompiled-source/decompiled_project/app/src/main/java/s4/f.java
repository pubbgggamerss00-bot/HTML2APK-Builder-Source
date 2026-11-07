package s4;

import java.util.List;

@vg.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<u0<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24222a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<e<Object>> f24224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends e<Object>> list, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f24224c = list;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f24224c, eVar);
        fVar.f24223b = obj;
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(u0<Object> u0Var, tg.e<? super pg.f0> eVar) {
        return ((f) create(u0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24222a;
        if (i10 == 0) {
            pg.q.b(obj);
            u0 u0Var = (u0) this.f24223b;
            this.f24222a = 1;
            if (ah.p.a(this.f24224c, u0Var, this) == aVar) {
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
