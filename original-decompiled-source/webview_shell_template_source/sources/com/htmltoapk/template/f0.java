package com.htmltoapk.template;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12555t;

    public /* synthetic */ f0(int i6, Object obj) {
        this.s = i6;
        this.f12555t = obj;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                w2.t tVar = (w2.t) this.f12555t;
                LinearLayout linearLayout = tVar.f15008a0;
                if (linearLayout == null || tVar.f15016i0 == 0) {
                    tVar.n();
                } else {
                    tVar.Q = !tVar.Q;
                    linearLayout.animate().cancel();
                    if (tVar.Q) {
                        linearLayout.setVisibility(0);
                        linearLayout.animate().translationY(0.0f).alpha(1.0f).setDuration(180L).start();
                        tVar.f15024t.removeCallbacks(tVar.f15013f0);
                        tVar.V.animate().alpha(0.0f).setDuration(150L).start();
                    } else {
                        linearLayout.animate().translationY(linearLayout.getHeight()).alpha(0.0f).setDuration(180L).withEndAction(new u0(3, tVar, linearLayout)).start();
                    }
                }
                p5.a<d5.j> aVar = tVar.f15021n0;
                if (aVar != null) {
                    aVar.a();
                }
                break;
            default:
                ((w2.a0) this.f12555t).c(false);
                break;
        }
        return d5.j.f12745a;
    }
}
