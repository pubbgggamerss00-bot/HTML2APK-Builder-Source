package ph;

/* loaded from: classes2.dex */
public final class e1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21525a;

    public e1(boolean z10) {
        this.f21525a = z10;
    }

    @Override // ph.n1
    public final d2 c() {
        return null;
    }

    @Override // ph.n1
    public final boolean isActive() {
        return this.f21525a;
    }

    public final String toString() {
        return x0.s1.a(new StringBuilder("Empty{"), this.f21525a ? "Active" : "New", '}');
    }
}
