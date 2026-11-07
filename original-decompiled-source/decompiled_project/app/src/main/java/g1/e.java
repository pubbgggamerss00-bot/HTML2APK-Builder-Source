package g1;

import eh.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import p.l0;
import p.w0;
import pg.f0;
import x0.j;
import x0.o0;
import x0.s3;
import x0.y;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final n f11284e;

    /* renamed from: a, reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f11285a;

    /* renamed from: b, reason: collision with root package name */
    public final l0<Object, i> f11286b;

    /* renamed from: c, reason: collision with root package name */
    public i f11287c;

    /* renamed from: d, reason: collision with root package name */
    public final c f11288d;

    public static final class a extends s implements p<o, e, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11289a = new a(2);

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        @Override // eh.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(o oVar, e eVar) {
            e eVar2 = eVar;
            Map<Object, Map<String, List<Object>>> map = eVar2.f11285a;
            l0<Object, i> l0Var = eVar2.f11286b;
            Object[] objArr = l0Var.f20738b;
            Object[] objArr2 = l0Var.f20739c;
            long[] jArr = l0Var.f20737a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                Map<String, List<Object>> mapB = ((i) objArr2[i13]).b();
                                if (mapB.isEmpty()) {
                                    map.remove(obj);
                                } else {
                                    map.put(obj, mapB);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (map.isEmpty()) {
                return null;
            }
            return map;
        }
    }

    public static final class b extends s implements eh.l<Map<Object, Map<String, ? extends List<? extends Object>>>, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11290a = new b(1);

        @Override // eh.l
        public final e invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new e((Map<Object, Map<String, List<Object>>>) map);
        }
    }

    public static final class c extends s implements eh.l<Object, Boolean> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            i iVar = e.this.f11287c;
            return Boolean.valueOf(iVar != null ? iVar.a(obj) : true);
        }
    }

    static {
        n nVar = m.f11307a;
        f11284e = new n(a.f11289a, b.f11290a);
    }

    public e() {
        this(0);
    }

    @Override // g1.d
    public final void e(Object obj, f1.b bVar, x0.j jVar, int i10) {
        jVar.L(-1198538093);
        jVar.n(obj);
        Object objG = jVar.g();
        Object obj2 = j.a.f31715a;
        if (objG == obj2) {
            c cVar = this.f11288d;
            if (!((Boolean) cVar.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map<String, List<Object>> map = this.f11285a.get(obj);
            s3 s3Var = k.f11305a;
            Object jVar2 = new j(map, cVar);
            jVar.C(jVar2);
            objG = jVar2;
        }
        i iVar = (i) objG;
        y.a(k.f11305a.a(iVar), bVar, jVar, (i10 & 112) | 8);
        f0 f0Var = f0.f21461a;
        boolean zL = jVar.l(this) | jVar.l(obj) | jVar.l(iVar);
        Object objG2 = jVar.g();
        if (zL || objG2 == obj2) {
            objG2 = new g(this, obj, iVar);
            jVar.C(objG2);
        }
        o0.a(f0Var, (eh.l) objG2, jVar);
        jVar.d();
        jVar.B();
    }

    @Override // g1.d
    public final void f(Object obj) {
        if (this.f11286b.j(obj) == null) {
            this.f11285a.remove(obj);
        }
    }

    public e(Map<Object, Map<String, List<Object>>> map) {
        this.f11285a = map;
        this.f11286b = w0.b();
        this.f11288d = new c();
    }

    public /* synthetic */ e(int i10) {
        this(new LinkedHashMap());
    }
}
