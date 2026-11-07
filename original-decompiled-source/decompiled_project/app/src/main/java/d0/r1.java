package d0;

import g1.i;
import java.util.List;
import java.util.Map;
import x0.j;
import x0.s3;

/* loaded from: classes.dex */
public final class r1 implements g1.i, g1.d {

    /* renamed from: a, reason: collision with root package name */
    public final g1.j f7269a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.d f7270b;

    /* renamed from: c, reason: collision with root package name */
    public final p.m0<Object> f7271c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Object, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1.i f7272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1.i iVar) {
            super(1);
            this.f7272a = iVar;
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            g1.i iVar = this.f7272a;
            return Boolean.valueOf(iVar != null ? iVar.a(obj) : true);
        }
    }

    public r1(g1.i iVar, Map<String, ? extends List<? extends Object>> map, g1.d dVar) {
        a aVar = new a(iVar);
        s3 s3Var = g1.k.f11305a;
        this.f7269a = new g1.j(map, aVar);
        this.f7270b = dVar;
        this.f7271c = p.y0.a();
    }

    @Override // g1.i
    public final boolean a(Object obj) {
        return this.f7269a.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // g1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, List<Object>> b() {
        p.m0<Object> m0Var = this.f7271c;
        Object[] objArr = m0Var.f20753b;
        long[] jArr = m0Var.f20752a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            this.f7270b.f(objArr[(i10 << 3) + i12]);
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
        return this.f7269a.b();
    }

    @Override // g1.i
    public final Object c(String str) {
        return this.f7269a.c(str);
    }

    @Override // g1.i
    public final i.a d(String str, eh.a<? extends Object> aVar) {
        return this.f7269a.d(str, aVar);
    }

    @Override // g1.d
    public final void e(Object obj, f1.b bVar, x0.j jVar, int i10) {
        jVar.L(-697180401);
        this.f7270b.e(obj, bVar, jVar, i10 & 126);
        boolean zL = jVar.l(this) | jVar.l(obj);
        Object objG = jVar.g();
        if (zL || objG == j.a.f31715a) {
            objG = new v1(0, this, obj);
            jVar.C(objG);
        }
        x0.o0.a(obj, (eh.l) objG, jVar);
        jVar.B();
    }

    @Override // g1.d
    public final void f(Object obj) {
        this.f7270b.f(obj);
    }
}
