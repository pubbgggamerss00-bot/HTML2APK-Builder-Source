package b3;

import x0.r3;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final r3<Object> f3568a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3569b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3570c;

    public m(r3<? extends Object> r3Var, m mVar) {
        this.f3568a = r3Var;
        this.f3569b = mVar;
        this.f3570c = r3Var.getValue();
    }

    public final boolean a() {
        if (this.f3568a.getValue() != this.f3570c) {
            return true;
        }
        m mVar = this.f3569b;
        return mVar != null && mVar.a();
    }
}
