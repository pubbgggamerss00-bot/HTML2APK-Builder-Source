package u0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class t0 extends androidx.work.j {
    public final Window s;

    /* renamed from: t, reason: collision with root package name */
    public final w f14579t;

    public t0(Window window, w wVar) {
        this.s = window;
        this.f14579t = wVar;
    }

    @Override // androidx.work.j
    public final void h(int i6) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                if (i7 == 1) {
                    o(4);
                } else if (i7 == 2) {
                    o(2);
                } else if (i7 == 8) {
                    this.f14579t.f14584a.a();
                }
            }
        }
    }

    @Override // androidx.work.j
    public final void m() {
        this.s.getDecorView().setTag(356039078, 2);
        p(2048);
        o(4096);
    }

    @Override // androidx.work.j
    public final void n(int i6) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                if (i7 == 1) {
                    p(4);
                    this.s.clearFlags(1024);
                } else if (i7 == 2) {
                    p(2);
                } else if (i7 == 8) {
                    this.f14579t.f14584a.b();
                }
            }
        }
    }

    public final void o(int i6) {
        View decorView = this.s.getDecorView();
        decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
    }

    public final void p(int i6) {
        View decorView = this.s.getDecorView();
        decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
    }
}
