package i2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final q2<e0> f13958a = new q2<>(o.f13967a);

    public final void a(e0 e0Var) {
        if (!e0Var.m()) {
            f2.a.b("DepthSortedSet.add called on an unattached node");
        }
        this.f13958a.add(e0Var);
    }

    public final boolean b(e0 e0Var) {
        if (!e0Var.m()) {
            f2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return this.f13958a.remove(e0Var);
    }

    public final String toString() {
        return this.f13958a.toString();
    }
}
