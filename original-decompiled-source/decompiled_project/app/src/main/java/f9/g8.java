package f9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.LinearLayout;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9676b;

    public /* synthetic */ g8(Object obj, int i10) {
        this.f9675a = i10;
        this.f9676b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9675a) {
            case 0:
                Context context = (Context) this.f9676b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://apps.admob.com"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } catch (Exception unused) {
                }
                break;
            default:
                final m9.g0 g0Var = (m9.g0) this.f9676b;
                final LinearLayout linearLayout = g0Var.I;
                if (linearLayout == null || g0Var.R == 0) {
                    g0Var.p();
                } else {
                    g0Var.B = !g0Var.B;
                    linearLayout.animate().cancel();
                    if (g0Var.B) {
                        linearLayout.setVisibility(0);
                        linearLayout.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).alpha(1.0f).setDuration(180L).start();
                        g0Var.f17775b.removeCallbacks(g0Var.O);
                        g0Var.G.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(150L).start();
                    } else {
                        linearLayout.animate().translationY(linearLayout.getHeight()).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(180L).withEndAction(new Runnable() { // from class: m9.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (g0Var.B) {
                                    return;
                                }
                                linearLayout.setVisibility(4);
                            }
                        }).start();
                    }
                }
                eh.a<pg.f0> aVar = g0Var.W;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
