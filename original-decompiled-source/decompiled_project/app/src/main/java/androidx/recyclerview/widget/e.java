package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2541b;

    public e(k kVar, ArrayList arrayList) {
        this.f2541b = kVar;
        this.f2540a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2540a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            k kVar = this.f2541b;
            if (i10 >= size) {
                arrayList.clear();
                kVar.f2569l.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            v.a0 a0Var = (v.a0) obj;
            kVar.getClass();
            View view = a0Var.f2708a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.f2572o.add(a0Var);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(kVar.f2733c).setListener(new g(view, viewPropertyAnimatorAnimate, kVar, a0Var)).start();
        }
    }
}
