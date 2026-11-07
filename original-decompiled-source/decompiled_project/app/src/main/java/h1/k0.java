package h1;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public long f12133a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f12134b;

    public k0(long j10) {
        this.f12133a = j10;
    }

    public abstract void a(k0 k0Var);

    public abstract k0 b();

    public k0 c(long j10) {
        k0 k0VarB = b();
        k0VarB.f12133a = j10;
        return k0VarB;
    }

    public k0() {
        this(n.k().g());
    }
}
