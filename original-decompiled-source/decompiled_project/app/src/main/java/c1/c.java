package c1;

import fh.c;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements c.a {

    /* renamed from: c, reason: collision with root package name */
    public final i<K, V> f4554c;

    /* renamed from: d, reason: collision with root package name */
    public V f4555d;

    public c(i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        this.f4554c = iVar;
        this.f4555d = v10;
    }

    @Override // c1.b, java.util.Map.Entry
    public final V getValue() {
        return this.f4555d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.b, java.util.Map.Entry
    public final V setValue(V v10) {
        V v11 = this.f4555d;
        this.f4555d = v10;
        g<K, V, Map.Entry<K, V>> gVar = this.f4554c.f4573a;
        f<K, V> fVar = gVar.f4568d;
        K k10 = this.f4552a;
        if (!fVar.containsKey(k10)) {
            return v11;
        }
        boolean z10 = gVar.f4561c;
        if (!z10) {
            fVar.put(k10, v10);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            u uVar = gVar.f4559a[gVar.f4560b];
            Object obj = uVar.f4586a[uVar.f4588c];
            fVar.put(k10, v10);
            gVar.f(obj != null ? obj.hashCode() : 0, fVar.f4564c, obj, 0);
        }
        gVar.f4571g = fVar.f4566e;
        return v11;
    }
}
