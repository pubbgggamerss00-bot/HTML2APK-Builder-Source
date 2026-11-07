package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.j0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f2340a = new AtomicBoolean(false);

    public static final class a extends g {
        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            j0.a.b(activity);
        }
    }
}
