package b4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements v0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1996b;

    public d(BottomSheetBehavior bottomSheetBehavior, int i6) {
        this.f1996b = bottomSheetBehavior;
        this.f1995a = i6;
    }

    @Override // v0.d
    public final boolean a(View view) {
        this.f1996b.F(this.f1995a);
        return true;
    }
}
