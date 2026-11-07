package t0;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e6 extends b.u {

    /* renamed from: d, reason: collision with root package name */
    public eh.a<pg.f0> f25800d;

    /* renamed from: e, reason: collision with root package name */
    public q7 f25801e;

    /* renamed from: f, reason: collision with root package name */
    public final View f25802f;

    /* renamed from: g, reason: collision with root package name */
    public final d6 f25803g;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<b.w, pg.f0> {
        public b() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(b.w wVar) {
            e6 e6Var = e6.this;
            if (e6Var.f25801e.f26790b) {
                e6Var.f25800d.invoke();
            }
            return pg.f0.f21461a;
        }
    }

    public e6(eh.a<pg.f0> aVar, q7 q7Var, View view, f3.r rVar, f3.d dVar, UUID uuid, s.b<Float, s.o> bVar, ph.i0 i0Var, boolean z10) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f25800d = aVar;
        this.f25801e = q7Var;
        this.f25802f = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        y3.w0.a(window, false);
        d6 d6Var = new d6(getContext(), this.f25801e.f26790b, this.f25800d, bVar, i0Var);
        d6Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        d6Var.setClipChildren(false);
        d6Var.setElevation(dVar.N0(f10));
        d6Var.setOutlineProvider(new a());
        this.f25803g = d6Var;
        setContentView(d6Var);
        androidx.lifecycle.c1.d(d6Var, androidx.lifecycle.c1.c(view));
        d6Var.setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.d1.a(view));
        d6Var.setTag(R.id.view_tree_saved_state_registry_owner, b6.c.d(view));
        c(this.f25800d, this.f25801e, rVar);
        window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        e9.x0 e2Var = i10 >= 35 ? new y3.e2(window) : i10 >= 30 ? new y3.d2(window) : new y3.a2(window);
        boolean z11 = !z10;
        e2Var.c(z11);
        e2Var.b(z11);
        b.h0.a(this.f3273c, this, new b());
    }

    public final void c(eh.a<pg.f0> aVar, q7 q7Var, f3.r rVar) {
        this.f25800d = aVar;
        this.f25801e = q7Var;
        j3.q0 q0Var = q7Var.f26789a;
        ViewGroup.LayoutParams layoutParams = this.f25802f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 1;
        boolean z10 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = q0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z10 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                z10 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.r.b(window);
        window.setFlags(z10 ? 8192 : -8193, 8192);
        int iOrdinal2 = rVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else if (iOrdinal2 != 1) {
            throw new pg.l();
        }
        this.f25803g.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f25800d.invoke();
        }
        return zOnTouchEvent;
    }
}
