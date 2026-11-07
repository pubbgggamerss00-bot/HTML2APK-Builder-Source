package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.c1;
import androidx.lifecycle.l;
import com.basitce.htmltoapk.R;
import f9.z0;

/* loaded from: classes.dex */
public class u extends Dialog implements androidx.lifecycle.t, i0, c6.e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f3271a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.d f3272b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f3273c;

    public u(Context context, int i10) {
        super(context, i10);
        this.f3272b = new c6.d(new e6.b(this, new z0(this, 2)));
        this.f3273c = new d0(new t(this, 0));
    }

    public static void a(u uVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.r.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.r.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window!!.decorView");
        c1.d(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.r.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.r.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.r.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.r.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.l getLifecycle() {
        androidx.lifecycle.v vVar = this.f3271a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f3271a = vVar2;
        return vVar2;
    }

    @Override // b.i0
    public final d0 getOnBackPressedDispatcher() {
        return this.f3273c;
    }

    @Override // c6.e
    public final c6.c getSavedStateRegistry() {
        return this.f3272b.f4996b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3273c.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.r.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            d0 d0Var = this.f3273c;
            d0Var.f3226e = onBackInvokedDispatcher;
            d0Var.d(d0Var.f3228g);
        }
        this.f3272b.a(bundle);
        androidx.lifecycle.v vVar = this.f3271a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f3271a = vVar;
        }
        vVar.f(l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.r.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f3272b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.f3271a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f3271a = vVar;
        }
        vVar.f(l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.v vVar = this.f3271a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f3271a = vVar;
        }
        vVar.f(l.a.ON_DESTROY);
        this.f3271a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        kotlin.jvm.internal.r.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.r.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
