package kotlinx.serialization.internal;

import bi.m;
import f9.vf;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class n0 implements bi.f, f {

    /* renamed from: a, reason: collision with root package name */
    public final String f16388a;

    /* renamed from: b, reason: collision with root package name */
    public final GeneratedSerializer<?> f16389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16390c;

    /* renamed from: d, reason: collision with root package name */
    public int f16391d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f16392e;

    /* renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f16393f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f16394g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16395h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16396i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16397j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f16398k;

    public n0(String serialName, GeneratedSerializer<?> generatedSerializer, int i10) {
        kotlin.jvm.internal.r.e(serialName, "serialName");
        this.f16388a = serialName;
        this.f16389b = generatedSerializer;
        this.f16390c = i10;
        this.f16391d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f16392e = strArr;
        int i12 = this.f16390c;
        this.f16393f = new List[i12];
        this.f16394g = new boolean[i12];
        this.f16395h = qg.a0.f22708a;
        pg.k kVar = pg.k.f21466a;
        this.f16396i = e9.w0.a(kVar, new eh.a() { // from class: kotlinx.serialization.internal.m0
            @Override // eh.a
            public final Object invoke() {
                zh.b<?>[] bVarArrChildSerializers;
                GeneratedSerializer<?> generatedSerializer2 = this.f16382a.f16389b;
                return (generatedSerializer2 == null || (bVarArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? p0.f16404a : bVarArrChildSerializers;
            }
        });
        int i13 = 1;
        this.f16397j = e9.w0.a(kVar, new vf(this, i13));
        this.f16398k = e9.w0.a(kVar, new h9.x0(this, i13));
    }

    @Override // bi.f
    public final String a() {
        return this.f16388a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.internal.f
    public final Set<String> b() {
        return this.f16395h.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        Integer num = (Integer) this.f16395h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // bi.f
    public final int e() {
        return this.f16390c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pg.j] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            bi.f fVar = (bi.f) obj;
            if (kotlin.jvm.internal.r.a(this.f16388a, fVar.a()) && Arrays.equals((bi.f[]) this.f16397j.getValue(), (bi.f[]) ((n0) obj).f16397j.getValue())) {
                int iE = fVar.e();
                int i10 = this.f16390c;
                if (i10 == iE) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (kotlin.jvm.internal.r.a(h(i11).a(), fVar.h(i11).a()) && kotlin.jvm.internal.r.a(h(i11).getKind(), fVar.h(i11).getKind())) {
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
        return this.f16392e[i10];
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        List<Annotation> list = this.f16393f[i10];
        return list == null ? qg.z.f22752a : list;
    }

    @Override // bi.f
    public final List<Annotation> getAnnotations() {
        return qg.z.f22752a;
    }

    @Override // bi.f
    public bi.l getKind() {
        return m.a.f4278a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    @Override // bi.f
    public bi.f h(int i10) {
        return ((zh.b[]) this.f16396i.getValue())[i10].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    public int hashCode() {
        return ((Number) this.f16398k.getValue()).intValue();
    }

    @Override // bi.f
    public final boolean i(int i10) {
        return this.f16394g[i10];
    }

    public final void j(String name, boolean z10) {
        kotlin.jvm.internal.r.e(name, "name");
        int i10 = this.f16391d + 1;
        this.f16391d = i10;
        String[] strArr = this.f16392e;
        strArr[i10] = name;
        this.f16394g[i10] = z10;
        this.f16393f[i10] = null;
        if (i10 == this.f16390c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f16395h = map;
        }
    }

    public String toString() {
        return o0.c(this);
    }
}
