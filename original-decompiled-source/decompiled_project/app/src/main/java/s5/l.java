package s5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import b9.o0;
import c0.g0;
import f9.fh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.u;
import lh.o;
import p.i0;
import p5.b1;
import p5.c1;
import p5.d1;
import p5.k0;
import p5.n0;
import p5.s;
import p5.u0;
import p5.x;
import p5.x0;
import p5.y;
import p5.y0;
import pg.f0;
import qg.z;
import sh.a1;
import sh.l0;
import sh.q0;
import sh.z0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final x f24479a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f24480b;

    /* renamed from: c, reason: collision with root package name */
    public p5.o0 f24481c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f24482d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f24483e;

    /* renamed from: f, reason: collision with root package name */
    public final qg.l<s> f24484f = new qg.l<>();

    /* renamed from: g, reason: collision with root package name */
    public final z0 f24485g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f24486h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f24487i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f24488j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f24489k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f24490l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f24491m;

    /* renamed from: n, reason: collision with root package name */
    public t f24492n;

    /* renamed from: o, reason: collision with root package name */
    public y f24493o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f24494p;

    /* renamed from: q, reason: collision with root package name */
    public l.b f24495q;

    /* renamed from: r, reason: collision with root package name */
    public final g f24496r;

    /* renamed from: s, reason: collision with root package name */
    public final c1 f24497s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f24498t;

    /* renamed from: u, reason: collision with root package name */
    public eh.l<? super s, f0> f24499u;

    /* renamed from: v, reason: collision with root package name */
    public h f24500v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f24501w;

    /* renamed from: x, reason: collision with root package name */
    public int f24502x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f24503y;

    /* renamed from: z, reason: collision with root package name */
    public final sh.o0 f24504z;

    /* JADX WARN: Type inference failed for: r2v11, types: [s5.g] */
    public l(x xVar, o0 o0Var) {
        this.f24479a = xVar;
        this.f24480b = o0Var;
        z zVar = z.f22752a;
        this.f24485g = a1.a(zVar);
        z0 z0VarA = a1.a(zVar);
        this.f24486h = z0VarA;
        this.f24487i = gg.a.a(z0VarA);
        this.f24488j = new LinkedHashMap();
        this.f24489k = new LinkedHashMap();
        this.f24490l = new LinkedHashMap();
        this.f24491m = new LinkedHashMap();
        this.f24494p = new ArrayList();
        this.f24495q = l.b.f2320b;
        this.f24496r = new androidx.lifecycle.r() { // from class: s5.g
            @Override // androidx.lifecycle.r
            public final void l(t tVar, l.a aVar) {
                l.b bVarA = aVar.a();
                l lVar = this.f24466a;
                lVar.f24495q = bVarA;
                if (lVar.f24481c != null) {
                    ArrayList arrayListE0 = qg.x.e0(lVar.f24484f);
                    int size = arrayListE0.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListE0.get(i10);
                        i10++;
                        s sVar = (s) obj;
                        sVar.getClass();
                        c cVar = sVar.f21275h;
                        cVar.getClass();
                        cVar.f24446d = aVar.a();
                        cVar.b();
                    }
                }
            }
        };
        this.f24497s = new c1();
        this.f24498t = new LinkedHashMap();
        this.f24501w = new LinkedHashMap();
        this.f24503y = new ArrayList();
        this.f24504z = q0.b(0, 2, rh.a.f23577b);
    }

    public static k0 e(int i10, k0 k0Var, k0 k0Var2, boolean z10) {
        if (k0Var.f21235b.f24511d == i10 && (k0Var2 == null || (k0Var.equals(k0Var2) && kotlin.jvm.internal.r.a(k0Var.f21236c, k0Var2.f21236c)))) {
            return k0Var;
        }
        p5.o0 o0Var = k0Var instanceof p5.o0 ? (p5.o0) k0Var : null;
        if (o0Var == null) {
            o0Var = k0Var.f21236c;
            kotlin.jvm.internal.r.b(o0Var);
        }
        return o0Var.f21253f.c(i10, o0Var, k0Var2, z10);
    }

    public static /* synthetic */ void q(l lVar, s sVar) {
        lVar.p(sVar, false, new qg.l<>());
    }

    public final void a(k0 k0Var, Bundle bundle, s sVar, List<s> list) {
        s sVarPrevious;
        s sVarPrevious2;
        e eVar = this.f24479a.f21305c;
        k0 k0Var2 = sVar.f21269b;
        boolean z10 = k0Var2 instanceof p5.i;
        qg.l<s> lVar = this.f24484f;
        if (!z10) {
            while (!lVar.isEmpty() && (lVar.last().f21269b instanceof p5.i) && o(lVar.last().f21269b.f21235b.f24511d, true, false)) {
            }
        }
        qg.l lVar2 = new qg.l();
        s sVar2 = null;
        if (k0Var instanceof p5.o0) {
            k0 k0Var3 = k0Var2;
            do {
                kotlin.jvm.internal.r.b(k0Var3);
                k0Var3 = k0Var3.f21236c;
                if (k0Var3 != null) {
                    ListIterator<s> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            sVarPrevious2 = null;
                            break;
                        } else {
                            sVarPrevious2 = listIterator.previous();
                            if (kotlin.jvm.internal.r.a(sVarPrevious2.f21269b, k0Var3)) {
                                break;
                            }
                        }
                    }
                    s sVarA = sVarPrevious2;
                    if (sVarA == null) {
                        sVarA = s.a.a(eVar, k0Var3, bundle, j(), this.f24493o);
                    }
                    lVar2.addFirst(sVarA);
                    if (!lVar.isEmpty() && lVar.last().f21269b == k0Var3) {
                        q(this, lVar.last());
                    }
                }
                if (k0Var3 == null) {
                    break;
                }
            } while (k0Var3 != k0Var);
        }
        k0 k0Var4 = lVar2.isEmpty() ? k0Var2 : ((s) lVar2.first()).f21269b;
        while (k0Var4 != null && d(k0Var4.f21235b.f24511d, k0Var4) != k0Var4) {
            k0Var4 = k0Var4.f21236c;
            if (k0Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<s> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        sVarPrevious = null;
                        break;
                    } else {
                        sVarPrevious = listIterator2.previous();
                        if (kotlin.jvm.internal.r.a(sVarPrevious.f21269b, k0Var4)) {
                            break;
                        }
                    }
                }
                s sVarA2 = sVarPrevious;
                if (sVarA2 == null) {
                    sVarA2 = s.a.a(eVar, k0Var4, k0Var4.c(bundle2), j(), this.f24493o);
                }
                lVar2.addFirst(sVarA2);
            }
        }
        if (!lVar2.isEmpty()) {
            k0Var2 = ((s) lVar2.first()).f21269b;
        }
        while (!lVar.isEmpty() && (lVar.last().f21269b instanceof p5.o0)) {
            k0 k0Var5 = lVar.last().f21269b;
            kotlin.jvm.internal.r.c(k0Var5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((p5.o0) k0Var5).f21253f.f24518b.c(k0Var2.f21235b.f24511d) != null) {
                break;
            } else {
                q(this, lVar.last());
            }
        }
        s sVarI = lVar.i();
        if (sVarI == null) {
            sVarI = (s) lVar2.i();
        }
        if (!kotlin.jvm.internal.r.a(sVarI != null ? sVarI.f21269b : null, this.f24481c)) {
            ListIterator<s> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                s sVarPrevious3 = listIterator3.previous();
                k0 k0Var6 = sVarPrevious3.f21269b;
                p5.o0 o0Var = this.f24481c;
                kotlin.jvm.internal.r.b(o0Var);
                if (kotlin.jvm.internal.r.a(k0Var6, o0Var)) {
                    sVar2 = sVarPrevious3;
                    break;
                }
            }
            s sVarA3 = sVar2;
            if (sVarA3 == null) {
                p5.o0 o0Var2 = this.f24481c;
                kotlin.jvm.internal.r.b(o0Var2);
                p5.o0 o0Var3 = this.f24481c;
                kotlin.jvm.internal.r.b(o0Var3);
                sVarA3 = s.a.a(eVar, o0Var2, o0Var3.c(bundle), j(), this.f24493o);
            }
            lVar2.addFirst(sVarA3);
        }
        Iterator<E> it = lVar2.iterator();
        while (it.hasNext()) {
            s sVar3 = (s) it.next();
            Object obj = this.f24498t.get(this.f24497s.b(sVar3.f21269b.f21234a));
            if (obj == null) {
                throw new IllegalStateException(b.o.a(new StringBuilder("NavigatorBackStack for "), k0Var.f21234a, " should already be created").toString());
            }
            ((x.a) obj).k(sVar3);
        }
        lVar.addAll(lVar2);
        lVar.addLast(sVar);
        ArrayList arrayListP = qg.x.P(sVar, lVar2);
        int size = arrayListP.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayListP.get(i10);
            i10++;
            s sVar4 = (s) obj2;
            p5.o0 o0Var4 = sVar4.f21269b.f21236c;
            if (o0Var4 != null) {
                l(sVar4, f(o0Var4.f21235b.f24511d));
            }
        }
    }

    public final boolean b() {
        qg.l<s> lVar;
        while (true) {
            lVar = this.f24484f;
            if (lVar.isEmpty() || !(lVar.last().f21269b instanceof p5.o0)) {
                break;
            }
            q(this, lVar.last());
        }
        s sVarK = lVar.k();
        ArrayList arrayList = this.f24503y;
        if (sVarK != null) {
            arrayList.add(sVarK);
        }
        this.f24502x++;
        u();
        int i10 = this.f24502x - 1;
        this.f24502x = i10;
        if (i10 == 0) {
            ArrayList arrayListE0 = qg.x.e0(arrayList);
            arrayList.clear();
            int size = arrayListE0.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListE0.get(i11);
                i11++;
                s sVar = (s) obj;
                ArrayList arrayList2 = this.f24494p;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    k0 k0Var = sVar.f21269b;
                    sVar.f21275h.a();
                    ((x.b) obj2).a();
                }
                this.f24504z.r(sVar);
            }
            ArrayList arrayListE02 = qg.x.e0(lVar);
            z0 z0Var = this.f24485g;
            z0Var.getClass();
            z0Var.j(null, arrayListE02);
            ArrayList arrayListR = r();
            z0 z0Var2 = this.f24486h;
            z0Var2.getClass();
            z0Var2.j(null, arrayListR);
        }
        return sVarK != null;
    }

    public final boolean c(ArrayList arrayList, k0 k0Var, boolean z10, boolean z11) {
        l lVar;
        boolean z12;
        b0 b0Var = new b0();
        qg.l lVar2 = new qg.l();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lVar = this;
                z12 = z11;
                break;
            }
            int i11 = i10 + 1;
            b1 navigator = (b1) arrayList.get(i10);
            b0 b0Var2 = new b0();
            s popUpTo = this.f24484f.last();
            lVar = this;
            z12 = z11;
            h hVar = new h(b0Var2, b0Var, lVar, z12, lVar2);
            kotlin.jvm.internal.r.e(navigator, "navigator");
            kotlin.jvm.internal.r.e(popUpTo, "popUpTo");
            lVar.f24500v = hVar;
            navigator.e(popUpTo, z12);
            lVar.f24500v = null;
            if (!b0Var2.f16318a) {
                break;
            }
            z11 = z12;
            i10 = i11;
        }
        if (z12) {
            LinkedHashMap linkedHashMap = lVar.f24490l;
            if (!z10) {
                int i12 = 1;
                o.a aVar = new o.a(new lh.o(lh.l.h(new com.basitce.htmltoapk.data.local.dao.e(i12), k0Var), new fh(this, i12)));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((k0) aVar.next()).f21235b.f24511d);
                    p5.t tVar = (p5.t) lVar2.i();
                    linkedHashMap.put(numValueOf, tVar != null ? tVar.f21276a.f24457a : null);
                }
            }
            if (!lVar2.isEmpty()) {
                d dVar = ((p5.t) lVar2.first()).f21276a;
                o.a aVar2 = new o.a(new lh.o(lh.l.h(new u(1), d(dVar.f24458b, null)), new eh.l() { // from class: s5.i
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        k0 destination = (k0) obj;
                        kotlin.jvm.internal.r.e(destination, "destination");
                        return Boolean.valueOf(!this.f24472a.f24490l.containsKey(Integer.valueOf(destination.f21235b.f24511d)));
                    }
                }));
                while (aVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((k0) aVar2.next()).f21235b.f24511d), dVar.f24457a);
                }
                if (linkedHashMap.values().contains(dVar.f24457a)) {
                    lVar.f24491m.put(dVar.f24457a, lVar2);
                }
            }
        }
        lVar.f24480b.invoke();
        return b0Var.f16318a;
    }

    public final k0 d(int i10, k0 k0Var) {
        k0 k0Var2;
        p5.o0 o0Var = this.f24481c;
        if (o0Var == null) {
            return null;
        }
        if (o0Var.f21235b.f24511d == i10) {
            if (k0Var == null) {
                return o0Var;
            }
            if (kotlin.jvm.internal.r.a(o0Var, k0Var) && k0Var.f21236c == null) {
                return this.f24481c;
            }
        }
        s sVarK = this.f24484f.k();
        if (sVarK == null || (k0Var2 = sVarK.f21269b) == null) {
            k0Var2 = this.f24481c;
            kotlin.jvm.internal.r.b(k0Var2);
        }
        return e(i10, k0Var2, k0Var, false);
    }

    public final s f(int i10) {
        s sVarPrevious;
        qg.l<s> lVar = this.f24484f;
        ListIterator<s> listIterator = lVar.listIterator(lVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                sVarPrevious = null;
                break;
            }
            sVarPrevious = listIterator.previous();
            if (sVarPrevious.f21269b.f21235b.f24511d == i10) {
                break;
            }
        }
        s sVar = sVarPrevious;
        if (sVar != null) {
            return sVar;
        }
        StringBuilder sbB = i0.b(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbB.append(h());
        throw new IllegalArgumentException(sbB.toString().toString());
    }

    public final s g() {
        return this.f24484f.k();
    }

    public final k0 h() {
        s sVarG = g();
        if (sVarG != null) {
            return sVarG.f21269b;
        }
        return null;
    }

    public final p5.o0 i() {
        p5.o0 o0Var = this.f24481c;
        if (o0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.r.c(o0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return o0Var;
    }

    public final l.b j() {
        return this.f24492n == null ? l.b.f2321c : this.f24495q;
    }

    public final p5.o0 k() {
        k0 k0Var;
        s sVarK = this.f24484f.k();
        if (sVarK == null || (k0Var = sVarK.f21269b) == null) {
            k0Var = this.f24481c;
            kotlin.jvm.internal.r.b(k0Var);
        }
        p5.o0 o0Var = k0Var instanceof p5.o0 ? (p5.o0) k0Var : null;
        if (o0Var != null) {
            return o0Var;
        }
        p5.o0 o0Var2 = k0Var.f21236c;
        kotlin.jvm.internal.r.b(o0Var2);
        return o0Var2;
    }

    public final void l(s sVar, s sVar2) {
        this.f24488j.put(sVar, sVar2);
        LinkedHashMap linkedHashMap = this.f24489k;
        if (linkedHashMap.get(sVar2) == null) {
            linkedHashMap.put(sVar2, new a());
        }
        Object obj = linkedHashMap.get(sVar2);
        kotlin.jvm.internal.r.b(obj);
        ((a) obj).f24442a.incrementAndGet();
    }

    public final void m(String route, u0 u0Var) throws Resources.NotFoundException {
        kotlin.jvm.internal.r.e(route, "route");
        if (this.f24481c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        p5.o0 o0VarK = k();
        k0.b bVarI = o0VarK.i(route, true, o0VarK);
        if (bVarI == null) {
            StringBuilder sbA = e.e.a("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbA.append(this.f24481c);
            throw new IllegalArgumentException(sbA.toString());
        }
        k0 k0Var = bVarI.f21238a;
        Bundle bundleC = k0Var.c(bVarI.f21239b);
        if (bundleC == null) {
            bundleC = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        }
        int i10 = k0.f21233e;
        String str = k0Var.f21235b.f24512e;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : "";
        kotlin.jvm.internal.r.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.r.d(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        n(k0Var, bundleC, u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x010f A[EDGE_INSN: B:167:0x010f->B:60:0x010f BREAK  A[LOOP:1: B:14:0x0052->B:58:0x010b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b A[LOOP:1: B:14:0x0052->B:58:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final k0 node, Bundle bundle, u0 u0Var) throws Resources.NotFoundException {
        boolean zO;
        boolean z10;
        boolean z11;
        int iNextIndex;
        k0 k0Var;
        int iNextIndex2;
        s sVarPrevious;
        boolean z12;
        Bundle bundle2;
        Object objA;
        kotlin.jvm.internal.r.e(node, "node");
        Iterator it = this.f24498t.values().iterator();
        while (it.hasNext()) {
            ((x.a) it.next()).f21200a = true;
        }
        final b0 b0Var = new b0();
        if (u0Var == null) {
            zO = false;
        } else {
            String route = u0Var.f21286j;
            if (route != null) {
                boolean z13 = u0Var.f21280d;
                boolean z14 = u0Var.f21281e;
                kotlin.jvm.internal.r.e(route, "route");
                qg.l<s> lVar = this.f24484f;
                if (!lVar.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ListIterator<s> listIterator = lVar.listIterator(lVar.c());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            sVarPrevious = null;
                            break;
                        }
                        sVarPrevious = listIterator.previous();
                        s sVar = sVarPrevious;
                        k0 k0Var2 = sVar.f21269b;
                        Bundle bundleA = sVar.f21275h.a();
                        k0Var2.getClass();
                        o oVar = k0Var2.f21235b;
                        oVar.getClass();
                        if (kotlin.jvm.internal.r.a(oVar.f24512e, route)) {
                            z12 = true;
                            if (z13 || !z12) {
                                arrayList.add(this.f24497s.b(sVar.f21269b.f21234a));
                            }
                            if (!z12) {
                                break;
                            }
                        } else {
                            k0.b bVarA = oVar.a(route);
                            if (oVar.f24508a.equals(bVarA != null ? bVarA.f21238a : null)) {
                                Bundle bundle3 = bVarA.f21239b;
                                if (bundleA != null && bundle3 != null) {
                                    Set<String> setKeySet = bundle3.keySet();
                                    kotlin.jvm.internal.r.d(setKeySet, "keySet(...)");
                                    Iterator it2 = setKeySet.iterator();
                                    while (it2.hasNext()) {
                                        String str = (String) it2.next();
                                        kotlin.jvm.internal.r.b(str);
                                        if (bundleA.containsKey(str)) {
                                            Iterator it3 = it2;
                                            p5.q qVar = bVarA.f21238a.e().get(str);
                                            y0<Object> y0Var = qVar != null ? qVar.f21257a : null;
                                            if (y0Var != null) {
                                                bundle2 = bundle3;
                                                objA = y0Var.a(bundle3, str);
                                            } else {
                                                bundle2 = bundle3;
                                                objA = null;
                                            }
                                            Object objA2 = y0Var != null ? y0Var.a(bundleA, str) : null;
                                            if (y0Var == null || y0Var.f(objA, objA2)) {
                                                it2 = it3;
                                                bundle3 = bundle2;
                                            }
                                        }
                                    }
                                    z12 = true;
                                    if (z13) {
                                        arrayList.add(this.f24497s.b(sVar.f21269b.f21234a));
                                        if (!z12) {
                                        }
                                    }
                                }
                            }
                            z12 = false;
                            if (z13) {
                            }
                        }
                    }
                    s sVar2 = sVarPrevious;
                    k0 k0Var3 = sVar2 != null ? sVar2.f21269b : null;
                    if (k0Var3 == null) {
                        String message = "Ignoring popBackStack to route " + route + " as it was not found on the current back stack";
                        kotlin.jvm.internal.r.e(message, "message");
                        Log.i("NavController", message);
                        zO = false;
                    } else {
                        zO = c(arrayList, k0Var3, z13, z14);
                    }
                }
            } else {
                int i10 = u0Var.f21279c;
                if (i10 != -1) {
                    zO = o(i10, u0Var.f21280d, u0Var.f21281e);
                }
            }
        }
        final Bundle bundleC = node.c(bundle);
        if (u0Var != null && u0Var.f21278b && this.f24490l.containsKey(Integer.valueOf(node.f21235b.f24511d))) {
            b0Var.f16318a = s(node.f21235b.f24511d, bundleC, u0Var);
            z11 = false;
        } else if (u0Var == null || !u0Var.f21277a) {
            z10 = false;
            if (!z10) {
                s sVarA = s.a.a(this.f24479a.f21305c, node, bundleC, j(), this.f24493o);
                b1 b1VarB = this.f24497s.b(node.f21234a);
                List listC = g0.c(sVarA);
                this.f24499u = new eh.l() { // from class: s5.f
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        s it4 = (s) obj;
                        kotlin.jvm.internal.r.e(it4, "it");
                        b0Var.f16318a = true;
                        this.a(node, bundleC, it4, z.f22752a);
                        return f0.f21461a;
                    }
                };
                b1VarB.d(listC, u0Var);
                this.f24499u = null;
            }
            z11 = z10;
        } else {
            s sVarG = g();
            qg.l<s> lVar2 = this.f24484f;
            ListIterator<s> listIterator2 = lVar2.listIterator(lVar2.c());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (listIterator2.previous().f21269b == node) {
                    iNextIndex = listIterator2.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1) {
                if (node instanceof p5.o0) {
                    int i11 = p5.o0.f21252g;
                    List listK = lh.j.k(new lh.p(lh.l.h(new n0(), (p5.o0) node), new com.basitce.htmltoapk.data.local.dao.j(1)));
                    if (this.f24484f.f22729c - iNextIndex == listK.size()) {
                        qg.l<s> lVar3 = this.f24484f;
                        List<s> listSubList = lVar3.subList(iNextIndex, lVar3.f22729c);
                        ArrayList arrayList2 = new ArrayList(qg.p.h(listSubList, 10));
                        Iterator<T> it4 = listSubList.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Integer.valueOf(((s) it4.next()).f21269b.f21235b.f24511d));
                        }
                        if (arrayList2.equals(listK)) {
                            qg.l lVar4 = new qg.l();
                            while (qg.p.i(this.f24484f) >= iNextIndex) {
                                s sVar3 = (s) qg.t.t(this.f24484f);
                                t(sVar3);
                                s sVar4 = new s(sVar3.f21268a, sVar3.f21269b, sVar3.f21269b.c(bundle), sVar3.f21271d, sVar3.f21272e, sVar3.f21273f, sVar3.f21274g);
                                c cVar = sVar4.f21275h;
                                l.b bVar = sVar3.f21271d;
                                cVar.getClass();
                                kotlin.jvm.internal.r.e(bVar, "<set-?>");
                                cVar.f24446d = bVar;
                                c cVar2 = sVar4.f21275h;
                                l.b maxState = sVar3.f21275h.f24453k;
                                cVar2.getClass();
                                kotlin.jvm.internal.r.e(maxState, "maxState");
                                cVar2.f24453k = maxState;
                                cVar2.b();
                                lVar4.addFirst(sVar4);
                            }
                            Iterator<E> it5 = lVar4.iterator();
                            while (it5.hasNext()) {
                                s sVar5 = (s) it5.next();
                                p5.o0 o0Var = sVar5.f21269b.f21236c;
                                if (o0Var != null) {
                                    l(sVar5, f(o0Var.f21235b.f24511d));
                                }
                                this.f24484f.addLast(sVar5);
                            }
                            Iterator<E> it6 = lVar4.iterator();
                            while (it6.hasNext()) {
                                s sVar6 = (s) it6.next();
                                b1 b1VarB2 = this.f24497s.b(sVar6.f21269b.f21234a);
                                k0 k0Var4 = sVar6.f21269b;
                                if (k0Var4 == null) {
                                    k0Var4 = null;
                                }
                                if (k0Var4 != null) {
                                    x0.a(new p5.a1(0));
                                    b1VarB2.c(k0Var4);
                                    d1 d1VarB = b1VarB2.b();
                                    synchronized (((r) d1VarB.f21201b)) {
                                        try {
                                            ArrayList arrayListE0 = qg.x.e0((Collection) ((l0) d1VarB.f21204e).f25021a.getValue());
                                            ListIterator listIterator3 = arrayListE0.listIterator(arrayListE0.size());
                                            while (true) {
                                                if (!listIterator3.hasPrevious()) {
                                                    iNextIndex2 = -1;
                                                    break;
                                                } else if (kotlin.jvm.internal.r.a(((s) listIterator3.previous()).f21273f, sVar6.f21273f)) {
                                                    iNextIndex2 = listIterator3.nextIndex();
                                                    break;
                                                }
                                            }
                                            arrayListE0.set(iNextIndex2, sVar6);
                                            z0 z0Var = (z0) d1VarB.f21202c;
                                            z0Var.getClass();
                                            z0Var.j(null, arrayListE0);
                                            f0 f0Var = f0.f21461a;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                            z10 = true;
                        }
                    }
                    z10 = false;
                } else if (sVarG == null || (k0Var = sVarG.f21269b) == null || node.f21235b.f24511d != k0Var.f21235b.f24511d) {
                }
                if (!z10) {
                }
                z11 = z10;
            }
        }
        this.f24480b.invoke();
        Iterator it7 = this.f24498t.values().iterator();
        while (it7.hasNext()) {
            ((x.a) it7.next()).f21200a = false;
        }
        if (zO || b0Var.f16318a || z11) {
            b();
        } else {
            u();
        }
    }

    public final boolean o(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        k0 k0Var;
        qg.l<s> lVar = this.f24484f;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = qg.x.R(lVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                k0Var = null;
                break;
            }
            k0Var = ((s) it.next()).f21269b;
            String str = k0Var.f21234a;
            o oVar = k0Var.f21235b;
            b1 b1VarB = this.f24497s.b(str);
            if (z10 || oVar.f24511d != i10) {
                arrayList.add(b1VarB);
            }
            if (oVar.f24511d == i10) {
                break;
            }
        }
        if (k0Var != null) {
            return c(arrayList, k0Var, z10, z11);
        }
        int i11 = k0.f21233e;
        String message = "Ignoring popBackStack to destination " + k0.a.a(this.f24479a.f21305c, i10) + " as it was not found on the current back stack";
        kotlin.jvm.internal.r.e(message, "message");
        Log.i("NavController", message);
        return false;
    }

    public final void p(s popUpTo, boolean z10, qg.l<p5.t> lVar) {
        y yVar;
        l0 l0Var;
        Set set;
        kotlin.jvm.internal.r.e(popUpTo, "popUpTo");
        qg.l<s> lVar2 = this.f24484f;
        s sVarLast = lVar2.last();
        if (!kotlin.jvm.internal.r.a(sVarLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f21269b + ", which is not the top of the back stack (" + sVarLast.f21269b + ')').toString());
        }
        qg.t.t(lVar2);
        x.a aVar = (x.a) this.f24498t.get(this.f24497s.b(sVarLast.f21269b.f21234a));
        boolean z11 = true;
        if ((aVar == null || (l0Var = (l0) aVar.f21205f) == null || (set = (Set) l0Var.f25021a.getValue()) == null || !set.contains(sVarLast)) && !this.f24489k.containsKey(sVarLast)) {
            z11 = false;
        }
        l.b bVar = sVarLast.f21275h.f24452j.f2361d;
        l.b bVar2 = l.b.f2321c;
        if (bVar.compareTo(bVar2) >= 0) {
            if (z10) {
                sVarLast.a(bVar2);
                lVar.addFirst(new p5.t(sVarLast));
            }
            if (z11) {
                sVarLast.a(bVar2);
            } else {
                sVarLast.a(l.b.f2319a);
                t(sVarLast);
            }
        }
        if (z10 || z11 || (yVar = this.f24493o) == null) {
            return;
        }
        String backStackEntryId = sVarLast.f21273f;
        kotlin.jvm.internal.r.e(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.a1 a1Var = (androidx.lifecycle.a1) yVar.f21314b.remove(backStackEntryId);
        if (a1Var != null) {
            a1Var.a();
        }
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f24498t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((l0) ((x.a) it.next()).f21205f).f25021a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                s sVar = (s) obj;
                if (!arrayList.contains(sVar) && sVar.f21275h.f24453k.compareTo(l.b.f2322d) < 0) {
                    arrayList2.add(obj);
                }
            }
            qg.t.p(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<s> it2 = this.f24484f.iterator();
        while (it2.hasNext()) {
            s next = it2.next();
            s sVar2 = next;
            if (!arrayList.contains(sVar2) && sVar2.f21275h.f24453k.compareTo(l.b.f2322d) >= 0) {
                arrayList3.add(next);
            }
        }
        qg.t.p(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (!(((s) obj2).f21269b instanceof p5.o0)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i10, final Bundle bundle, u0 u0Var) throws Resources.NotFoundException {
        k0 k0VarI;
        s sVar;
        k0 k0Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f24490l;
        int i11 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.r.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.r.a((String) it.next(), str)) {
                it.remove();
            }
        }
        qg.l lVar = (qg.l) m0.a(this.f24491m).remove(str);
        e context = this.f24479a.f21305c;
        ArrayList arrayList = new ArrayList();
        s sVarK = this.f24484f.k();
        if (sVarK == null || (k0VarI = sVarK.f21269b) == null) {
            k0VarI = i();
        }
        if (lVar != null) {
            Iterator<E> it2 = lVar.iterator();
            while (it2.hasNext()) {
                p5.t tVar = (p5.t) it2.next();
                d dVar = tVar.f21276a;
                d dVar2 = tVar.f21276a;
                k0 k0VarE = e(dVar.f24458b, k0VarI, null, true);
                if (k0VarE == null) {
                    int i12 = k0.f21233e;
                    throw new IllegalStateException(("Restore State failed: destination " + k0.a.a(context, dVar2.f24458b) + " cannot be found from the current destination " + k0VarI).toString());
                }
                l.b hostLifecycleState = j();
                y yVar = this.f24493o;
                kotlin.jvm.internal.r.e(context, "context");
                kotlin.jvm.internal.r.e(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = dVar2.f24459c;
                if (bundle3 != null) {
                    Context context2 = context.f24461a;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id2 = dVar2.f24457a;
                Bundle bundle4 = dVar2.f24460d;
                kotlin.jvm.internal.r.e(id2, "id");
                arrayList.add(new s(context, k0VarE, bundle2, hostLifecycleState, yVar, id2, bundle4));
                k0VarI = k0VarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            if (!(((s) obj).f21269b instanceof p5.o0)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            s sVar2 = (s) obj2;
            List list = (List) qg.x.K(arrayList2);
            if (kotlin.jvm.internal.r.a((list == null || (sVar = (s) qg.x.J(list)) == null || (k0Var = sVar.f21269b) == null) ? null : k0Var.f21234a, sVar2.f21269b.f21234a)) {
                list.add(sVar2);
            } else {
                arrayList2.add(qg.p.k(sVar2));
            }
        }
        final b0 b0Var = new b0();
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            List list2 = (List) obj3;
            b1 b1VarB = this.f24497s.b(((s) qg.x.B(list2)).f21269b.f21234a);
            final e0 e0Var = new e0();
            final ArrayList arrayList4 = arrayList;
            this.f24499u = new eh.l() { // from class: s5.k
                @Override // eh.l
                public final Object invoke(Object obj4) {
                    List<s> listSubList;
                    s entry = (s) obj4;
                    kotlin.jvm.internal.r.e(entry, "entry");
                    b0Var.f16318a = true;
                    ArrayList arrayList5 = arrayList4;
                    int iIndexOf = arrayList5.indexOf(entry);
                    if (iIndexOf != -1) {
                        e0 e0Var2 = e0Var;
                        int i15 = iIndexOf + 1;
                        listSubList = arrayList5.subList(e0Var2.f16324a, i15);
                        e0Var2.f16324a = i15;
                    } else {
                        listSubList = z.f22752a;
                    }
                    this.a(entry.f21269b, bundle, entry, listSubList);
                    return f0.f21461a;
                }
            };
            b1VarB.d(list2, u0Var);
            this.f24499u = null;
            arrayList = arrayList4;
        }
        return b0Var.f16318a;
    }

    public final void t(s child) {
        kotlin.jvm.internal.r.e(child, "child");
        s sVar = (s) this.f24488j.remove(child);
        if (sVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f24489k;
        a aVar = (a) linkedHashMap.get(sVar);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f24442a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            x.a aVar2 = (x.a) this.f24498t.get(this.f24497s.b(sVar.f21269b.f21234a));
            if (aVar2 != null) {
                aVar2.f(sVar);
            }
            linkedHashMap.remove(sVar);
        }
    }

    public final void u() {
        a aVar;
        l0 l0Var;
        Set set;
        ArrayList arrayListE0 = qg.x.e0(this.f24484f);
        if (arrayListE0.isEmpty()) {
            return;
        }
        ArrayList arrayListK = qg.p.k(((s) qg.x.J(arrayListE0)).f21269b);
        ArrayList arrayList = new ArrayList();
        if (qg.x.J(arrayListK) instanceof p5.i) {
            Iterator it = qg.x.R(arrayListE0).iterator();
            while (it.hasNext()) {
                k0 k0Var = ((s) it.next()).f21269b;
                arrayList.add(k0Var);
                if (!(k0Var instanceof p5.i) && !(k0Var instanceof p5.o0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (s sVar : qg.x.R(arrayListE0)) {
            l.b bVar = sVar.f21275h.f24453k;
            k0 k0Var2 = sVar.f21269b;
            k0 k0Var3 = (k0) qg.x.D(arrayListK);
            if (k0Var3 != null && k0Var3.f21235b.f24511d == k0Var2.f21235b.f24511d) {
                l.b bVar2 = l.b.f2323e;
                if (bVar != bVar2) {
                    x.a aVar2 = (x.a) this.f24498t.get(this.f24497s.b(sVar.f21269b.f21234a));
                    if (kotlin.jvm.internal.r.a((aVar2 == null || (l0Var = (l0) aVar2.f21205f) == null || (set = (Set) l0Var.f25021a.getValue()) == null) ? null : Boolean.valueOf(set.contains(sVar)), Boolean.TRUE) || ((aVar = (a) this.f24489k.get(sVar)) != null && aVar.f24442a.get() == 0)) {
                        map.put(sVar, l.b.f2322d);
                    } else {
                        map.put(sVar, bVar2);
                    }
                }
                k0 k0Var4 = (k0) qg.x.D(arrayList);
                if (k0Var4 != null && k0Var4.f21235b.f24511d == k0Var2.f21235b.f24511d) {
                    qg.t.s(arrayList);
                }
                qg.t.s(arrayListK);
                p5.o0 o0Var = k0Var2.f21236c;
                if (o0Var != null) {
                    arrayListK.add(o0Var);
                }
            } else if (arrayList.isEmpty() || k0Var2.f21235b.f24511d != ((k0) qg.x.B(arrayList)).f21235b.f24511d) {
                sVar.a(l.b.f2321c);
            } else {
                k0 k0Var5 = (k0) qg.t.s(arrayList);
                if (bVar == l.b.f2323e) {
                    sVar.a(l.b.f2322d);
                } else {
                    l.b bVar3 = l.b.f2322d;
                    if (bVar != bVar3) {
                        map.put(sVar, bVar3);
                    }
                }
                p5.o0 o0Var2 = k0Var5.f21236c;
                if (o0Var2 != null && !arrayList.contains(o0Var2)) {
                    arrayList.add(o0Var2);
                }
            }
        }
        int size = arrayListE0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListE0.get(i10);
            i10++;
            s sVar2 = (s) obj;
            l.b bVar4 = (l.b) map.get(sVar2);
            if (bVar4 != null) {
                sVar2.a(bVar4);
            } else {
                sVar2.f21275h.b();
            }
        }
    }
}
