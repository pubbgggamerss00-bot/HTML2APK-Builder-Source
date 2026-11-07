package androidx.room;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f<T> {
    public abstract void bind(h6.d dVar, T t3);

    public abstract String createQuery();

    public final void insert(h6.b connection, T t3) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (t3 == null) {
            return;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            bind(dVarB0, t3);
            dVarB0.t0();
            ch.a.a(dVarB0, null);
        } finally {
        }
    }

    public final long insertAndReturnId(h6.b connection, T t3) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (t3 == null) {
            return -1L;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            bind(dVarB0, t3);
            dVarB0.t0();
            ch.a.a(dVarB0, null);
            return b6.m.a(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(h6.b connection, Collection<? extends T> collection) {
        long jA;
        kotlin.jvm.internal.r.e(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objZ = qg.x.z(collection, i10);
                if (objZ != null) {
                    bind(dVarB0, objZ);
                    dVarB0.t0();
                    dVarB0.reset();
                    jA = b6.m.a(connection);
                } else {
                    jA = -1;
                }
                jArr[i10] = jA;
            }
            ch.a.a(dVarB0, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(h6.b connection, Collection<? extends T> collection) {
        long jA;
        kotlin.jvm.internal.r.e(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objZ = qg.x.z(collection, i10);
                if (objZ != null) {
                    bind(dVarB0, objZ);
                    dVarB0.t0();
                    dVarB0.reset();
                    jA = b6.m.a(connection);
                } else {
                    jA = -1;
                }
                lArr[i10] = Long.valueOf(jA);
            }
            ch.a.a(dVarB0, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(h6.b connection, T[] tArr) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (tArr == null) {
            return qg.z.f22752a;
        }
        rg.b bVarB = c0.g0.b();
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            for (T t3 : tArr) {
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                    bVarB.add(Long.valueOf(b6.m.a(connection)));
                } else {
                    bVarB.add(-1L);
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
            return c0.g0.a(bVarB);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(h6.b connection, T[] tArr) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (tArr == null) {
            return;
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
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(h6.b connection, T[] tArr) {
        long jA;
        kotlin.jvm.internal.r.e(connection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t3 = tArr[i10];
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                    jA = b6.m.a(connection);
                } else {
                    jA = -1;
                }
                jArr[i10] = jA;
            }
            ch.a.a(dVarB0, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(h6.b connection, T[] tArr) {
        long jA;
        kotlin.jvm.internal.r.e(connection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t3 = tArr[i10];
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                    jA = b6.m.a(connection);
                } else {
                    jA = -1;
                }
                lArr[i10] = Long.valueOf(jA);
            }
            ch.a.a(dVarB0, null);
            return lArr;
        } finally {
        }
    }

    public final void insert(h6.b connection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (iterable == null) {
            return;
        }
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            for (T t3 : iterable) {
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(h6.b connection, Collection<? extends T> collection) {
        kotlin.jvm.internal.r.e(connection, "connection");
        if (collection == null) {
            return qg.z.f22752a;
        }
        rg.b bVarB = c0.g0.b();
        h6.d dVarB0 = connection.B0(createQuery());
        try {
            for (T t3 : collection) {
                if (t3 != null) {
                    bind(dVarB0, t3);
                    dVarB0.t0();
                    dVarB0.reset();
                    bVarB.add(Long.valueOf(b6.m.a(connection)));
                } else {
                    bVarB.add(-1L);
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            ch.a.a(dVarB0, null);
            return c0.g0.a(bVarB);
        } finally {
        }
    }
}
