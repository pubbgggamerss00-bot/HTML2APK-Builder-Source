package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a0 extends v.i {

    /* renamed from: g, reason: collision with root package name */
    public boolean f2511g;

    @Override // androidx.recyclerview.widget.v.i
    public final boolean a(v.a0 a0Var, v.a0 a0Var2, v.i.b bVar, v.i.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f2737a;
        int i13 = bVar.f2738b;
        if (a0Var2.n()) {
            int i14 = bVar.f2737a;
            i11 = bVar.f2738b;
            i10 = i14;
        } else {
            i10 = bVar2.f2737a;
            i11 = bVar2.f2738b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.g(a0Var, i12, i13, i10, i11);
        }
        View view = a0Var.f2708a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(a0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = a0Var2.f2708a;
        kVar.l(a0Var2);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        ArrayList<k.a> arrayList = kVar.f2568k;
        k.a aVar = new k.a();
        aVar.f2576a = a0Var;
        aVar.f2577b = a0Var2;
        aVar.f2578c = i12;
        aVar.f2579d = i13;
        aVar.f2580e = i10;
        aVar.f2581f = i11;
        arrayList.add(aVar);
        return true;
    }

    public abstract boolean g(v.a0 a0Var, int i10, int i11, int i12, int i13);
}
