package p5;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p5.s;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21303a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.l f21304b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.e f21305c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f21306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21307e;

    /* renamed from: f, reason: collision with root package name */
    public final c f21308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21309g;

    public class a extends d1 {

        /* renamed from: g, reason: collision with root package name */
        public final b1<? extends k0> f21310g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x f21311h;

        public a(x xVar, b1<? extends k0> navigator) {
            kotlin.jvm.internal.r.e(navigator, "navigator");
            this.f21311h = xVar;
            this.f21310g = navigator;
        }

        @Override // p5.d1
        public final s c(k0 k0Var, Bundle bundle) {
            s5.l lVar = this.f21311h.f21304b;
            lVar.getClass();
            return s.a.a(lVar.f24479a.f21305c, k0Var, bundle, lVar.j(), lVar.f24493o);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        @Override // p5.d1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void f(s entry) {
            y yVar;
            androidx.lifecycle.a1 a1Var;
            kotlin.jvm.internal.r.e(entry, "entry");
            s5.l lVar = this.f21311h.f21304b;
            sh.z0 z0Var = lVar.f24486h;
            String backStackEntryId = entry.f21273f;
            LinkedHashMap linkedHashMap = lVar.f24501w;
            boolean zA = kotlin.jvm.internal.r.a(linkedHashMap.get(entry), Boolean.TRUE);
            super.f(entry);
            pg.f0 f0Var = pg.f0.f21461a;
            linkedHashMap.remove(entry);
            qg.l<s> lVar2 = lVar.f24484f;
            if (lVar2.contains(entry)) {
                if (this.f21200a) {
                    return;
                }
                lVar.u();
                sh.z0 z0Var2 = lVar.f24485g;
                ArrayList arrayListE0 = qg.x.e0(lVar2);
                z0Var2.getClass();
                z0Var2.j(null, arrayListE0);
                ArrayList arrayListR = lVar.r();
                z0Var.getClass();
                z0Var.j(null, arrayListR);
                return;
            }
            lVar.t(entry);
            if (entry.f21275h.f24452j.f2361d.compareTo(l.b.f2321c) >= 0) {
                entry.a(l.b.f2319a);
            }
            if (!lVar2.isEmpty()) {
                Iterator<s> it = lVar2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.r.a(it.next().f21273f, backStackEntryId)) {
                        break;
                    }
                }
                if (!zA) {
                    kotlin.jvm.internal.r.e(backStackEntryId, "backStackEntryId");
                    a1Var = (androidx.lifecycle.a1) yVar.f21314b.remove(backStackEntryId);
                    if (a1Var != null) {
                    }
                }
            } else if (!zA && (yVar = lVar.f24493o) != null) {
                kotlin.jvm.internal.r.e(backStackEntryId, "backStackEntryId");
                a1Var = (androidx.lifecycle.a1) yVar.f21314b.remove(backStackEntryId);
                if (a1Var != null) {
                    a1Var.a();
                }
            }
            lVar.u();
            ArrayList arrayListR2 = lVar.r();
            z0Var.getClass();
            z0Var.j(null, arrayListR2);
        }

        @Override // p5.d1
        public final void g(s sVar, boolean z10) throws Resources.NotFoundException {
            s5.l lVar = this.f21311h.f21304b;
            lVar.getClass();
            b1 b1VarB = lVar.f24497s.b(sVar.f21269b.f21234a);
            lVar.f24501w.put(sVar, Boolean.valueOf(z10));
            if (!b1VarB.equals(this.f21310g)) {
                Object obj = lVar.f24498t.get(b1VarB);
                kotlin.jvm.internal.r.b(obj);
                ((a) obj).g(sVar, z10);
                return;
            }
            s5.h hVar = lVar.f24500v;
            if (hVar != null) {
                hVar.invoke(sVar);
                super.g(sVar, z10);
                pg.f0 f0Var = pg.f0.f21461a;
                return;
            }
            qg.l<s> lVar2 = lVar.f24484f;
            int iIndexOf = lVar2.indexOf(sVar);
            if (iIndexOf < 0) {
                String message = "Ignoring pop of " + sVar + " as it was not found on the current back stack";
                kotlin.jvm.internal.r.e(message, "message");
                Log.i("NavController", message);
                return;
            }
            int i10 = iIndexOf + 1;
            if (i10 != lVar2.f22729c) {
                lVar.o(lVar2.get(i10).f21269b.f21235b.f24511d, true, false);
            }
            s5.l.q(lVar, sVar);
            super.g(sVar, z10);
            pg.f0 f0Var2 = pg.f0.f21461a;
            lVar.f24480b.invoke();
            lVar.b();
        }

        @Override // p5.d1
        public final void i(s entry) {
            kotlin.jvm.internal.r.e(entry, "entry");
            super.i(entry);
            s5.l lVar = this.f21311h.f21304b;
            lVar.getClass();
            if (!lVar.f24484f.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.a(l.b.f2322d);
        }

        @Override // p5.d1
        public final void j(s backStackEntry) {
            kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
            s5.l lVar = this.f21311h.f21304b;
            lVar.getClass();
            b1 b1VarB = lVar.f24497s.b(backStackEntry.f21269b.f21234a);
            if (!b1VarB.equals(this.f21310g)) {
                Object obj = lVar.f24498t.get(b1VarB);
                if (obj == null) {
                    throw new IllegalStateException(b.o.a(new StringBuilder("NavigatorBackStack for "), backStackEntry.f21269b.f21234a, " should already be created").toString());
                }
                ((a) obj).j(backStackEntry);
                return;
            }
            eh.l<? super s, pg.f0> lVar2 = lVar.f24499u;
            if (lVar2 != null) {
                lVar2.invoke(backStackEntry);
                super.j(backStackEntry);
                return;
            }
            String message = "Ignoring add of destination " + backStackEntry.f21269b + " outside of the call to navigate(). ";
            kotlin.jvm.internal.r.e(message, "message");
            Log.i("NavController", message);
        }

        public final void k(s backStackEntry) {
            kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
            super.j(backStackEntry);
        }
    }

    public interface b {
        void a();
    }

    public static final class c extends b.w {
        public c() {
            super(false);
        }

        @Override // b.w
        public final void b() {
            x.this.d();
        }
    }

    public x(Context context) {
        Object next;
        kotlin.jvm.internal.r.e(context, "context");
        this.f21303a = context;
        this.f21304b = new s5.l(this, new b9.o0(this, 1));
        this.f21305c = new s5.e(context);
        Iterator it = lh.l.h(new u(), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f21306d = (Activity) next;
        this.f21308f = new c();
        this.f21309g = true;
        c1 c1Var = this.f21304b.f24497s;
        c1Var.a(new r0(c1Var));
        this.f21304b.f24497s.a(new p5.b(this.f21303a));
        e9.w0.b(new eh.a() { // from class: p5.v
            @Override // eh.a
            public final Object invoke() {
                x xVar = this.f21293a;
                Context context2 = xVar.f21303a;
                c1 navigatorProvider = xVar.f21304b.f24497s;
                kotlin.jvm.internal.r.e(context2, "context");
                kotlin.jvm.internal.r.e(navigatorProvider, "navigatorProvider");
                return new t0();
            }
        });
    }

    public static void c(String route, x xVar) {
        xVar.getClass();
        kotlin.jvm.internal.r.e(route, "route");
        xVar.f21304b.m(route, null);
    }

    public final s a() {
        Object next;
        Iterator it = qg.x.R(this.f21304b.f24484f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((lh.a) lh.l.g(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((s) next).f21269b instanceof o0)) {
                break;
            }
        }
        return (s) next;
    }

    public final void b(eh.l builder, String route) {
        kotlin.jvm.internal.r.e(route, "route");
        kotlin.jvm.internal.r.e(builder, "builder");
        s5.l lVar = this.f21304b;
        lVar.getClass();
        lVar.m(route, x0.a(builder));
    }

    public final boolean d() {
        s5.l lVar = this.f21304b;
        if (!lVar.f24484f.isEmpty()) {
            k0 k0VarH = lVar.h();
            kotlin.jvm.internal.r.b(k0VarH);
            if (lVar.o(k0VarH.f21235b.f24511d, true, false) && lVar.b()) {
                return true;
            }
        }
        return false;
    }
}
