package j2;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14841a;

    public /* synthetic */ p(AndroidComposeView androidComposeView) {
        this.f14841a = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidComposeView androidComposeView = this.f14841a;
        androidComposeView.D0 = false;
        MotionEvent motionEvent = androidComposeView.f1257x0;
        kotlin.jvm.internal.r.b(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.a0(motionEvent);
    }
}
