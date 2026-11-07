package androidx.room;

import androidx.room.s;
import androidx.room.t0;
import java.util.concurrent.locks.ReentrantLock;

@vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {301, 309}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i1 extends vg.i implements eh.p<t0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f2989a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2991c;

    @vg.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<s0<pg.f0>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public s.a[] f2992a;

        /* renamed from: b, reason: collision with root package name */
        public a1 f2993b;

        /* renamed from: c, reason: collision with root package name */
        public t0 f2994c;

        /* renamed from: d, reason: collision with root package name */
        public int f2995d;

        /* renamed from: e, reason: collision with root package name */
        public int f2996e;

        /* renamed from: f, reason: collision with root package name */
        public int f2997f;

        /* renamed from: g, reason: collision with root package name */
        public int f2998g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ s.a[] f2999h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ a1 f3000j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t0 f3001k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.a[] aVarArr, a1 a1Var, t0 t0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f2999h = aVarArr;
            this.f3000j = a1Var;
            this.f3001k = t0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f2999h, this.f3000j, this.f3001k, eVar);
        }

        @Override // eh.p
        public final Object invoke(s0<pg.f0> s0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (androidx.room.a1.c(r7, r6, r11, r10) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i10;
            t0 t0Var;
            s.a[] aVarArr;
            int i11;
            a1 a1Var;
            ug.a aVar = ug.a.f29706a;
            int i12 = this.f2998g;
            if (i12 == 0) {
                pg.q.b(obj);
                s.a[] aVarArr2 = this.f2999h;
                length = aVarArr2.length;
                i10 = 0;
                a1 a1Var2 = this.f3000j;
                t0Var = this.f3001k;
                aVarArr = aVarArr2;
                i11 = 0;
                a1Var = a1Var2;
                if (i10 >= length) {
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.f2997f;
                i10 = this.f2996e;
                int i13 = this.f2995d;
                t0Var = this.f2994c;
                a1Var = this.f2993b;
                aVarArr = this.f2992a;
                pg.q.b(obj);
                i11 = i13;
                i10++;
                if (i10 >= length) {
                    int i14 = i11 + 1;
                    int iOrdinal = aVarArr[i10].ordinal();
                    if (iOrdinal == 0) {
                        i11 = i14;
                        i10++;
                        if (i10 >= length) {
                            return pg.f0.f21461a;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new pg.l();
                            }
                            this.f2992a = aVarArr;
                            this.f2993b = a1Var;
                            this.f2994c = t0Var;
                            this.f2995d = i14;
                            this.f2996e = i10;
                            this.f2997f = length;
                            this.f2998g = 2;
                            if (a1.d(a1Var, t0Var, i11, this) != aVar) {
                                i13 = i14;
                                i11 = i13;
                            }
                            return aVar;
                        }
                        this.f2992a = aVarArr;
                        this.f2993b = a1Var;
                        this.f2994c = t0Var;
                        this.f2995d = i14;
                        this.f2996e = i10;
                        this.f2997f = length;
                        this.f2998g = 1;
                        i10++;
                        if (i10 >= length) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(a1 a1Var, tg.e<? super i1> eVar) {
        super(2, eVar);
        this.f2991c = a1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        i1 i1Var = new i1(this.f2991c, eVar);
        i1Var.f2990b = obj;
        return i1Var;
    }

    @Override // eh.p
    public final Object invoke(t0 t0Var, tg.e<? super pg.f0> eVar) {
        return ((i1) create(t0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r2.c(r4, r6, r19) == r0) goto L48;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var;
        Object objB;
        s.a[] aVarArr;
        s.a aVar;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f2989a;
        boolean z10 = true;
        if (i10 == 0) {
            pg.q.b(obj);
            t0Var = (t0) this.f2990b;
            this.f2990b = t0Var;
            this.f2989a = 1;
            objB = t0Var.b(this);
            if (objB != aVar2) {
            }
            return aVar2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        t0Var = (t0) this.f2990b;
        pg.q.b(obj);
        objB = obj;
        if (((Boolean) objB).booleanValue()) {
            return pg.f0.f21461a;
        }
        a1 a1Var = this.f2991c;
        s sVar = a1Var.f2843h;
        long[] jArr = sVar.f3078b;
        ReentrantLock reentrantLock = sVar.f3077a;
        reentrantLock.lock();
        try {
            if (sVar.f3080d) {
                boolean z11 = false;
                sVar.f3080d = false;
                int length = jArr.length;
                aVarArr = new s.a[length];
                int i11 = 0;
                boolean z12 = false;
                while (i11 < length) {
                    boolean z13 = jArr[i11] > 0 ? z10 : z11;
                    boolean[] zArr = sVar.f3079c;
                    if (z13 != zArr[i11]) {
                        zArr[i11] = z13;
                        aVar = z13 ? s.a.f3082b : s.a.f3083c;
                        z12 = true;
                    } else {
                        aVar = s.a.f3081a;
                    }
                    aVarArr[i11] = aVar;
                    i11++;
                    z10 = true;
                    z11 = false;
                }
                if (!z12) {
                    aVarArr = null;
                }
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                aVarArr = null;
            }
            if (aVarArr != null) {
                t0.a aVar3 = t0.a.f3089b;
                a aVar4 = new a(aVarArr, a1Var, t0Var, null);
                this.f2990b = null;
                this.f2989a = 2;
            }
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
