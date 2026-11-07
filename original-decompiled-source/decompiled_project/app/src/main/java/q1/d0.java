package q1;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class d0 implements k1 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21679d = true;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f21680a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21681b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public u1.b f21682c;

    public d0(AndroidComposeView androidComposeView) {
        this.f21680a = androidComposeView;
    }

    @Override // q1.k1
    public final void a(t1.d dVar) {
        synchronized (this.f21681b) {
            if (!dVar.f27652s) {
                dVar.f27652s = true;
                dVar.b();
            }
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    @Override // q1.k1
    public final t1.d b() {
        t1.e zVar;
        t1.d dVar;
        synchronized (this.f21681b) {
            try {
                AndroidComposeView androidComposeView = this.f21680a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    zVar = new t1.y();
                } else if (f21679d) {
                    try {
                        zVar = new t1.g(this.f21680a, new x0(), new s1.a());
                    } catch (Throwable unused) {
                        f21679d = false;
                        zVar = new t1.z(c(this.f21680a));
                    }
                } else {
                    zVar = new t1.z(c(this.f21680a));
                }
                dVar = new t1.d(zVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public final u1.a c(AndroidComposeView androidComposeView) {
        u1.b bVar = this.f21682c;
        if (bVar != null) {
            return bVar;
        }
        u1.b bVar2 = new u1.b(androidComposeView.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(bVar2, -1);
        this.f21682c = bVar2;
        return bVar2;
    }
}
