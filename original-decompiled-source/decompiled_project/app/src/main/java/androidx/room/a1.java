package androidx.room;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f2835l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final g0 f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2838c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final n f2840e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f2842g;

    /* renamed from: h, reason: collision with root package name */
    public final s f2843h;

    /* renamed from: i, reason: collision with root package name */
    public final u f2844i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f2845j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public eh.a<Boolean> f2846k = new x0();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2841f = new LinkedHashMap();

    public static final class a {
    }

    @vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {389}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f2847a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f2849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eh.a<pg.f0> aVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f2849c = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return a1.this.new b(this.f2849c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2847a;
            eh.a<pg.f0> aVar2 = this.f2849c;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    a1 a1Var = a1.this;
                    this.f2847a = 1;
                    obj = a1.b(a1Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                aVar2.invoke();
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                aVar2.invoke();
                throw th2;
            }
        }
    }

    public a1(g0 g0Var, HashMap map, HashMap map2, String[] strArr, boolean z10, n nVar) {
        String lowerCase;
        this.f2836a = g0Var;
        this.f2837b = map;
        this.f2838c = map2;
        this.f2839d = z10;
        this.f2840e = nVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
            this.f2841f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f2837b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f2842g = strArr2;
        for (Map.Entry entry : this.f2837b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.r.d(lowerCase3, "toLowerCase(...)");
            if (this.f2841f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.r.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f2841f;
                linkedHashMap.put(lowerCase4, qg.k0.c(lowerCase3, linkedHashMap));
            }
        }
        this.f2843h = new s(this.f2842g.length);
        this.f2844i = new u(this.f2842g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a1 a1Var, w wVar, vg.c cVar) {
        b1 b1Var;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i10 = b1Var.f2856d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b1Var.f2856d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b1Var = new b1(a1Var, cVar);
            }
        }
        Object objA = b1Var.f2854b;
        ug.a aVar = ug.a.f29706a;
        int i11 = b1Var.f2856d;
        if (i11 == 0) {
            pg.q.b(objA);
            w0 w0Var = new w0(0);
            b1Var.f2853a = wVar;
            b1Var.f2856d = 1;
            objA = wVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", w0Var, b1Var);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) b1Var.f2853a;
            pg.q.b(objA);
            return set;
        }
        wVar = (w) b1Var.f2853a;
        pg.q.b(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            b1Var.f2853a = set2;
            b1Var.f2856d = 2;
            if (v0.a(wVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", b1Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a1 a1Var, vg.c cVar) throws Throwable {
        d1 d1Var;
        w5.a closeBarrier$room_runtime_release;
        Object objUseConnection$room_runtime_release;
        Throwable th2;
        w5.a aVar;
        g0 g0Var = a1Var.f2836a;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i10 = d1Var.f2902e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                d1Var.f2902e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                d1Var = new d1(a1Var, cVar);
            }
        }
        Object obj = d1Var.f2900c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = d1Var.f2902e;
        if (i11 == 0) {
            pg.q.b(obj);
            closeBarrier$room_runtime_release = g0Var.getCloseBarrier$room_runtime_release();
            boolean zA = closeBarrier$room_runtime_release.a();
            qg.b0 b0Var = qg.b0.f22711a;
            if (!zA) {
                return b0Var;
            }
            try {
                if (!a1Var.f2845j.compareAndSet(true, false)) {
                    closeBarrier$room_runtime_release.b();
                    return b0Var;
                }
                if (!a1Var.f2846k.invoke().booleanValue()) {
                    closeBarrier$room_runtime_release.b();
                    return b0Var;
                }
                e1 e1Var = new e1(a1Var, null);
                d1Var.f2898a = a1Var;
                d1Var.f2899b = closeBarrier$room_runtime_release;
                d1Var.f2902e = 1;
                objUseConnection$room_runtime_release = g0Var.useConnection$room_runtime_release(false, e1Var, d1Var);
                if (objUseConnection$room_runtime_release == aVar2) {
                    return aVar2;
                }
            } catch (Throwable th3) {
                w5.a aVar3 = closeBarrier$room_runtime_release;
                th2 = th3;
                aVar = aVar3;
                aVar.b();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = d1Var.f2899b;
            a1 a1Var2 = d1Var.f2898a;
            try {
                pg.q.b(obj);
                closeBarrier$room_runtime_release = aVar;
                a1Var = a1Var2;
                objUseConnection$room_runtime_release = obj;
            } catch (Throwable th4) {
                th2 = th4;
                aVar.b();
                throw th2;
            }
        }
        Set<? extends Integer> set = (Set) objUseConnection$room_runtime_release;
        if (!set.isEmpty()) {
            a1Var.f2844i.b(set);
            a1Var.f2840e.invoke(set);
        }
        closeBarrier$room_runtime_release.b();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (androidx.room.v0.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (androidx.room.v0.a(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a1 a1Var, t0 t0Var, int i10, vg.c cVar) {
        f1 f1Var;
        String[] strArr;
        a1 a1Var2;
        int i11;
        w wVar;
        int i12;
        String str;
        a1 a1Var3 = a1Var;
        w wVar2 = t0Var;
        int i13 = i10;
        a1Var3.getClass();
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i14 = f1Var.f2920k;
            if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                f1Var.f2920k = i14 - PKIFailureInfo.systemUnavail;
            } else {
                f1Var = new f1(a1Var3, cVar);
            }
        }
        Object obj = f1Var.f2918h;
        ug.a aVar = ug.a.f29706a;
        int i15 = f1Var.f2920k;
        boolean z10 = true;
        if (i15 == 0) {
            pg.q.b(obj);
            String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i13 + ", 0)";
            f1Var.f2911a = a1Var3;
            f1Var.f2912b = wVar2;
            f1Var.f2915e = i13;
            f1Var.f2920k = 1;
        } else if (i15 == 1) {
            int i16 = f1Var.f2915e;
            wVar2 = f1Var.f2912b;
            a1 a1Var4 = f1Var.f2911a;
            pg.q.b(obj);
            i13 = i16;
            a1Var3 = a1Var4;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = f1Var.f2917g;
            i12 = f1Var.f2916f;
            i13 = f1Var.f2915e;
            strArr = f1Var.f2914d;
            str = f1Var.f2913c;
            wVar = f1Var.f2912b;
            a1Var2 = f1Var.f2911a;
            pg.q.b(obj);
            boolean z11 = true;
            i12++;
            z10 = z11;
            if (i12 < i11) {
                return pg.f0.f21461a;
            }
            String str3 = strArr[i12];
            z11 = z10;
            StringBuilder sbA = y0.a("CREATE ", a1Var2.f2839d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            z0.a(sbA, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strA = x0.a.a(sbA, i13, " AND invalidated = 0; END");
            f1Var.f2911a = a1Var2;
            f1Var.f2912b = wVar;
            f1Var.f2913c = str;
            f1Var.f2914d = strArr;
            f1Var.f2915e = i13;
            f1Var.f2916f = i12;
            f1Var.f2917g = i11;
            f1Var.f2920k = 2;
        }
        String str4 = a1Var3.f2842g[i13];
        strArr = f2835l;
        a1Var2 = a1Var3;
        i11 = 3;
        wVar = wVar2;
        i12 = 0;
        str = str4;
        if (i12 < i11) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.room.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a1 a1Var, t0 t0Var, int i10, vg.c cVar) {
        g1 g1Var;
        String str;
        int i11;
        t0 t0Var2;
        int i12;
        String[] strArr;
        a1Var.getClass();
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i13 = g1Var.f2967h;
            if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                g1Var.f2967h = i13 - PKIFailureInfo.systemUnavail;
            } else {
                g1Var = new g1(a1Var, cVar);
            }
        }
        Object obj = g1Var.f2965f;
        ug.a aVar = ug.a.f29706a;
        int i14 = g1Var.f2967h;
        if (i14 == 0) {
            pg.q.b(obj);
            str = a1Var.f2842g[i10];
            i11 = 3;
            t0Var2 = t0Var;
            i12 = 0;
            strArr = f2835l;
            if (i12 < i11) {
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = g1Var.f2964e;
            i12 = g1Var.f2963d;
            String[] strArr2 = g1Var.f2962c;
            str = g1Var.f2961b;
            ?? r42 = g1Var.f2960a;
            pg.q.b(obj);
            strArr = strArr2;
            t0Var2 = r42;
            i12++;
            if (i12 < i11) {
                String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i12]) + '`';
                g1Var.f2960a = t0Var2;
                g1Var.f2961b = str;
                g1Var.f2962c = strArr;
                g1Var.f2963d = i12;
                g1Var.f2964e = i11;
                g1Var.f2967h = 1;
                if (v0.a(t0Var2, str2, g1Var) == aVar) {
                    return aVar;
                }
                i12++;
                if (i12 < i11) {
                    return pg.f0.f21461a;
                }
            }
        }
    }

    public final void e(eh.a<pg.f0> onRefreshScheduled, eh.a<pg.f0> onRefreshCompleted) {
        kotlin.jvm.internal.r.e(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.r.e(onRefreshCompleted, "onRefreshCompleted");
        if (this.f2845j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            ph.h.c(this.f2836a.getCoroutineScope(), new ph.h0(), null, new b(onRefreshCompleted, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(vg.c cVar) throws Throwable {
        h1 h1Var;
        w5.a aVar;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i10 = h1Var.f2982d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h1Var.f2982d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h1Var = new h1(this, cVar);
            }
        }
        Object obj = h1Var.f2980b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = h1Var.f2982d;
        if (i11 == 0) {
            pg.q.b(obj);
            g0 g0Var = this.f2836a;
            w5.a closeBarrier$room_runtime_release = g0Var.getCloseBarrier$room_runtime_release();
            if (closeBarrier$room_runtime_release.a()) {
                try {
                    i1 i1Var = new i1(this, null);
                    h1Var.f2979a = closeBarrier$room_runtime_release;
                    h1Var.f2982d = 1;
                    if (g0Var.useConnection$room_runtime_release(false, i1Var, h1Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = closeBarrier$room_runtime_release;
                    aVar.b();
                } catch (Throwable th2) {
                    th = th2;
                    aVar = closeBarrier$room_runtime_release;
                    aVar.b();
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = h1Var.f2979a;
            try {
                pg.q.b(obj);
                aVar.b();
            } catch (Throwable th3) {
                th = th3;
                aVar.b();
                throw th;
            }
        }
        return pg.f0.f21461a;
    }

    public final pg.n<String[], int[]> g(String[] strArr) {
        rg.g gVar = new rg.g();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f2838c.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr2 = (String[]) qg.n0.a(gVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr2[i10];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f2841f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        return new pg.n<>(strArr2, iArr);
    }
}
