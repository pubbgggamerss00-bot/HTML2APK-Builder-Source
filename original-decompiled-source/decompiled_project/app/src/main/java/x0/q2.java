package x0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@vg.e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {580, 591}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q2 extends vg.i implements eh.q<ph.i0, d1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public List f31879a;

    /* renamed from: b, reason: collision with root package name */
    public List f31880b;

    /* renamed from: c, reason: collision with root package name */
    public List f31881c;

    /* renamed from: d, reason: collision with root package name */
    public p.m0 f31882d;

    /* renamed from: e, reason: collision with root package name */
    public p.m0 f31883e;

    /* renamed from: f, reason: collision with root package name */
    public p.m0 f31884f;

    /* renamed from: g, reason: collision with root package name */
    public Set f31885g;

    /* renamed from: h, reason: collision with root package name */
    public p.m0 f31886h;

    /* renamed from: j, reason: collision with root package name */
    public int f31887j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ d1 f31888k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k2 f31889l;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2 f31890a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p.m0<Object> f31891b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p.m0<f0> f31892c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<f0> f31893d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<j1> f31894e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p.m0<f0> f31895f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<f0> f31896g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p.m0<f0> f31897h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Set<Object> f31898j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k2 k2Var, p.m0<Object> m0Var, p.m0<f0> m0Var2, List<f0> list, List<j1> list2, p.m0<f0> m0Var3, List<f0> list3, p.m0<f0> m0Var4, Set<? extends Object> set) {
            super(1);
            this.f31890a = k2Var;
            this.f31891b = m0Var;
            this.f31892c = m0Var2;
            this.f31893d = list;
            this.f31894e = list2;
            this.f31895f = m0Var3;
            this.f31896g = list3;
            this.f31897h = m0Var4;
            this.f31898j = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01c0 A[Catch: all -> 0x00cb, TryCatch #4 {all -> 0x00cb, blocks: (B:30:0x0060, B:31:0x0065, B:38:0x0083, B:39:0x0084, B:40:0x008a, B:42:0x0091, B:45:0x0099, B:56:0x00c7, B:66:0x00e1, B:86:0x013f, B:94:0x0154, B:116:0x01ac, B:123:0x01c0, B:124:0x01c2, B:126:0x01c6, B:127:0x01c7, B:129:0x01dc, B:130:0x01dd, B:119:0x01b6, B:121:0x01bc, B:122:0x01bf, B:89:0x0149, B:91:0x014e, B:92:0x0151, B:61:0x00d4, B:64:0x00dd, B:65:0x00e0, B:140:0x0201, B:142:0x020a, B:168:0x0274, B:182:0x02a7, B:144:0x0210, B:145:0x0212, B:167:0x0273, B:183:0x02af, B:184:0x02b0, B:186:0x02b7, B:191:0x02c0, B:192:0x02c3, B:193:0x02c4, B:194:0x02c5, B:170:0x027a, B:171:0x027d, B:173:0x0283, B:174:0x028e, B:176:0x0294, B:177:0x029c, B:88:0x0143, B:69:0x00f2, B:72:0x0103, B:74:0x0111, B:76:0x011b, B:78:0x0121, B:96:0x015a, B:99:0x0164, B:101:0x0174, B:103:0x017e, B:105:0x0184, B:47:0x009f, B:49:0x00a6, B:52:0x00b4, B:54:0x00bb, B:146:0x0213, B:148:0x021e, B:150:0x022a, B:152:0x0230, B:155:0x0237, B:156:0x023a, B:158:0x0242, B:160:0x024e, B:162:0x0254, B:165:0x0264, B:164:0x025c, B:166:0x0267, B:131:0x01de, B:133:0x01e5, B:135:0x01f1, B:138:0x01fb, B:32:0x0066, B:34:0x006f, B:37:0x007c, B:118:0x01b0, B:125:0x01c3, B:60:0x00ce, B:185:0x02b1), top: B:207:0x0060, inners: #0, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:212:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(Long l10) {
            boolean zY;
            long j10;
            int i10;
            boolean z10;
            long jLongValue = l10.longValue();
            k2 k2Var = this.f31890a;
            synchronized (k2Var.f31765b) {
                zY = k2Var.y();
            }
            if (zY) {
                k2 k2Var2 = this.f31890a;
                Trace.beginSection("Recomposer:animation");
                try {
                    k2Var2.f31764a.a(jLongValue);
                    synchronized (h1.n.f12160c) {
                        p.m0<h1.i0> m0Var = h1.n.f12167j.f12096h;
                        if (m0Var != null) {
                            z10 = m0Var.c();
                        }
                    }
                    if (z10) {
                        h1.n.a();
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } finally {
                }
            }
            k2 k2Var3 = this.f31890a;
            p.m0<Object> m0Var2 = this.f31891b;
            p.m0<f0> m0Var3 = this.f31892c;
            List<f0> list = this.f31893d;
            List<j1> list2 = this.f31894e;
            p.m0<f0> m0Var4 = this.f31895f;
            List<f0> list3 = this.f31896g;
            p.m0<f0> m0Var5 = this.f31897h;
            Set<? extends Object> set = this.f31898j;
            Trace.beginSection("Recomposer:recompose");
            try {
                k2.t(k2Var3);
                synchronized (k2Var3.f31765b) {
                    try {
                        z0.b<f0> bVar = k2Var3.f31771h;
                        f0[] f0VarArr = bVar.f34700a;
                        int i11 = bVar.f34702c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            list.add(f0VarArr[i12]);
                        }
                        k2Var3.f31771h.g();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    } finally {
                    }
                }
                m0Var2.e();
                m0Var3.e();
                while (true) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        break;
                    }
                    try {
                        int size = list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            f0 f0Var3 = list.get(i13);
                            f0 f0VarS = k2.s(k2Var3, f0Var3, m0Var2);
                            if (f0VarS != null) {
                                list3.add(f0VarS);
                                pg.f0 f0Var4 = pg.f0.f21461a;
                            }
                            m0Var3.d(f0Var3);
                        }
                        list.clear();
                        if (m0Var2.c() || k2Var3.f31771h.f34702c != 0) {
                            synchronized (k2Var3.f31765b) {
                                try {
                                    List<f0> listA = k2Var3.A();
                                    int size2 = listA.size();
                                    for (int i14 = 0; i14 < size2; i14++) {
                                        f0 f0Var5 = listA.get(i14);
                                        if (!m0Var3.a(f0Var5) && f0Var5.e(set)) {
                                            list.add(f0Var5);
                                        }
                                    }
                                    z0.b<f0> bVar2 = k2Var3.f31771h;
                                    int i15 = bVar2.f34702c;
                                    int i16 = 0;
                                    for (int i17 = 0; i17 < i15; i17++) {
                                        f0 f0Var6 = bVar2.f34700a[i17];
                                        if (!m0Var3.a(f0Var6) && !list.contains(f0Var6)) {
                                            list.add(f0Var6);
                                            i16++;
                                        } else if (i16 > 0) {
                                            f0[] f0VarArr2 = bVar2.f34700a;
                                            f0VarArr2[i17 - i16] = f0VarArr2[i17];
                                        }
                                    }
                                    int i18 = i15 - i16;
                                    Arrays.fill(bVar2.f34700a, i18, i15, (Object) null);
                                    bVar2.f34702c = i18;
                                    pg.f0 f0Var7 = pg.f0.f21461a;
                                } finally {
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                q2.g(list2, k2Var3);
                                while (!list2.isEmpty()) {
                                    List<f0> listD = k2Var3.D(list2, m0Var2);
                                    m0Var4.getClass();
                                    Iterator<T> it = listD.iterator();
                                    while (it.hasNext()) {
                                        m0Var4.j(it.next());
                                    }
                                    q2.g(list2, k2Var3);
                                }
                            } catch (Throwable th2) {
                                k2Var3.E(th2, null);
                                q2.e(k2Var3, list, list2, list3, m0Var4, m0Var5, m0Var2, m0Var3);
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            k2Var3.E(th3, null);
                            q2.e(k2Var3, list, list2, list3, m0Var4, m0Var5, m0Var2, m0Var3);
                        } finally {
                            list.clear();
                        }
                    }
                    return pg.f0.f21461a;
                }
                if (list3.isEmpty()) {
                    int i19 = 8;
                    if (m0Var4.c()) {
                    }
                    if (m0Var5.c()) {
                    }
                } else {
                    try {
                        int size3 = list3.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            m0Var5.d(list3.get(i20));
                        }
                        int size4 = list3.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            list3.get(i21).m();
                        }
                        int i192 = 8;
                        if (m0Var4.c()) {
                            j10 = 128;
                        } else {
                            try {
                                m0Var5.k(m0Var4);
                                Object[] objArr = m0Var4.f20753b;
                                long[] jArr = m0Var4.f20752a;
                                j10 = 128;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i22 = 0;
                                    while (true) {
                                        long j11 = jArr[i22];
                                        Object[] objArr2 = objArr;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i23 = 8 - ((~(i22 - length)) >>> 31);
                                            for (int i24 = 0; i24 < i23; i24++) {
                                                if ((j11 & 255) < 128) {
                                                    ((f0) objArr2[(i22 << 3) + i24]).i();
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i23 != 8) {
                                                break;
                                            }
                                            if (i22 == length) {
                                                break;
                                            }
                                            i22++;
                                            objArr = objArr2;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    k2Var3.E(th4, null);
                                    q2.e(k2Var3, list, list2, list3, m0Var4, m0Var5, m0Var2, m0Var3);
                                    m0Var4.e();
                                } finally {
                                    m0Var4.e();
                                }
                            }
                        }
                        if (m0Var5.c()) {
                            synchronized (k2Var3.f31765b) {
                            }
                        } else {
                            try {
                                Object[] objArr3 = m0Var5.f20753b;
                                long[] jArr2 = m0Var5.f20752a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i25 = 0;
                                    while (true) {
                                        long j12 = jArr2[i25];
                                        int i26 = i192;
                                        int i27 = length2;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i28 = 8 - ((~(i25 - i27)) >>> 31);
                                            for (int i29 = 0; i29 < i28; i29++) {
                                                if ((j12 & 255) < j10) {
                                                    ((f0) objArr3[(i25 << 3) + i29]).r();
                                                }
                                                j12 >>= i26;
                                            }
                                            i10 = i26;
                                            if (i28 != i10) {
                                                break;
                                            }
                                        } else {
                                            i10 = i26;
                                        }
                                        if (i25 == i27) {
                                            break;
                                        }
                                        i25++;
                                        int i30 = i10;
                                        length2 = i27;
                                        i192 = i30;
                                    }
                                }
                                synchronized (k2Var3.f31765b) {
                                    k2Var3.x();
                                }
                                h1.n.k().m();
                                m0Var3.e();
                                m0Var2.e();
                                k2Var3.f31779p = null;
                                pg.f0 f0Var8 = pg.f0.f21461a;
                            } catch (Throwable th5) {
                                try {
                                    k2Var3.E(th5, null);
                                    q2.e(k2Var3, list, list2, list3, m0Var4, m0Var5, m0Var2, m0Var3);
                                    m0Var5.e();
                                } finally {
                                    m0Var5.e();
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            k2Var3.E(th6, null);
                            q2.e(k2Var3, list, list2, list3, m0Var4, m0Var5, m0Var2, m0Var3);
                        } finally {
                            list3.clear();
                        }
                    }
                }
                return pg.f0.f21461a;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(k2 k2Var, tg.e<? super q2> eVar) {
        super(3, eVar);
        this.f31889l = k2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(k2 k2Var, List list, List list2, List list3, p.m0 m0Var, p.m0 m0Var2, p.m0 m0Var3, p.m0 m0Var4) {
        char c10;
        long j10;
        long j11;
        synchronized (k2Var.f31765b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f0 f0Var = (f0) list3.get(i10);
                    f0Var.q();
                    k2Var.F(f0Var);
                }
                list3.clear();
                Object[] objArr = m0Var.f20753b;
                long[] jArr = m0Var.f20752a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    j10 = 255;
                    while (true) {
                        long j12 = jArr[i11];
                        c10 = 7;
                        j11 = -9187201950435737472L;
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j12 & 255) < 128) {
                                    f0 f0Var2 = (f0) objArr[(i11 << 3) + i13];
                                    f0Var2.q();
                                    k2Var.F(f0Var2);
                                }
                                j12 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 == length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    c10 = 7;
                    j10 = 255;
                    j11 = -9187201950435737472L;
                }
                m0Var.e();
                Object[] objArr2 = m0Var2.f20753b;
                long[] jArr2 = m0Var2.f20752a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j13 = jArr2[i14];
                        if ((((~j13) << c10) & j13 & j11) != j11) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j13 & j10) < 128) {
                                    ((f0) objArr2[(i14 << 3) + i16]).r();
                                }
                                j13 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 == length2) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                m0Var2.e();
                m0Var3.e();
                Object[] objArr3 = m0Var4.f20753b;
                long[] jArr3 = m0Var4.f20752a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j14 = jArr3[i17];
                        if ((((~j14) << c10) & j14 & j11) != j11) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j14 & j10) < 128) {
                                    f0 f0Var3 = (f0) objArr3[(i17 << 3) + i19];
                                    f0Var3.q();
                                    k2Var.F(f0Var3);
                                }
                                j14 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            } else if (i17 == length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                m0Var4.e();
                pg.f0 f0Var4 = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void g(List list, k2 k2Var) {
        list.clear();
        synchronized (k2Var.f31765b) {
            try {
                ArrayList arrayList = k2Var.f31773j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((j1) arrayList.get(i10));
                }
                k2Var.f31773j.clear();
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // eh.q
    public final Object b(ph.i0 i0Var, d1 d1Var, tg.e<? super pg.f0> eVar) throws Throwable {
        q2 q2Var = new q2(this.f31889l, eVar);
        q2Var.f31888k = d1Var;
        q2Var.invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x011f -> B:44:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01e0 -> B:12:0x0090). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        d1 d1Var;
        p.m0 m0VarA;
        p.m0 m0VarA2;
        List list;
        Set set;
        List list2;
        p.m0 m0Var;
        List list3;
        p.m0 m0Var2;
        List list4;
        p.m0 m0Var3;
        List list5;
        p.m0 m0Var4;
        Object objO;
        ph.m mVar;
        ug.a aVar;
        d1 d1Var2;
        p.h0 h0Var;
        q2 q2Var = this;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = q2Var.f31887j;
        int i11 = 2;
        int i12 = 1;
        if (i10 == 0) {
            pg.q.b(obj);
            d1Var = q2Var.f31888k;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            m0VarA = p.y0.a();
            p.m0 m0VarA3 = p.y0.a();
            p.m0 m0Var5 = new p.m0((Object) null);
            z0.d dVar = new z0.d(m0Var5);
            m0VarA2 = p.y0.a();
            list = arrayList;
            set = dVar;
            list2 = arrayList2;
            m0Var = m0Var5;
            list3 = arrayList3;
            m0Var2 = m0VarA3;
            synchronized (q2Var.f31889l.f31765b) {
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.m0 m0Var6 = q2Var.f31886h;
                set = q2Var.f31885g;
                m0Var = q2Var.f31884f;
                m0Var2 = q2Var.f31883e;
                m0VarA = q2Var.f31882d;
                list3 = q2Var.f31881c;
                list2 = q2Var.f31880b;
                list = q2Var.f31879a;
                d1 d1Var3 = q2Var.f31888k;
                pg.q.b(obj);
                m0VarA2 = m0Var6;
                d1Var = d1Var3;
                k2 k2Var = q2Var.f31889l;
                synchronized (k2Var.f31765b) {
                    try {
                        p.l0<Object, Object> l0Var = k2Var.f31774k;
                        if (l0Var.f20741e != 0) {
                            p.h0 h0VarE = z0.a.e(l0Var);
                            k2Var.f31774k.f();
                            o1 o1Var = k2Var.f31775l;
                            o1Var.f31835a.f();
                            o1Var.f31836b.f();
                            k2Var.f31777n.f();
                            h0Var = new p.h0(h0VarE.f20707b);
                            Object[] objArr = h0VarE.f20706a;
                            int i13 = h0VarE.f20707b;
                            aVar = aVar2;
                            int i14 = 0;
                            while (i14 < i13) {
                                int i15 = i14;
                                j1 j1Var = (j1) objArr[i14];
                                h0Var.g(new pg.n(j1Var, k2Var.f31776m.d(j1Var)));
                                i14 = i15 + 1;
                                d1Var = d1Var;
                            }
                            d1Var2 = d1Var;
                            k2Var.f31776m.f();
                        } else {
                            aVar = aVar2;
                            d1Var2 = d1Var;
                            h0Var = p.r0.f20711b;
                            kotlin.jvm.internal.r.c(h0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Object[] objArr2 = h0Var.f20706a;
                int i16 = h0Var.f20707b;
                for (int i17 = 0; i17 < i16; i17++) {
                    pg.n nVar = (pg.n) objArr2[i17];
                    j1 j1Var2 = (j1) nVar.f21469a;
                    i1 i1Var = (i1) nVar.f21470b;
                    if (i1Var != null) {
                        f1.h hVar = new f1.h(j1Var2.f31720c.f31928e);
                        d3 d3VarG = i1Var.f31711a.g();
                        try {
                            q.h(d3VarG, hVar);
                            pg.f0 f0Var = pg.f0.f21461a;
                            d3VarG.e(true);
                            hVar.b();
                        } catch (Throwable th3) {
                            d3VarG.e(false);
                            throw th3;
                        }
                    }
                }
                q2Var = this;
                aVar2 = aVar;
                d1Var = d1Var2;
                i11 = 2;
                i12 = 1;
                synchronized (q2Var.f31889l.f31765b) {
                }
                k2 k2Var2 = q2Var.f31889l;
                q2Var.f31888k = d1Var;
                q2Var.f31879a = list;
                q2Var.f31880b = list2;
                q2Var.f31881c = list3;
                q2Var.f31882d = m0VarA;
                q2Var.f31883e = m0Var2;
                q2Var.f31884f = m0Var;
                q2Var.f31885g = set;
                q2Var.f31886h = m0VarA2;
                q2Var.f31887j = i12;
                if (k2Var2.z()) {
                    objO = pg.f0.f21461a;
                } else {
                    ph.m mVar2 = new ph.m(i12, ah.p.c(q2Var));
                    mVar2.p();
                    synchronized (k2Var2.f31765b) {
                        if (k2Var2.z()) {
                            mVar = mVar2;
                        } else {
                            k2Var2.f31780q = mVar2;
                            mVar = null;
                        }
                    }
                    if (mVar != null) {
                        mVar.resumeWith(pg.f0.f21461a);
                    }
                    objO = mVar2.o();
                    if (objO != ug.a.f29706a) {
                        objO = pg.f0.f21461a;
                    }
                }
                if (objO != aVar2) {
                    List list6 = list;
                    m0Var3 = m0VarA;
                    m0Var4 = m0VarA2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    p.m0 m0Var7 = m0Var2;
                    p.m0 m0Var8 = m0Var;
                    if (k2.t(q2Var.f31889l)) {
                        List list7 = list4;
                        m0VarA2 = m0Var4;
                        m0VarA = m0Var3;
                        list = list5;
                        list3 = list7;
                        q2Var = this;
                        m0Var = m0Var8;
                        m0Var2 = m0Var7;
                        set = set2;
                        synchronized (q2Var.f31889l.f31765b) {
                        }
                    } else {
                        a aVar3 = new a(q2Var.f31889l, m0Var8, m0Var4, list5, list2, m0Var3, list4, m0Var7, set2);
                        q2Var.f31888k = d1Var;
                        q2Var.f31879a = list5;
                        q2Var.f31880b = list2;
                        q2Var.f31881c = list4;
                        q2Var.f31882d = m0Var3;
                        q2Var.f31883e = m0Var7;
                        q2Var.f31884f = m0Var8;
                        q2Var.f31885g = set2;
                        q2Var.f31886h = m0Var4;
                        q2Var.f31887j = i11;
                        if (d1Var.f0(aVar3, q2Var) != aVar2) {
                            List list8 = list4;
                            m0VarA2 = m0Var4;
                            m0VarA = m0Var3;
                            list = list5;
                            list3 = list8;
                            m0Var = m0Var8;
                            m0Var2 = m0Var7;
                            set = set2;
                            k2 k2Var3 = q2Var.f31889l;
                            synchronized (k2Var3.f31765b) {
                            }
                        }
                    }
                }
                return aVar2;
            }
            p.m0 m0Var9 = q2Var.f31886h;
            set = q2Var.f31885g;
            m0Var = q2Var.f31884f;
            m0Var2 = q2Var.f31883e;
            p.m0 m0Var10 = q2Var.f31882d;
            List list9 = q2Var.f31881c;
            list2 = q2Var.f31880b;
            List list10 = q2Var.f31879a;
            d1 d1Var4 = q2Var.f31888k;
            pg.q.b(obj);
            m0Var4 = m0Var9;
            d1Var = d1Var4;
            list4 = list9;
            list5 = list10;
            m0Var3 = m0Var10;
            Set set22 = set;
            p.m0 m0Var72 = m0Var2;
            p.m0 m0Var82 = m0Var;
            if (k2.t(q2Var.f31889l)) {
            }
        }
    }
}
