package c1;

import java.util.Map;

/* loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f4588c;
        this.f4588c = i10 + 2;
        Object[] objArr = this.f4586a;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
