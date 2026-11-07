package c5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.c1;
import androidx.lifecycle.z;
import c5.b0.m;
import c5.h;
import c5.j0;
import com.basitce.htmltoapk.R;
import o.b;

/* loaded from: classes.dex */
public class g extends h implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final b W;
    public final c X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4844a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4845b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f4846c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4847d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d f4848e0;

    /* renamed from: f0, reason: collision with root package name */
    public Dialog f4849f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4850g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4851h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4852i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f4853j0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.X.onDismiss(gVar.f4849f0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f4849f0;
            if (dialog != null) {
                gVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f4849f0;
            if (dialog != null) {
                gVar.onDismiss(dialog);
            }
        }
    }

    public class d implements androidx.lifecycle.b0<androidx.lifecycle.t> {
        public d() {
        }

        @Override // androidx.lifecycle.b0
        public final void a(androidx.lifecycle.t tVar) {
            if (tVar != null) {
                g gVar = g.this;
                if (gVar.f4845b0) {
                    gVar.getClass();
                    throw new IllegalStateException("Fragment " + gVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
            }
        }
    }

    public class e extends p {
        public e(h.c cVar) {
        }

        @Override // c5.p
        public final View Y(int i10) {
            Dialog dialog = g.this.f4849f0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // c5.p
        public final boolean Z() {
            return g.this.f4853j0;
        }
    }

    public g() {
        new a();
        this.W = new b();
        this.X = new c();
        this.Y = 0;
        this.Z = 0;
        this.f4844a0 = true;
        this.f4845b0 = true;
        this.f4846c0 = -1;
        this.f4848e0 = new d();
        this.f4853j0 = false;
    }

    public Dialog C() {
        if (b0.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.u(A(), this.Z);
    }

    @Override // c5.h
    public final p d() {
        return new e(new h.c());
    }

    @Override // c5.h
    @Deprecated
    public final void n() {
        this.F = true;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f4850g0) {
            return;
        }
        if (b0.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4851h0) {
            return;
        }
        this.f4851h0 = true;
        this.f4852i0 = false;
        Dialog dialog = this.f4849f0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4849f0.dismiss();
        }
        this.f4850g0 = true;
        if (this.f4846c0 >= 0) {
            b0 b0VarI = i();
            int i10 = this.f4846c0;
            if (i10 < 0) {
                throw new IllegalArgumentException(j2.y.a(i10, "Bad id: "));
            }
            b0VarI.w(b0VarI.new m(i10), true);
            this.f4846c0 = -1;
            return;
        }
        c5.a aVar = new c5.a(i());
        aVar.f4933o = true;
        b0 b0Var = this.f4889t;
        if (b0Var == null || b0Var == aVar.f4760p) {
            aVar.b(new j0.a(3, this));
            aVar.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // c5.h
    public final void p(Context context) {
        androidx.lifecycle.z<androidx.lifecycle.t>.d dVar;
        super.p(context);
        androidx.lifecycle.a0<androidx.lifecycle.t> a0Var = this.Q;
        a0Var.getClass();
        androidx.lifecycle.z.a("observeForever");
        d dVar2 = this.f4848e0;
        z.b bVar = new z.b(dVar2);
        o.b<androidx.lifecycle.b0<? super androidx.lifecycle.t>, androidx.lifecycle.z<androidx.lifecycle.t>.d> bVar2 = a0Var.f2383b;
        b.c<androidx.lifecycle.b0<? super androidx.lifecycle.t>, androidx.lifecycle.z<androidx.lifecycle.t>.d> cVarA = bVar2.a(dVar2);
        if (cVarA != null) {
            dVar = cVarA.f18832b;
        } else {
            b.c<K, V> cVar = new b.c<>(dVar2, bVar);
            bVar2.f18830d++;
            b.c cVar2 = bVar2.f18828b;
            if (cVar2 == null) {
                bVar2.f18827a = cVar;
                bVar2.f18828b = cVar;
            } else {
                cVar2.f18833c = cVar;
                cVar.f18834d = cVar2;
                bVar2.f18828b = cVar;
            }
            dVar = null;
        }
        androidx.lifecycle.z<androidx.lifecycle.t>.d dVar3 = dVar;
        if (dVar3 instanceof z.c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar3 == null) {
            bVar.a(true);
        }
        if (this.f4852i0) {
            return;
        }
        this.f4851h0 = false;
    }

    @Override // c5.h
    public final void q(Bundle bundle) {
        super.q(bundle);
        new Handler();
        this.f4845b0 = this.f4894z == 0;
        if (bundle != null) {
            this.Y = bundle.getInt("android:style", 0);
            this.Z = bundle.getInt("android:theme", 0);
            this.f4844a0 = bundle.getBoolean("android:cancelable", true);
            this.f4845b0 = bundle.getBoolean("android:showsDialog", this.f4845b0);
            this.f4846c0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // c5.h
    public final void s() {
        this.F = true;
        Dialog dialog = this.f4849f0;
        if (dialog != null) {
            this.f4850g0 = true;
            dialog.setOnDismissListener(null);
            this.f4849f0.dismiss();
            if (!this.f4851h0) {
                onDismiss(this.f4849f0);
            }
            this.f4849f0 = null;
            this.f4853j0 = false;
        }
    }

    @Override // c5.h
    public final void t() {
        this.F = true;
        if (!this.f4852i0 && !this.f4851h0) {
            this.f4851h0 = true;
        }
        this.Q.g(this.f4848e0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:29:0x0048, B:32:0x0050, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:33:0x0068), top: B:52:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:29:0x0048, B:32:0x0050, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:33:0x0068), top: B:52:0x001a }] */
    @Override // c5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater u(Bundle bundle) {
        t<?> tVar;
        LayoutInflater layoutInflaterU = super.u(bundle);
        boolean z10 = this.f4845b0;
        if (z10 && !this.f4847d0) {
            if (z10 && !this.f4853j0) {
                try {
                    this.f4847d0 = true;
                    Dialog dialogC = C();
                    this.f4849f0 = dialogC;
                    n nVar = null;
                    if (this.f4845b0) {
                        int i10 = this.Y;
                        if (i10 == 1 || i10 == 2) {
                            dialogC.requestWindowFeature(1);
                            tVar = this.f4890v;
                            if (tVar != null) {
                                nVar = tVar.f4980b;
                            }
                            if (nVar != null) {
                                this.f4849f0.setOwnerActivity(nVar);
                            }
                            this.f4849f0.setCancelable(this.f4844a0);
                            this.f4849f0.setOnCancelListener(this.W);
                            this.f4849f0.setOnDismissListener(this.X);
                            this.f4853j0 = true;
                        } else if (i10 == 3) {
                            Window window = dialogC.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogC.requestWindowFeature(1);
                            tVar = this.f4890v;
                            if (tVar != null) {
                            }
                            if (nVar != null) {
                            }
                            this.f4849f0.setCancelable(this.f4844a0);
                            this.f4849f0.setOnCancelListener(this.W);
                            this.f4849f0.setOnDismissListener(this.X);
                            this.f4853j0 = true;
                        } else {
                            tVar = this.f4890v;
                            if (tVar != null) {
                            }
                            if (nVar != null) {
                            }
                            this.f4849f0.setCancelable(this.f4844a0);
                            this.f4849f0.setOnCancelListener(this.W);
                            this.f4849f0.setOnDismissListener(this.X);
                            this.f4853j0 = true;
                        }
                    } else {
                        this.f4849f0 = null;
                    }
                    this.f4847d0 = false;
                } catch (Throwable th2) {
                    this.f4847d0 = false;
                    throw th2;
                }
            }
            if (b0.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4849f0;
            if (dialog != null) {
                return layoutInflaterU.cloneInContext(dialog.getContext());
            }
        } else if (b0.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4845b0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterU;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterU;
    }

    @Override // c5.h
    public final void w(Bundle bundle) {
        Dialog dialog = this.f4849f0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.Y;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.Z;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f4844a0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f4845b0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f4846c0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // c5.h
    public final void x() {
        this.F = true;
        Dialog dialog = this.f4849f0;
        if (dialog != null) {
            this.f4850g0 = false;
            dialog.show();
            View decorView = this.f4849f0.getWindow().getDecorView();
            c1.d(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // c5.h
    public final void y() {
        this.F = true;
        Dialog dialog = this.f4849f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // c5.h
    public final void z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.z(layoutInflater, viewGroup, bundle);
        if (this.f4849f0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4849f0.onRestoreInstanceState(bundle2);
    }
}
