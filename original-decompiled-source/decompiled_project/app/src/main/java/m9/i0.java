package m9;

import android.view.View;

/* loaded from: classes.dex */
public final class i0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f17821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f17823c;

    public i0(g0 g0Var, int i10, float f10) {
        this.f17821a = g0Var;
        this.f17822b = i10;
        this.f17823c = f10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final g0 g0Var = this.f17821a;
        c2 c2Var = g0Var.f17785k;
        kotlin.jvm.internal.r.e(v10, "v");
        if (i12 - i10 <= 0) {
            return;
        }
        c2Var.removeOnLayoutChangeListener(this);
        final int i18 = this.f17822b;
        final float f10 = this.f17823c;
        c2Var.post(new Runnable() { // from class: m9.h0
            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var2 = g0Var;
                int i19 = i18;
                float f11 = f10;
                if (g0Var2.f17794v) {
                    return;
                }
                g0Var2.m(f11, i19);
            }
        });
    }
}
