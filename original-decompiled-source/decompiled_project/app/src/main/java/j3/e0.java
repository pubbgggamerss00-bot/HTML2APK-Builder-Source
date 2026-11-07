package j3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.UUID;
import y3.w0;

/* loaded from: classes.dex */
public final class e0 extends b.u {

    /* renamed from: d, reason: collision with root package name */
    public eh.a<pg.f0> f15051d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f15052e;

    /* renamed from: f, reason: collision with root package name */
    public final View f15053f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f15054g;

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
            e0 e0Var = e0.this;
            if (e0Var.f15052e.f15045a) {
                e0Var.f15051d.invoke();
            }
            return pg.f0.f21461a;
        }
    }

    public e0(eh.a<pg.f0> aVar, d0 d0Var, View view, f3.r rVar, f3.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), d0Var.f15049e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f15051d = aVar;
        this.f15052e = d0Var;
        this.f15053f = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        w0.a(window, this.f15052e.f15049e);
        window.setGravity(17);
        c0 c0Var = new c0(getContext(), window);
        c0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c0Var.setClipChildren(false);
        c0Var.setElevation(dVar.N0(f10));
        c0Var.setOutlineProvider(new a());
        this.f15054g = c0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(c0Var);
        c1.d(c0Var, c1.c(view));
        c0Var.setTag(R.id.view_tree_view_model_store_owner, d1.a(view));
        c0Var.setTag(R.id.view_tree_saved_state_registry_owner, b6.c.d(view));
        d(this.f15051d, this.f15052e, rVar);
        b.h0.a(this.f3273c, this, new b());
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof c0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(eh.a<pg.f0> aVar, d0 d0Var, f3.r rVar) {
        int i10;
        this.f15051d = aVar;
        this.f15052e = d0Var;
        q0 q0Var = d0Var.f15047c;
        boolean zB = k.b(this.f15053f);
        int iOrdinal = q0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.r.b(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = rVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new pg.l();
            }
            i10 = 1;
        }
        c0 c0Var = this.f15054g;
        c0Var.setLayoutDirection(i10);
        boolean z10 = d0Var.f15049e;
        boolean z11 = d0Var.f15048d;
        Window window2 = c0Var.f15033j;
        boolean z12 = (c0Var.f15037n && z11 == c0Var.f15035l && z10 == c0Var.f15036m) ? false : true;
        c0Var.f15035l = z11;
        c0Var.f15036m = z10;
        if (z12) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z11 ? -2 : -1;
            if (i11 != attributes.width || !c0Var.f15037n) {
                window2.setLayout(i11, -2);
                c0Var.f15037n = true;
            }
        }
        setCanceledOnTouchOutside(d0Var.f15046b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z10 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f15052e.f15045a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f15051d.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7 <= r1) goto L24;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f15052e.f15046b) {
            c0 c0Var = this.f15054g;
            c0Var.getClass();
            float x10 = motionEvent.getX();
            if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
                float y10 = motionEvent.getY();
                if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = c0Var.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + c0Var.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + c0Var.getTop();
                    int height = childAt.getHeight() + top;
                    int iB = gh.a.b(motionEvent.getX());
                    if (left <= iB) {
                        if (iB <= width) {
                            int iB2 = gh.a.b(motionEvent.getY());
                            if (top <= iB2) {
                            }
                        }
                    }
                }
            }
            this.f15051d.invoke();
            return true;
        }
        return zOnTouchEvent;
    }
}
