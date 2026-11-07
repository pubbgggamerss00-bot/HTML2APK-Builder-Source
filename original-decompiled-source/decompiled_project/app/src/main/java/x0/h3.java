package x0;

/* loaded from: classes.dex */
public class h3<T> extends h1.j0 implements h1.t<T> {

    /* renamed from: b, reason: collision with root package name */
    public final i3<T> f31707b;

    /* renamed from: c, reason: collision with root package name */
    public a<T> f31708c;

    public static final class a<T> extends h1.k0 {

        /* renamed from: c, reason: collision with root package name */
        public T f31709c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, long j10) {
            super(j10);
            this.f31709c = obj;
        }

        @Override // h1.k0
        public final void a(h1.k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f31709c = ((a) k0Var).f31709c;
        }

        @Override // h1.k0
        public final h1.k0 b() {
            return new a(this.f31709c, h1.n.k().g());
        }

        @Override // h1.k0
        public final h1.k0 c(long j10) {
            return new a(this.f31709c, h1.n.k().g());
        }
    }

    public h3(T t3, i3<T> i3Var) {
        this.f31707b = i3Var;
        h1.h hVarK = h1.n.k();
        a<T> aVar = new a<>(t3, hVarK.g());
        if (!(hVarK instanceof h1.b)) {
            aVar.f12134b = new a(t3, 1);
        }
        this.f31708c = aVar;
    }

    @Override // h1.t
    public final i3<T> a() {
        return this.f31707b;
    }

    @Override // h1.i0
    public final h1.k0 c() {
        return this.f31708c;
    }

    @Override // x0.r3
    public final T getValue() {
        return ((a) h1.n.t(this.f31708c, this)).f31709c;
    }

    @Override // h1.i0
    public final void k(h1.k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f31708c = (a) k0Var;
    }

    @Override // h1.i0
    public final h1.k0 m(h1.k0 k0Var, h1.k0 k0Var2, h1.k0 k0Var3) {
        if (this.f31707b.a(((a) k0Var2).f31709c, ((a) k0Var3).f31709c)) {
            return k0Var2;
        }
        return null;
    }

    @Override // x0.n1
    public final void setValue(T t3) {
        h1.h hVarK;
        a aVar = (a) h1.n.i(this.f31708c);
        if (this.f31707b.a(aVar.f31709c, t3)) {
            return;
        }
        a<T> aVar2 = this.f31708c;
        synchronized (h1.n.f12160c) {
            hVarK = h1.n.k();
            ((a) h1.n.o(aVar2, this, hVarK, aVar)).f31709c = t3;
            pg.f0 f0Var = pg.f0.f21461a;
        }
        h1.n.n(hVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) h1.n.i(this.f31708c)).f31709c + ")@" + hashCode();
    }
}
