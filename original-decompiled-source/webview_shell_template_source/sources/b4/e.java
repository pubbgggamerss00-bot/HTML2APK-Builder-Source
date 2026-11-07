package b4;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import u0.r0;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends r0.b {

    /* renamed from: b, reason: collision with root package name */
    public final View f1997b;

    /* renamed from: c, reason: collision with root package name */
    public int f1998c;

    /* renamed from: d, reason: collision with root package name */
    public int f1999d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2000e = new int[2];

    public e(View view) {
        this.f1997b = view;
    }

    @Override // u0.r0.b
    public final void a(r0 r0Var) {
        this.f1997b.setTranslationY(0.0f);
    }

    @Override // u0.r0.b
    public final void b(r0 r0Var) {
        View view = this.f1997b;
        int[] iArr = this.f2000e;
        view.getLocationOnScreen(iArr);
        this.f1998c = iArr[1];
    }

    @Override // u0.r0.b
    public final s0 c(s0 s0Var, List<r0> list) {
        Iterator<r0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f14524a.d() & 8) != 0) {
                this.f1997b.setTranslationY(x3.a.c(r0.f14524a.c(), this.f1999d, 0));
                break;
            }
        }
        return s0Var;
    }

    @Override // u0.r0.b
    public final r0.a d(r0 r0Var, r0.a aVar) {
        View view = this.f1997b;
        int[] iArr = this.f2000e;
        view.getLocationOnScreen(iArr);
        int i6 = this.f1998c - iArr[1];
        this.f1999d = i6;
        view.setTranslationY(i6);
        return aVar;
    }
}
