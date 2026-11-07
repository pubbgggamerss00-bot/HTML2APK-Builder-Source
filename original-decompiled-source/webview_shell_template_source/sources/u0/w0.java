package u0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class w0 extends androidx.work.j {
    public final WindowInsetsController s;

    /* renamed from: t, reason: collision with root package name */
    public final w f14587t;

    /* renamed from: u, reason: collision with root package name */
    public final Window f14588u;

    public w0(Window window, w wVar) {
        WindowInsetsController insetsController = window.getInsetsController();
        new w.g();
        this.s = insetsController;
        this.f14587t = wVar;
        this.f14588u = window;
    }

    @Override // androidx.work.j
    public final void h(int i6) {
        this.s.hide(i6 & (-9));
    }

    @Override // androidx.work.j
    public final void k(boolean z6) {
        Window window = this.f14588u;
        if (z6) {
            if (window != null) {
                o(16);
            }
            this.s.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                p(16);
            }
            this.s.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // androidx.work.j
    public final void l(boolean z6) {
        Window window = this.f14588u;
        if (z6) {
            if (window != null) {
                o(8192);
            }
            this.s.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                p(8192);
            }
            this.s.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // androidx.work.j
    public void m() {
        Window window = this.f14588u;
        if (window == null) {
            this.s.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        p(2048);
        o(4096);
    }

    @Override // androidx.work.j
    public final void n(int i6) {
        if ((i6 & 8) != 0) {
            this.f14587t.f14584a.b();
        }
        this.s.show(i6 & (-9));
    }

    public final void o(int i6) {
        View decorView = this.f14588u.getDecorView();
        decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
    }

    public final void p(int i6) {
        View decorView = this.f14588u.getDecorView();
        decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
    }
}
