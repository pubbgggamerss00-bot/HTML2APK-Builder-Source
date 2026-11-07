package nc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q<K, V> extends c<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final K f18728a;

    /* renamed from: b, reason: collision with root package name */
    public final Short f18729b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(q0 q0Var, Short sh2) {
        this.f18728a = q0Var;
        this.f18729b = sh2;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f18728a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.f18729b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
