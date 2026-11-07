package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends a0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2564s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<v.a0> f2565h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<v.a0> f2566i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<b> f2567j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<a> f2568k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<v.a0>> f2569l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<b>> f2570m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<a>> f2571n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<v.a0> f2572o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<v.a0> f2573p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<v.a0> f2574q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<v.a0> f2575r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public v.a0 f2576a;

        /* renamed from: b, reason: collision with root package name */
        public v.a0 f2577b;

        /* renamed from: c, reason: collision with root package name */
        public int f2578c;

        /* renamed from: d, reason: collision with root package name */
        public int f2579d;

        /* renamed from: e, reason: collision with root package name */
        public int f2580e;

        /* renamed from: f, reason: collision with root package name */
        public int f2581f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f2576a);
            sb.append(", newHolder=");
            sb.append(this.f2577b);
            sb.append(", fromX=");
            sb.append(this.f2578c);
            sb.append(", fromY=");
            sb.append(this.f2579d);
            sb.append(", toX=");
            sb.append(this.f2580e);
            sb.append(", toY=");
            return b.b.a(sb, this.f2581f, '}');
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public v.a0 f2582a;

        /* renamed from: b, reason: collision with root package name */
        public int f2583b;

        /* renamed from: c, reason: collision with root package name */
        public int f2584c;

        /* renamed from: d, reason: collision with root package name */
        public int f2585d;

        /* renamed from: e, reason: collision with root package name */
        public int f2586e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v.a0) arrayList.get(size)).f2708a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.v.i
    public final void d(v.a0 a0Var) {
        ArrayList<ArrayList<v.a0>> arrayList = this.f2569l;
        ArrayList<ArrayList<b>> arrayList2 = this.f2570m;
        ArrayList<ArrayList<a>> arrayList3 = this.f2571n;
        View view = a0Var.f2708a;
        view.animate().cancel();
        ArrayList<b> arrayList4 = this.f2567j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList4.get(size).f2582a == a0Var) {
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                c(a0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f2568k, a0Var);
        if (this.f2565h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f2566i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList5 = arrayList3.get(size2);
            j(arrayList5, a0Var);
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
                if (arrayList6.get(size4).f2582a == a0Var) {
                    view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                    c(a0Var);
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
            ArrayList<v.a0> arrayList7 = arrayList.get(size5);
            if (arrayList7.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f2574q.remove(a0Var);
        this.f2572o.remove(a0Var);
        this.f2575r.remove(a0Var);
        this.f2573p.remove(a0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.v.i
    public final void e() {
        ArrayList<ArrayList<a>> arrayList = this.f2571n;
        ArrayList<ArrayList<v.a0>> arrayList2 = this.f2569l;
        ArrayList<ArrayList<b>> arrayList3 = this.f2570m;
        ArrayList<a> arrayList4 = this.f2568k;
        ArrayList<v.a0> arrayList5 = this.f2566i;
        ArrayList<v.a0> arrayList6 = this.f2565h;
        ArrayList<b> arrayList7 = this.f2567j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList7.get(size);
            View view = bVar.f2582a.f2708a;
            view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
            c(bVar.f2582a);
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
            v.a0 a0Var = arrayList5.get(size3);
            a0Var.f2708a.setAlpha(1.0f);
            c(a0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            v.a0 a0Var2 = aVar.f2576a;
            if (a0Var2 != null) {
                k(aVar, a0Var2);
            }
            v.a0 a0Var3 = aVar.f2577b;
            if (a0Var3 != null) {
                k(aVar, a0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList8 = arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList8.get(size6);
                    View view2 = bVar2.f2582a.f2708a;
                    view2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    view2.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                    c(bVar2.f2582a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList<v.a0> arrayList9 = arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    v.a0 a0Var4 = arrayList9.get(size8);
                    a0Var4.f2708a.setAlpha(1.0f);
                    c(a0Var4);
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
                    v.a0 a0Var5 = aVar2.f2576a;
                    if (a0Var5 != null) {
                        k(aVar2, a0Var5);
                    }
                    v.a0 a0Var6 = aVar2.f2577b;
                    if (a0Var6 != null) {
                        k(aVar2, a0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f2574q);
            h(this.f2573p);
            h(this.f2572o);
            h(this.f2575r);
            ArrayList<v.i.a> arrayList11 = this.f2732b;
            int size11 = arrayList11.size();
            for (int i10 = 0; i10 < size11; i10++) {
                arrayList11.get(i10).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.v.i
    public final boolean f() {
        return (this.f2566i.isEmpty() && this.f2568k.isEmpty() && this.f2567j.isEmpty() && this.f2565h.isEmpty() && this.f2573p.isEmpty() && this.f2574q.isEmpty() && this.f2572o.isEmpty() && this.f2575r.isEmpty() && this.f2570m.isEmpty() && this.f2569l.isEmpty() && this.f2571n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean g(v.a0 a0Var, int i10, int i11, int i12, int i13) {
        View view = a0Var.f2708a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) a0Var.f2708a.getTranslationY());
        l(a0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(a0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList<b> arrayList = this.f2567j;
        b bVar = new b();
        bVar.f2582a = a0Var;
        bVar.f2583b = translationX;
        bVar.f2584c = translationY;
        bVar.f2585d = i12;
        bVar.f2586e = i13;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<v.i.a> arrayList = this.f2732b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, v.a0 a0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, a0Var) && aVar.f2576a == null && aVar.f2577b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, v.a0 a0Var) {
        if (aVar.f2577b == a0Var) {
            aVar.f2577b = null;
        } else {
            if (aVar.f2576a != a0Var) {
                return false;
            }
            aVar.f2576a = null;
        }
        View view = a0Var.f2708a;
        View view2 = a0Var.f2708a;
        view.setAlpha(1.0f);
        view2.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        view2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        c(a0Var);
        return true;
    }

    public final void l(v.a0 a0Var) {
        if (f2564s == null) {
            f2564s = new ValueAnimator().getInterpolator();
        }
        a0Var.f2708a.animate().setInterpolator(f2564s);
        d(a0Var);
    }
}
