package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import eh.l;
import eh.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public g0 f877a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f878b;

    /* renamed from: c, reason: collision with root package name */
    public int f879c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f881e;

    @vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {428}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<l<? super a.b, ? extends f0>, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public g0 f882a;

        /* renamed from: b, reason: collision with root package name */
        public int f883b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f884c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g0<androidx.compose.foundation.gestures.a> f885d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f886e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<androidx.compose.foundation.gestures.a> g0Var, b bVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f885d = g0Var;
            this.f886e = bVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f885d, this.f886e, eVar);
            aVar.f884c = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(l<? super a.b, ? extends f0> lVar, tg.e<? super f0> eVar) {
            return ((a) create(lVar, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            l lVar;
            androidx.compose.foundation.gestures.a aVar;
            ug.a aVar2 = ug.a.f29706a;
            int i10 = this.f883b;
            if (i10 == 0) {
                q.b(obj);
                lVar = (l) this.f884c;
                g0Var = this.f885d;
                aVar = g0Var.f16327a;
                if (aVar instanceof a.d) {
                }
                return f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0<androidx.compose.foundation.gestures.a> g0Var = this.f882a;
            lVar = (l) this.f884c;
            q.b(obj);
            T t3 = (androidx.compose.foundation.gestures.a) obj;
            g0Var.f16327a = t3;
            g0Var = this.f885d;
            aVar = g0Var.f16327a;
            if (!(aVar instanceof a.d) || (aVar instanceof a.C0013a)) {
                return f0.f21461a;
            }
            t3 = 0;
            a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
            if (bVar != null) {
                lVar.invoke(bVar);
            }
            rh.c cVar = this.f886e.f843x;
            if (cVar != null) {
                this.f884c = lVar;
                this.f882a = g0Var;
                this.f883b = 1;
                obj = cVar.b(this);
                if (obj == aVar2) {
                    return aVar2;
                }
                T t32 = (androidx.compose.foundation.gestures.a) obj;
            }
            g0Var.f16327a = t32;
            g0Var = this.f885d;
            aVar = g0Var.f16327a;
            if (aVar instanceof a.d) {
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f881e = bVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f881e, eVar);
        fVar.f880d = obj;
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        if (androidx.compose.foundation.gestures.b.W1(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00c3, B:40:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00c7, B:19:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
      0x0032: PHI (r1v11 kotlin.jvm.internal.g0) = (r1v3 kotlin.jvm.internal.g0), (r1v15 kotlin.jvm.internal.g0) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v6 ph.i0) = (r4v4 ph.i0), (r4v7 ph.i0) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r5
      0x0056: PHI (r5v7 ph.i0) = (r5v0 ph.i0), (r5v3 ph.i0), (r5v3 ph.i0), (r5v3 ph.i0), (r5v5 ph.i0), (r5v8 ph.i0) binds: [B:18:0x004e, B:45:0x00c5, B:47:0x00d2, B:41:0x00be, B:30:0x0082, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00be -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c5 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d2 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e0 -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        i0 i0Var;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        i0 i0Var2;
        i0 i0Var3;
        T t3;
        a aVar;
        T t10;
        T t11;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f879c;
        b bVar = this.f881e;
        switch (i10) {
            case 0:
                q.b(obj);
                i0Var = (i0) this.f880d;
                if (!j0.d(i0Var)) {
                    g0Var = new g0();
                    rh.c cVar = bVar.f843x;
                    if (cVar == null) {
                        g0Var2 = g0Var;
                        t10 = 0;
                        g0Var.f16327a = t10;
                        t11 = g0Var2.f16327a;
                        if (t11 instanceof a.c) {
                        }
                        return aVar2;
                    }
                    this.f880d = i0Var;
                    this.f877a = g0Var;
                    this.f878b = g0Var;
                    this.f879c = 1;
                    obj = cVar.b(this);
                    if (obj != aVar2) {
                        g0Var2 = g0Var;
                        t10 = (androidx.compose.foundation.gestures.a) obj;
                        g0Var.f16327a = t10;
                        t11 = g0Var2.f16327a;
                        if (t11 instanceof a.c) {
                            this.f880d = i0Var;
                            this.f877a = g0Var2;
                            this.f878b = null;
                            this.f879c = 2;
                            if (b.X1(bVar, (a.c) t11, this) != aVar2) {
                                g0Var3 = g0Var2;
                                i0Var2 = i0Var;
                                aVar = new a(g0Var3, bVar, null);
                                this.f880d = i0Var2;
                                this.f877a = g0Var3;
                                this.f879c = 3;
                                if (bVar.a2(aVar, this) != aVar2) {
                                    i0Var = i0Var2;
                                    try {
                                    } catch (CancellationException unused) {
                                        i0Var3 = i0Var;
                                        this.f880d = i0Var3;
                                        this.f877a = null;
                                        this.f879c = 6;
                                        break;
                                    }
                                    t3 = g0Var3.f16327a;
                                    if (t3 instanceof a.d) {
                                        this.f880d = i0Var;
                                        this.f877a = null;
                                        this.f879c = 4;
                                        if (b.Y1(bVar, (a.d) t3, this) != aVar2) {
                                            if (!j0.d(i0Var)) {
                                            }
                                        }
                                    } else {
                                        if (t3 instanceof a.C0013a) {
                                            this.f880d = i0Var;
                                            this.f877a = null;
                                            this.f879c = 5;
                                            if (b.W1(bVar, this) != aVar2) {
                                            }
                                        }
                                        if (!j0.d(i0Var)) {
                                            return f0.f21461a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                }
            case 1:
                g0Var = this.f878b;
                g0Var2 = this.f877a;
                i0Var = (i0) this.f880d;
                q.b(obj);
                t10 = (androidx.compose.foundation.gestures.a) obj;
                g0Var.f16327a = t10;
                t11 = g0Var2.f16327a;
                if (t11 instanceof a.c) {
                }
                return aVar2;
            case 2:
                g0Var3 = this.f877a;
                i0Var2 = (i0) this.f880d;
                q.b(obj);
                aVar = new a(g0Var3, bVar, null);
                this.f880d = i0Var2;
                this.f877a = g0Var3;
                this.f879c = 3;
                if (bVar.a2(aVar, this) != aVar2) {
                }
                return aVar2;
            case 3:
                g0Var3 = this.f877a;
                i0Var2 = (i0) this.f880d;
                try {
                    q.b(obj);
                } catch (CancellationException unused2) {
                    i0Var3 = i0Var2;
                    this.f880d = i0Var3;
                    this.f877a = null;
                    this.f879c = 6;
                    break;
                }
                i0Var = i0Var2;
                t3 = g0Var3.f16327a;
                if (t3 instanceof a.d) {
                }
                break;
            case 4:
                i0Var3 = (i0) this.f880d;
                try {
                    q.b(obj);
                } catch (CancellationException unused3) {
                    this.f880d = i0Var3;
                    this.f877a = null;
                    this.f879c = 6;
                    break;
                }
                i0Var = i0Var3;
                if (!j0.d(i0Var)) {
                }
                break;
            case 5:
                i0Var3 = (i0) this.f880d;
                q.b(obj);
                i0Var = i0Var3;
                if (!j0.d(i0Var)) {
                }
                break;
            case 6:
                i0Var3 = (i0) this.f880d;
                q.b(obj);
                i0Var = i0Var3;
                if (!j0.d(i0Var)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
