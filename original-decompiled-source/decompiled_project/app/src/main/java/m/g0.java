package m;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class g0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f17135a = null;

    public static void a(Context context) {
        if ((context instanceof g0) || (context.getResources() instanceof i0)) {
            return;
        }
        context.getResources();
        int i10 = n0.f17151a;
    }
}
