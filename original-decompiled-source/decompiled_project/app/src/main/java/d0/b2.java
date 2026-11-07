package d0;

import d0.o;

/* loaded from: classes.dex */
public final class b2 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final p.f0 f7059a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f7060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7061c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g<? extends o.a>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7062a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p.f0<Object> f7064c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b2 f7065d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, p.f0<Object> f0Var, b2 b2Var) {
            super(1);
            this.f7062a = i10;
            this.f7063b = i11;
            this.f7064c = f0Var;
            this.f7065d = b2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[LOOP:0: B:4:0x001d->B:10:0x0041, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[EDGE_INSN: B:13:0x0044->B:11:0x0044 BREAK  A[LOOP:0: B:4:0x001d->B:10:0x0041], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(g<? extends o.a> gVar) {
            Object eVar;
            g<? extends o.a> gVar2 = gVar;
            eh.l<Integer, Object> key = gVar2.f7133c.getKey();
            int i10 = gVar2.f7131a;
            int iMax = Math.max(this.f7062a, i10);
            int iMin = Math.min(this.f7063b, (gVar2.f7132b + i10) - 1);
            if (iMax <= iMin) {
                while (true) {
                    if (key == null) {
                        eVar = new e(iMax);
                        this.f7064c.h(iMax, eVar);
                        b2 b2Var = this.f7065d;
                        b2Var.f7060b[iMax - b2Var.f7061c] = eVar;
                        if (iMax != iMin) {
                            break;
                        }
                        iMax++;
                    } else {
                        eVar = key.invoke(Integer.valueOf(iMax - i10));
                        if (eVar == null) {
                        }
                        this.f7064c.h(iMax, eVar);
                        b2 b2Var2 = this.f7065d;
                        b2Var2.f7060b[iMax - b2Var2.f7061c] = eVar;
                        if (iMax != iMin) {
                        }
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    public b2(jh.g gVar, o<?> oVar) {
        a2 a2VarF = oVar.f();
        int i10 = gVar.f15744a;
        if (i10 < 0) {
            y.c.c("negative nearestRange.first");
        }
        int iMin = Math.min(gVar.f15745b, a2VarF.f7052b - 1);
        if (iMin < i10) {
            p.f0<Object> f0Var = p.p0.f20701a;
            kotlin.jvm.internal.r.c(f0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f7059a = f0Var;
            this.f7060b = new Object[0];
            this.f7061c = 0;
            return;
        }
        int i11 = (iMin - i10) + 1;
        this.f7060b = new Object[i11];
        this.f7061c = i10;
        p.f0 f0Var2 = new p.f0(i11);
        a aVar = new a(i10, iMin, f0Var2, this);
        z0.b<g<T>> bVar = a2VarF.f7051a;
        if (i10 < 0 || i10 >= a2VarF.f7052b) {
            StringBuilder sbB = p.i0.b(i10, "Index ", ", size ");
            sbB.append(a2VarF.f7052b);
            y.c.e(sbB.toString());
        }
        if (iMin < 0 || iMin >= a2VarF.f7052b) {
            StringBuilder sbB2 = p.i0.b(iMin, "Index ", ", size ");
            sbB2.append(a2VarF.f7052b);
            y.c.e(sbB2.toString());
        }
        if (iMin < i10) {
            y.c.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iB = h.b(i10, bVar);
        int i12 = ((g) bVar.f34700a[iB]).f7131a;
        while (i12 <= iMin) {
            g<? extends o.a> gVar2 = (g) bVar.f34700a[iB];
            aVar.invoke(gVar2);
            i12 += gVar2.f7132b;
            iB++;
        }
        this.f7059a = f0Var2;
    }

    public final Object a(int i10) {
        int i11 = i10 - this.f7061c;
        if (i11 < 0) {
            return null;
        }
        Object[] objArr = this.f7060b;
        kotlin.jvm.internal.r.e(objArr, "<this>");
        if (i11 <= objArr.length - 1) {
            return objArr[i11];
        }
        return null;
    }

    @Override // d0.j0
    public final int c(Object obj) {
        p.f0 f0Var = this.f7059a;
        int iD = f0Var.d(obj);
        if (iD >= 0) {
            return f0Var.f20617c[iD];
        }
        return -1;
    }
}
