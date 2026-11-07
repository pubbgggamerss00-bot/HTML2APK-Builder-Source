package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.j0;
import androidx.fragment.app.k;
import androidx.lifecycle.h;
import com.htmltoapk.template.R;
import i1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l1.a;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1097c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1098d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1099e = -1;

    public e0(u uVar, f0 f0Var, k kVar) {
        this.f1095a = uVar;
        this.f1096b = f0Var;
        this.f1097c = kVar;
    }

    public final void a() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + kVar);
        }
        Bundle bundle = kVar.f1193t;
        kVar.L.N();
        kVar.s = 3;
        kVar.U = false;
        kVar.l();
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onActivityCreated()");
        }
        if (y.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + kVar);
        }
        View view = kVar.W;
        if (view != null) {
            Bundle bundle2 = kVar.f1193t;
            SparseArray<Parcelable> sparseArray = kVar.f1194u;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                kVar.f1194u = null;
            }
            if (kVar.W != null) {
                kVar.f1188f0.f1137v.b(kVar.f1195v);
                kVar.f1195v = null;
            }
            kVar.U = false;
            kVar.w(bundle2);
            if (!kVar.U) {
                throw new l0("Fragment " + kVar + " did not call through to super.onViewStateRestored()");
            }
            if (kVar.W != null) {
                kVar.f1188f0.a(h.a.ON_CREATE);
            }
        }
        kVar.f1193t = null;
        z zVar = kVar.L;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(4);
        this.f1095a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f1096b.f1102t;
        k kVar = this.f1097c;
        ViewGroup viewGroup = kVar.V;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(kVar);
            int i6 = iIndexOf - 1;
            while (true) {
                if (i6 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        k kVar2 = (k) arrayList.get(iIndexOf);
                        if (kVar2.V == viewGroup && (view = kVar2.W) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    k kVar3 = (k) arrayList.get(i6);
                    if (kVar3.V == viewGroup && (view2 = kVar3.W) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i6--;
                }
            }
        }
        kVar.V.addView(kVar.W, iIndexOfChild);
    }

    public final void c() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "moveto ATTACHED: " + kVar);
        }
        k kVar2 = kVar.f1198y;
        e0 e0Var = null;
        f0 f0Var = this.f1096b;
        if (kVar2 != null) {
            e0 e0Var2 = (e0) ((HashMap) f0Var.s).get(kVar2.f1196w);
            if (e0Var2 == null) {
                throw new IllegalStateException("Fragment " + kVar + " declared target fragment " + kVar.f1198y + " that does not belong to this FragmentManager!");
            }
            kVar.f1199z = kVar.f1198y.f1196w;
            kVar.f1198y = null;
            e0Var = e0Var2;
        } else {
            String str = kVar.f1199z;
            if (str != null && (e0Var = (e0) ((HashMap) f0Var.s).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(kVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(androidx.activity.m.e(sb, kVar.f1199z, " that does not belong to this FragmentManager!"));
            }
        }
        if (e0Var != null) {
            e0Var.k();
        }
        y yVar = kVar.J;
        kVar.K = yVar.f1248t;
        kVar.M = yVar.f1250v;
        u uVar = this.f1095a;
        uVar.g(false);
        ArrayList<k.e> arrayList = kVar.f1191i0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            k.e eVar = arrayList.get(i6);
            i6++;
            eVar.a();
        }
        arrayList.clear();
        kVar.L.b(kVar.K, kVar.a(), kVar);
        kVar.s = 0;
        kVar.U = false;
        kVar.n(kVar.K.f1222t);
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onAttach()");
        }
        Iterator<c0> it = kVar.J.f1242m.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        z zVar = kVar.L;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(0);
        uVar.b(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.fragment.app.j0$d$b] */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.fragment.app.j0$d$b] */
    public final int d() {
        k kVar = this.f1097c;
        if (kVar.J == null) {
            return kVar.s;
        }
        int iMin = this.f1099e;
        int iOrdinal = kVar.f1186d0.ordinal();
        int i6 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (kVar.E) {
            if (kVar.F) {
                iMin = Math.max(this.f1099e, 2);
                View view = kVar.W;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1099e < 4 ? Math.min(iMin, kVar.s) : Math.min(iMin, 1);
            }
        }
        if (!kVar.C) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = kVar.V;
        j0.d dVar = null;
        if (viewGroup != null) {
            j0 j0VarF = j0.f(viewGroup, kVar.f().F());
            j0.d dVarD = j0VarF.d(kVar);
            j0.d dVar2 = dVarD != null ? dVarD.f1168b : null;
            ArrayList<j0.d> arrayList = j0VarF.f1162c;
            int size = arrayList.size();
            while (true) {
                if (i6 >= size) {
                    break;
                }
                j0.d dVar3 = arrayList.get(i6);
                i6++;
                j0.d dVar4 = dVar3;
                if (dVar4.f1169c.equals(kVar) && !dVar4.f1172f) {
                    dVar = dVar4;
                    break;
                }
            }
            dVar = (dVar == null || !(dVar2 == null || dVar2 == j0.d.b.s)) ? dVar2 : dVar.f1168b;
        }
        if (dVar == j0.d.b.f1175t) {
            iMin = Math.min(iMin, 6);
        } else if (dVar == j0.d.b.f1176u) {
            iMin = Math.max(iMin, 3);
        } else if (kVar.D) {
            iMin = kVar.k() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (kVar.X && kVar.s < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (y.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + kVar);
        }
        return iMin;
    }

    public final void e() {
        Parcelable parcelable;
        boolean zH = y.H(3);
        final k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "moveto CREATED: " + kVar);
        }
        if (kVar.f1184b0) {
            Bundle bundle = kVar.f1193t;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                kVar.L.T(parcelable);
                z zVar = kVar.L;
                zVar.E = false;
                zVar.F = false;
                zVar.L.f1080i = false;
                zVar.t(1);
            }
            kVar.s = 1;
            return;
        }
        u uVar = this.f1095a;
        uVar.h(false);
        Bundle bundle2 = kVar.f1193t;
        kVar.L.N();
        kVar.s = 1;
        kVar.U = false;
        kVar.f1187e0.a(new androidx.lifecycle.k() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar, h.a aVar) {
                View view;
                if (aVar != h.a.ON_STOP || (view = kVar.W) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        kVar.f1190h0.b(bundle2);
        kVar.o(bundle2);
        kVar.f1184b0 = true;
        if (kVar.U) {
            kVar.f1187e0.f(h.a.ON_CREATE);
            uVar.c(false);
        } else {
            throw new l0("Fragment " + kVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        k kVar = this.f1097c;
        if (kVar.E) {
            return;
        }
        if (y.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + kVar);
        }
        LayoutInflater layoutInflaterS = kVar.s(kVar.f1193t);
        ViewGroup viewGroup = kVar.V;
        if (viewGroup == null) {
            int i6 = kVar.O;
            if (i6 == 0) {
                viewGroup = null;
            } else {
                if (i6 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + kVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) kVar.J.f1249u.d(i6);
                if (viewGroup == null) {
                    if (!kVar.G) {
                        try {
                            resourceName = kVar.y().getResources().getResourceName(kVar.O);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(kVar.O) + " (" + resourceName + ") for fragment " + kVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    b.a aVar = i1.b.f13340a;
                    i1.b.b(new i1.e(kVar, viewGroup));
                    i1.b.a(kVar).getClass();
                }
            }
        }
        kVar.V = viewGroup;
        kVar.x(layoutInflaterS, viewGroup, kVar.f1193t);
        View view = kVar.W;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            kVar.W.setTag(R.id.fragment_container_view_tag, kVar);
            if (viewGroup != null) {
                b();
            }
            if (kVar.Q) {
                kVar.W.setVisibility(8);
            }
            View view2 = kVar.W;
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            if (view2.isAttachedToWindow()) {
                f0.c.c(kVar.W);
            } else {
                View view3 = kVar.W;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            kVar.L.t(2);
            this.f1095a.m(false);
            int visibility = kVar.W.getVisibility();
            kVar.b().f1209j = kVar.W.getAlpha();
            if (kVar.V != null && visibility == 0) {
                View viewFindFocus = kVar.W.findFocus();
                if (viewFindFocus != null) {
                    kVar.b().f1210k = viewFindFocus;
                    if (y.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + kVar);
                    }
                }
                kVar.W.setAlpha(0.0f);
            }
        }
        kVar.s = 2;
    }

    public final void g() {
        k kVarC;
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATED: " + kVar);
        }
        boolean zIsChangingConfigurations = true;
        int i6 = 0;
        boolean z6 = kVar.D && !kVar.k();
        f0 f0Var = this.f1096b;
        if (z6) {
        }
        if (!z6) {
            b0 b0Var = (b0) f0Var.f1104v;
            if (!((b0Var.f1076d.containsKey(kVar.f1196w) && b0Var.f1079g) ? b0Var.h : true)) {
                String str = kVar.f1199z;
                if (str != null && (kVarC = f0Var.c(str)) != null && kVarC.S) {
                    kVar.f1198y = kVarC;
                }
                kVar.s = 0;
                return;
            }
        }
        s<?> sVar = kVar.K;
        if (sVar instanceof androidx.lifecycle.k0) {
            zIsChangingConfigurations = ((b0) f0Var.f1104v).h;
        } else {
            FragmentActivity fragmentActivity = sVar.f1222t;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z6 || zIsChangingConfigurations) {
            ((b0) f0Var.f1104v).c(kVar);
        }
        kVar.L.k();
        kVar.f1187e0.f(h.a.ON_DESTROY);
        kVar.s = 0;
        kVar.U = false;
        kVar.f1184b0 = false;
        kVar.U = true;
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onDestroy()");
        }
        this.f1095a.d(false);
        ArrayList arrayListE = f0Var.e();
        int size = arrayListE.size();
        while (i6 < size) {
            Object obj = arrayListE.get(i6);
            i6++;
            e0 e0Var = (e0) obj;
            if (e0Var != null) {
                k kVar2 = e0Var.f1097c;
                if (kVar.f1196w.equals(kVar2.f1199z)) {
                    kVar2.f1198y = kVar;
                    kVar2.f1199z = null;
                }
            }
        }
        String str2 = kVar.f1199z;
        if (str2 != null) {
            kVar.f1198y = f0Var.c(str2);
        }
        f0Var.i(this);
    }

    public final void h() {
        View view;
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + kVar);
        }
        ViewGroup viewGroup = kVar.V;
        if (viewGroup != null && (view = kVar.W) != null) {
            viewGroup.removeView(view);
        }
        kVar.L.t(1);
        if (kVar.W != null) {
            h0 h0Var = kVar.f1188f0;
            h0Var.b();
            if (h0Var.f1136u.f1317c.compareTo(h.b.f1302u) >= 0) {
                kVar.f1188f0.a(h.a.ON_DESTROY);
            }
        }
        kVar.s = 1;
        kVar.U = false;
        kVar.q();
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onDestroyView()");
        }
        androidx.lifecycle.h0 h0Var2 = new androidx.lifecycle.h0(kVar.getViewModelStore(), a.b.f13818e);
        String canonicalName = a.b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        w.h<a.C0076a> hVar = ((a.b) h0Var2.a(a.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f13819d;
        int i6 = hVar.f14852u;
        for (int i7 = 0; i7 < i6; i7++) {
            ((a.C0076a) hVar.f14851t[i7]).getClass();
        }
        kVar.H = false;
        this.f1095a.n(false);
        kVar.V = null;
        kVar.W = null;
        kVar.f1188f0 = null;
        kVar.f1189g0.setValue(null);
        kVar.F = false;
    }

    public final void i() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + kVar);
        }
        kVar.s = -1;
        kVar.U = false;
        kVar.r();
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onDetach()");
        }
        z zVar = kVar.L;
        if (!zVar.G) {
            zVar.k();
            kVar.L = new z();
        }
        this.f1095a.e(false);
        kVar.s = -1;
        kVar.K = null;
        kVar.M = null;
        kVar.J = null;
        if (!kVar.D || kVar.k()) {
            b0 b0Var = (b0) this.f1096b.f1104v;
            if (!((b0Var.f1076d.containsKey(kVar.f1196w) && b0Var.f1079g) ? b0Var.h : true)) {
                return;
            }
        }
        if (y.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + kVar);
        }
        kVar.i();
    }

    public final void j() {
        k kVar = this.f1097c;
        if (kVar.E && kVar.F && !kVar.H) {
            if (y.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + kVar);
            }
            kVar.x(kVar.s(kVar.f1193t), null, kVar.f1193t);
            View view = kVar.W;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                kVar.W.setTag(R.id.fragment_container_view_tag, kVar);
                if (kVar.Q) {
                    kVar.W.setVisibility(8);
                }
                kVar.L.t(2);
                this.f1095a.m(false);
                kVar.s = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        f0 f0Var = this.f1096b;
        boolean z6 = this.f1098d;
        k kVar = this.f1097c;
        if (z6) {
            if (y.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + kVar);
                return;
            }
            return;
        }
        try {
            this.f1098d = true;
            boolean z7 = false;
            while (true) {
                int iD = d();
                int i6 = kVar.s;
                if (iD == i6) {
                    if (!z7 && i6 == -1 && kVar.D && !kVar.k()) {
                        if (y.H(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + kVar);
                        }
                        ((b0) f0Var.f1104v).c(kVar);
                        f0Var.i(this);
                        if (y.H(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + kVar);
                        }
                        kVar.i();
                    }
                    if (kVar.f1183a0) {
                        if (kVar.W != null && (viewGroup = kVar.V) != null) {
                            j0 j0VarF = j0.f(viewGroup, kVar.f().F());
                            boolean z8 = kVar.Q;
                            j0.d.b bVar = j0.d.b.s;
                            if (z8) {
                                if (y.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + kVar);
                                }
                                j0VarF.a(j0.d.c.f1179u, bVar, this);
                            } else {
                                if (y.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + kVar);
                                }
                                j0VarF.a(j0.d.c.f1178t, bVar, this);
                            }
                        }
                        y yVar = kVar.J;
                        if (yVar != null && kVar.C && y.I(kVar)) {
                            yVar.D = true;
                        }
                        kVar.f1183a0 = false;
                        kVar.L.n();
                    }
                    this.f1098d = false;
                    return;
                }
                if (iD <= i6) {
                    switch (i6 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            kVar.s = 1;
                            break;
                        case 2:
                            kVar.F = false;
                            kVar.s = 2;
                            break;
                        case 3:
                            if (y.H(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + kVar);
                            }
                            if (kVar.W != null && kVar.f1194u == null) {
                                o();
                            }
                            if (kVar.W != null && (viewGroup2 = kVar.V) != null) {
                                j0 j0VarF2 = j0.f(viewGroup2, kVar.f().F());
                                if (y.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + kVar);
                                }
                                j0VarF2.a(j0.d.c.s, j0.d.b.f1176u, this);
                            }
                            kVar.s = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            kVar.s = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i6 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (kVar.W != null && (viewGroup3 = kVar.V) != null) {
                                j0 j0VarF3 = j0.f(viewGroup3, kVar.f().F());
                                j0.d.c cVarB = j0.d.c.b(kVar.W.getVisibility());
                                if (y.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + kVar);
                                }
                                j0VarF3.a(cVarB, j0.d.b.f1175t, this);
                            }
                            kVar.s = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            kVar.s = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z7 = true;
            }
        } catch (Throwable th) {
            this.f1098d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "movefrom RESUMED: " + kVar);
        }
        kVar.L.t(5);
        if (kVar.W != null) {
            kVar.f1188f0.a(h.a.ON_PAUSE);
        }
        kVar.f1187e0.f(h.a.ON_PAUSE);
        kVar.s = 6;
        kVar.U = true;
        this.f1095a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        k kVar = this.f1097c;
        Bundle bundle = kVar.f1193t;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        kVar.f1194u = kVar.f1193t.getSparseParcelableArray("android:view_state");
        kVar.f1195v = kVar.f1193t.getBundle("android:view_registry_state");
        String string = kVar.f1193t.getString("android:target_state");
        kVar.f1199z = string;
        if (string != null) {
            kVar.A = kVar.f1193t.getInt("android:target_req_state", 0);
        }
        boolean z6 = kVar.f1193t.getBoolean("android:user_visible_hint", true);
        kVar.Y = z6;
        if (z6) {
            return;
        }
        kVar.X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "moveto RESUMED: " + kVar);
        }
        k.c cVar = kVar.Z;
        View view = cVar == null ? null : cVar.f1210k;
        if (view != null) {
            if (view == kVar.W) {
                boolean zRequestFocus = view.requestFocus();
                if (y.H(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(kVar);
                    sb.append(" resulting in focused view ");
                    sb.append(kVar.W.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == kVar.W) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (y.H(2)) {
                        }
                    }
                }
            }
        }
        kVar.b().f1210k = null;
        kVar.L.N();
        kVar.L.y(true);
        kVar.s = 7;
        kVar.U = false;
        kVar.U = true;
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onResume()");
        }
        androidx.lifecycle.n nVar = kVar.f1187e0;
        h.a aVar = h.a.ON_RESUME;
        nVar.f(aVar);
        if (kVar.W != null) {
            kVar.f1188f0.f1136u.f(aVar);
        }
        z zVar = kVar.L;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(7);
        this.f1095a.i(false);
        kVar.f1193t = null;
        kVar.f1194u = null;
        kVar.f1195v = null;
    }

    public final void o() {
        k kVar = this.f1097c;
        if (kVar.W == null) {
            return;
        }
        if (y.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + kVar + " with view " + kVar.W);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        kVar.W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            kVar.f1194u = sparseArray;
        }
        Bundle bundle = new Bundle();
        kVar.f1188f0.f1137v.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        kVar.f1195v = bundle;
    }

    public final void p() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "moveto STARTED: " + kVar);
        }
        kVar.L.N();
        kVar.L.y(true);
        kVar.s = 5;
        kVar.U = false;
        kVar.u();
        if (!kVar.U) {
            throw new l0("Fragment " + kVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.n nVar = kVar.f1187e0;
        h.a aVar = h.a.ON_START;
        nVar.f(aVar);
        if (kVar.W != null) {
            kVar.f1188f0.f1136u.f(aVar);
        }
        z zVar = kVar.L;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(5);
        this.f1095a.k(false);
    }

    public final void q() {
        boolean zH = y.H(3);
        k kVar = this.f1097c;
        if (zH) {
            Log.d("FragmentManager", "movefrom STARTED: " + kVar);
        }
        z zVar = kVar.L;
        zVar.F = true;
        zVar.L.f1080i = true;
        zVar.t(4);
        if (kVar.W != null) {
            kVar.f1188f0.a(h.a.ON_STOP);
        }
        kVar.f1187e0.f(h.a.ON_STOP);
        kVar.s = 4;
        kVar.U = false;
        kVar.v();
        if (kVar.U) {
            this.f1095a.l(false);
            return;
        }
        throw new l0("Fragment " + kVar + " did not call through to super.onStop()");
    }

    public e0(u uVar, f0 f0Var, ClassLoader classLoader, r rVar, d0 d0Var) {
        this.f1095a = uVar;
        this.f1096b = f0Var;
        k kVarA = rVar.a(d0Var.s);
        Bundle bundle = d0Var.B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        kVarA.B(bundle);
        kVarA.f1196w = d0Var.f1083t;
        kVarA.E = d0Var.f1084u;
        kVarA.G = true;
        kVarA.N = d0Var.f1085v;
        kVarA.O = d0Var.f1086w;
        kVarA.P = d0Var.f1087x;
        kVarA.S = d0Var.f1088y;
        kVarA.D = d0Var.f1089z;
        kVarA.R = d0Var.A;
        kVarA.Q = d0Var.C;
        kVarA.f1186d0 = h.b.values()[d0Var.D];
        Bundle bundle2 = d0Var.E;
        if (bundle2 != null) {
            kVarA.f1193t = bundle2;
        } else {
            kVarA.f1193t = new Bundle();
        }
        this.f1097c = kVarA;
        if (y.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + kVarA);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View s;

        public a(View view) {
            this.s = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.s;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            f0.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public e0(u uVar, f0 f0Var, k kVar, d0 d0Var) {
        this.f1095a = uVar;
        this.f1096b = f0Var;
        this.f1097c = kVar;
        kVar.f1194u = null;
        kVar.f1195v = null;
        kVar.I = 0;
        kVar.F = false;
        kVar.C = false;
        k kVar2 = kVar.f1198y;
        kVar.f1199z = kVar2 != null ? kVar2.f1196w : null;
        kVar.f1198y = null;
        Bundle bundle = d0Var.E;
        if (bundle != null) {
            kVar.f1193t = bundle;
        } else {
            kVar.f1193t = new Bundle();
        }
    }
}
