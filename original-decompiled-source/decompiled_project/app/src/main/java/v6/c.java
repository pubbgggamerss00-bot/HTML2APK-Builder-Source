package v6;

import a7.p;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.model.WorkSpec;
import c7.i0;
import c7.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import ph.s1;
import t6.c0;
import t6.s;
import u6.r;
import u6.s0;
import u6.t;
import u6.x;
import u6.y;
import y6.b;
import y6.h;
import y6.l;
import y6.n;

/* loaded from: classes.dex */
public final class c implements t, h, u6.e {

    /* renamed from: q, reason: collision with root package name */
    public static final String f30628q = s.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f30629a;

    /* renamed from: c, reason: collision with root package name */
    public final b f30631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30632d;

    /* renamed from: g, reason: collision with root package name */
    public final r f30635g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f30636h;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.work.a f30637j;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f30639l;

    /* renamed from: m, reason: collision with root package name */
    public final l f30640m;

    /* renamed from: n, reason: collision with root package name */
    public final e7.b f30641n;

    /* renamed from: p, reason: collision with root package name */
    public final e f30642p;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f30630b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f30633e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final y f30634f = new y(new gb.h());

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f30638k = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30643a;

        /* renamed from: b, reason: collision with root package name */
        public final long f30644b;

        public a(int i10, long j10) {
            this.f30643a = i10;
            this.f30644b = j10;
        }
    }

    public c(Context context, androidx.work.a aVar, p pVar, r rVar, s0 s0Var, e7.b bVar) {
        this.f30629a = context;
        u6.d dVar = aVar.f3122g;
        this.f30631c = new b(this, dVar, aVar.f3119d);
        this.f30642p = new e(dVar, s0Var);
        this.f30641n = bVar;
        this.f30640m = new l(pVar);
        this.f30637j = aVar;
        this.f30635g = rVar;
        this.f30636h = s0Var;
    }

    @Override // y6.h
    public final void a(WorkSpec workSpec, y6.b bVar) {
        j jVarA = i0.a(workSpec);
        boolean z10 = bVar instanceof b.a;
        s0 s0Var = this.f30636h;
        e eVar = this.f30642p;
        String str = f30628q;
        y yVar = this.f30634f;
        if (z10) {
            if (yVar.a(jVarA)) {
                return;
            }
            s.d().a(str, "Constraints met: Scheduling work ID " + jVarA);
            x xVarD = yVar.d(jVarA);
            eVar.b(xVarD);
            s0Var.c(xVarD, null);
            return;
        }
        s.d().a(str, "Constraints not met: Cancelling work ID " + jVarA);
        x xVarC = yVar.c(jVarA);
        if (xVarC != null) {
            eVar.a(xVarC);
            s0Var.a(xVarC, ((b.C0345b) bVar).f33960a);
        }
    }

    @Override // u6.e
    public final void b(j jVar, boolean z10) {
        s1 s1Var;
        x xVarC = this.f30634f.c(jVar);
        if (xVarC != null) {
            this.f30642p.a(xVarC);
        }
        synchronized (this.f30633e) {
            s1Var = (s1) this.f30630b.remove(jVar);
        }
        if (s1Var != null) {
            s.d().a(f30628q, "Stopping tracking for " + jVar);
            s1Var.cancel((CancellationException) null);
        }
        if (z10) {
            return;
        }
        synchronized (this.f30633e) {
            this.f30638k.remove(jVar);
        }
    }

    @Override // u6.t
    public final void c(WorkSpec... workSpecArr) {
        long jMax;
        if (this.f30639l == null) {
            this.f30639l = Boolean.valueOf(d7.r.a(this.f30629a, this.f30637j));
        }
        if (!this.f30639l.booleanValue()) {
            s.d().e(f30628q, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f30632d) {
            this.f30635g.a(this);
            this.f30632d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f30634f.a(i0.a(workSpec))) {
                synchronized (this.f30633e) {
                    try {
                        j jVarA = i0.a(workSpec);
                        a aVar = (a) this.f30638k.get(jVarA);
                        if (aVar == null) {
                            int i10 = workSpec.f3177k;
                            this.f30637j.f3119d.getClass();
                            aVar = new a(i10, System.currentTimeMillis());
                            this.f30638k.put(jVarA, aVar);
                        }
                        jMax = (Math.max((workSpec.f3177k - aVar.f30643a) - 5, 0) * 30000) + aVar.f30644b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(workSpec.a(), jMax);
                this.f30637j.f3119d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (workSpec.f3168b == c0.f27994a) {
                    if (jCurrentTimeMillis < jMax2) {
                        b bVar = this.f30631c;
                        if (bVar != null) {
                            u6.d dVar = bVar.f30625b;
                            HashMap map = bVar.f30627d;
                            Runnable runnable = (Runnable) map.remove(workSpec.f3167a);
                            if (runnable != null) {
                                dVar.a(runnable);
                            }
                            v6.a aVar2 = new v6.a(bVar, workSpec);
                            map.put(workSpec.f3167a, aVar2);
                            dVar.b(jMax2 - bVar.f30626c.a(), aVar2);
                        }
                    } else if (workSpec.b()) {
                        t6.e eVar = workSpec.f3176j;
                        if (eVar.f28005d) {
                            s.d().a(f30628q, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (eVar.b()) {
                            s.d().a(f30628q, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.f3167a);
                        }
                    } else if (!this.f30634f.a(i0.a(workSpec))) {
                        s.d().a(f30628q, "Starting work for " + workSpec.f3167a);
                        y yVar = this.f30634f;
                        yVar.getClass();
                        x xVarD = yVar.d(i0.a(workSpec));
                        this.f30642p.b(xVarD);
                        this.f30636h.c(xVarD, null);
                    }
                }
            }
        }
        synchronized (this.f30633e) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f30628q, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WorkSpec workSpec2 = (WorkSpec) it.next();
                        j jVarA2 = i0.a(workSpec2);
                        if (!this.f30630b.containsKey(jVarA2)) {
                            this.f30630b.put(jVarA2, n.a(this.f30640m, workSpec2, this.f30641n.a(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // u6.t
    public final boolean d() {
        return false;
    }

    @Override // u6.t
    public final void e(String str) {
        Runnable runnable;
        if (this.f30639l == null) {
            this.f30639l = Boolean.valueOf(d7.r.a(this.f30629a, this.f30637j));
        }
        boolean zBooleanValue = this.f30639l.booleanValue();
        String str2 = f30628q;
        if (!zBooleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f30632d) {
            this.f30635g.a(this);
            this.f30632d = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        b bVar = this.f30631c;
        if (bVar != null && (runnable = (Runnable) bVar.f30627d.remove(str)) != null) {
            bVar.f30625b.a(runnable);
        }
        for (x xVar : this.f30634f.b(str)) {
            this.f30642p.a(xVar);
            this.f30636h.b(xVar);
        }
    }
}
