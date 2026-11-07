package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f1610t;

    public e(k kVar, ArrayList arrayList) {
        this.f1610t = kVar;
        this.s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            k kVar = this.f1610t;
            if (i6 >= size) {
                arrayList.clear();
                kVar.f1636l.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i6);
            i6++;
            RecyclerView.b0 b0Var = (RecyclerView.b0) obj;
            kVar.getClass();
            View view = b0Var.f1441a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.f1639o.add(b0Var);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(kVar.f1465c).setListener(new g(view, viewPropertyAnimatorAnimate, kVar, b0Var)).start();
        }
    }
}
