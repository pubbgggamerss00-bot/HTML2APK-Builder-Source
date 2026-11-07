package c5;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.l;
import c5.h;
import c5.m0;
import d5.b;
import j5.a;
import java.util.ArrayList;
import java.util.Iterator;
import m5.a;
import p.c1;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f4909b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4910c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4911d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4912e = -1;

    public h0(v vVar, i0 i0Var, h hVar) {
        this.f4908a = vVar;
        this.f4909b = i0Var;
        this.f4910c = hVar;
    }

    public final void a() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + hVar);
        }
        Bundle bundle = hVar.f4873b;
        hVar.f4891w.M();
        hVar.f4872a = 3;
        hVar.F = false;
        hVar.n();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onActivityCreated()");
        }
        if (b0.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + hVar);
        }
        hVar.f4873b = null;
        c0 c0Var = hVar.f4891w;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(4);
        this.f4908a.a(false);
    }

    public final void b() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "moveto ATTACHED: " + hVar);
        }
        h hVar2 = hVar.f4878g;
        h0 h0Var = null;
        i0 i0Var = this.f4909b;
        if (hVar2 != null) {
            h0 h0Var2 = i0Var.f4915b.get(hVar2.f4876e);
            if (h0Var2 == null) {
                throw new IllegalStateException("Fragment " + hVar + " declared target fragment " + hVar.f4878g + " that does not belong to this FragmentManager!");
            }
            hVar.f4879h = hVar.f4878g.f4876e;
            hVar.f4878g = null;
            h0Var = h0Var2;
        } else {
            String str = hVar.f4879h;
            if (str != null && (h0Var = i0Var.f4915b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(hVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(b.o.a(sb, hVar.f4879h, " that does not belong to this FragmentManager!"));
            }
        }
        if (h0Var != null) {
            h0Var.j();
        }
        b0 b0Var = hVar.f4889t;
        hVar.f4890v = b0Var.f4798u;
        hVar.f4892x = b0Var.f4800w;
        v vVar = this.f4908a;
        vVar.g(false);
        ArrayList<h.f> arrayList = hVar.T;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            h.f fVar = arrayList.get(i10);
            i10++;
            fVar.a();
        }
        arrayList.clear();
        hVar.f4891w.b(hVar.f4890v, hVar.d(), hVar);
        hVar.f4872a = 0;
        hVar.F = false;
        hVar.p(hVar.f4890v.f4980b);
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onAttach()");
        }
        Iterator<f0> it = hVar.f4889t.f4791n.iterator();
        while (it.hasNext()) {
            it.next().s();
        }
        c0 c0Var = hVar.f4891w;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(0);
        vVar.b(false);
    }

    public final int c() {
        h hVar = this.f4910c;
        if (hVar.f4889t == null) {
            return hVar.f4872a;
        }
        int iMin = this.f4912e;
        int iOrdinal = hVar.O.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (hVar.f4884n) {
            iMin = hVar.f4885p ? Math.max(this.f4912e, 2) : this.f4912e < 4 ? Math.min(iMin, hVar.f4872a) : Math.min(iMin, 1);
        }
        if (!hVar.f4882l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = hVar.G;
        if (viewGroup != null) {
            m0 m0VarD = m0.d(viewGroup, hVar.i().E());
            ArrayList<m0.a> arrayList = m0VarD.f4949b;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw null;
            }
            ArrayList<m0.a> arrayList2 = m0VarD.f4950c;
            if (arrayList2.size() > 0) {
                arrayList2.get(0).getClass();
                throw null;
            }
        }
        if (hVar.f4883m) {
            iMin = hVar.m() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (hVar.H && hVar.f4872a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (b0.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + hVar);
        }
        return iMin;
    }

    public final void d() {
        Parcelable parcelable;
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "moveto CREATED: " + hVar);
        }
        if (hVar.M) {
            Bundle bundle = hVar.f4873b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                hVar.f4891w.R(parcelable);
                c0 c0Var = hVar.f4891w;
                c0Var.F = false;
                c0Var.G = false;
                c0Var.M.f4838g = false;
                c0Var.t(1);
            }
            hVar.f4872a = 1;
            return;
        }
        v vVar = this.f4908a;
        vVar.h(false);
        Bundle bundle2 = hVar.f4873b;
        hVar.f4891w.M();
        hVar.f4872a = 1;
        hVar.F = false;
        hVar.P.a(new i(hVar));
        hVar.S.a(bundle2);
        hVar.q(bundle2);
        hVar.M = true;
        if (hVar.F) {
            hVar.P.f(l.a.ON_CREATE);
            vVar.c(false);
        } else {
            throw new o0("Fragment " + hVar + " did not call through to super.onCreate()");
        }
    }

    public final void e() throws Resources.NotFoundException {
        String resourceName;
        h hVar = this.f4910c;
        if (hVar.f4884n) {
            return;
        }
        if (b0.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + hVar);
        }
        LayoutInflater layoutInflaterU = hVar.u(hVar.f4873b);
        ViewGroup viewGroup = hVar.G;
        if (viewGroup == null) {
            int i10 = hVar.f4894z;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + hVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) hVar.f4889t.f4799v.Y(i10);
                if (viewGroup == null) {
                    if (!hVar.f4886q) {
                        try {
                            resourceName = hVar.A().getResources().getResourceName(hVar.f4894z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(hVar.f4894z) + " (" + resourceName + ") for fragment " + hVar);
                    }
                } else if (!(viewGroup instanceof q)) {
                    b.a aVar = d5.b.f7368a;
                    d5.b.b(new d5.e(hVar, "Attempting to add fragment " + hVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    d5.b.a(hVar).getClass();
                }
            }
        }
        hVar.G = viewGroup;
        hVar.z(layoutInflaterU, viewGroup, hVar.f4873b);
        hVar.f4872a = 2;
    }

    public final void f() {
        h hVarB;
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATED: " + hVar);
        }
        boolean zIsChangingConfigurations = true;
        int i10 = 0;
        boolean z10 = hVar.f4883m && !hVar.m();
        i0 i0Var = this.f4909b;
        if (z10) {
            i0Var.f4916c.remove(hVar.f4876e);
        }
        if (!z10) {
            e0 e0Var = i0Var.f4917d;
            if (!((e0Var.f4833b.containsKey(hVar.f4876e) && e0Var.f4836e) ? e0Var.f4837f : true)) {
                String str = hVar.f4879h;
                if (str != null && (hVarB = i0Var.b(str)) != null && hVarB.D) {
                    hVar.f4878g = hVarB;
                }
                hVar.f4872a = 0;
                return;
            }
        }
        t<?> tVar = hVar.f4890v;
        if (tVar instanceof b1) {
            zIsChangingConfigurations = i0Var.f4917d.f4837f;
        } else {
            n nVar = tVar.f4980b;
            if (nVar != null) {
                zIsChangingConfigurations = true ^ nVar.isChangingConfigurations();
            }
        }
        if (z10 || zIsChangingConfigurations) {
            i0Var.f4917d.f(hVar);
        }
        hVar.f4891w.k();
        hVar.P.f(l.a.ON_DESTROY);
        hVar.f4872a = 0;
        hVar.F = false;
        hVar.M = false;
        hVar.r();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onDestroy()");
        }
        this.f4908a.d(false);
        ArrayList arrayListD = i0Var.d();
        int size = arrayListD.size();
        while (i10 < size) {
            Object obj = arrayListD.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (h0Var != null) {
                h hVar2 = h0Var.f4910c;
                if (hVar.f4876e.equals(hVar2.f4879h)) {
                    hVar2.f4878g = hVar;
                    hVar2.f4879h = null;
                }
            }
        }
        String str2 = hVar.f4879h;
        if (str2 != null) {
            hVar.f4878g = i0Var.b(str2);
        }
        i0Var.h(this);
    }

    public final void g() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + hVar);
        }
        ViewGroup viewGroup = hVar.G;
        hVar.f4891w.t(1);
        hVar.f4872a = 1;
        hVar.F = false;
        hVar.s();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onDestroyView()");
        }
        a1 store = hVar.getViewModelStore();
        kotlin.jvm.internal.r.e(store, "store");
        a.C0143a defaultCreationExtras = a.C0143a.f15159b;
        kotlin.jvm.internal.r.e(defaultCreationExtras, "defaultCreationExtras");
        j5.f fVar = new j5.f(store, a.c.f17665d, defaultCreationExtras);
        kotlin.jvm.internal.h hVarA = kotlin.jvm.internal.h0.a(a.c.class);
        String strA = hVarA.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        c1<a.C0174a> c1Var = ((a.c) fVar.a(hVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA))).f17666b;
        int iF = c1Var.f();
        for (int i10 = 0; i10 < iF; i10++) {
            c1Var.g(i10).j();
        }
        hVar.f4887r = false;
        this.f4908a.m(false);
        hVar.G = null;
        hVar.Q.h(null);
        hVar.f4885p = false;
    }

    public final void h() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + hVar);
        }
        hVar.f4872a = -1;
        hVar.F = false;
        hVar.t();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onDetach()");
        }
        c0 c0Var = hVar.f4891w;
        if (!c0Var.H) {
            c0Var.k();
            hVar.f4891w = new c0();
        }
        this.f4908a.e(false);
        hVar.f4872a = -1;
        hVar.f4890v = null;
        hVar.f4892x = null;
        hVar.f4889t = null;
        if (!hVar.f4883m || hVar.m()) {
            e0 e0Var = this.f4909b.f4917d;
            if (!((e0Var.f4833b.containsKey(hVar.f4876e) && e0Var.f4836e) ? e0Var.f4837f : true)) {
                return;
            }
        }
        if (b0.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + hVar);
        }
        hVar.k();
    }

    public final void i() {
        h hVar = this.f4910c;
        if (hVar.f4884n && hVar.f4885p && !hVar.f4887r) {
            if (b0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + hVar);
            }
            hVar.z(hVar.u(hVar.f4873b), null, hVar.f4873b);
        }
    }

    public final void j() {
        i0 i0Var = this.f4909b;
        boolean z10 = this.f4911d;
        h hVar = this.f4910c;
        if (z10) {
            if (b0.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + hVar);
                return;
            }
            return;
        }
        try {
            this.f4911d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i10 = hVar.f4872a;
                if (iC == i10) {
                    if (!z11 && i10 == -1 && hVar.f4883m && !hVar.m()) {
                        if (b0.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + hVar);
                        }
                        i0Var.f4917d.f(hVar);
                        i0Var.h(this);
                        if (b0.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + hVar);
                        }
                        hVar.k();
                    }
                    if (hVar.L) {
                        b0 b0Var = hVar.f4889t;
                        if (b0Var != null && hVar.f4882l && b0.H(hVar)) {
                            b0Var.E = true;
                        }
                        hVar.L = false;
                        hVar.f4891w.n();
                    }
                    this.f4911d = false;
                    return;
                }
                if (iC <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            hVar.f4872a = 1;
                            break;
                        case 2:
                            hVar.f4885p = false;
                            hVar.f4872a = 2;
                            break;
                        case 3:
                            if (b0.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + hVar);
                            }
                            hVar.f4872a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            hVar.f4872a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            hVar.f4872a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            hVar.f4872a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f4911d = false;
            throw th2;
        }
    }

    public final void k() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "movefrom RESUMED: " + hVar);
        }
        hVar.f4891w.t(5);
        hVar.P.f(l.a.ON_PAUSE);
        hVar.f4872a = 6;
        hVar.F = true;
        this.f4908a.f(false);
    }

    public final void l(ClassLoader classLoader) {
        h hVar = this.f4910c;
        Bundle bundle = hVar.f4873b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        hVar.f4874c = hVar.f4873b.getSparseParcelableArray("android:view_state");
        hVar.f4875d = hVar.f4873b.getBundle("android:view_registry_state");
        String string = hVar.f4873b.getString("android:target_state");
        hVar.f4879h = string;
        if (string != null) {
            hVar.f4880j = hVar.f4873b.getInt("android:target_req_state", 0);
        }
        boolean z10 = hVar.f4873b.getBoolean("android:user_visible_hint", true);
        hVar.I = z10;
        if (z10) {
            return;
        }
        hVar.H = true;
    }

    public final void m() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "moveto RESUMED: " + hVar);
        }
        h.d dVar = hVar.K;
        View view = dVar == null ? null : dVar.f4907j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        hVar.f().f4907j = null;
        hVar.f4891w.M();
        hVar.f4891w.y(true);
        hVar.f4872a = 7;
        hVar.F = false;
        hVar.v();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onResume()");
        }
        hVar.P.f(l.a.ON_RESUME);
        c0 c0Var = hVar.f4891w;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(7);
        this.f4908a.i(false);
        hVar.f4873b = null;
        hVar.f4874c = null;
        hVar.f4875d = null;
    }

    public final void n() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "moveto STARTED: " + hVar);
        }
        hVar.f4891w.M();
        hVar.f4891w.y(true);
        hVar.f4872a = 5;
        hVar.F = false;
        hVar.x();
        if (!hVar.F) {
            throw new o0("Fragment " + hVar + " did not call through to super.onStart()");
        }
        hVar.P.f(l.a.ON_START);
        c0 c0Var = hVar.f4891w;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(5);
        this.f4908a.k(false);
    }

    public final void o() {
        boolean zG = b0.G(3);
        h hVar = this.f4910c;
        if (zG) {
            Log.d("FragmentManager", "movefrom STARTED: " + hVar);
        }
        c0 c0Var = hVar.f4891w;
        c0Var.G = true;
        c0Var.M.f4838g = true;
        c0Var.t(4);
        hVar.P.f(l.a.ON_STOP);
        hVar.f4872a = 4;
        hVar.F = false;
        hVar.y();
        if (hVar.F) {
            this.f4908a.l(false);
            return;
        }
        throw new o0("Fragment " + hVar + " did not call through to super.onStop()");
    }

    public h0(v vVar, i0 i0Var, ClassLoader classLoader, s sVar, g0 g0Var) {
        this.f4908a = vVar;
        this.f4909b = i0Var;
        h hVarA = sVar.a(g0Var.f4859a);
        Bundle bundle = g0Var.f4868k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        b0 b0Var = hVarA.f4889t;
        if (b0Var != null && (b0Var.F || b0Var.G)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        hVarA.f4877f = bundle;
        hVarA.f4876e = g0Var.f4860b;
        hVarA.f4884n = g0Var.f4861c;
        hVarA.f4886q = true;
        hVarA.f4893y = g0Var.f4862d;
        hVarA.f4894z = g0Var.f4863e;
        hVarA.A = g0Var.f4864f;
        hVarA.D = g0Var.f4865g;
        hVarA.f4883m = g0Var.f4866h;
        hVarA.C = g0Var.f4867j;
        hVarA.B = g0Var.f4869l;
        hVarA.O = l.b.values()[g0Var.f4870m];
        Bundle bundle2 = g0Var.f4871n;
        if (bundle2 != null) {
            hVarA.f4873b = bundle2;
        } else {
            hVarA.f4873b = new Bundle();
        }
        this.f4910c = hVarA;
        if (b0.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + hVarA);
        }
    }

    public h0(v vVar, i0 i0Var, h hVar, g0 g0Var) {
        this.f4908a = vVar;
        this.f4909b = i0Var;
        this.f4910c = hVar;
        hVar.f4874c = null;
        hVar.f4875d = null;
        hVar.f4888s = 0;
        hVar.f4885p = false;
        hVar.f4882l = false;
        h hVar2 = hVar.f4878g;
        hVar.f4879h = hVar2 != null ? hVar2.f4876e : null;
        hVar.f4878g = null;
        Bundle bundle = g0Var.f4871n;
        if (bundle != null) {
            hVar.f4873b = bundle;
        } else {
            hVar.f4873b = new Bundle();
        }
    }
}
