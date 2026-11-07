package bi;

import d9.o;
import e9.w0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.o0;
import pg.s;
import qg.e0;
import qg.f0;
import qg.g0;
import qg.j0;
import qg.k0;
import qg.p;
import qg.x;

/* loaded from: classes2.dex */
public final class g implements f, kotlinx.serialization.internal.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4263c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Annotation> f4264d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f4265e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f4266f;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f4267g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f4268h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f4269i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Integer> f4270j;

    /* renamed from: k, reason: collision with root package name */
    public final f[] f4271k;

    /* renamed from: l, reason: collision with root package name */
    public final s f4272l;

    public g(String serialName, l kind, int i10, List<? extends f> list, a aVar) {
        r.e(serialName, "serialName");
        r.e(kind, "kind");
        this.f4261a = serialName;
        this.f4262b = kind;
        this.f4263c = i10;
        this.f4264d = aVar.f4241b;
        ArrayList arrayList = aVar.f4242c;
        r.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(j0.a(p.h(arrayList, 12)));
        x.Z(arrayList, hashSet);
        this.f4265e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f4266f = strArr;
        this.f4267g = l0.b(aVar.f4244e);
        this.f4268h = (List[]) aVar.f4245f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f4246g;
        r.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f4269i = zArr;
        r.e(strArr, "<this>");
        f0 f0Var = new f0(new o(strArr, 1));
        ArrayList arrayList3 = new ArrayList(p.h(f0Var, 10));
        Iterator it2 = f0Var.iterator();
        while (true) {
            g0 g0Var = (g0) it2;
            if (!g0Var.f22722a.hasNext()) {
                this.f4270j = k0.i(arrayList3);
                this.f4271k = l0.b(list);
                this.f4272l = w0.b(new androidx.room.l(this, 1));
                return;
            }
            e0 e0Var = (e0) g0Var.next();
            arrayList3.add(new pg.n(e0Var.f22720b, Integer.valueOf(e0Var.f22719a)));
        }
    }

    @Override // bi.f
    public final String a() {
        return this.f4261a;
    }

    @Override // kotlinx.serialization.internal.f
    public final Set<String> b() {
        return this.f4265e;
    }

    @Override // bi.f
    public final int d(String name) {
        r.e(name, "name");
        Integer num = this.f4270j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // bi.f
    public final int e() {
        return this.f4263c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (r.a(this.f4261a, fVar.a()) && Arrays.equals(this.f4271k, ((g) obj).f4271k)) {
                int iE = fVar.e();
                int i10 = this.f4263c;
                if (i10 == iE) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        f[] fVarArr = this.f4267g;
                        if (r.a(fVarArr[i11].a(), fVar.h(i11).a()) && r.a(fVarArr[i11].getKind(), fVar.h(i11).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bi.f
    public final String f(int i10) {
        return this.f4266f[i10];
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        return this.f4268h[i10];
    }

    @Override // bi.f
    public final List<Annotation> getAnnotations() {
        return this.f4264d;
    }

    @Override // bi.f
    public final l getKind() {
        return this.f4262b;
    }

    @Override // bi.f
    public final f h(int i10) {
        return this.f4267g[i10];
    }

    public final int hashCode() {
        return ((Number) this.f4272l.getValue()).intValue();
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return this.f4269i[i10];
    }

    public final String toString() {
        return o0.c(this);
    }
}
