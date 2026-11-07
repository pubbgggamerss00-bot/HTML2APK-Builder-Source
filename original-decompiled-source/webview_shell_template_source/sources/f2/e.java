package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import y4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13001b;

    public /* synthetic */ e(int i6, Object obj) {
        this.f13000a = i6;
        this.f13001b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13000a) {
            case 0:
                d dVar = (d) this.f13001b;
                ArrayList arrayList = new ArrayList(dVar.f12993w);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((c) arrayList.get(i6)).a(dVar);
                }
                break;
            default:
                k kVar = (k) this.f13001b;
                kVar.p();
                kVar.f15269r.start();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13000a) {
            case 0:
                d dVar = (d) this.f13001b;
                ArrayList arrayList = new ArrayList(dVar.f12993w);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((c) arrayList.get(i6)).b(dVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
