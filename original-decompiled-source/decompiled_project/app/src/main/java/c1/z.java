package c1;

/* loaded from: classes.dex */
public final class z<K, V> extends u<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i10 = this.f4588c;
        this.f4588c = i10 + 2;
        return (V) this.f4586a[i10 + 1];
    }
}
