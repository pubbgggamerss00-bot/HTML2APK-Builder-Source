package f9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9832a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9833b;

    /* renamed from: c, reason: collision with root package name */
    public String f9834c;

    /* renamed from: d, reason: collision with root package name */
    public long f9835d;

    public j() {
        this(0);
    }

    public final void a(y2.c0 newValue, boolean z10) {
        kotlin.jvm.internal.r.e(newValue, "newValue");
        t2.b bVar = newValue.f33682a;
        String str = bVar.f27761b;
        String str2 = bVar.f27761b;
        boolean zA = kotlin.jvm.internal.r.a(str, this.f9834c);
        ArrayList arrayList = this.f9832a;
        if (zA) {
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.set(qg.p.i(arrayList), newValue);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = z10 || jCurrentTimeMillis - this.f9835d > 1500 || mh.t.i(str2, "\n", false) || Math.abs(str2.length() - this.f9834c.length()) > 15;
        this.f9833b.clear();
        if (z11 || arrayList.size() < 2) {
            arrayList.add(newValue);
            if (arrayList.size() > 40) {
                arrayList.remove(0);
            }
            this.f9834c = str2;
            this.f9835d = jCurrentTimeMillis;
        } else {
            if (arrayList.isEmpty()) {
                arrayList.add(newValue);
            } else {
                arrayList.set(qg.p.i(arrayList), newValue);
            }
            this.f9834c = str2;
        }
        b();
    }

    public final void b() {
        ArrayList arrayList = this.f9832a;
        int size = arrayList.size();
        long length = 0;
        long length2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            length2 += ((y2.c0) obj).f33682a.f27761b.length();
        }
        ArrayList arrayList2 = this.f9833b;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            length += ((y2.c0) obj2).f33682a.f27761b.length();
        }
        long length3 = length2 + length;
        while (true) {
            if (arrayList.size() <= 40 && (length3 <= 8000000 || arrayList.size() <= 2)) {
                return;
            } else {
                length3 -= ((y2.c0) arrayList.remove(0)).f33682a.f27761b.length();
            }
        }
    }

    public /* synthetic */ j(int i10) {
        this(new y2.c0("", 0L, 6));
    }

    public j(y2.c0 c0Var) {
        ArrayList arrayList = new ArrayList();
        this.f9832a = arrayList;
        this.f9833b = new ArrayList();
        this.f9834c = c0Var.f33682a.f27761b;
        this.f9835d = System.currentTimeMillis();
        arrayList.add(c0Var);
    }
}
