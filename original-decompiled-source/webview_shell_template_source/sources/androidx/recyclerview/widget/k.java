package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends z {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.b0> h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f1633i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<b> f1634j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<a> f1635k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.b0>> f1636l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<b>> f1637m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<a>> f1638n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f1639o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f1640p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f1641q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f1642r;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f1643a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.b0 f1644b;

        /* renamed from: c, reason: collision with root package name */
        public int f1645c;

        /* renamed from: d, reason: collision with root package name */
        public int f1646d;

        /* renamed from: e, reason: collision with root package name */
        public int f1647e;

        /* renamed from: f, reason: collision with root package name */
        public int f1648f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f1643a + ", newHolder=" + this.f1644b + ", fromX=" + this.f1645c + ", fromY=" + this.f1646d + ", toX=" + this.f1647e + ", toY=" + this.f1648f + '}';
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f1649a;

        /* renamed from: b, reason: collision with root package name */
        public int f1650b;

        /* renamed from: c, reason: collision with root package name */
        public int f1651c;

        /* renamed from: d, reason: collision with root package name */
        public int f1652d;

        /* renamed from: e, reason: collision with root package name */
        public int f1653e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.b0) arrayList.get(size)).f1441a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    @SuppressLint({"UnknownNullness"})
    public final void d(RecyclerView.b0 b0Var) {
        ArrayList<ArrayList<RecyclerView.b0>> arrayList = this.f1636l;
        ArrayList<ArrayList<b>> arrayList2 = this.f1637m;
        ArrayList<ArrayList<a>> arrayList3 = this.f1638n;
        View view = b0Var.f1441a;
        view.animate().cancel();
        ArrayList<b> arrayList4 = this.f1634j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList4.get(size).f1649a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f1635k, b0Var);
        if (this.h.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.f1633i.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList5 = arrayList3.get(size2);
            j(arrayList5, b0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList6 = arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList6.get(size4).f1649a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.b0> arrayList7 = arrayList.get(size5);
            if (arrayList7.remove(b0Var)) {
                view.setAlpha(1.0f);
                c(b0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f1641q.remove(b0Var);
        this.f1639o.remove(b0Var);
        this.f1642r.remove(b0Var);
        this.f1640p.remove(b0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e() {
        ArrayList<ArrayList<a>> arrayList = this.f1638n;
        ArrayList<ArrayList<RecyclerView.b0>> arrayList2 = this.f1636l;
        ArrayList<ArrayList<b>> arrayList3 = this.f1637m;
        ArrayList<a> arrayList4 = this.f1635k;
        ArrayList<RecyclerView.b0> arrayList5 = this.f1633i;
        ArrayList<RecyclerView.b0> arrayList6 = this.h;
        ArrayList<b> arrayList7 = this.f1634j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList7.get(size);
            View view = bVar.f1649a.f1441a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f1649a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c(arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList5.get(size3);
            b0Var.f1441a.setAlpha(1.0f);
            c(b0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.b0 b0Var2 = aVar.f1643a;
            if (b0Var2 != null) {
                k(aVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = aVar.f1644b;
            if (b0Var3 != null) {
                k(aVar, b0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList8 = arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList8.get(size6);
                    View view2 = bVar2.f1649a.f1441a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f1649a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.b0> arrayList9 = arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var4 = arrayList9.get(size8);
                    b0Var4.f1441a.setAlpha(1.0f);
                    c(b0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.b0 b0Var5 = aVar2.f1643a;
                    if (b0Var5 != null) {
                        k(aVar2, b0Var5);
                    }
                    RecyclerView.b0 b0Var6 = aVar2.f1644b;
                    if (b0Var6 != null) {
                        k(aVar2, b0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f1641q);
            h(this.f1640p);
            h(this.f1639o);
            h(this.f1642r);
            ArrayList<RecyclerView.j.a> arrayList11 = this.f1464b;
            int size11 = arrayList11.size();
            for (int i6 = 0; i6 < size11; i6++) {
                arrayList11.get(i6).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f() {
        return (this.f1633i.isEmpty() && this.f1635k.isEmpty() && this.f1634j.isEmpty() && this.h.isEmpty() && this.f1640p.isEmpty() && this.f1641q.isEmpty() && this.f1639o.isEmpty() && this.f1642r.isEmpty() && this.f1637m.isEmpty() && this.f1636l.isEmpty() && this.f1638n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.z
    @SuppressLint({"UnknownNullness"})
    public final boolean g(RecyclerView.b0 b0Var, int i6, int i7, int i8, int i9) {
        View view = b0Var.f1441a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i7 + ((int) b0Var.f1441a.getTranslationY());
        l(b0Var);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            c(b0Var);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        ArrayList<b> arrayList = this.f1634j;
        b bVar = new b();
        bVar.f1649a = b0Var;
        bVar.f1650b = translationX;
        bVar.f1651c = translationY;
        bVar.f1652d = i8;
        bVar.f1653e = i9;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.j.a> arrayList = this.f1464b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, RecyclerView.b0 b0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, b0Var) && aVar.f1643a == null && aVar.f1644b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.b0 b0Var) {
        if (aVar.f1644b == b0Var) {
            aVar.f1644b = null;
        } else {
            if (aVar.f1643a != b0Var) {
                return false;
            }
            aVar.f1643a = null;
        }
        View view = b0Var.f1441a;
        View view2 = b0Var.f1441a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(b0Var);
        return true;
    }

    public final void l(RecyclerView.b0 b0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b0Var.f1441a.animate().setInterpolator(s);
        d(b0Var);
    }
}
