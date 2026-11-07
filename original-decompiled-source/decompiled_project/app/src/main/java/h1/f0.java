package h1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final w<K, V> f12115a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f12116b;

    /* renamed from: c, reason: collision with root package name */
    public int f12117c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f12118d;

    /* renamed from: e, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f12119e;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(w<K, V> wVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f12115a = wVar;
        this.f12116b = it;
        this.f12117c = wVar.f().f12192d;
        c();
    }

    public final void c() {
        this.f12118d = this.f12119e;
        Iterator<Map.Entry<K, V>> it = this.f12116b;
        this.f12119e = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f12119e != null;
    }

    public final void remove() {
        w<K, V> wVar = this.f12115a;
        if (wVar.f().f12192d != this.f12117c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f12118d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        wVar.remove(entry.getKey());
        this.f12118d = null;
        pg.f0 f0Var = pg.f0.f21461a;
        this.f12117c = wVar.f().f12192d;
    }
}
