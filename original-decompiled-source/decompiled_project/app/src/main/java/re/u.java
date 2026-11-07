package re;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class u extends r {

    /* renamed from: k, reason: collision with root package name */
    public final float f23526k;

    /* renamed from: l, reason: collision with root package name */
    public final float f23527l;

    /* renamed from: m, reason: collision with root package name */
    public int f23528m;

    /* renamed from: n, reason: collision with root package name */
    public final List<Object> f23529n;

    public u(we.c cVar, String str, String str2, List list, int i10, int i11) {
        super(cVar, str, str2);
        this.f23528m = 0;
        this.f23529n = list;
        this.f23526k = i10;
        this.f23527l = i11;
        this.f23521i = new ArrayList();
        this.f23528m = 0;
        new t(this).H(list);
    }

    public static ArrayList l(int i10, List list) {
        int size = list.size() / i10;
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 * i10;
            i11++;
            arrayList.add(list.subList(i12, i11 * i10));
        }
        return arrayList;
    }

    public final void e(List<Number> list, o oVar) {
        this.f23521i.addAll(list);
        this.f23521i.add(oVar);
    }

    public final void f(List<List<Number>> list, o oVar) {
        Iterator<List<Number>> it = list.iterator();
        while (it.hasNext()) {
            e(it.next(), oVar);
        }
    }

    public final List g(ArrayList arrayList, boolean z10) {
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        if (this.f23521i.isEmpty()) {
            if (z10) {
                e(Arrays.asList(fValueOf, Float.valueOf(((Number) arrayList.get(0)).floatValue() + this.f23527l)), new o(13));
                return arrayList.subList(1, arrayList.size());
            }
            e(Arrays.asList(fValueOf, Float.valueOf(this.f23526k)), new o(13));
        }
        return arrayList;
    }

    public final void h() {
        o oVar = this.f23528m > 0 ? (o) l.b.b(this.f23521i, 1) : null;
        o oVar2 = new o(9);
        if (oVar == null || oVar2.equals(oVar)) {
            return;
        }
        e(Collections.EMPTY_LIST, oVar2);
    }

    public final void i(ArrayList arrayList, boolean z10) {
        List listSubList = arrayList;
        boolean z11 = z10;
        while (true) {
            int i10 = 4;
            if (listSubList.size() < 4) {
                return;
            }
            boolean z12 = listSubList.size() == 5;
            if (z11) {
                e(Arrays.asList((Number) listSubList.get(0), 0, (Number) listSubList.get(1), (Number) listSubList.get(2), z12 ? (Number) listSubList.get(4) : 0, (Number) listSubList.get(3)), new o(8));
            } else {
                e(Arrays.asList(0, (Number) listSubList.get(0), (Number) listSubList.get(1), (Number) listSubList.get(2), (Number) listSubList.get(3), z12 ? (Number) listSubList.get(4) : 0), new o(8));
            }
            if (z12) {
                i10 = 5;
            }
            listSubList = listSubList.subList(i10, listSubList.size());
            z11 = !z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public final void j(ArrayList arrayList, boolean z10) {
        for (ArrayList arrayListSubList = arrayList; !arrayListSubList.isEmpty(); arrayListSubList = arrayListSubList.subList(1, arrayListSubList.size())) {
            e(arrayListSubList.subList(0, 1), new o(z10 ? 6 : 7));
            z10 = !z10;
        }
    }

    public final void k(ArrayList arrayList, boolean z10) {
        int i10;
        List listSubList = arrayList;
        while (true) {
            if (listSubList.size() < 4) {
                return;
            }
            int i11 = listSubList.size() % 4 == 1 ? 1 : 0;
            if (z10) {
                i10 = 4;
                e(Arrays.asList((Number) listSubList.get(i11), i11 != 0 ? (Number) listSubList.get(0) : 0, (Number) listSubList.get(i11 != 0 ? 2 : 1), (Number) listSubList.get(i11 != 0 ? 3 : 2), (Number) listSubList.get(i11 == 0 ? 3 : 4), 0), new o(8));
            } else {
                i10 = 4;
                e(Arrays.asList(i11 != 0 ? (Number) listSubList.get(0) : 0, (Number) listSubList.get(i11), (Number) listSubList.get(i11 != 0 ? 2 : 1), (Number) listSubList.get(i11 != 0 ? 3 : 2), 0, (Number) listSubList.get(i11 != 0 ? 4 : 3)), new o(8));
            }
            listSubList = listSubList.subList(i11 != 0 ? 5 : i10, listSubList.size());
        }
    }
}
