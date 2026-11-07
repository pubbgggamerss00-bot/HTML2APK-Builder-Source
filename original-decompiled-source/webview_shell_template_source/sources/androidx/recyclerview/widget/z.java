package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class z extends RecyclerView.j {

    /* renamed from: g, reason: collision with root package name */
    public boolean f1725g;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.b bVar, RecyclerView.j.b bVar2) {
        int i6;
        int i7;
        int i8 = bVar.f1469a;
        int i9 = bVar.f1470b;
        if (b0Var2.o()) {
            int i10 = bVar.f1469a;
            i7 = bVar.f1470b;
            i6 = i10;
        } else {
            i6 = bVar2.f1469a;
            i7 = bVar2.f1470b;
        }
        k kVar = (k) this;
        if (b0Var == b0Var2) {
            return kVar.g(b0Var, i8, i9, i6, i7);
        }
        View view = b0Var.f1441a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b0Var2.f1441a;
        kVar.l(b0Var2);
        view2.setTranslationX(-((int) ((i6 - i8) - translationX)));
        view2.setTranslationY(-((int) ((i7 - i9) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList<k.a> arrayList = kVar.f1635k;
        k.a aVar = new k.a();
        aVar.f1643a = b0Var;
        aVar.f1644b = b0Var2;
        aVar.f1645c = i8;
        aVar.f1646d = i9;
        aVar.f1647e = i6;
        aVar.f1648f = i7;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean g(RecyclerView.b0 b0Var, int i6, int i7, int i8, int i9);
}
