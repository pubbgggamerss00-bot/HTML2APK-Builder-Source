package d1;

import a1.e;
import c1.d;
import c1.t;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import qg.j;
import x0.k2;

/* loaded from: classes.dex */
public final class b<E> extends j<E> implements e<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7312d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7313a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7314b;

    /* renamed from: c, reason: collision with root package name */
    public final d<E, a> f7315c;

    static {
        e1.b bVar = e1.b.f8339a;
        f7312d = new b(bVar, bVar, d.f4556c);
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.f7313a = obj;
        this.f7314b = obj2;
        this.f7315c = dVar;
    }

    @Override // a1.e
    public final b M(k2.c cVar) {
        d<E, a> dVarF = this.f7315c;
        a aVar = dVarF.get(cVar);
        if (aVar == null) {
            return this;
        }
        Object obj = aVar.f7310a;
        Object obj2 = aVar.f7311b;
        t<E, a> tVar = dVarF.f4557a;
        t<E, a> tVarV = tVar.v(cVar, cVar != null ? cVar.hashCode() : 0, 0);
        if (tVar != tVarV) {
            dVarF = tVarV == null ? d.f4556c : new d<>(tVarV, dVarF.f4558b - 1);
        }
        e1.b bVar = e1.b.f8339a;
        if (obj != bVar) {
            a aVar2 = dVarF.get(obj);
            r.b(aVar2);
            dVarF = dVarF.f(obj, new a(aVar2.f7310a, obj2));
        }
        if (obj2 != bVar) {
            a aVar3 = dVarF.get(obj2);
            r.b(aVar3);
            dVarF = dVarF.f(obj2, new a(obj, aVar3.f7311b));
        }
        Object obj3 = obj != bVar ? this.f7313a : obj2;
        if (obj2 != bVar) {
            obj = this.f7314b;
        }
        return new b(obj3, obj, dVarF);
    }

    @Override // java.util.Collection, java.util.Set, a1.e
    public final b add(Object obj) {
        d<E, a> dVar = this.f7315c;
        if (dVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, dVar.f(obj, new a()));
        }
        Object obj2 = this.f7314b;
        Object obj3 = dVar.get(obj2);
        r.b(obj3);
        return new b(this.f7313a, obj, dVar.f(obj2, new a(((a) obj3).f7310a, obj)).f(obj, new a(obj2, e1.b.f8339a)));
    }

    @Override // qg.a
    public final int c() {
        d<E, a> dVar = this.f7315c;
        dVar.getClass();
        return dVar.f4558b;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7315c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new c(this.f7313a, this.f7315c);
    }
}
