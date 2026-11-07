package j2;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    public static e f14700e;

    /* renamed from: f, reason: collision with root package name */
    public static final e3.g f14701f = e3.g.f8361b;

    /* renamed from: g, reason: collision with root package name */
    public static final e3.g f14702g = e3.g.f8360a;

    /* renamed from: c, reason: collision with root package name */
    public t2.h0 f14703c;

    /* renamed from: d, reason: collision with root package name */
    public q2.t f14704d;

    @Override // j2.b
    public final int[] b(int i10) {
        int iE;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            q2.t tVar = this.f14704d;
            if (tVar == null) {
                kotlin.jvm.internal.r.h("node");
                throw null;
            }
            p1.e eVarE = tVar.e();
            int iRound = Math.round(eVarE.f21134d - eVarE.f21132b);
            if (i10 <= 0) {
                i10 = 0;
            }
            t2.h0 h0Var = this.f14703c;
            if (h0Var == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            int iD = h0Var.f27820b.d(i10);
            t2.h0 h0Var2 = this.f14703c;
            if (h0Var2 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            float f10 = h0Var2.f27820b.f(iD) + iRound;
            t2.h0 h0Var3 = this.f14703c;
            if (h0Var3 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            if (h0Var3 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            if (f10 < h0Var3.f27820b.f(r0.f27848f - 1)) {
                t2.h0 h0Var4 = this.f14703c;
                if (h0Var4 == null) {
                    kotlin.jvm.internal.r.h("layoutResult");
                    throw null;
                }
                iE = h0Var4.f27820b.e(f10);
            } else {
                t2.h0 h0Var5 = this.f14703c;
                if (h0Var5 == null) {
                    kotlin.jvm.internal.r.h("layoutResult");
                    throw null;
                }
                iE = h0Var5.f27820b.f27848f;
            }
            return c(i10, f(iE - 1, f14702g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // j2.b
    public final int[] e(int i10) {
        int iE;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            q2.t tVar = this.f14704d;
            if (tVar == null) {
                kotlin.jvm.internal.r.h("node");
                throw null;
            }
            p1.e eVarE = tVar.e();
            int iRound = Math.round(eVarE.f21134d - eVarE.f21132b);
            int length = d().length();
            if (length <= i10) {
                i10 = length;
            }
            t2.h0 h0Var = this.f14703c;
            if (h0Var == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            int iD = h0Var.f27820b.d(i10);
            t2.h0 h0Var2 = this.f14703c;
            if (h0Var2 == null) {
                kotlin.jvm.internal.r.h("layoutResult");
                throw null;
            }
            float f10 = h0Var2.f27820b.f(iD) - iRound;
            if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
                t2.h0 h0Var3 = this.f14703c;
                if (h0Var3 == null) {
                    kotlin.jvm.internal.r.h("layoutResult");
                    throw null;
                }
                iE = h0Var3.f27820b.e(f10);
            } else {
                iE = 0;
            }
            if (i10 == d().length() && iE < iD) {
                iE++;
            }
            return c(f(iE, f14701f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int f(int i10, e3.g gVar) {
        t2.h0 h0Var = this.f14703c;
        if (h0Var == null) {
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        int iG = h0Var.g(i10);
        t2.h0 h0Var2 = this.f14703c;
        if (h0Var2 == null) {
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        if (gVar != h0Var2.h(iG)) {
            t2.h0 h0Var3 = this.f14703c;
            if (h0Var3 != null) {
                return h0Var3.g(i10);
            }
            kotlin.jvm.internal.r.h("layoutResult");
            throw null;
        }
        if (this.f14703c != null) {
            return r6.f27820b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.r.h("layoutResult");
        throw null;
    }
}
