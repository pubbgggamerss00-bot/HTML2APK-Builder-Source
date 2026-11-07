package t2;

/* loaded from: classes.dex */
public final class z implements g1.l<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<g1.o, Object, Object> f27958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, Object> f27959b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(eh.p<? super g1.o, Object, Object> pVar, eh.l<Object, Object> lVar) {
        this.f27958a = pVar;
        this.f27959b = lVar;
    }

    @Override // g1.l
    public final Object a(Object obj) {
        return this.f27959b.invoke(obj);
    }

    @Override // g1.l
    public final Object b(g1.o oVar, Object obj) {
        return this.f27958a.invoke(oVar, obj);
    }
}
