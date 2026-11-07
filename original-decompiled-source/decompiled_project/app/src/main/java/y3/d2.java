package y3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class d2 extends e9.x0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsetsController f33806c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f33807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Window window) {
        super(3);
        WindowInsetsController insetsController = window.getInsetsController();
        new p.b1();
        this.f33806c = insetsController;
        this.f33807d = window;
    }

    @Override // e9.x0
    public void b(boolean z10) {
        d(16, 16, z10);
    }

    @Override // e9.x0
    public void c(boolean z10) {
        d(8192, 8, z10);
    }

    public final void d(int i10, int i11, boolean z10) {
        Window window = this.f33807d;
        if (window == null) {
            if (z10) {
                this.f33806c.setSystemBarsAppearance(i11, i11);
                return;
            } else {
                this.f33806c.setSystemBarsAppearance(0, i11);
                return;
            }
        }
        if (z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i10) & decorView2.getSystemUiVisibility());
        }
    }
}
