package c1;

import java.util.Map;

/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d, reason: collision with root package name */
    public final i<K, V> f4589d;

    public y(i<K, V> iVar) {
        this.f4589d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f4588c;
        this.f4588c = i10 + 2;
        Object[] objArr = this.f4586a;
        return new c(this.f4589d, objArr[i10], objArr[i10 + 1]);
    }
}
