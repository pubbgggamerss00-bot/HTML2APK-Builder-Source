package x0;

import java.util.ArrayList;
import java.util.List;
import x0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements c.InterfaceC0101c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f15109a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final c f15110b;

    /* renamed from: c, reason: collision with root package name */
    public int f15111c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15112d;

    public b(c cVar, ArrayList arrayList) {
        f(arrayList, false);
        f(arrayList, true);
        ArrayList<c.InterfaceC0101c> arrayList2 = cVar.f15114b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            e(cVar.f15115c, cVar.f15116d);
            c();
        }
        this.f15110b = cVar;
    }

    @Override // x0.c.InterfaceC0101c
    public final void a() {
        int i6 = this.f15111c;
        boolean z6 = i6 > 0;
        int i7 = i6 - 1;
        this.f15111c = i7;
        if (z6 && i7 == 0) {
            ArrayList<a> arrayList = this.f15109a;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            arrayList.get(size).getClass();
            throw null;
        }
    }

    @Override // x0.c.InterfaceC0101c
    public final void b() {
        this.f15111c++;
    }

    @Override // x0.c.InterfaceC0101c
    public final void c() {
        ArrayList<a> arrayList = this.f15109a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }

    @Override // x0.c.InterfaceC0101c
    public final void d() {
        ArrayList<a> arrayList = this.f15109a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }

    @Override // x0.c.InterfaceC0101c
    public final void e(m0.b bVar, m0.b bVar2) {
        ArrayList<a> arrayList = this.f15109a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw null;
    }

    public final void f(List<a> list, boolean z6) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = list.get(i6);
            aVar.getClass();
            if (!z6) {
                b bVar = aVar.f15108a;
                if (bVar != null) {
                    throw new IllegalStateException(aVar + " is already controlled by " + bVar);
                }
                aVar.f15108a = this;
                this.f15109a.add(aVar);
            }
        }
    }
}
