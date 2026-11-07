package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.g0;
import androidx.fragment.app.k;
import androidx.fragment.app.y.m;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class j extends k implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l0, reason: collision with root package name */
    public Handler f1144l0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1152u0;

    /* renamed from: w0, reason: collision with root package name */
    public Dialog f1154w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1155x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f1156y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1157z0;

    /* renamed from: m0, reason: collision with root package name */
    public final a f1145m0 = new a();

    /* renamed from: n0, reason: collision with root package name */
    public final b f1146n0 = new b();

    /* renamed from: o0, reason: collision with root package name */
    public final c f1147o0 = new c();
    public int p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1148q0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f1149r0 = true;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1150s0 = true;

    /* renamed from: t0, reason: collision with root package name */
    public int f1151t0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1153v0 = new d();
    public boolean A0 = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            j jVar = j.this;
            jVar.f1147o0.onDismiss(jVar.f1154w0);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            j jVar = j.this;
            Dialog dialog = jVar.f1154w0;
            if (dialog != null) {
                jVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            j jVar = j.this;
            Dialog dialog = jVar.f1154w0;
            if (dialog != null) {
                jVar.onDismiss(dialog);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements androidx.lifecycle.s<androidx.lifecycle.m> {
        public d() {
        }

        @Override // androidx.lifecycle.s
        @SuppressLint({"SyntheticAccessor"})
        public final void onChanged(androidx.lifecycle.m mVar) {
            if (mVar != null) {
                j jVar = j.this;
                if (jVar.f1150s0) {
                    View viewZ = jVar.z();
                    if (viewZ.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (jVar.f1154w0 != null) {
                        if (y.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + jVar.f1154w0);
                        }
                        jVar.f1154w0.setContentView(viewZ);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends p {
        public final /* synthetic */ k.b s;

        public e(k.b bVar) {
            this.s = bVar;
        }

        @Override // androidx.fragment.app.p
        public final View d(int i6) {
            k.b bVar = this.s;
            if (bVar.g()) {
                return bVar.d(i6);
            }
            Dialog dialog = j.this.f1154w0;
            if (dialog != null) {
                return dialog.findViewById(i6);
            }
            return null;
        }

        @Override // androidx.fragment.app.p
        public final boolean g() {
            return this.s.g() || j.this.A0;
        }
    }

    public final void C(boolean z6, boolean z7) {
        if (this.f1156y0) {
            return;
        }
        this.f1156y0 = true;
        this.f1157z0 = false;
        Dialog dialog = this.f1154w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1154w0.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f1144l0.getLooper()) {
                    onDismiss(this.f1154w0);
                } else {
                    this.f1144l0.post(this.f1145m0);
                }
            }
        }
        this.f1155x0 = true;
        if (this.f1151t0 >= 0) {
            y yVarF = f();
            int i6 = this.f1151t0;
            if (i6 < 0) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Bad id: "));
            }
            yVarF.w(yVarF.new m(i6), z6);
            this.f1151t0 = -1;
            return;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(f());
        aVar.f1122o = true;
        y yVar = this.J;
        if (yVar != null && yVar != aVar.f1058p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new g0.a(3, this));
        if (z6) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog D() {
        if (y.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.r(y(), this.f1148q0);
    }

    @Override // androidx.fragment.app.k
    public final p a() {
        return new e(new k.b());
    }

    @Override // androidx.fragment.app.k
    @Deprecated
    public final void l() {
        this.U = true;
    }

    @Override // androidx.fragment.app.k
    public final void n(Context context) {
        super.n(context);
        this.f1189g0.observeForever(this.f1153v0);
        if (this.f1157z0) {
            return;
        }
        this.f1156y0 = false;
    }

    @Override // androidx.fragment.app.k
    public void o(Bundle bundle) {
        super.o(bundle);
        this.f1144l0 = new Handler();
        this.f1150s0 = this.O == 0;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.f1148q0 = bundle.getInt("android:theme", 0);
            this.f1149r0 = bundle.getBoolean("android:cancelable", true);
            this.f1150s0 = bundle.getBoolean("android:showsDialog", this.f1150s0);
            this.f1151t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1155x0) {
            return;
        }
        if (y.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        C(true, true);
    }

    @Override // androidx.fragment.app.k
    public final void q() {
        this.U = true;
        Dialog dialog = this.f1154w0;
        if (dialog != null) {
            this.f1155x0 = true;
            dialog.setOnDismissListener(null);
            this.f1154w0.dismiss();
            if (!this.f1156y0) {
                onDismiss(this.f1154w0);
            }
            this.f1154w0 = null;
            this.A0 = false;
        }
    }

    @Override // androidx.fragment.app.k
    public final void r() {
        this.U = true;
        if (!this.f1157z0 && !this.f1156y0) {
            this.f1156y0 = true;
        }
        this.f1189g0.removeObserver(this.f1153v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater s(Bundle bundle) {
        Context contextD;
        LayoutInflater layoutInflaterS = super.s(bundle);
        boolean z6 = this.f1150s0;
        if (z6 && !this.f1152u0) {
            if (z6 && !this.A0) {
                try {
                    this.f1152u0 = true;
                    Dialog dialogD = D();
                    this.f1154w0 = dialogD;
                    if (this.f1150s0) {
                        int i6 = this.p0;
                        if (i6 == 1 || i6 == 2) {
                            dialogD.requestWindowFeature(1);
                            contextD = d();
                            if (contextD != null) {
                                this.f1154w0.setOwnerActivity((Activity) contextD);
                            }
                            this.f1154w0.setCancelable(this.f1149r0);
                            this.f1154w0.setOnCancelListener(this.f1146n0);
                            this.f1154w0.setOnDismissListener(this.f1147o0);
                            this.A0 = true;
                        } else if (i6 == 3) {
                            Window window = dialogD.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogD.requestWindowFeature(1);
                            contextD = d();
                            if (contextD != null) {
                            }
                            this.f1154w0.setCancelable(this.f1149r0);
                            this.f1154w0.setOnCancelListener(this.f1146n0);
                            this.f1154w0.setOnDismissListener(this.f1147o0);
                            this.A0 = true;
                        } else {
                            contextD = d();
                            if (contextD != null) {
                            }
                            this.f1154w0.setCancelable(this.f1149r0);
                            this.f1154w0.setOnCancelListener(this.f1146n0);
                            this.f1154w0.setOnDismissListener(this.f1147o0);
                            this.A0 = true;
                        }
                    } else {
                        this.f1154w0 = null;
                    }
                    this.f1152u0 = false;
                } catch (Throwable th) {
                    this.f1152u0 = false;
                    throw th;
                }
            }
            if (y.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f1154w0;
            if (dialog != null) {
                return layoutInflaterS.cloneInContext(dialog.getContext());
            }
        } else if (y.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f1150s0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterS;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterS;
    }

    @Override // androidx.fragment.app.k
    public void t(Bundle bundle) {
        Dialog dialog = this.f1154w0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i6 = this.p0;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i7 = this.f1148q0;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z6 = this.f1149r0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f1150s0;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i8 = this.f1151t0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // androidx.fragment.app.k
    public void u() {
        this.U = true;
        Dialog dialog = this.f1154w0;
        if (dialog != null) {
            this.f1155x0 = false;
            dialog.show();
            View decorView = this.f1154w0.getWindow().getDecorView();
            kotlin.jvm.internal.j.e("<this>", decorView);
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.k
    public void v() {
        this.U = true;
        Dialog dialog = this.f1154w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.k
    public final void w(Bundle bundle) {
        Bundle bundle2;
        this.U = true;
        if (this.f1154w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1154w0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.k
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.W != null || this.f1154w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1154w0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
