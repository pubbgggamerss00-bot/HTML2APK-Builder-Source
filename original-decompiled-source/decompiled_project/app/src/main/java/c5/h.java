package c5;

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
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.l;
import androidx.lifecycle.s0;
import androidx.lifecycle.z0;
import c5.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, b1, androidx.lifecycle.i, c6.e {
    public static final Object V = new Object();
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public ViewGroup G;
    public boolean H;
    public d K;
    public boolean L;
    public boolean M;
    public String N;
    public l.b O;
    public androidx.lifecycle.v P;
    public final androidx.lifecycle.a0<androidx.lifecycle.t> Q;
    public s0 R;
    public c6.d S;
    public final ArrayList<f> T;
    public final b U;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f4873b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray<Parcelable> f4874c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f4875d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f4877f;

    /* renamed from: g, reason: collision with root package name */
    public h f4878g;

    /* renamed from: j, reason: collision with root package name */
    public int f4880j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4882l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4883m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4884n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4885p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4886q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4887r;

    /* renamed from: s, reason: collision with root package name */
    public int f4888s;

    /* renamed from: t, reason: collision with root package name */
    public b0 f4889t;

    /* renamed from: v, reason: collision with root package name */
    public t<?> f4890v;

    /* renamed from: x, reason: collision with root package name */
    public h f4892x;

    /* renamed from: y, reason: collision with root package name */
    public int f4893y;

    /* renamed from: z, reason: collision with root package name */
    public int f4894z;

    /* renamed from: a, reason: collision with root package name */
    public int f4872a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f4876e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f4879h = null;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f4881k = null;

    /* renamed from: w, reason: collision with root package name */
    public c0 f4891w = new c0();
    public final boolean E = true;
    public boolean I = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            if (hVar.K != null) {
                hVar.f().getClass();
            }
        }
    }

    public class b extends f {
        public b() {
        }

        @Override // c5.h.f
        public final void a() {
            h hVar = h.this;
            hVar.S.f4995a.a();
            androidx.lifecycle.o0.b(hVar);
        }
    }

    public class c extends p {
        public c() {
        }

        @Override // c5.p
        public final View Y(int i10) {
            throw new IllegalStateException("Fragment " + h.this + " does not have a view");
        }

        @Override // c5.p
        public final boolean Z() {
            return false;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4898a;

        /* renamed from: b, reason: collision with root package name */
        public int f4899b;

        /* renamed from: c, reason: collision with root package name */
        public int f4900c;

        /* renamed from: d, reason: collision with root package name */
        public int f4901d;

        /* renamed from: e, reason: collision with root package name */
        public int f4902e;

        /* renamed from: f, reason: collision with root package name */
        public int f4903f;

        /* renamed from: g, reason: collision with root package name */
        public Object f4904g;

        /* renamed from: h, reason: collision with root package name */
        public Object f4905h;

        /* renamed from: i, reason: collision with root package name */
        public Object f4906i;

        /* renamed from: j, reason: collision with root package name */
        public View f4907j;
    }

    public static class e extends RuntimeException {
    }

    public static abstract class f {
        public abstract void a();
    }

    public h() {
        new a();
        this.O = l.b.f2323e;
        this.Q = new androidx.lifecycle.a0<>();
        new AtomicInteger();
        this.T = new ArrayList<>();
        this.U = new b();
        j();
    }

    public final Context A() {
        t<?> tVar = this.f4890v;
        n nVar = tVar == null ? null : tVar.f4980b;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void B(int i10, int i11, int i12, int i13) {
        if (this.K == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        f().f4899b = i10;
        f().f4900c = i11;
        f().f4901d = i12;
        f().f4902e = i13;
    }

    public p d() {
        return new c();
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f4893y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f4894z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f4872a);
        printWriter.print(" mWho=");
        printWriter.print(this.f4876e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f4888s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f4882l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f4883m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f4884n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f4885p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.I);
        if (this.f4889t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f4889t);
        }
        if (this.f4890v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f4890v);
        }
        if (this.f4892x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f4892x);
        }
        if (this.f4877f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f4877f);
        }
        if (this.f4873b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f4873b);
        }
        if (this.f4874c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f4874c);
        }
        if (this.f4875d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f4875d);
        }
        h hVarB = this.f4878g;
        if (hVarB == null) {
            b0 b0Var = this.f4889t;
            hVarB = (b0Var == null || (str2 = this.f4879h) == null) ? null : b0Var.f4780c.b(str2);
        }
        if (hVarB != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(hVarB);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f4880j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        d dVar = this.K;
        printWriter.println(dVar == null ? false : dVar.f4898a);
        d dVar2 = this.K;
        if ((dVar2 == null ? 0 : dVar2.f4899b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            d dVar3 = this.K;
            printWriter.println(dVar3 == null ? 0 : dVar3.f4899b);
        }
        d dVar4 = this.K;
        if ((dVar4 == null ? 0 : dVar4.f4900c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            d dVar5 = this.K;
            printWriter.println(dVar5 == null ? 0 : dVar5.f4900c);
        }
        d dVar6 = this.K;
        if ((dVar6 == null ? 0 : dVar6.f4901d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            d dVar7 = this.K;
            printWriter.println(dVar7 == null ? 0 : dVar7.f4901d);
        }
        d dVar8 = this.K;
        if ((dVar8 == null ? 0 : dVar8.f4902e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            d dVar9 = this.K;
            printWriter.println(dVar9 != null ? dVar9.f4902e : 0);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        t<?> tVar = this.f4890v;
        if ((tVar != null ? tVar.f4980b : null) != null) {
            new m5.a(this, getViewModelStore()).I(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f4891w + ":");
        this.f4891w.v(k3.a.a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final d f() {
        if (this.K == null) {
            d dVar = new d();
            Object obj = V;
            dVar.f4904g = obj;
            dVar.f4905h = obj;
            dVar.f4906i = obj;
            dVar.f4907j = null;
            this.K = dVar;
        }
        return this.K;
    }

    public final b0 g() {
        if (this.f4890v != null) {
            return this.f4891w;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.i
    public final j5.a getDefaultViewModelCreationExtras() {
        Object obj;
        Application application;
        Context applicationContext = A().getApplicationContext();
        while (true) {
            obj = null;
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
        if (application == null && b0.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        j5.d dVar = new j5.d(obj);
        LinkedHashMap linkedHashMap = dVar.f15158a;
        if (application != null) {
            linkedHashMap.put(z0.a.f2402d, application);
        }
        linkedHashMap.put(androidx.lifecycle.o0.f2335a, this);
        linkedHashMap.put(androidx.lifecycle.o0.f2336b, this);
        Bundle bundle = this.f4877f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.o0.f2337c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.i
    public final z0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f4889t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.R == null) {
            Context applicationContext = A().getApplicationContext();
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
            if (application == null && b0.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.R = new s0(application, this, this.f4877f);
        }
        return this.R;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.l getLifecycle() {
        return this.P;
    }

    @Override // c6.e
    public final c6.c getSavedStateRegistry() {
        return this.S.f4996b;
    }

    @Override // androidx.lifecycle.b1
    public final a1 getViewModelStore() {
        if (this.f4889t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iH = h();
        l.b bVar = l.b.f2319a;
        if (iH == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, a1> map = this.f4889t.M.f4835d;
        a1 a1Var = map.get(this.f4876e);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1();
        map.put(this.f4876e, a1Var2);
        return a1Var2;
    }

    public final int h() {
        l.b bVar = this.O;
        return (bVar == l.b.f2320b || this.f4892x == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f4892x.h());
    }

    public final b0 i() {
        b0 b0Var = this.f4889t;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void j() {
        this.P = new androidx.lifecycle.v(this);
        this.S = new c6.d(new e6.b(this, new f9.z0(this, 2)));
        this.R = null;
        ArrayList<f> arrayList = this.T;
        b bVar = this.U;
        if (arrayList.contains(bVar)) {
            return;
        }
        if (this.f4872a >= 0) {
            bVar.a();
        } else {
            arrayList.add(bVar);
        }
    }

    public final void k() {
        j();
        this.N = this.f4876e;
        this.f4876e = UUID.randomUUID().toString();
        this.f4882l = false;
        this.f4883m = false;
        this.f4884n = false;
        this.f4885p = false;
        this.f4886q = false;
        this.f4888s = 0;
        this.f4889t = null;
        this.f4891w = new c0();
        this.f4890v = null;
        this.f4893y = 0;
        this.f4894z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }

    public final boolean l() {
        if (this.B) {
            return true;
        }
        b0 b0Var = this.f4889t;
        if (b0Var != null) {
            h hVar = this.f4892x;
            b0Var.getClass();
            if (hVar == null ? false : hVar.l()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return this.f4888s > 0;
    }

    @Deprecated
    public void n() {
        this.F = true;
    }

    @Deprecated
    public void o(int i10, int i11, Intent intent) {
        if (b0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        t<?> tVar = this.f4890v;
        n nVar = tVar == null ? null : tVar.f4979a;
        if (nVar != null) {
            nVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.F = true;
    }

    public void p(Context context) {
        this.F = true;
        t<?> tVar = this.f4890v;
        if ((tVar == null ? null : tVar.f4979a) != null) {
            this.F = true;
        }
    }

    public void q(Bundle bundle) {
        Parcelable parcelable;
        this.F = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f4891w.R(parcelable);
            c0 c0Var = this.f4891w;
            c0Var.F = false;
            c0Var.G = false;
            c0Var.M.f4838g = false;
            c0Var.t(1);
        }
        c0 c0Var2 = this.f4891w;
        if (c0Var2.f4797t >= 1) {
            return;
        }
        c0Var2.F = false;
        c0Var2.G = false;
        c0Var2.M.f4838g = false;
        c0Var2.t(1);
    }

    public void r() {
        this.F = true;
    }

    public void s() {
        this.F = true;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        if (this.f4890v == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        b0 b0VarI = i();
        if (b0VarI.A == null) {
            t<?> tVar = b0VarI.f4798u;
            if (i10 == -1) {
                p3.b.startActivity(tVar.f4980b, intent, null);
                return;
            } else {
                tVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        String str = this.f4876e;
        b0.k kVar = new b0.k();
        kVar.f4812a = str;
        kVar.f4813b = i10;
        b0VarI.D.addLast(kVar);
        b0VarI.A.a(intent);
    }

    public void t() {
        this.F = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4876e);
        if (this.f4893y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4893y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        t<?> tVar = this.f4890v;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterD0 = tVar.d0();
        layoutInflaterD0.setFactory2(this.f4891w.f4783f);
        return layoutInflaterD0;
    }

    public void v() {
        this.F = true;
    }

    public void w(Bundle bundle) {
    }

    public void x() {
        this.F = true;
    }

    public void y() {
        this.F = true;
    }

    public void z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4891w.M();
        this.f4887r = true;
        getViewModelStore();
    }
}
