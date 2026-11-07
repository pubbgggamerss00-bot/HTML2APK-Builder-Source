package x8;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f32210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f32212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32213d;

    public /* synthetic */ a0(b0.m0 m0Var, x0.n1 n1Var, x0.k1 k1Var, x0.n1 n1Var2) {
        this.f32210a = m0Var;
        this.f32211b = n1Var;
        this.f32212c = k1Var;
        this.f32213d = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        c2.b0 change = (c2.b0) obj;
        p1.c cVar = (p1.c) obj2;
        kotlin.jvm.internal.r.e(change, "change");
        float f10 = s.f33139a;
        Long l10 = (Long) this.f32211b.getValue();
        if (l10 == null) {
            return pg.f0.f21461a;
        }
        long jLongValue = l10.longValue();
        change.a();
        x0.k1 k1Var = this.f32212c;
        k1Var.e(Float.intBitsToFloat((int) (cVar.f21129a >> 32)) + k1Var.getFloatValue());
        Iterator<T> it = this.f32210a.i().i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b0.n nVar = (b0.n) next;
            if ((nVar.getKey() instanceof Long) && !kotlin.jvm.internal.r.a(nVar.getKey(), l10) && k1Var.getFloatValue() >= nVar.getOffset()) {
                if (k1Var.getFloatValue() <= nVar.getSize() + nVar.getOffset()) {
                    break;
                }
            }
        }
        b0.n nVar2 = (b0.n) next;
        x0.n1 n1Var = this.f32213d;
        List list = (List) n1Var.getValue();
        if (list == null) {
            return pg.f0.f21461a;
        }
        if (nVar2 != null) {
            Object key = nVar2.getKey();
            kotlin.jvm.internal.r.c(key, "null cannot be cast to non-null type kotlin.Long");
            List<Long> listA = w7.a(list, jLongValue, ((Long) key).longValue());
            if (!listA.equals(list)) {
                n1Var.setValue(listA);
            }
        }
        return pg.f0.f21461a;
    }
}
