package n4;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import n4.n;
import u0.r;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements r {
    public final /* synthetic */ b4.c s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n.a f13993t;

    public l(b4.c cVar, n.a aVar) {
        this.s = cVar;
        this.f13993t = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    @Override // u0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 d(View view, s0 s0Var) {
        boolean z6;
        boolean z7;
        n.a aVar = this.f13993t;
        int i6 = aVar.f13994a;
        int i7 = aVar.f13995b;
        int i8 = aVar.f13996c;
        s0.l lVar = s0Var.f14553a;
        m0.b bVarF = lVar.f(519);
        m0.b bVarF2 = lVar.f(32);
        b4.c cVar = this.s;
        BottomSheetBehavior bottomSheetBehavior = cVar.f1994b;
        int i9 = bVarF.f13855b;
        int i10 = bVarF.f13856c;
        int i11 = bVarF.f13854a;
        bottomSheetBehavior.f12090x = i9;
        boolean z8 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z9 = bottomSheetBehavior.f12083p;
        if (z9) {
            int iA = s0Var.a();
            bottomSheetBehavior.f12089w = iA;
            paddingBottom = iA + i8;
        }
        if (bottomSheetBehavior.f12084q) {
            paddingLeft = (z8 ? i7 : i6) + i11;
        }
        int i12 = paddingLeft;
        if (bottomSheetBehavior.f12085r) {
            if (!z8) {
                i6 = i7;
            }
            paddingRight = i6 + i10;
        }
        int i13 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f12086t || marginLayoutParams.leftMargin == i11) {
            z6 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z6 = true;
        }
        if (bottomSheetBehavior.f12087u && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z6 = true;
        }
        if (bottomSheetBehavior.f12088v) {
            int i14 = marginLayoutParams.topMargin;
            int i15 = bVarF.f13855b;
            if (i14 != i15) {
                marginLayoutParams.topMargin = i15;
                z7 = true;
            } else {
                z7 = z6;
            }
        }
        if (z7) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(i12, view.getPaddingTop(), i13, paddingBottom);
        boolean z10 = cVar.f1993a;
        if (z10) {
            bottomSheetBehavior.f12081n = bVarF2.f13857d;
        }
        if (!z9 && !z10) {
            return s0Var;
        }
        bottomSheetBehavior.M();
        return s0Var;
    }
}
