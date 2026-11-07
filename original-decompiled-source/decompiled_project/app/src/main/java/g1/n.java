package g1;

import eh.p;

/* loaded from: classes.dex */
public final class n implements l<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<o, Object, Object> f11310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, Object> f11311b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(p<? super o, Object, Object> pVar, eh.l<Object, Object> lVar) {
        this.f11310a = pVar;
        this.f11311b = lVar;
    }

    @Override // g1.l
    public final Object a(Object obj) {
        return this.f11311b.invoke(obj);
    }

    @Override // g1.l
    public final Object b(o oVar, Object obj) {
        return this.f11310a.invoke(oVar, obj);
    }
}
