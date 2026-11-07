package b6;

/* loaded from: classes.dex */
public final class m {
    public static final long a(h6.b bVar) {
        if (b(bVar) == 0) {
            return -1L;
        }
        h6.d dVarB0 = bVar.B0("SELECT last_insert_rowid()");
        try {
            dVarB0.t0();
            long j10 = dVarB0.getLong(0);
            ch.a.a(dVarB0, null);
            return j10;
        } finally {
        }
    }

    public static final int b(h6.b bVar) {
        h6.d dVarB0 = bVar.B0("SELECT changes()");
        try {
            dVarB0.t0();
            int i10 = (int) dVarB0.getLong(0);
            ch.a.a(dVarB0, null);
            return i10;
        } finally {
        }
    }
}
