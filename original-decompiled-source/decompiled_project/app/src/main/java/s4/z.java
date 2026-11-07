package s4;

import java.io.Serializable;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f24432a;

    /* renamed from: b, reason: collision with root package name */
    public int f24433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<Object> f24434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f24436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.jvm.internal.g0<Object> g0Var, m<Object> mVar, kotlin.jvm.internal.e0 e0Var, tg.e<? super z> eVar) {
        super(1, eVar);
        this.f24434c = g0Var;
        this.f24435d = mVar;
        this.f24436e = e0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new z(this.f24434c, this.f24435d, this.f24436e, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((z) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        kotlin.jvm.internal.g0<Object> g0Var;
        T t3;
        kotlin.jvm.internal.e0 e0Var;
        Object obj3;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24433b;
        kotlin.jvm.internal.e0 e0Var2 = this.f24436e;
        kotlin.jvm.internal.g0<Object> g0Var2 = this.f24434c;
        m<Object> mVar = this.f24435d;
        try {
        } catch (c unused) {
            Object obj4 = g0Var2.f16327a;
            this.f24432a = e0Var2;
            this.f24433b = 3;
            Object objJ = mVar.j(obj4, true, this);
            obj2 = objJ;
        }
        if (i10 == 0) {
            pg.q.b(obj);
            this.f24432a = g0Var2;
            this.f24433b = 1;
            Object objI = mVar.i(this);
            if (objI == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
            t3 = objI;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    e0Var = (kotlin.jvm.internal.e0) this.f24432a;
                    pg.q.b(obj);
                    obj3 = obj;
                    e0Var.f16324a = ((Number) obj3).intValue();
                    return pg.f0.f21461a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var2 = (kotlin.jvm.internal.e0) this.f24432a;
                pg.q.b(obj);
                obj2 = obj;
                e0Var2.f16324a = ((Number) obj2).intValue();
                return pg.f0.f21461a;
            }
            g0Var = (kotlin.jvm.internal.g0) this.f24432a;
            pg.q.b(obj);
            t3 = obj;
        }
        g0Var.f16327a = t3;
        v0 v0VarG = mVar.g();
        this.f24432a = e0Var2;
        this.f24433b = 2;
        Integer version = v0VarG.getVersion();
        if (version == aVar) {
            return aVar;
        }
        e0Var = e0Var2;
        obj3 = version;
        e0Var.f16324a = ((Number) obj3).intValue();
        return pg.f0.f21461a;
    }
}
