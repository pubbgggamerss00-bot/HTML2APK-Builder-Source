package s;

import s.s;

/* loaded from: classes.dex */
public final class o2<T, V extends s> implements n2<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<T, V> f23857a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<V, T> f23858b;

    /* JADX WARN: Multi-variable type inference failed */
    public o2(eh.l<? super T, ? extends V> lVar, eh.l<? super V, ? extends T> lVar2) {
        this.f23857a = lVar;
        this.f23858b = lVar2;
    }

    @Override // s.n2
    public final eh.l<T, V> a() {
        return this.f23857a;
    }

    @Override // s.n2
    public final eh.l<V, T> b() {
        return this.f23858b;
    }
}
