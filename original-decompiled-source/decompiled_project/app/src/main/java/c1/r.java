package c1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r<K, V> extends qg.a<V> {

    /* renamed from: a, reason: collision with root package name */
    public final d<K, V> f4578a;

    public r(d<K, V> dVar) {
        this.f4578a = dVar;
    }

    @Override // qg.a
    public final int c() {
        d<K, V> dVar = this.f4578a;
        dVar.getClass();
        return dVar.f4558b;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4578a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        t<K, V> tVar = this.f4578a.f4557a;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new z();
        }
        return new s(tVar, uVarArr);
    }
}
