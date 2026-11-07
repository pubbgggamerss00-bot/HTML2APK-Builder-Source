package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f1609t;

    public d(k kVar, ArrayList arrayList) {
        this.f1609t = kVar;
        this.s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            k kVar = this.f1609t;
            if (i6 >= size) {
                arrayList.clear();
                kVar.f1638n.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i6);
            i6++;
            k.a aVar = (k.a) obj;
            ArrayList<RecyclerView.b0> arrayList2 = kVar.f1642r;
            long j6 = kVar.f1468f;
            RecyclerView.b0 b0Var = aVar.f1643a;
            View view = b0Var == null ? null : b0Var.f1441a;
            RecyclerView.b0 b0Var2 = aVar.f1644b;
            View view2 = b0Var2 != null ? b0Var2.f1441a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j6);
                arrayList2.add(aVar.f1643a);
                duration.translationX(aVar.f1647e - aVar.f1645c);
                duration.translationY(aVar.f1648f - aVar.f1646d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.f1644b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new j(kVar, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
