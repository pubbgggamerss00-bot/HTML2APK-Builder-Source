package ve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public int f30778a;

    /* renamed from: b, reason: collision with root package name */
    public int f30779b;

    /* renamed from: c, reason: collision with root package name */
    public long f30780c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f30781d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f30782e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f30783f = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30784a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30785b;

        /* renamed from: c, reason: collision with root package name */
        public final short f30786c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30787d;

        public a(int i10, int i11, short s10, int i12) {
            this.f30784a = i10;
            this.f30785b = i11;
            this.f30786c = s10;
            this.f30787d = i12;
        }
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // ve.c
    public final ArrayList a(int i10) {
        int[] iArr;
        int i11 = (i10 < 0 || (iArr = this.f30781d) == null || i10 >= iArr.length) ? -1 : iArr[i10];
        if (i11 == -1) {
            return null;
        }
        if (i11 != Integer.MIN_VALUE) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i11));
            return arrayList;
        }
        List list = (List) this.f30782e.get(Integer.valueOf(i10));
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2);
        return arrayList2;
    }

    @Override // ve.c
    public final int b(int i10) {
        Integer num = (Integer) this.f30783f.get(Integer.valueOf(i10));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void c(int i10) {
        this.f30781d = d(i10 + 1);
        for (Map.Entry entry : this.f30783f.entrySet()) {
            if (this.f30781d[((Integer) entry.getValue()).intValue()] == -1) {
                this.f30781d[((Integer) entry.getValue()).intValue()] = ((Integer) entry.getKey()).intValue();
            } else {
                Object value = entry.getValue();
                HashMap map = this.f30782e;
                List list = (List) map.get(value);
                List list2 = list;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    map.put(entry.getValue(), arrayList);
                    arrayList.add(Integer.valueOf(this.f30781d[((Integer) entry.getValue()).intValue()]));
                    this.f30781d[((Integer) entry.getValue()).intValue()] = Integer.MIN_VALUE;
                    list2 = arrayList;
                }
                list2.add(entry.getKey());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f30778a);
        sb.append(" ");
        return x0.a.a(sb, this.f30779b, "}");
    }
}
