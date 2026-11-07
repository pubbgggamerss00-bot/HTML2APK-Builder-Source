package qb;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import z3.l;

/* loaded from: classes2.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f22596b;

    public d(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f22596b = bottomSheetBehavior;
        this.f22595a = i10;
    }

    @Override // z3.l
    public final boolean a(View view) {
        this.f22596b.r(this.f22595a);
        return true;
    }
}
