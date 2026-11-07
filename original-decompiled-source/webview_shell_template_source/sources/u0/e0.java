package u0;

import android.view.View;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0 extends f0.b<Boolean> {
    @Override // u0.f0.b
    public final Boolean a(View view) {
        return Boolean.valueOf(f0.g.b(view));
    }

    @Override // u0.f0.b
    public final void b(View view, Boolean bool) {
        f0.g.d(view, bool.booleanValue());
    }

    @Override // u0.f0.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
