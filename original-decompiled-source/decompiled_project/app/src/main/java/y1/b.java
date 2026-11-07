package y1;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f33674a;

    public b(AndroidComposeView androidComposeView) {
        this.f33674a = androidComposeView;
    }

    @Override // y1.a
    public final void a(int i10) {
        AndroidComposeView androidComposeView = this.f33674a;
        if (i10 == 16) {
            androidComposeView.performHapticFeedback(16);
            return;
        }
        if (i10 == 6) {
            androidComposeView.performHapticFeedback(6);
            return;
        }
        if (i10 == 13) {
            androidComposeView.performHapticFeedback(13);
            return;
        }
        if (i10 == 23) {
            androidComposeView.performHapticFeedback(23);
            return;
        }
        if (i10 == 0) {
            androidComposeView.performHapticFeedback(0);
            return;
        }
        if (i10 == 17) {
            androidComposeView.performHapticFeedback(17);
            return;
        }
        if (i10 == 27) {
            androidComposeView.performHapticFeedback(27);
            return;
        }
        if (i10 == 26) {
            androidComposeView.performHapticFeedback(26);
            return;
        }
        if (i10 == 9) {
            androidComposeView.performHapticFeedback(9);
            return;
        }
        if (i10 == 22) {
            androidComposeView.performHapticFeedback(22);
        } else if (i10 == 21) {
            androidComposeView.performHapticFeedback(21);
        } else if (i10 == 1) {
            androidComposeView.performHapticFeedback(1);
        }
    }
}
