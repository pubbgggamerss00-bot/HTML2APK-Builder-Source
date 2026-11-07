package j2;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public static d f14689d;

    /* renamed from: e, reason: collision with root package name */
    public static final e3.g f14690e = e3.g.f8361b;

    /* renamed from: f, reason: collision with root package name */
    public static final e3.g f14691f = e3.g.f8360a;

    /* renamed from: c, reason: collision with root package name */
    public t2.h0 f14692c;

    @Override // j2.b
    public final int[] b(int i10) {
        int iD;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        e3.g gVar = f14690e;
        if (i10 < 0) {
            t2.h0 h0Var = this.f14692c;
            if (h0Var == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            iD = h0Var.f27820b.d(0);
        } else {
            t2.h0 h0Var2 = this.f14692c;
            if (h0Var2 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            int iD2 = h0Var2.f27820b.d(i10);
            iD = f(iD2, gVar) == i10 ? iD2 : iD2 + 1;
        }
        t2.h0 h0Var3 = this.f14692c;
        if (h0Var3 == null) {
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        if (iD >= h0Var3.f27820b.f27848f) {
            return null;
        }
        return c(f(iD, gVar), f(iD, f14691f) + 1);
    }

    @Override // j2.b
    public final int[] e(int i10) {
        int iD;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = d().length();
        e3.g gVar = f14691f;
        if (i10 > length) {
            t2.h0 h0Var = this.f14692c;
            if (h0Var == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            iD = h0Var.f27820b.d(d().length());
        } else {
            t2.h0 h0Var2 = this.f14692c;
            if (h0Var2 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            int iD2 = h0Var2.f27820b.d(i10);
            iD = f(iD2, gVar) + 1 == i10 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return c(f(iD, f14690e), f(iD, gVar) + 1);
    }

    public final int f(int i10, e3.g gVar) {
        t2.h0 h0Var = this.f14692c;
        if (h0Var == null) {
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        int iG = h0Var.g(i10);
        t2.h0 h0Var2 = this.f14692c;
        if (h0Var2 == null) {
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        if (gVar != h0Var2.h(iG)) {
            t2.h0 h0Var3 = this.f14692c;
            if (h0Var3 != null) {
                return h0Var3.g(i10);
            }
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        if (this.f14692c != null) {
            return r6.f27820b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.r.h("layoutResult");
        throw null;
    }
}
