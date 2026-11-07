package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f33372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1.a f33374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f33377f;

    public /* synthetic */ y(b0.m0 m0Var, x0.n1 n1Var, y1.a aVar, x0.n1 n1Var2, x0.n1 n1Var3, x0.k1 k1Var) {
        this.f33372a = m0Var;
        this.f33373b = n1Var;
        this.f33374c = aVar;
        this.f33375d = n1Var2;
        this.f33376e = n1Var3;
        this.f33377f = k1Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        Object next;
        p1.c cVar = (p1.c) obj;
        Iterator<T> it = this.f33372a.i().i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ((((b0.n) next).getKey() instanceof Long) && Float.intBitsToFloat((int) (cVar.f21129a >> 32)) >= r2.getOffset()) {
                if (Float.intBitsToFloat((int) (cVar.f21129a >> 32)) <= r2.getSize() + r2.getOffset()) {
                    break;
                }
            }
        }
        b0.n nVar = (b0.n) next;
        if (nVar == null) {
            return pg.f0.f21461a;
        }
        Object key = nVar.getKey();
        kotlin.jvm.internal.r.c(key, "null cannot be cast to non-null type kotlin.Long");
        float f10 = s.f33139a;
        this.f33375d.setValue((Long) key);
        Iterable iterable = (Iterable) this.f33373b.getValue();
        ArrayList arrayList = new ArrayList(qg.p.h(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((FolderEntity) it2.next()).getId()));
        }
        this.f33376e.setValue(arrayList);
        this.f33377f.e((nVar.getSize() / 2.0f) + nVar.getOffset());
        this.f33374c.a(0);
        return pg.f0.f21461a;
    }
}
