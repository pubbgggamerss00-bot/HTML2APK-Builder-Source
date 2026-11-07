package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.h;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.m, androidx.lifecycle.k0, androidx.lifecycle.f, y1.c {

    /* renamed from: k0, reason: collision with root package name */
    public static final Object f1182k0 = new Object();
    public int A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public y J;
    public s<?> K;
    public k M;
    public int N;
    public int O;
    public String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public ViewGroup V;
    public View W;
    public boolean X;
    public c Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1183a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1184b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f1185c0;

    /* renamed from: e0, reason: collision with root package name */
    public androidx.lifecycle.n f1187e0;

    /* renamed from: f0, reason: collision with root package name */
    public h0 f1188f0;

    /* renamed from: h0, reason: collision with root package name */
    public y1.b f1190h0;

    /* renamed from: i0, reason: collision with root package name */
    public final ArrayList<e> f1191i0;

    /* renamed from: j0, reason: collision with root package name */
    public final a f1192j0;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f1193t;

    /* renamed from: u, reason: collision with root package name */
    public SparseArray<Parcelable> f1194u;

    /* renamed from: v, reason: collision with root package name */
    public Bundle f1195v;

    /* renamed from: x, reason: collision with root package name */
    public Bundle f1197x;

    /* renamed from: y, reason: collision with root package name */
    public k f1198y;
    public int s = -1;

    /* renamed from: w, reason: collision with root package name */
    public String f1196w = UUID.randomUUID().toString();

    /* renamed from: z, reason: collision with root package name */
    public String f1199z = null;
    public Boolean B = null;
    public z L = new z();
    public final boolean T = true;
    public boolean Y = true;

    /* renamed from: d0, reason: collision with root package name */
    public h.b f1186d0 = h.b.f1304w;

    /* renamed from: g0, reason: collision with root package name */
    public final androidx.lifecycle.r<androidx.lifecycle.m> f1189g0 = new androidx.lifecycle.r<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends e {
        public a() {
        }

        @Override // androidx.fragment.app.k.e
        public final void a() {
            k kVar = k.this;
            kVar.f1190h0.a();
            androidx.lifecycle.z.b(kVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends p {
        public b() {
        }

        @Override // androidx.fragment.app.p
        public final View d(int i6) {
            k kVar = k.this;
            View view = kVar.W;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new IllegalStateException("Fragment " + kVar + " does not have a view");
        }

        @Override // androidx.fragment.app.p
        public final boolean g() {
            return k.this.W != null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1201a;

        /* renamed from: b, reason: collision with root package name */
        public int f1202b;

        /* renamed from: c, reason: collision with root package name */
        public int f1203c;

        /* renamed from: d, reason: collision with root package name */
        public int f1204d;

        /* renamed from: e, reason: collision with root package name */
        public int f1205e;

        /* renamed from: f, reason: collision with root package name */
        public int f1206f;

        /* renamed from: g, reason: collision with root package name */
        public Object f1207g;
        public Object h;

        /* renamed from: i, reason: collision with root package name */
        public Object f1208i;

        /* renamed from: j, reason: collision with root package name */
        public float f1209j;

        /* renamed from: k, reason: collision with root package name */
        public View f1210k;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends RuntimeException {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class e {
        public abstract void a();
    }

    public k() {
        new AtomicInteger();
        this.f1191i0 = new ArrayList<>();
        this.f1192j0 = new a();
        h();
    }

    public final void A(int i6, int i7, int i8, int i9) {
        if (this.Z == null && i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        b().f1202b = i6;
        b().f1203c = i7;
        b().f1204d = i8;
        b().f1205e = i9;
    }

    public final void B(Bundle bundle) {
        y yVar = this.J;
        if (yVar != null && (yVar.E || yVar.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1197x = bundle;
    }

    public p a() {
        return new b();
    }

    public final c b() {
        if (this.Z == null) {
            c cVar = new c();
            Object obj = f1182k0;
            cVar.f1207g = obj;
            cVar.h = obj;
            cVar.f1208i = obj;
            cVar.f1209j = 1.0f;
            cVar.f1210k = null;
            this.Z = cVar;
        }
        return this.Z;
    }

    public final y c() {
        if (this.K != null) {
            return this.L;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context d() {
        s<?> sVar = this.K;
        if (sVar == null) {
            return null;
        }
        return sVar.f1222t;
    }

    public final int e() {
        h.b bVar = this.f1186d0;
        return (bVar == h.b.f1301t || this.M == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.M.e());
    }

    public final y f() {
        y yVar = this.J;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String g(int i6) {
        return y().getResources().getString(i6);
    }

    @Override // androidx.lifecycle.f
    public final k1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && y.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k1.c cVar = new k1.c(0);
        LinkedHashMap linkedHashMap = cVar.f13533a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f1299a, application);
        }
        linkedHashMap.put(androidx.lifecycle.z.f1345a, this);
        linkedHashMap.put(androidx.lifecycle.z.f1346b, this);
        Bundle bundle = this.f1197x;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.z.f1347c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.h getLifecycle() {
        return this.f1187e0;
    }

    @Override // y1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f1190h0.f15219b;
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 getViewModelStore() {
        if (this.J == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, androidx.lifecycle.j0> map = this.J.L.f1078f;
        androidx.lifecycle.j0 j0Var = map.get(this.f1196w);
        if (j0Var != null) {
            return j0Var;
        }
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0();
        map.put(this.f1196w, j0Var2);
        return j0Var2;
    }

    public final void h() {
        this.f1187e0 = new androidx.lifecycle.n(this);
        this.f1190h0 = new y1.b(this);
        ArrayList<e> arrayList = this.f1191i0;
        a aVar = this.f1192j0;
        if (arrayList.contains(aVar)) {
            return;
        }
        if (this.s >= 0) {
            aVar.a();
        } else {
            arrayList.add(aVar);
        }
    }

    public final void i() {
        h();
        this.f1185c0 = this.f1196w;
        this.f1196w = UUID.randomUUID().toString();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.I = 0;
        this.J = null;
        this.L = new z();
        this.K = null;
        this.N = 0;
        this.O = 0;
        this.P = null;
        this.Q = false;
        this.R = false;
    }

    public final boolean j() {
        if (this.Q) {
            return true;
        }
        y yVar = this.J;
        if (yVar != null) {
            k kVar = this.M;
            yVar.getClass();
            if (kVar == null ? false : kVar.j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.I > 0;
    }

    @Deprecated
    public void l() {
        this.U = true;
    }

    @Deprecated
    public void m(int i6, int i7, Intent intent) {
        if (y.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i7 + " data: " + intent);
        }
    }

    public void n(Context context) {
        this.U = true;
        s<?> sVar = this.K;
        if ((sVar == null ? null : sVar.s) != null) {
            this.U = true;
        }
    }

    public void o(Bundle bundle) {
        Parcelable parcelable;
        this.U = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.L.T(parcelable);
            z zVar = this.L;
            zVar.E = false;
            zVar.F = false;
            zVar.L.f1080i = false;
            zVar.t(1);
        }
        z zVar2 = this.L;
        if (zVar2.s >= 1) {
            return;
        }
        zVar2.E = false;
        zVar2.F = false;
        zVar2.L.f1080i = false;
        zVar2.t(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        s<?> sVar = this.K;
        FragmentActivity fragmentActivity = sVar == null ? null : sVar.s;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.U = true;
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void q() {
        this.U = true;
    }

    public void r() {
        this.U = true;
    }

    public LayoutInflater s(Bundle bundle) {
        s<?> sVar = this.K;
        if (sVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterK = sVar.k();
        layoutInflaterK.setFactory2(this.L.f1236f);
        return layoutInflaterK;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1196w);
        if (this.N != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.N));
        }
        if (this.P != null) {
            sb.append(" tag=");
            sb.append(this.P);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.U = true;
    }

    public void v() {
        this.U = true;
    }

    public void w(Bundle bundle) {
        this.U = true;
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L.N();
        this.H = true;
        this.f1188f0 = new h0(this, getViewModelStore());
        View viewP = p(layoutInflater, viewGroup, bundle);
        this.W = viewP;
        if (viewP == null) {
            if (this.f1188f0.f1136u != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1188f0 = null;
            return;
        }
        this.f1188f0.b();
        View view = this.W;
        h0 h0Var = this.f1188f0;
        kotlin.jvm.internal.j.e("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, h0Var);
        View view2 = this.W;
        h0 h0Var2 = this.f1188f0;
        kotlin.jvm.internal.j.e("<this>", view2);
        view2.setTag(R.id.view_tree_view_model_store_owner, h0Var2);
        View view3 = this.W;
        h0 h0Var3 = this.f1188f0;
        kotlin.jvm.internal.j.e("<this>", view3);
        view3.setTag(R.id.view_tree_saved_state_registry_owner, h0Var3);
        this.f1189g0.setValue(this.f1188f0);
    }

    public final Context y() {
        Context contextD = d();
        if (contextD != null) {
            return contextD;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View z() {
        View view = this.W;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void t(Bundle bundle) {
    }
}
