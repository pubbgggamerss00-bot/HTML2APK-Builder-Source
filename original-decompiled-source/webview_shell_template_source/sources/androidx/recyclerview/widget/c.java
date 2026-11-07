package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f1602t;

    public c(k kVar, ArrayList arrayList) {
        this.f1602t = kVar;
        this.s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            k kVar = this.f1602t;
            if (i6 >= size) {
                arrayList.clear();
                kVar.f1637m.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i6);
            i6++;
            k.b bVar = (k.b) obj;
            RecyclerView.b0 b0Var = bVar.f1649a;
            int i7 = bVar.f1650b;
            int i8 = bVar.f1651c;
            int i9 = bVar.f1652d;
            int i10 = bVar.f1653e;
            kVar.getClass();
            View view = b0Var.f1441a;
            int i11 = i9 - i7;
            int i12 = i10 - i8;
            if (i11 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i12 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.f1640p.add(b0Var);
            viewPropertyAnimatorAnimate.setDuration(kVar.f1467e).setListener(new h(kVar, b0Var, i11, view, i12, viewPropertyAnimatorAnimate)).start();
        }
    }
}
