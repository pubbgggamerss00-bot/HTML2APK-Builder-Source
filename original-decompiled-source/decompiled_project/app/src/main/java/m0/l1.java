package m0;

/* loaded from: classes.dex */
public final class l1 {
    public static final e3.g a(t2.h0 h0Var, int i10) {
        t2.g0 g0Var = h0Var.f27819a;
        t2.l lVar = h0Var.f27820b;
        if (g0Var.f27809a.f27761b.length() != 0) {
            int iD = lVar.d(i10);
            if ((i10 != 0 && iD == lVar.d(i10 - 1)) || (i10 != g0Var.f27809a.f27761b.length() && iD == lVar.d(i10 + 1))) {
                return h0Var.a(i10);
            }
        }
        return h0Var.h(i10);
    }

    public static final o b(o oVar, o oVar2) {
        int iOrdinal = oVar2.ordinal();
        if (iOrdinal == 0) {
            return o.f17433a;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return o.f17435c;
            }
            throw new pg.l();
        }
        int iOrdinal2 = oVar.ordinal();
        if (iOrdinal2 == 0) {
            return o.f17433a;
        }
        if (iOrdinal2 == 1) {
            return o.f17434b;
        }
        if (iOrdinal2 == 2) {
            return o.f17435c;
        }
        throw new pg.l();
    }
}
