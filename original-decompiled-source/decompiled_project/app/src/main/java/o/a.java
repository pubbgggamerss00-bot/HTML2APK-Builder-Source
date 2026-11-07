package o;

import java.util.HashMap;
import o.b;

/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f18826e = new HashMap<>();

    @Override // o.b
    public final b.c<K, V> a(K k10) {
        return this.f18826e.get(k10);
    }

    @Override // o.b
    public final V b(K k10) {
        V v10 = (V) super.b(k10);
        this.f18826e.remove(k10);
        return v10;
    }
}
