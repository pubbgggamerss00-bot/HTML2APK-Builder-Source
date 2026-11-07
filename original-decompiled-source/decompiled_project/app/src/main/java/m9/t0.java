package m9;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17937b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f17936a = i10;
        this.f17937b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17936a) {
            case 0:
                u0 u0Var = (u0) this.f17937b;
                if (!u0Var.f17948f) {
                    u0Var.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(250L).start();
                    break;
                }
                break;
            default:
                ph.s1 s1Var = (ph.s1) this.f17937b;
                if (s1Var != null) {
                    s1Var.cancel((CancellationException) null);
                    break;
                }
                break;
        }
    }
}
