package w2;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f15046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f15048c;

    public v(t tVar, int i6, float f6) {
        this.f15046a = tVar;
        this.f15047b = i6;
        this.f15048c = f6;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        final t tVar = this.f15046a;
        s0 s0Var = tVar.B;
        kotlin.jvm.internal.j.e("v", view);
        if (i8 - i6 <= 0) {
            return;
        }
        s0Var.removeOnLayoutChangeListener(this);
        final int i14 = this.f15047b;
        final float f6 = this.f15048c;
        s0Var.post(new Runnable() { // from class: w2.u
            @Override // java.lang.Runnable
            public final void run() {
                t tVar2 = tVar;
                int i15 = i14;
                float f7 = f6;
                if (tVar2.K) {
                    return;
                }
                tVar2.k(f7, i15);
            }
        });
    }
}
