package s;

import i0.e4;
import s.s;

/* loaded from: classes.dex */
public final class k<T, V extends s> {

    /* renamed from: a, reason: collision with root package name */
    public final n2<T, V> f23787a;

    /* renamed from: b, reason: collision with root package name */
    public final T f23788b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23789c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.s f23790d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f23791e;

    /* renamed from: f, reason: collision with root package name */
    public V f23792f;

    /* renamed from: g, reason: collision with root package name */
    public long f23793g;

    /* renamed from: h, reason: collision with root package name */
    public long f23794h = Long.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f23795i = bg.b.h(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public k(Object obj, n2 n2Var, s sVar, long j10, Object obj2, long j11, eh.a aVar) {
        this.f23787a = n2Var;
        this.f23788b = obj2;
        this.f23789c = j11;
        this.f23790d = (kotlin.jvm.internal.s) aVar;
        this.f23791e = bg.b.h(obj);
        this.f23792f = (V) e4.b(sVar);
        this.f23793g = j10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eh.a, kotlin.jvm.internal.s] */
    public final void a() {
        this.f23795i.setValue(Boolean.FALSE);
        this.f23790d.invoke();
    }
}
