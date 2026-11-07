package androidx.room;

/* loaded from: classes.dex */
public abstract class e<T> {
    public abstract void bind(h6.d dVar, T t3);

    public abstract String createQuery();

    public final int handle(h6.b connection, T t3) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (t3 == null) {
            return 0;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            bind(dVarB0, t3);
            dVarB0.t0();
            ch.a.a(dVarB0, null);
            return b6.m.b(connection);
        } finally {
        }
    }

    public final int handleMultiple(h6.b connection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(connection, "connection");
        int iB = 0;
        if (iterable == null) {
            return 0;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            for (T t3 : iterable) {
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                    iB += b6.m.b(connection);
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
            return iB;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(h6.b connection, T[] tArr) {
        kotlin.jvm.internal.r.e(connection, "connection");
        int iB = 0;
        if (tArr == null) {
            return 0;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            kotlin.jvm.internal.b bVarE = f3.f.e(tArr);
            while (bVarE.hasNext()) {
                Object next = bVarE.next();
                if (next != null) {
                    bind(dVarB0, next);
                    dVarB0.t0();
                    dVarB0.reset();
                    iB += b6.m.b(connection);
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
            return iB;
        } finally {
        }
    }
}
