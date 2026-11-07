package y0;

import f1.h;
import qg.m;
import x0.d3;

/* loaded from: classes.dex */
public final class e extends ci.a {

    /* renamed from: b, reason: collision with root package name */
    public int f33665b;

    /* renamed from: d, reason: collision with root package name */
    public int f33667d;

    /* renamed from: f, reason: collision with root package name */
    public int f33669f;

    /* renamed from: a, reason: collision with root package name */
    public d[] f33664a = new d[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f33666c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f33668e = new Object[16];

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f33670a;

        /* renamed from: b, reason: collision with root package name */
        public int f33671b;

        /* renamed from: c, reason: collision with root package name */
        public int f33672c;

        public a() {
        }

        public final int a(int i10) {
            return e.this.f33666c[this.f33671b + i10];
        }

        public final <T> T b(int i10) {
            return (T) e.this.f33668e[this.f33672c + i10];
        }
    }

    public static final class b {
        public static final <T> void a(e eVar, int i10, T t3) {
            eVar.f33668e[(eVar.f33669f - eVar.f33664a[eVar.f33665b - 1].f33628b) + i10] = t3;
        }

        public static final <T, U> void b(e eVar, int i10, T t3, int i11, U u7) {
            int i12 = eVar.f33669f - eVar.f33664a[eVar.f33665b - 1].f33628b;
            Object[] objArr = eVar.f33668e;
            objArr[i10 + i12] = t3;
            objArr[i12 + i11] = u7;
        }

        public static final void c(e eVar, Object obj, Object obj2, Object obj3) {
            int i10 = eVar.f33669f - eVar.f33664a[eVar.f33665b - 1].f33628b;
            Object[] objArr = eVar.f33668e;
            objArr[i10] = obj;
            objArr[i10 + 1] = obj2;
            objArr[i10 + 2] = obj3;
        }
    }

    public final void I() {
        this.f33665b = 0;
        this.f33667d = 0;
        m.m(this.f33668e, 0, this.f33669f, null);
        this.f33669f = 0;
    }

    public final void J(x0.d dVar, d3 d3Var, h hVar) {
        int i10;
        int i11;
        if (L()) {
            a aVar = new a();
            do {
                e eVar = e.this;
                eVar.f33664a[aVar.f33670a].a(aVar, dVar, d3Var, hVar);
                int i12 = aVar.f33670a;
                i10 = eVar.f33665b;
                if (i12 >= i10) {
                    break;
                }
                d dVar2 = eVar.f33664a[i12];
                aVar.f33671b += dVar2.f33627a;
                aVar.f33672c += dVar2.f33628b;
                i11 = i12 + 1;
                aVar.f33670a = i11;
            } while (i11 < i10);
        }
        I();
    }

    public final boolean K() {
        return this.f33665b == 0;
    }

    public final boolean L() {
        return this.f33665b != 0;
    }

    public final void M(d dVar) {
        int i10 = this.f33665b;
        d[] dVarArr = this.f33664a;
        if (i10 == dVarArr.length) {
            d[] dVarArr2 = new d[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i10);
            this.f33664a = dVarArr2;
        }
        int i11 = this.f33667d;
        int i12 = dVar.f33627a;
        int i13 = dVar.f33628b;
        int i14 = i11 + i12;
        int[] iArr = this.f33666c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            m.d(0, iArr, 0, length, iArr2);
            this.f33666c = iArr2;
        }
        int i16 = this.f33669f + i13;
        Object[] objArr = this.f33668e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f33668e = objArr2;
        }
        d[] dVarArr3 = this.f33664a;
        int i18 = this.f33665b;
        this.f33665b = i18 + 1;
        dVarArr3[i18] = dVar;
        this.f33667d += dVar.f33627a;
        this.f33669f += i13;
    }
}
