package r4;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f23209a;

    public b(a aVar) {
        this.f23209a = aVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.f23209a.f23206u.getInterpolation(f10);
    }
}
