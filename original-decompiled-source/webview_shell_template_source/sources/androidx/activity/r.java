package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class r extends Dialog implements androidx.lifecycle.m, p0, y1.c {
    public androidx.lifecycle.n s;

    /* renamed from: t, reason: collision with root package name */
    public final y1.b f84t;

    /* renamed from: u, reason: collision with root package name */
    public final OnBackPressedDispatcher f85u;

    public r(Context context, int i6) {
        super(context, i6);
        this.f84t = new y1.b(this);
        this.f85u = new OnBackPressedDispatcher(new j(1, this));
    }

    public static void a(r rVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e("view", view);
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.j.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.j.d("window!!.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.j.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.j.d("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.j.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.j.d("window!!.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.h getLifecycle() {
        androidx.lifecycle.n nVar = this.s;
        if (nVar != null) {
            return nVar;
        }
        androidx.lifecycle.n nVar2 = new androidx.lifecycle.n(this);
        this.s = nVar2;
        return nVar2;
    }

    @Override // androidx.activity.p0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f85u;
    }

    @Override // y1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f84t.f15219b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f85u.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d("onBackInvokedDispatcher", onBackInvokedDispatcher);
            OnBackPressedDispatcher onBackPressedDispatcher = this.f85u;
            onBackPressedDispatcher.f47e = onBackInvokedDispatcher;
            onBackPressedDispatcher.d(onBackPressedDispatcher.f49g);
        }
        this.f84t.b(bundle);
        androidx.lifecycle.n nVar = this.s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.s = nVar;
        }
        nVar.f(h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.j.d("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f84t.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.n nVar = this.s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.s = nVar;
        }
        nVar.f(h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.n nVar = this.s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.s = nVar;
        }
        nVar.f(h.a.ON_DESTROY);
        this.s = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        b();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.j.e("view", view);
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e("view", view);
        b();
        super.setContentView(view, layoutParams);
    }
}
