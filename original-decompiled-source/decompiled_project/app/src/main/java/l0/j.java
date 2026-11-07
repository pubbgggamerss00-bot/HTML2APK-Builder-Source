package l0;

import g2.v;
import i2.g1;
import t2.h0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f16626c = new j(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final v f16627a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f16628b;

    public j(v vVar, h0 h0Var) {
        this.f16627a = vVar;
        this.f16628b = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [g2.v] */
    public static j a(j jVar, g1 g1Var, h0 h0Var, int i10) {
        g1 g1Var2 = g1Var;
        if ((i10 & 1) != 0) {
            g1Var2 = jVar.f16627a;
        }
        if ((i10 & 2) != 0) {
            h0Var = jVar.f16628b;
        }
        return new j(g1Var2, h0Var);
    }
}
