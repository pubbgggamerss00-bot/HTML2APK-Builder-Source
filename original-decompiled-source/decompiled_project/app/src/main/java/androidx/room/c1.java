package androidx.room;

import java.util.ArrayList;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {233, 233, 237}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c1 extends vg.i implements eh.p<sh.g<? super Set<? extends String>>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f2881a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f2884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f2885e;

    @vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {233}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f2886a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f2887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f2887b = a1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f2887b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2886a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f2886a = 1;
                if (this.f2887b.f(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<int[]> f2888a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sh.g<Set<String>> f2889b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f2890c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int[] f2891d;

        @vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {241, 250}, m = "emit")
        public static final class a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public b f2892a;

            /* renamed from: b, reason: collision with root package name */
            public int[] f2893b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f2894c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b<T> f2895d;

            /* renamed from: e, reason: collision with root package name */
            public int f2896e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, tg.e<? super a> eVar) {
                super(eVar);
                this.f2895d = bVar;
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f2894c = obj;
                this.f2896e |= PKIFailureInfo.systemUnavail;
                return this.f2895d.c(null, this);
            }
        }

        public b(kotlin.jvm.internal.g0 g0Var, sh.g gVar, String[] strArr, int[] iArr) {
            this.f2888a = g0Var;
            this.f2889b = gVar;
            this.f2890c = strArr;
            this.f2891d = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (r6.c(r15, r0) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        
            if (r6.c(r15, r0) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(int[] iArr, tg.e<? super pg.f0> eVar) {
            a aVar;
            b<T> bVar;
            Object obj;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f2896e;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f2896e = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            }
            Object obj2 = aVar.f2894c;
            ug.a aVar2 = ug.a.f29706a;
            int i11 = aVar.f2896e;
            if (i11 == 0) {
                pg.q.b(obj2);
                kotlin.jvm.internal.g0<int[]> g0Var = this.f2888a;
                int[] iArr2 = g0Var.f16327a;
                String[] strArr = this.f2890c;
                sh.g<Set<String>> gVar = this.f2889b;
                if (iArr2 == null) {
                    Set<String> setC = qg.o.C(strArr);
                    aVar.f2892a = this;
                    aVar.f2893b = iArr;
                    aVar.f2896e = 1;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int length = strArr.length;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < length) {
                        String str = strArr[i12];
                        int i14 = i13 + 1;
                        int[] iArr3 = g0Var.f16327a;
                        if (iArr3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        int i15 = this.f2891d[i13];
                        if (iArr3[i15] != iArr[i15]) {
                            arrayList.add(str);
                        }
                        i12++;
                        i13 = i14;
                    }
                    if (!arrayList.isEmpty()) {
                        Set<String> setH0 = qg.x.h0(arrayList);
                        aVar.f2892a = this;
                        aVar.f2893b = iArr;
                        aVar.f2896e = 2;
                    }
                    bVar = this;
                    obj = iArr;
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = (T) aVar.f2893b;
                bVar = aVar.f2892a;
                pg.q.b(obj2);
                obj = obj3;
            }
            bVar.f2888a.f16327a = (T) obj;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a1 a1Var, int[] iArr, String[] strArr, tg.e eVar) {
        super(2, eVar);
        this.f2883c = a1Var;
        this.f2884d = iArr;
        this.f2885e = strArr;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c1 c1Var = new c1(this.f2883c, this.f2884d, this.f2885e, eVar);
        c1Var.f2882b = obj;
        return c1Var;
    }

    @Override // eh.p
    public final Object invoke(sh.g<? super Set<? extends String>> gVar, tg.e<? super pg.f0> eVar) {
        ((c1) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (ph.h.e((tg.h) r11, r6, r10) == r0) goto L23;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sh.g gVar;
        sh.g gVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f2881a;
        int[] iArr = this.f2884d;
        a1 a1Var = this.f2883c;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                gVar = (sh.g) this.f2882b;
                if (a1Var.f2843h.a(iArr)) {
                    g0 g0Var = a1Var.f2836a;
                    this.f2882b = gVar;
                    this.f2881a = 1;
                    tg.h hVarE = b6.c.e(g0Var, false, this);
                    if (hVarE != aVar) {
                        gVar2 = gVar;
                        obj = hVarE;
                    }
                    return aVar;
                }
                kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                u uVar = a1Var.f2844i;
                b bVar = new b(g0Var2, gVar, this.f2885e, iArr);
                this.f2882b = null;
                this.f2881a = 3;
                uVar.a(bVar, this);
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    throw new pg.g();
                }
                gVar2 = (sh.g) this.f2882b;
                pg.q.b(obj);
                gVar = gVar2;
                kotlin.jvm.internal.g0 g0Var22 = new kotlin.jvm.internal.g0();
                u uVar2 = a1Var.f2844i;
                b bVar2 = new b(g0Var22, gVar, this.f2885e, iArr);
                this.f2882b = null;
                this.f2881a = 3;
                uVar2.a(bVar2, this);
                return aVar;
            }
            gVar2 = (sh.g) this.f2882b;
            pg.q.b(obj);
            a aVar2 = new a(a1Var, null);
            this.f2882b = gVar2;
            this.f2881a = 2;
        } catch (Throwable th2) {
            a1Var.f2843h.b(iArr);
            throw th2;
        }
    }
}
