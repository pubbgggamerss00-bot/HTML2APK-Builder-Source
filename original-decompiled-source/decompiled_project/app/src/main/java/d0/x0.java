package d0;

import d0.c1;
import g2.e1;

/* loaded from: classes.dex */
public final class x0 implements g2.e1, e1.a, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7296a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f7297b;

    /* renamed from: d, reason: collision with root package name */
    public int f7299d;

    /* renamed from: e, reason: collision with root package name */
    public e1.a f7300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7301f;

    /* renamed from: c, reason: collision with root package name */
    public int f7298c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f7302g = bg.b.h(null);

    public x0(Object obj, c1 c1Var) {
        this.f7296a = obj;
        this.f7297b = c1Var;
    }

    @Override // g2.e1.a
    public final void a() {
        if (this.f7301f) {
            return;
        }
        if (this.f7299d <= 0) {
            y.c.c("Release should only be called once");
        }
        int i10 = this.f7299d - 1;
        this.f7299d = i10;
        if (i10 == 0) {
            this.f7297b.f7078a.remove(this);
            e1.a aVar = this.f7300e;
            if (aVar != null) {
                aVar.a();
            }
            this.f7300e = null;
        }
    }

    @Override // g2.e1
    public final x0 b() {
        if (this.f7301f) {
            y.c.c("Pin should not be called on an already disposed item ");
        }
        if (this.f7299d == 0) {
            this.f7297b.f7078a.add(this);
            g2.e1 e1Var = (g2.e1) this.f7302g.getValue();
            this.f7300e = e1Var != null ? e1Var.b() : null;
        }
        this.f7299d++;
        return this;
    }

    @Override // d0.c1.a
    public final int getIndex() {
        return this.f7298c;
    }

    @Override // d0.c1.a
    public final Object getKey() {
        return this.f7296a;
    }
}
