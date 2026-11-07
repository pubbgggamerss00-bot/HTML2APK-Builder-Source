package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2524b;

    public c(k kVar, ArrayList arrayList) {
        this.f2524b = kVar;
        this.f2523a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2523a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            k kVar = this.f2524b;
            if (i10 >= size) {
                arrayList.clear();
                kVar.f2570m.remove(arrayList);
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            k.b bVar = (k.b) obj;
            v.a0 a0Var = bVar.f2582a;
            int i11 = bVar.f2583b;
            int i12 = bVar.f2584c;
            int i13 = bVar.f2585d;
            int i14 = bVar.f2586e;
            kVar.getClass();
            View view = a0Var.f2708a;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (i15 != 0) {
                view.animate().translationX(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            if (i16 != 0) {
                view.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            kVar.f2573p.add(a0Var);
            viewPropertyAnimatorAnimate.setDuration(kVar.f2735e).setListener(new h(kVar, a0Var, i15, view, i16, viewPropertyAnimatorAnimate)).start();
        }
    }
}
