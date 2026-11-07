package i2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final n f13974a = new n();

    /* renamed from: b, reason: collision with root package name */
    public final n f13975b = new n();

    public final void a(e0 e0Var, boolean z10) {
        n nVar = this.f13975b;
        n nVar2 = this.f13974a;
        if (z10) {
            nVar2.a(e0Var);
            nVar.a(e0Var);
        } else {
            if (nVar2.f13958a.contains(e0Var)) {
                return;
            }
            nVar.a(e0Var);
        }
    }

    public final boolean b() {
        return !(this.f13975b.f13958a.isEmpty() && this.f13974a.f13958a.isEmpty());
    }
}
