package s4;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k1 extends vg.i implements eh.q<y0<Object>, Boolean, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24287a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ y0 f24288b;

    @Override // eh.q
    public final Object b(y0<Object> y0Var, Boolean bool, tg.e<Object> eVar) {
        bool.getClass();
        k1 k1Var = new k1(3, eVar);
        k1Var.f24288b = y0Var;
        return k1Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24287a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        y0 y0Var = this.f24288b;
        this.f24287a = 1;
        Object objA = y0Var.a(this);
        return objA == aVar ? aVar : objA;
    }
}
