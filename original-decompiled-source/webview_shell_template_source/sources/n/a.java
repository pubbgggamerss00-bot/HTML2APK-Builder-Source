package n;

import java.util.HashMap;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: w, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f13902w = new HashMap<>();

    @Override // n.b
    public final b.c<K, V> c(K k6) {
        return this.f13902w.get(k6);
    }

    @Override // n.b
    public final V d(K k6, V v2) {
        b.c<K, V> cVarC = c(k6);
        if (cVarC != null) {
            return cVarC.f13906t;
        }
        b.c<K, V> cVar = new b.c<>(k6, v2);
        this.f13905v++;
        b.c<K, V> cVar2 = this.f13903t;
        if (cVar2 == null) {
            this.s = cVar;
            this.f13903t = cVar;
        } else {
            cVar2.f13907u = cVar;
            cVar.f13908v = cVar2;
            this.f13903t = cVar;
        }
        this.f13902w.put(k6, cVar);
        return null;
    }

    @Override // n.b
    public final V e(K k6) {
        V v2 = (V) super.e(k6);
        this.f13902w.remove(k6);
        return v2;
    }
}
