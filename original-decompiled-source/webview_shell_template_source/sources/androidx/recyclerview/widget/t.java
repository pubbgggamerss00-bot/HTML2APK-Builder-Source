package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f1716q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f1716q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.w
    public final void e(View view, RecyclerView.w.a aVar) {
        u uVar = this.f1716q;
        int[] iArrB = uVar.b(uVar.f1584a.getLayoutManager(), view);
        int i6 = iArrB[0];
        int i7 = iArrB[1];
        int iCeil = (int) Math.ceil(k(Math.max(Math.abs(i6), Math.abs(i7))) / 0.3356d);
        if (iCeil > 0) {
            aVar.f1519a = i6;
            aVar.f1520b = i7;
            aVar.f1521c = iCeil;
            aVar.f1523e = this.f1705j;
            aVar.f1524f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float j(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int k(int i6) {
        return Math.min(100, super.k(i6));
    }
}
