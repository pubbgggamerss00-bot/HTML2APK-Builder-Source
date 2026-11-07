package c1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p<K, V> extends qg.j<K> implements a1.b<K> {

    /* renamed from: a, reason: collision with root package name */
    public final d<K, V> f4577a;

    public p(d<K, V> dVar) {
        this.f4577a = dVar;
    }

    @Override // qg.a
    public final int c() {
        d<K, V> dVar = this.f4577a;
        dVar.getClass();
        return dVar.f4558b;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4577a.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        t<K, V> tVar = this.f4577a.f4557a;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new w();
        }
        return new q(tVar, uVarArr);
    }
}
