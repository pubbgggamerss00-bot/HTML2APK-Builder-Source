package j2;

import android.graphics.Outline;

/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final q3 f14867a = new q3();

    public final void a(Outline outline, q1.u1 u1Var) {
        if (!(u1Var instanceof q1.j0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((q1.j0) u1Var).f21712a);
    }
}
