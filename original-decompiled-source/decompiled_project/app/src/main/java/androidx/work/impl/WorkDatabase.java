package androidx.work.impl;

import android.content.Context;
import androidx.room.g0;
import androidx.room.x;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import i6.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import t6.b;
import u6.f;
import u6.g;
import u6.h;
import u6.i;
import u6.j;
import u6.k;
import u6.l;
import u6.m;
import u6.n;
import u6.o;
import u6.s;
import u6.v0;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends g0 {
    public static final a Companion = new a();

    public static final class a {
        /* JADX WARN: Type inference failed for: r1v1, types: [u6.e0] */
        public static WorkDatabase a(final Context context, Executor queryExecutor, b clock, boolean z10) {
            g0.a aVarA;
            r.e(context, "context");
            r.e(queryExecutor, "queryExecutor");
            r.e(clock, "clock");
            if (z10) {
                aVarA = new g0.a(context, WorkDatabase.class, null);
                aVarA.f2929i = true;
            } else {
                aVarA = x.a(context, WorkDatabase.class, "androidx.work.workdb");
                aVarA.f2928h = new c.InterfaceC0132c() { // from class: u6.e0
                    @Override // i6.c.InterfaceC0132c
                    public final i6.c a(c.b bVar) {
                        Context context2 = context;
                        kotlin.jvm.internal.r.e(context2, "context");
                        String str = bVar.f14171b;
                        c.a callback = bVar.f14172c;
                        kotlin.jvm.internal.r.e(callback, "callback");
                        if (str == null || str.length() == 0) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new j6.g(context2, str, callback, true, true);
                    }
                };
            }
            aVarA.f2926f = queryExecutor;
            aVarA.f2924d.add(new u6.c(clock));
            aVarA.a(j.f29301a);
            aVarA.a(new s(context, 2, 3));
            aVarA.a(k.f29303a);
            aVarA.a(l.f29304a);
            aVarA.a(new s(context, 5, 6));
            aVarA.a(m.f29305a);
            aVarA.a(n.f29306a);
            aVarA.a(o.f29308a);
            aVarA.a(new v0(context));
            aVarA.a(new s(context, 10, 11));
            aVarA.a(f.f29291a);
            aVarA.a(g.f29295a);
            aVarA.a(h.f29297a);
            aVarA.a(i.f29300a);
            aVarA.a(new s(context, 21, 22));
            aVarA.f2936p = false;
            aVarA.f2937q = true;
            return (WorkDatabase) aVarA.b();
        }
    }

    public static final WorkDatabase create(Context context, Executor executor, b bVar, boolean z10) {
        Companion.getClass();
        return a.a(context, executor, bVar, z10);
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract RawWorkInfoDao rawWorkInfoDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();
}
