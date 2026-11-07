package h1;

import androidx.datastore.preferences.protobuf.u1;
import h1.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p.w0;
import p.x0;
import x0.b2;
import x0.g0;
import x0.i3;
import x0.u3;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<eh.a<pg.f0>, pg.f0> f12194a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12196c;

    /* renamed from: h, reason: collision with root package name */
    public g f12201h;

    /* renamed from: i, reason: collision with root package name */
    public a f12202i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f12195b = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    public final b f12197d = new b();

    /* renamed from: e, reason: collision with root package name */
    public final c f12198e = new c();

    /* renamed from: f, reason: collision with root package name */
    public final z0.b<a> f12199f = new z0.b<>(new a[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f12200g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f12203j = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final eh.l<Object, pg.f0> f12204a;

        /* renamed from: b, reason: collision with root package name */
        public Object f12205b;

        /* renamed from: c, reason: collision with root package name */
        public p.f0<Object> f12206c;

        /* renamed from: j, reason: collision with root package name */
        public int f12213j;

        /* renamed from: d, reason: collision with root package name */
        public int f12207d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final p.l0<Object, Object> f12208e = w0.b();

        /* renamed from: f, reason: collision with root package name */
        public final p.l0<Object, p.f0<Object>> f12209f = new p.l0<>((Object) null);

        /* renamed from: g, reason: collision with root package name */
        public final p.m0<Object> f12210g = new p.m0<>((Object) null);

        /* renamed from: h, reason: collision with root package name */
        public final z0.b<x0.h0<?>> f12211h = new z0.b<>(new x0.h0[16]);

        /* renamed from: i, reason: collision with root package name */
        public final C0109a f12212i = new C0109a();

        /* renamed from: k, reason: collision with root package name */
        public final p.l0<Object, Object> f12214k = w0.b();

        /* renamed from: l, reason: collision with root package name */
        public final HashMap<x0.h0<?>, Object> f12215l = new HashMap<>();

        /* renamed from: h1.z$a$a, reason: collision with other inner class name */
        public static final class C0109a implements x0.i0 {
            public C0109a() {
            }

            @Override // x0.i0
            public final void done() {
                a aVar = a.this;
                aVar.f12213j--;
            }

            @Override // x0.i0
            public final void start() {
                a.this.f12213j++;
            }
        }

        public a(eh.l<Object, pg.f0> lVar) {
            this.f12204a = lVar;
        }

        public final void a(Object obj, c cVar, eh.a aVar) {
            boolean z10;
            int i10;
            int i11;
            Object obj2 = this.f12205b;
            p.f0<Object> f0Var = this.f12206c;
            int i12 = this.f12207d;
            this.f12205b = obj;
            this.f12206c = this.f12209f.d(obj);
            if (this.f12207d == -1) {
                this.f12207d = Long.hashCode(n.k().g());
            }
            C0109a c0109a = this.f12212i;
            z0.b bVarC = bg.b.c();
            boolean z11 = true;
            try {
                bVarC.b(c0109a);
                h.a.c(aVar, cVar);
                bVarC.k(bVarC.f34702c - 1);
                Object obj3 = this.f12205b;
                kotlin.jvm.internal.r.b(obj3);
                int i13 = this.f12207d;
                p.f0<Object> f0Var2 = this.f12206c;
                if (f0Var2 != null) {
                    long[] jArr = f0Var2.f20615a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                z10 = z11;
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        i11 = i15;
                                        Object obj4 = f0Var2.f20616b[i18];
                                        i10 = i17;
                                        boolean z12 = f0Var2.f20617c[i18] != i13 ? z10 : false;
                                        if (z12) {
                                            d(obj3, obj4);
                                        }
                                        if (z12) {
                                            f0Var2.g(i18);
                                        }
                                    } else {
                                        i10 = i17;
                                        i11 = i15;
                                    }
                                    j10 >>= i11;
                                    i17 = i10 + 1;
                                    i15 = i11;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                            } else {
                                z10 = z11;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                            z11 = z10;
                        }
                    }
                }
                this.f12205b = obj2;
                this.f12206c = f0Var;
                this.f12207d = i12;
            } catch (Throwable th2) {
                bVarC.k(bVarC.f34702c - 1);
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0285 A[PHI: r13
          0x0285: PHI (r13v38 boolean) = (r13v37 boolean), (r13v39 boolean) binds: [B:110:0x025d, B:118:0x0283] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x03e7 A[PHI: r46
          0x03e7: PHI (r46v4 boolean) = (r46v3 boolean), (r46v6 boolean) binds: [B:172:0x03b5, B:182:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:200:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04bd A[PHI: r13
          0x04bd: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:214:0x0495, B:222:0x04bb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:245:0x051d A[EDGE_INSN: B:245:0x051d->B:326:0x0526 BREAK  A[LOOP:18: B:235:0x04eb->B:246:0x051f], PHI: r13
          0x051d: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:236:0x04f5, B:244:0x051b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[PHI: r33
          0x013b: PHI (r33v13 boolean) = (r33v12 boolean), (r33v14 boolean) binds: [B:48:0x010f, B:57:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0216 A[PHI: r13
          0x0216: PHI (r13v48 boolean) = (r13v47 boolean), (r13v49 boolean) binds: [B:86:0x01ee, B:94:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0224  */
        /* JADX WARN: Type inference failed for: r31v6, types: [x0.i3] */
        /* JADX WARN: Type inference failed for: r36v23, types: [x0.i3] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(Set<? extends Object> set) {
            char c10;
            long j10;
            boolean z10;
            Iterator it;
            String str;
            Object obj;
            int i10;
            long[] jArr;
            Object[] objArr;
            int i11;
            long[] jArr2;
            String str2;
            Object[] objArr2;
            long j11;
            Object obj2;
            int i12;
            int i13;
            x0.h0<?>[] h0VarArr;
            int i14;
            z0.b<x0.h0<?>> bVar;
            int i15;
            int i16;
            z0.b<x0.h0<?>> bVar2;
            p.f0<Object> f0Var;
            long[] jArr3;
            Object[] objArr3;
            u3 u3Var;
            long[] jArr4;
            Object[] objArr4;
            u3 u3Var2;
            int i17;
            int i18;
            int i19;
            long j12;
            Object obj3;
            Object obj4;
            Object obj5;
            int i20;
            int i21;
            long j13;
            int i22;
            int i23;
            boolean z11 = set instanceof z0.d;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            u3 u3Var3 = u3.f31923a;
            z0.b<x0.h0<?>> bVar3 = this.f12211h;
            p.l0<Object, Object> l0Var = this.f12214k;
            HashMap<x0.h0<?>, Object> map = this.f12215l;
            p.l0<Object, Object> l0Var2 = this.f12208e;
            p.m0<Object> m0Var = this.f12210g;
            if (z11) {
                x0 x0Var = ((z0.d) set).f34709a;
                Object[] objArr5 = x0Var.f20753b;
                long[] jArr5 = x0Var.f20752a;
                c10 = 7;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i24 = 0;
                    z10 = false;
                    j10 = -9187201950435737472L;
                    while (true) {
                        int i25 = 8;
                        long j14 = jArr5[i24];
                        int i26 = i24;
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i27 = 8 - ((~(i26 - length)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j14 & 255) < 128) {
                                    jArr4 = jArr5;
                                    Object obj6 = objArr5[(i26 << 3) + i28];
                                    objArr4 = objArr5;
                                    if (obj6 instanceof j0) {
                                        u3Var2 = u3Var3;
                                        if (!((j0) obj6).n(2)) {
                                        }
                                        i28 = i19 + 1;
                                        i25 = 8;
                                        objArr5 = objArr4;
                                        u3Var3 = u3Var2;
                                        length = i17;
                                        i27 = i18;
                                        j14 = j12 >> 8;
                                        jArr5 = jArr4;
                                    } else {
                                        u3Var2 = u3Var3;
                                    }
                                    if (l0Var.b(obj6)) {
                                        Object objD = l0Var.d(obj6);
                                        if (objD == null) {
                                            obj4 = obj6;
                                            i17 = length;
                                            i18 = i27;
                                            i19 = i28;
                                            j12 = j14;
                                            obj3 = obj4;
                                        } else {
                                            if (objD instanceof p.m0) {
                                                p.m0 m0Var2 = (p.m0) objD;
                                                Object[] objArr6 = m0Var2.f20753b;
                                                long[] jArr6 = m0Var2.f20752a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    i19 = i28;
                                                    boolean z12 = z10;
                                                    int i29 = 0;
                                                    while (true) {
                                                        long j15 = jArr6[i29];
                                                        j12 = j14;
                                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                            int i31 = 0;
                                                            while (i31 < i30) {
                                                                if ((j15 & 255) < 128) {
                                                                    j13 = j15;
                                                                    x0.h0 h0Var = (x0.h0) objArr6[(i29 << 3) + i31];
                                                                    kotlin.jvm.internal.r.c(h0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                    Object obj7 = map.get(h0Var);
                                                                    ?? A = h0Var.a();
                                                                    i22 = i31;
                                                                    if ((A == 0 ? u3Var2 : A).a(h0Var.l().f31691f, obj7)) {
                                                                        obj5 = obj6;
                                                                        i20 = length;
                                                                        i21 = i27;
                                                                        bVar3.b(h0Var);
                                                                    } else {
                                                                        Object objD2 = l0Var2.d(h0Var);
                                                                        if (objD2 == null) {
                                                                            obj5 = obj6;
                                                                            i20 = length;
                                                                            i21 = i27;
                                                                        } else if (objD2 instanceof p.m0) {
                                                                            p.m0 m0Var3 = (p.m0) objD2;
                                                                            Object[] objArr7 = m0Var3.f20753b;
                                                                            long[] jArr7 = m0Var3.f20752a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i20 = length;
                                                                                i21 = i27;
                                                                                int i32 = 0;
                                                                                while (true) {
                                                                                    long j16 = jArr7[i32];
                                                                                    long[] jArr8 = jArr7;
                                                                                    obj5 = obj6;
                                                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i33 = 8 - ((~(i32 - length3)) >>> 31);
                                                                                        int i34 = 0;
                                                                                        while (i34 < i33) {
                                                                                            if ((j16 & 255) < 128) {
                                                                                                i23 = i34;
                                                                                                m0Var.d(objArr7[(i32 << 3) + i34]);
                                                                                                z12 = true;
                                                                                            } else {
                                                                                                i23 = i34;
                                                                                            }
                                                                                            j16 >>= i25;
                                                                                            i34 = i23 + 1;
                                                                                        }
                                                                                        if (i33 != i25) {
                                                                                            break;
                                                                                        }
                                                                                        if (i32 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i32++;
                                                                                        obj6 = obj5;
                                                                                        jArr7 = jArr8;
                                                                                        i25 = 8;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj5 = obj6;
                                                                            i20 = length;
                                                                            i21 = i27;
                                                                            m0Var.d(objD2);
                                                                            z12 = true;
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj5 = obj6;
                                                                    i20 = length;
                                                                    i21 = i27;
                                                                    j13 = j15;
                                                                    i22 = i31;
                                                                }
                                                                j15 = j13 >> 8;
                                                                i31 = i22 + 1;
                                                                i25 = 8;
                                                                length = i20;
                                                                i27 = i21;
                                                                obj6 = obj5;
                                                            }
                                                            obj4 = obj6;
                                                            i17 = length;
                                                            i18 = i27;
                                                            if (i30 != i25) {
                                                                break;
                                                            }
                                                        } else {
                                                            obj4 = obj6;
                                                            i17 = length;
                                                            i18 = i27;
                                                        }
                                                        if (i29 == length2) {
                                                            break;
                                                        }
                                                        i29++;
                                                        i25 = 8;
                                                        j14 = j12;
                                                        length = i17;
                                                        i27 = i18;
                                                        obj6 = obj4;
                                                    }
                                                    z10 = z12;
                                                }
                                            } else {
                                                obj4 = obj6;
                                                i17 = length;
                                                i18 = i27;
                                                i19 = i28;
                                                j12 = j14;
                                                x0.h0 h0Var2 = (x0.h0) objD;
                                                Object obj8 = map.get(h0Var2);
                                                i3 i3VarA = h0Var2.a();
                                                if (i3VarA == null) {
                                                    i3VarA = u3Var2;
                                                }
                                                if (i3VarA.a(h0Var2.l().f31691f, obj8)) {
                                                    bVar3.b(h0Var2);
                                                } else {
                                                    Object objD3 = l0Var2.d(h0Var2);
                                                    if (objD3 != null) {
                                                        if (objD3 instanceof p.m0) {
                                                            p.m0 m0Var4 = (p.m0) objD3;
                                                            Object[] objArr8 = m0Var4.f20753b;
                                                            long[] jArr9 = m0Var4.f20752a;
                                                            int length4 = jArr9.length - 2;
                                                            if (length4 >= 0) {
                                                                int i35 = 0;
                                                                while (true) {
                                                                    long j17 = jArr9[i35];
                                                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i36 = 8 - ((~(i35 - length4)) >>> 31);
                                                                        for (int i37 = 0; i37 < i36; i37++) {
                                                                            if ((j17 & 255) < 128) {
                                                                                m0Var.d(objArr8[(i35 << 3) + i37]);
                                                                                z10 = true;
                                                                            }
                                                                            j17 >>= 8;
                                                                        }
                                                                        if (i36 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i35 == length4) {
                                                                            break;
                                                                        }
                                                                        i35++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            m0Var.d(objD3);
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            obj3 = obj4;
                                        }
                                        i28 = i19 + 1;
                                        i25 = 8;
                                        objArr5 = objArr4;
                                        u3Var3 = u3Var2;
                                        length = i17;
                                        i27 = i18;
                                        j14 = j12 >> 8;
                                        jArr5 = jArr4;
                                    } else {
                                        i17 = length;
                                        i18 = i27;
                                        i19 = i28;
                                        j12 = j14;
                                        obj3 = obj6;
                                    }
                                    Object objD4 = l0Var2.d(obj3);
                                    if (objD4 != null) {
                                        if (objD4 instanceof p.m0) {
                                            p.m0 m0Var5 = (p.m0) objD4;
                                            Object[] objArr9 = m0Var5.f20753b;
                                            long[] jArr10 = m0Var5.f20752a;
                                            int length5 = jArr10.length - 2;
                                            if (length5 >= 0) {
                                                int i38 = 0;
                                                while (true) {
                                                    long j18 = jArr10[i38];
                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i39 = 8 - ((~(i38 - length5)) >>> 31);
                                                        for (int i40 = 0; i40 < i39; i40++) {
                                                            if ((j18 & 255) < 128) {
                                                                m0Var.d(objArr9[(i38 << 3) + i40]);
                                                                z10 = true;
                                                            }
                                                            j18 >>= 8;
                                                        }
                                                        if (i39 != 8) {
                                                            break;
                                                        }
                                                        if (i38 == length5) {
                                                            break;
                                                        }
                                                        i38++;
                                                    }
                                                }
                                            }
                                        } else {
                                            m0Var.d(objD4);
                                            z10 = true;
                                        }
                                    }
                                    i28 = i19 + 1;
                                    i25 = 8;
                                    objArr5 = objArr4;
                                    u3Var3 = u3Var2;
                                    length = i17;
                                    i27 = i18;
                                    j14 = j12 >> 8;
                                    jArr5 = jArr4;
                                } else {
                                    jArr4 = jArr5;
                                    objArr4 = objArr5;
                                    u3Var2 = u3Var3;
                                }
                                i17 = length;
                                i18 = i27;
                                i19 = i28;
                                j12 = j14;
                                i28 = i19 + 1;
                                i25 = 8;
                                objArr5 = objArr4;
                                u3Var3 = u3Var2;
                                length = i17;
                                i27 = i18;
                                j14 = j12 >> 8;
                                jArr5 = jArr4;
                            }
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            u3Var = u3Var3;
                            int i41 = length;
                            if (i27 != i25) {
                                break;
                            }
                            length = i41;
                        } else {
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            u3Var = u3Var3;
                        }
                        if (i26 == length) {
                            break;
                        }
                        i24 = i26 + 1;
                        objArr5 = objArr3;
                        jArr5 = jArr3;
                        u3Var3 = u3Var;
                    }
                } else {
                    j10 = -9187201950435737472L;
                    z10 = false;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                Iterator it2 = set.iterator();
                z10 = false;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!(next instanceof j0) || ((j0) next).n(2)) {
                        if (l0Var.b(next)) {
                            Object objD5 = l0Var.d(next);
                            if (objD5 == null) {
                                it = it2;
                                obj = next;
                                str = str3;
                            } else if (objD5 instanceof p.m0) {
                                p.m0 m0Var6 = (p.m0) objD5;
                                Object[] objArr10 = m0Var6.f20753b;
                                long[] jArr11 = m0Var6.f20752a;
                                int length6 = jArr11.length - 2;
                                if (length6 >= 0) {
                                    int i42 = 0;
                                    while (true) {
                                        long j19 = jArr11[i42];
                                        boolean z13 = z10;
                                        if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i43 = 8 - ((~(i42 - length6)) >>> 31);
                                            z10 = z13;
                                            it = it2;
                                            int i44 = 0;
                                            while (i44 < i43) {
                                                if ((j19 & 255) < 128) {
                                                    i11 = i44;
                                                    x0.h0 h0Var3 = (x0.h0) objArr10[(i42 << 3) + i44];
                                                    kotlin.jvm.internal.r.c(h0Var3, str3);
                                                    jArr2 = jArr11;
                                                    Object obj9 = map.get(h0Var3);
                                                    ?? A2 = h0Var3.a();
                                                    str2 = str3;
                                                    u3 u3Var4 = A2 == 0 ? u3Var3 : A2;
                                                    objArr2 = objArr10;
                                                    if (u3Var4.a(h0Var3.l().f31691f, obj9)) {
                                                        j11 = j19;
                                                        obj2 = next;
                                                        bVar3.b(h0Var3);
                                                    } else {
                                                        Object objD6 = l0Var2.d(h0Var3);
                                                        if (objD6 != null) {
                                                            if (objD6 instanceof p.m0) {
                                                                p.m0 m0Var7 = (p.m0) objD6;
                                                                Object[] objArr11 = m0Var7.f20753b;
                                                                long[] jArr12 = m0Var7.f20752a;
                                                                int length7 = jArr12.length - 2;
                                                                if (length7 >= 0) {
                                                                    boolean z14 = z10;
                                                                    j11 = j19;
                                                                    int i45 = 0;
                                                                    while (true) {
                                                                        long j20 = jArr12[i45];
                                                                        long[] jArr13 = jArr12;
                                                                        obj2 = next;
                                                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i46 = 8 - ((~(i45 - length7)) >>> 31);
                                                                            for (int i47 = 0; i47 < i46; i47 = i12 + 1) {
                                                                                if ((j20 & 255) < 128) {
                                                                                    i12 = i47;
                                                                                    m0Var.d(objArr11[(i45 << 3) + i47]);
                                                                                    z14 = true;
                                                                                } else {
                                                                                    i12 = i47;
                                                                                }
                                                                                j20 >>= 8;
                                                                            }
                                                                            if (i46 != 8) {
                                                                                z10 = z14;
                                                                                break;
                                                                            }
                                                                            boolean z15 = z14;
                                                                            if (i45 == length7) {
                                                                                z10 = z15;
                                                                                break;
                                                                            }
                                                                            i45++;
                                                                            z14 = z15;
                                                                            next = obj2;
                                                                            jArr12 = jArr13;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                j11 = j19;
                                                                obj2 = next;
                                                                m0Var.d(objD6);
                                                                z10 = true;
                                                            }
                                                        }
                                                    }
                                                    i44 = i11 + 1;
                                                    next = obj2;
                                                    objArr10 = objArr2;
                                                    j19 = j11 >> 8;
                                                    jArr11 = jArr2;
                                                    str3 = str2;
                                                } else {
                                                    i11 = i44;
                                                    jArr2 = jArr11;
                                                    str2 = str3;
                                                    objArr2 = objArr10;
                                                }
                                                j11 = j19;
                                                obj2 = next;
                                                i44 = i11 + 1;
                                                next = obj2;
                                                objArr10 = objArr2;
                                                j19 = j11 >> 8;
                                                jArr11 = jArr2;
                                                str3 = str2;
                                            }
                                            obj = next;
                                            jArr = jArr11;
                                            str = str3;
                                            objArr = objArr10;
                                            if (i43 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it2;
                                            obj = next;
                                            jArr = jArr11;
                                            str = str3;
                                            objArr = objArr10;
                                            z10 = z13;
                                        }
                                        if (i42 == length6) {
                                            break;
                                        }
                                        i42++;
                                        next = obj;
                                        it2 = it;
                                        jArr11 = jArr;
                                        objArr10 = objArr;
                                        str3 = str;
                                    }
                                }
                            } else {
                                it = it2;
                                obj = next;
                                str = str3;
                                x0.h0 h0Var4 = (x0.h0) objD5;
                                Object obj10 = map.get(h0Var4);
                                i3 i3VarA2 = h0Var4.a();
                                if (i3VarA2 == null) {
                                    i3VarA2 = u3Var3;
                                }
                                if (i3VarA2.a(h0Var4.l().f31691f, obj10)) {
                                    bVar3.b(h0Var4);
                                } else {
                                    Object objD7 = l0Var2.d(h0Var4);
                                    if (objD7 != null) {
                                        if (objD7 instanceof p.m0) {
                                            p.m0 m0Var8 = (p.m0) objD7;
                                            Object[] objArr12 = m0Var8.f20753b;
                                            long[] jArr14 = m0Var8.f20752a;
                                            int length8 = jArr14.length - 2;
                                            if (length8 >= 0) {
                                                int i48 = 0;
                                                while (true) {
                                                    long j21 = jArr14[i48];
                                                    long[] jArr15 = jArr14;
                                                    Object[] objArr13 = objArr12;
                                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i49 = 8 - ((~(i48 - length8)) >>> 31);
                                                        for (int i50 = 0; i50 < i49; i50++) {
                                                            if ((j21 & 255) < 128) {
                                                                m0Var.d(objArr13[(i48 << 3) + i50]);
                                                                z10 = true;
                                                            }
                                                            j21 >>= 8;
                                                        }
                                                        if (i49 != 8) {
                                                            break;
                                                        }
                                                        if (i48 == length8) {
                                                            break;
                                                        }
                                                        i48++;
                                                        objArr12 = objArr13;
                                                        jArr14 = jArr15;
                                                    }
                                                }
                                            }
                                        } else {
                                            m0Var.d(objD7);
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            it = it2;
                            str = str3;
                            obj = next;
                        }
                        Object objD8 = l0Var2.d(obj);
                        if (objD8 != null) {
                            if (objD8 instanceof p.m0) {
                                p.m0 m0Var9 = (p.m0) objD8;
                                Object[] objArr14 = m0Var9.f20753b;
                                long[] jArr16 = m0Var9.f20752a;
                                int length9 = jArr16.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j22 = jArr16[i10];
                                        if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i51 = 8 - ((~(i10 - length9)) >>> 31);
                                            for (int i52 = 0; i52 < i51; i52++) {
                                                if ((j22 & 255) < 128) {
                                                    m0Var.d(objArr14[(i10 << 3) + i52]);
                                                    z10 = true;
                                                }
                                                j22 >>= 8;
                                            }
                                            if (i51 == 8) {
                                                i10 = i10 != length9 ? i10 + 1 : 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                m0Var.d(objD8);
                                z10 = true;
                            }
                        }
                    } else {
                        it = it2;
                        str = str3;
                    }
                    it2 = it;
                    str3 = str;
                }
            }
            int i53 = bVar3.f34702c;
            if (i53 == 0) {
                return z10;
            }
            x0.h0<?>[] h0VarArr2 = bVar3.f34700a;
            int i54 = 0;
            while (i54 < i53) {
                x0.h0<?> h0Var5 = h0VarArr2[i54];
                int iHashCode = Long.hashCode(n.k().g());
                Object objD9 = l0Var2.d(h0Var5);
                if (objD9 != null) {
                    boolean z16 = objD9 instanceof p.m0;
                    p.l0<Object, p.f0<Object>> l0Var3 = this.f12209f;
                    if (z16) {
                        p.m0 m0Var10 = (p.m0) objD9;
                        Object[] objArr15 = m0Var10.f20753b;
                        long[] jArr17 = m0Var10.f20752a;
                        int length10 = jArr17.length - 2;
                        if (length10 >= 0) {
                            int i55 = 0;
                            while (true) {
                                long j23 = jArr17[i55];
                                i13 = i53;
                                h0VarArr = h0VarArr2;
                                if ((((~j23) << c10) & j23 & j10) != j10) {
                                    int i56 = 8 - ((~(i55 - length10)) >>> 31);
                                    int i57 = 0;
                                    while (i57 < i56) {
                                        if ((j23 & 255) < 128) {
                                            i15 = i57;
                                            Object obj11 = objArr15[(i55 << 3) + i57];
                                            p.f0<Object> f0VarD = l0Var3.d(obj11);
                                            i16 = i54;
                                            if (f0VarD == null) {
                                                bVar2 = bVar3;
                                                f0Var = new p.f0<>((Object) null);
                                                l0Var3.l(obj11, f0Var);
                                                pg.f0 f0Var2 = pg.f0.f21461a;
                                            } else {
                                                bVar2 = bVar3;
                                                f0Var = f0VarD;
                                            }
                                            c(h0Var5, iHashCode, obj11, f0Var);
                                        } else {
                                            i15 = i57;
                                            i16 = i54;
                                            bVar2 = bVar3;
                                        }
                                        j23 >>= 8;
                                        i57 = i15 + 1;
                                        i54 = i16;
                                        bVar3 = bVar2;
                                    }
                                    i14 = i54;
                                    bVar = bVar3;
                                    if (i56 == 8) {
                                        break;
                                    }
                                } else {
                                    i14 = i54;
                                    bVar = bVar3;
                                }
                                if (i55 != length10) {
                                    i55++;
                                    i53 = i13;
                                    h0VarArr2 = h0VarArr;
                                    i54 = i14;
                                    bVar3 = bVar;
                                }
                            }
                        } else {
                            i13 = i53;
                            h0VarArr = h0VarArr2;
                            i14 = i54;
                            bVar = bVar3;
                        }
                    } else {
                        i13 = i53;
                        h0VarArr = h0VarArr2;
                        i14 = i54;
                        bVar = bVar3;
                        p.f0<Object> f0VarD2 = l0Var3.d(objD9);
                        if (f0VarD2 == null) {
                            f0VarD2 = new p.f0<>((Object) null);
                            l0Var3.l(objD9, f0VarD2);
                            pg.f0 f0Var3 = pg.f0.f21461a;
                        }
                        c(h0Var5, iHashCode, objD9, f0VarD2);
                    }
                } else {
                    i13 = i53;
                    h0VarArr = h0VarArr2;
                    i14 = i54;
                    bVar = bVar3;
                }
                i54 = i14 + 1;
                i53 = i13;
                h0VarArr2 = h0VarArr;
                bVar3 = bVar;
            }
            bVar3.g();
            return z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Object obj, int i10, Object obj2, p.f0<Object> f0Var) {
            int i11;
            if (this.f12213j > 0) {
                return;
            }
            int iC = f0Var.c(obj);
            if (iC < 0) {
                iC = ~iC;
                i11 = -1;
            } else {
                i11 = f0Var.f20617c[iC];
            }
            f0Var.f20616b[iC] = obj;
            f0Var.f20617c[iC] = i10;
            if ((obj instanceof x0.h0) && i11 != i10) {
                g0.a aVarL = ((x0.h0) obj).l();
                this.f12215l.put(obj, aVarL.f31691f);
                p.f0 f0Var2 = aVarL.f31690e;
                p.l0<Object, Object> l0Var = this.f12214k;
                z0.e.c(l0Var, obj);
                Object[] objArr = f0Var2.f20616b;
                long[] jArr = f0Var2.f20615a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128) {
                                    i0 i0Var = (i0) objArr[(i12 << 3) + i14];
                                    if (i0Var instanceof j0) {
                                        ((j0) i0Var).o(2);
                                    }
                                    z0.e.a(l0Var, i0Var, obj);
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            } else if (i12 == length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
            }
            if (i11 == -1) {
                if (obj instanceof j0) {
                    ((j0) obj).o(2);
                }
                z0.e.a(this.f12208e, obj, obj2);
            }
        }

        public final void d(Object obj, Object obj2) {
            p.l0<Object, Object> l0Var = this.f12208e;
            z0.e.b(l0Var, obj2, obj);
            if (!(obj2 instanceof x0.h0) || l0Var.b(obj2)) {
                return;
            }
            z0.e.c(this.f12214k, obj2);
            this.f12215l.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(eh.l<Object, Boolean> lVar) {
            long[] jArr;
            long[] jArr2;
            long j10;
            char c10;
            long j11;
            int i10;
            long j12;
            p.l0<Object, p.f0<Object>> l0Var = this.f12209f;
            long[] jArr3 = l0Var.f20737a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j13 = jArr3[i11];
                char c11 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            c10 = c11;
                            Object obj = l0Var.f20738b[i15];
                            j11 = j14;
                            p.f0 f0Var = (p.f0) l0Var.f20739c[i15];
                            Boolean boolInvoke = lVar.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = f0Var.f20616b;
                                int[] iArr = f0Var.f20617c;
                                long[] jArr4 = f0Var.f20615a;
                                int i16 = i12;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j10 = j13;
                                    int i17 = 0;
                                    while (true) {
                                        long j15 = jArr4[i17];
                                        long[] jArr5 = jArr4;
                                        if ((((~j15) << c10) & j15 & j11) != j11) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            for (int i19 = 0; i19 < i18; i19++) {
                                                if ((j15 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    j12 = j15;
                                                    Object obj2 = objArr[i20];
                                                    int i21 = iArr[i20];
                                                    d(obj, obj2);
                                                } else {
                                                    j12 = j15;
                                                }
                                                j15 = j12 >> i16;
                                            }
                                            if (i18 != i16) {
                                                break;
                                            }
                                            if (i17 == length2) {
                                                break;
                                            }
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j13;
                                }
                                if (boolInvoke.booleanValue()) {
                                    l0Var.k(i15);
                                }
                                i10 = 8;
                            }
                        } else {
                            jArr2 = jArr3;
                            j10 = j13;
                            c10 = c11;
                            j11 = j14;
                            i10 = i12;
                        }
                        i14++;
                        i12 = i10;
                        j13 = j10 >> i10;
                        c11 = c10;
                        j14 = j11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<Set<? extends Object>, h, pg.f0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(Set<? extends Object> set, h hVar) {
            Set<? extends Object> setO;
            Set<? extends Object> set2 = set;
            z zVar = z.this;
            AtomicReference<Object> atomicReference = zVar.f12195b;
            while (true) {
                Object obj = atomicReference.get();
                if (obj == null) {
                    setO = set2;
                } else if (obj instanceof Set) {
                    setO = qg.p.j(obj, set2);
                } else {
                    if (!(obj instanceof List)) {
                        x0.q.d("Unexpected notification");
                        throw new pg.g();
                    }
                    setO = qg.x.O(c0.g0.c(set2), (Collection) obj);
                }
                while (!atomicReference.compareAndSet(obj, setO)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                if (z.a(zVar)) {
                    zVar.f12194a.invoke(new a0(zVar));
                }
                return pg.f0.f21461a;
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(Object obj) {
            z zVar = z.this;
            synchronized (zVar.f12200g) {
                a aVar = zVar.f12202i;
                kotlin.jvm.internal.r.b(aVar);
                Object obj2 = aVar.f12205b;
                kotlin.jvm.internal.r.b(obj2);
                int i10 = aVar.f12207d;
                p.f0<Object> f0Var = aVar.f12206c;
                if (f0Var == null) {
                    f0Var = new p.f0<>((Object) null);
                    aVar.f12206c = f0Var;
                    aVar.f12209f.l(obj2, f0Var);
                    pg.f0 f0Var2 = pg.f0.f21461a;
                }
                aVar.c(obj, i10, obj2, f0Var);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(eh.l<? super eh.a<pg.f0>, pg.f0> lVar) {
        this.f12194a = lVar;
    }

    public static final boolean a(z zVar) {
        boolean z10;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (zVar.f12200g) {
            z10 = zVar.f12196c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference<Object> atomicReference = zVar.f12195b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        x0.q.d("Unexpected notification");
                        throw new pg.g();
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                while (!atomicReference.compareAndSet(obj, objSubList)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (zVar.f12200g) {
                try {
                    z0.b<a> bVar = zVar.f12199f;
                    a[] aVarArr = bVar.f34700a;
                    int i10 = bVar.f34702c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        z11 = aVarArr[i11].b(set) || z11;
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f12200g) {
            try {
                z0.b<a> bVar = this.f12199f;
                a[] aVarArr = bVar.f34700a;
                int i10 = bVar.f34702c;
                for (int i11 = 0; i11 < i10; i11++) {
                    a aVar = aVarArr[i11];
                    aVar.f12208e.f();
                    aVar.f12209f.f();
                    aVar.f12214k.f();
                    aVar.f12215l.clear();
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj) {
        int i10;
        synchronized (this.f12200g) {
            try {
                z0.b<a> bVar = this.f12199f;
                int i11 = bVar.f34702c;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    a aVar = bVar.f34700a[i12];
                    p.f0<Object> f0VarJ = aVar.f12209f.j(obj);
                    if (f0VarJ == null) {
                        i10 = i12;
                    } else {
                        Object[] objArr = f0VarJ.f20616b;
                        int[] iArr = f0VarJ.f20617c;
                        long[] jArr = f0VarJ.f20615a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j10 = jArr[i14];
                                i10 = i12;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((j10 & 255) < 128) {
                                            int i17 = (i14 << 3) + i16;
                                            Object obj2 = objArr[i17];
                                            int i18 = iArr[i17];
                                            aVar.d(obj, obj2);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i15 != 8) {
                                        break;
                                    }
                                    if (i14 == length) {
                                        break;
                                    }
                                    i14++;
                                    i12 = i10;
                                }
                            }
                        }
                    }
                    if (!(aVar.f12209f.f20741e != 0)) {
                        i13++;
                    } else if (i13 > 0) {
                        a[] aVarArr = bVar.f34700a;
                        aVarArr[i10 - i13] = aVarArr[i10];
                    }
                    i12 = i10 + 1;
                }
                int i19 = i11 - i13;
                Arrays.fill(bVar.f34700a, i19, i11, (Object) null);
                bVar.f34702c = i19;
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> void d(T t3, eh.l<? super T, pg.f0> lVar, eh.a<pg.f0> aVar) {
        a aVar2;
        a aVar3;
        synchronized (this.f12200g) {
            z0.b<a> bVar = this.f12199f;
            a[] aVarArr = bVar.f34700a;
            int i10 = bVar.f34702c;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArr[i11];
                if (aVar2.f12204a == lVar) {
                    break;
                } else {
                    i11++;
                }
            }
            aVar3 = aVar2;
            if (aVar3 == null) {
                kotlin.jvm.internal.r.c(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.m0.b(1, lVar);
                aVar3 = new a(lVar);
                bVar.b(aVar3);
            }
        }
        a aVar4 = this.f12202i;
        long j10 = this.f12203j;
        if (j10 != -1 && j10 != u1.a()) {
            StringBuilder sbA = y.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=", j10);
            sbA.append(u1.a());
            sbA.append(", name=");
            sbA.append(Thread.currentThread().getName());
            sbA.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            b2.a(sbA.toString());
        }
        try {
            this.f12202i = aVar3;
            this.f12203j = u1.a();
            aVar3.a(t3, this.f12198e, aVar);
        } finally {
            this.f12202i = aVar4;
            this.f12203j = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        b bVar = this.f12197d;
        n.f(n.f12158a);
        synchronized (n.f12160c) {
            n.f12165h = qg.x.P(bVar, n.f12165h);
            pg.f0 f0Var = pg.f0.f21461a;
        }
        this.f12201h = new g(bVar);
    }
}
