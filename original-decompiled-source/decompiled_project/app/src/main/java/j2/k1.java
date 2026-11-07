package j2;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class k1 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f14823a;

    public k1(ViewConfiguration viewConfiguration) {
        this.f14823a = viewConfiguration;
    }

    @Override // j2.k5
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // j2.k5
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // j2.k5
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f14823a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // j2.k5
    public final float e() {
        return this.f14823a.getScaledMaximumFlingVelocity();
    }

    @Override // j2.k5
    public final float f() {
        return this.f14823a.getScaledTouchSlop();
    }

    @Override // j2.k5
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f14823a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
