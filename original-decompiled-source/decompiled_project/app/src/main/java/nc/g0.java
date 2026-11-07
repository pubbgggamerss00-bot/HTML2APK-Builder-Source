package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g0 extends c1<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.e f18681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Iterator it, lc.e eVar) {
        super(it);
        this.f18681b = eVar;
    }

    @Override // nc.c1
    public final Object a(Object obj) {
        return this.f18681b.apply(obj);
    }
}
