package z3;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k implements v0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f15442a;

    public k(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15442a = swipeDismissBehavior;
    }

    @Override // v0.d
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f15442a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        boolean z6 = view.getLayoutDirection() == 1;
        int i6 = swipeDismissBehavior.f12027d;
        int width = (!(i6 == 0 && z6) && (i6 != 1 || z6)) ? view.getWidth() : -view.getWidth();
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }
}
