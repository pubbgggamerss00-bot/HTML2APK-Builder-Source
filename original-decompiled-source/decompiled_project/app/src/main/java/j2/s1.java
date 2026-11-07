package j2;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class s1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f14893a = new s1();

    @Override // j2.p1
    public final Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
