package c1;

/* loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i10 = this.f4588c;
        this.f4588c = i10 + 2;
        return (K) this.f4586a[i10];
    }
}
