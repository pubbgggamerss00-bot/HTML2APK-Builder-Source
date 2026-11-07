package nc;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import nc.j;
import nc.p;
import nc.q0;
import nc.r;

/* loaded from: classes2.dex */
public final class u<K extends Comparable<?>, V> implements s0<K, V>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18752c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final transient r<q0<K>> f18753a;

    /* renamed from: b, reason: collision with root package name */
    public final transient r<V> f18754b;

    public static final class a<K extends Comparable<?>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f18755a = new ArrayList();

        public final u<K, V> a() {
            q0 q0Var;
            q0<Comparable> q0Var2 = q0.f18730c;
            q0.b bVar = q0.b.f18734a;
            bVar.getClass();
            f fVar = new f(bVar);
            ArrayList arrayList = this.f18755a;
            Collections.sort(arrayList, fVar);
            int size = arrayList.size();
            g.b(size, "initialCapacity");
            Object[] objArrCopyOf = new Object[size];
            int size2 = arrayList.size();
            g.b(size2, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[size2];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < arrayList.size()) {
                q0 q0Var3 = (q0) ((Map.Entry) arrayList.get(i10)).getKey();
                if (i10 > 0) {
                    q0 q0Var4 = (q0) ((Map.Entry) arrayList.get(i10 - 1)).getKey();
                    Comparable comparable = q0Var3.f18731a;
                    j jVar = q0Var3.f18732b;
                    Object obj = q0Var4.f18732b;
                    j jVar2 = q0Var4.f18731a;
                    if (comparable.compareTo(obj) <= 0 && jVar2.compareTo(jVar) <= 0) {
                        j jVar3 = q0Var3.f18731a;
                        int iCompareTo = jVar3.compareTo(jVar2);
                        j jVar4 = q0Var4.f18732b;
                        int iCompareTo2 = jVar.compareTo(jVar4);
                        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
                            q0Var = q0Var3;
                        } else if (iCompareTo > 0 || iCompareTo2 < 0) {
                            if (iCompareTo >= 0) {
                                jVar2 = jVar3;
                            }
                            if (iCompareTo2 > 0) {
                                jVar = jVar4;
                            }
                            q0Var = new q0(jVar2, jVar);
                        } else {
                            q0Var = q0Var4;
                        }
                        if (!q0Var.f18731a.equals(q0Var.f18732b)) {
                            throw new IllegalArgumentException("Overlapping ranges: range " + q0Var4 + " overlaps with entry " + q0Var3);
                        }
                    }
                }
                q0Var3.getClass();
                int i13 = i11 + 1;
                if (objArrCopyOf.length < i13) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, p.b.a(objArrCopyOf.length, i13));
                }
                objArrCopyOf[i11] = q0Var3;
                Object value = ((Map.Entry) arrayList.get(i10)).getValue();
                value.getClass();
                int i14 = i12 + 1;
                if (objArrCopyOf2.length < i14) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, p.b.a(objArrCopyOf2.length, i14));
                }
                objArrCopyOf2[i12] = value;
                i10++;
                i12 = i14;
                i11 = i13;
            }
            return new u<>(r.i(i11, objArrCopyOf), r.i(i12, objArrCopyOf2));
        }

        public final void b(q0 q0Var, Short sh2) {
            q0Var.getClass();
            if (q0Var.f18731a.equals(q0Var.f18732b)) {
                throw new IllegalArgumentException(d0.h0.b("Range must not be empty, but was %s", q0Var));
            }
            this.f18755a.add(new q(q0Var, sh2));
        }
    }

    static {
        r.a aVar = r.f18735b;
        u0 u0Var = u0.f18756e;
    }

    public u(u0 u0Var, u0 u0Var2) {
        this.f18753a = u0Var;
        this.f18754b = u0Var2;
    }

    @Override // nc.s0
    public final Object a(Integer num) {
        int i10;
        q0<Comparable> q0Var = q0.f18730c;
        j.d dVar = new j.d(num);
        n0 n0Var = n0.f18723a;
        r<q0<K>> rVar = this.f18753a;
        List listD = k0.d(rVar, q0.a.f18733a);
        n0Var.getClass();
        if (!(listD instanceof RandomAccess)) {
            listD = k0.a(listD);
        }
        int size = listD.size() - 1;
        int i11 = 0;
        while (true) {
            if (i11 > size) {
                i10 = i11 - 1;
                break;
            }
            int i12 = (i11 + size) >>> 1;
            int iCompare = n0Var.compare(dVar, listD.get(i12));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    listD.subList(i11, size + 1);
                    i10 = (i12 - i11) + i11;
                    break;
                }
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        if (i10 == -1) {
            return null;
        }
        q0<K> q0Var2 = rVar.get(i10);
        q0Var2.getClass();
        if (!q0Var2.f18731a.d(num) || q0Var2.f18732b.d(num)) {
            return null;
        }
        return this.f18754b.get(i10);
    }

    @Override // nc.s0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final s<q0<K>, V> b() {
        r<q0<K>> rVar = this.f18753a;
        if (rVar.isEmpty()) {
            return v0.f18761g;
        }
        q0<Comparable> q0Var = q0.f18730c;
        return new w(new x0(rVar, q0.b.f18734a), this.f18754b, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return b().equals(((s0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
