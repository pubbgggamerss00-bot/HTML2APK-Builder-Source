package c1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2159a;

    public d(c cVar) {
        this.f2159a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return this.f2159a.f2157u.getInterpolation(f6);
    }
}
