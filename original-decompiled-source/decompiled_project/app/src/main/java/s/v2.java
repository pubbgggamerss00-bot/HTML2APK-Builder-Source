package s;

import s.s;

/* loaded from: classes.dex */
public final class v2<V extends s> implements u2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final t f23954a;

    /* renamed from: b, reason: collision with root package name */
    public V f23955b;

    /* renamed from: c, reason: collision with root package name */
    public V f23956c;

    /* renamed from: d, reason: collision with root package name */
    public V f23957d;

    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f23958a;

        public a(f0 f0Var) {
            this.f23958a = f0Var;
        }

        @Override // s.t
        public final f0 get(int i10) {
            return this.f23958a;
        }
    }

    public v2(t tVar) {
        this.f23954a = tVar;
    }

    @Override // s.q2
    public final long b(V v10, V v11, V v12) {
        int iB = v10.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f23954a.get(i10).b(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        return jMax;
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        if (this.f23956c == null) {
            this.f23956c = (V) v12.c();
        }
        V v13 = this.f23956c;
        if (v13 == null) {
            kotlin.jvm.internal.r.h("velocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f23956c;
            if (v14 == null) {
                kotlin.jvm.internal.r.h("velocityVector");
                throw null;
            }
            v14.e(this.f23954a.get(i10).c(v10.a(i10), v11.a(i10), v12.a(i10), j10), i10);
        }
        V v15 = this.f23956c;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.r.h("velocityVector");
        throw null;
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        if (this.f23955b == null) {
            this.f23955b = (V) v10.c();
        }
        V v13 = this.f23955b;
        if (v13 == null) {
            kotlin.jvm.internal.r.h("valueVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f23955b;
            if (v14 == null) {
                kotlin.jvm.internal.r.h("valueVector");
                throw null;
            }
            v14.e(this.f23954a.get(i10).e(v10.a(i10), v11.a(i10), v12.a(i10), j10), i10);
        }
        V v15 = this.f23955b;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.r.h("valueVector");
        throw null;
    }

    @Override // s.q2
    public final V g(V v10, V v11, V v12) {
        if (this.f23957d == null) {
            this.f23957d = (V) v12.c();
        }
        V v13 = this.f23957d;
        if (v13 == null) {
            kotlin.jvm.internal.r.h("endVelocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f23957d;
            if (v14 == null) {
                kotlin.jvm.internal.r.h("endVelocityVector");
                throw null;
            }
            v14.e(this.f23954a.get(i10).d(v10.a(i10), v11.a(i10), v12.a(i10)), i10);
        }
        V v15 = this.f23957d;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.r.h("endVelocityVector");
        throw null;
    }

    public v2(f0 f0Var) {
        this(new a(f0Var));
    }
}
