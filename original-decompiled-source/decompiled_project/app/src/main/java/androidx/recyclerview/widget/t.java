package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f2654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2654q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.v.AbstractC0038v
    public final void e(View view, v.AbstractC0038v.a aVar) {
        u uVar = this.f2654q;
        int[] iArrA = uVar.a(uVar.f2519a.getLayoutManager(), view);
        int i10 = iArrA[0];
        int i11 = iArrA[1];
        int iCeil = (int) Math.ceil(i(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (iCeil > 0) {
            aVar.f2790a = i10;
            aVar.f2791b = i11;
            aVar.f2792c = iCeil;
            aVar.f2794e = this.f2643j;
            aVar.f2795f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int i(int i10) {
        return Math.min(100, super.i(i10));
    }
}
