package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2533b;

    public d(k kVar, ArrayList arrayList) {
        this.f2533b = kVar;
        this.f2532a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2532a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            k kVar = this.f2533b;
            if (i10 >= size) {
                arrayList.clear();
                kVar.f2571n.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            k.a aVar = (k.a) obj;
            ArrayList<v.a0> arrayList2 = kVar.f2575r;
            long j10 = kVar.f2736f;
            v.a0 a0Var = aVar.f2576a;
            View view = a0Var == null ? null : a0Var.f2708a;
            v.a0 a0Var2 = aVar.f2577b;
            View view2 = a0Var2 != null ? a0Var2.f2708a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j10);
                arrayList2.add(aVar.f2576a);
                duration.translationX(aVar.f2580e - aVar.f2578c);
                duration.translationY(aVar.f2581f - aVar.f2579d);
                duration.alpha(CropImageView.DEFAULT_ASPECT_RATIO).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.f2577b);
                viewPropertyAnimatorAnimate.translationX(CropImageView.DEFAULT_ASPECT_RATIO).translationY(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j10).alpha(1.0f).setListener(new j(kVar, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
