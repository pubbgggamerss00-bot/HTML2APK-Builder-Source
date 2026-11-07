package v;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {971, 993}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public c2.r f29995a;

    /* renamed from: b, reason: collision with root package name */
    public int f29996b;

    /* renamed from: c, reason: collision with root package name */
    public int f29997c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f29999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<c2.b0> f30000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<c2.b0> f30001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.jvm.internal.b0 b0Var, kotlin.jvm.internal.g0<c2.b0> g0Var, kotlin.jvm.internal.g0<c2.b0> g0Var2, tg.e<? super n> eVar) {
        super(2, eVar);
        this.f29999e = b0Var;
        this.f30000f = g0Var;
        this.f30001g = g0Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n nVar = new n(this.f29999e, this.f30000f, this.f30001g, eVar);
        nVar.f29998d = obj;
        return nVar;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
        return ((n) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[EDGE_INSN: B:69:0x00ce->B:44:0x00ce BREAK  A[LOOP:0: B:39:0x00bb->B:43:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, c2.b0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00af -> B:38:0x00b2). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c2.c cVar;
        int i10;
        Object objC1;
        c2.r rVar;
        int size;
        int i11;
        int size2;
        int i12;
        Object objC12;
        T t3;
        Object obj2;
        ug.a aVar = ug.a.f29706a;
        int i13 = this.f29997c;
        int i14 = 2;
        c2.r rVar2 = null;
        if (i13 == 0) {
            pg.q.b(obj);
            cVar = (c2.c) this.f29998d;
            i10 = 0;
            if (i10 != 0) {
            }
        } else {
            if (i13 == 1) {
                i10 = this.f29996b;
                cVar = (c2.c) this.f29998d;
                pg.q.b(obj);
                objC1 = obj;
                rVar = (c2.r) objC1;
                ?? r92 = rVar.f4687a;
                size = r92.size();
                i11 = 0;
                while (true) {
                    if (i11 >= size) {
                    }
                    i11++;
                }
                ?? r93 = rVar.f4687a;
                size2 = r93.size();
                while (i12 < size2) {
                }
                if (q1.g0.a(rVar)) {
                }
                c2.t tVar = c2.t.f4696c;
                this.f29998d = cVar;
                this.f29995a = rVar;
                this.f29996b = i10;
                this.f29997c = i14;
                objC12 = cVar.C1(tVar, this);
                if (objC12 != aVar) {
                }
                return aVar;
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f29996b;
            c2.r rVar3 = this.f29995a;
            c2.c cVar2 = (c2.c) this.f29998d;
            pg.q.b(obj);
            objC12 = obj;
            ?? r42 = ((c2.r) objC12).f4687a;
            int size3 = r42.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size3) {
                    break;
                }
                if (((c2.b0) r42.get(i15)).b()) {
                    i10 = 1;
                    break;
                }
                i15++;
            }
            kotlin.jvm.internal.g0<c2.b0> g0Var = this.f30000f;
            boolean zE = u.e(rVar3, g0Var.f16327a.f4593a);
            ?? r72 = rVar3.f4687a;
            kotlin.jvm.internal.g0<c2.b0> g0Var2 = this.f30001g;
            if (!zE) {
                int size4 = r72.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r72.get(i16);
                    if (((c2.b0) obj2).f4596d) {
                        break;
                    }
                    i16++;
                }
                ?? r11 = (c2.b0) obj2;
                if (r11 == 0) {
                    i10 = 1;
                    cVar = cVar2;
                    rVar2 = null;
                    if (i10 != 0) {
                        return pg.f0.f21461a;
                    }
                    c2.t tVar2 = c2.t.f4695b;
                    this.f29998d = cVar;
                    this.f29995a = rVar2;
                    this.f29996b = i10;
                    this.f29997c = 1;
                    objC1 = cVar.C1(tVar2, this);
                    if (objC1 != aVar) {
                        rVar = (c2.r) objC1;
                        ?? r922 = rVar.f4687a;
                        size = r922.size();
                        i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                i10 = 1;
                                break;
                            }
                            if (!c2.s.c((c2.b0) r922.get(i11))) {
                                break;
                            }
                            i11++;
                        }
                        ?? r932 = rVar.f4687a;
                        size2 = r932.size();
                        for (i12 = 0; i12 < size2; i12++) {
                            c2.b0 b0Var = (c2.b0) r932.get(i12);
                            if (b0Var.b() || c2.s.d(b0Var, cVar.a(), cVar.R0())) {
                                break;
                            }
                        }
                        if (q1.g0.a(rVar)) {
                            this.f29999e.f16318a = true;
                            i10 = 1;
                        }
                        c2.t tVar3 = c2.t.f4696c;
                        this.f29998d = cVar;
                        this.f29995a = rVar;
                        this.f29996b = i10;
                        this.f29997c = i14;
                        objC12 = cVar.C1(tVar3, this);
                        if (objC12 != aVar) {
                            cVar2 = cVar;
                            rVar3 = rVar;
                            ?? r422 = ((c2.r) objC12).f4687a;
                            int size32 = r422.size();
                            int i152 = 0;
                            while (true) {
                                if (i152 >= size32) {
                                }
                                i152++;
                            }
                            kotlin.jvm.internal.g0<c2.b0> g0Var3 = this.f30000f;
                            boolean zE2 = u.e(rVar3, g0Var3.f16327a.f4593a);
                            ?? r722 = rVar3.f4687a;
                            kotlin.jvm.internal.g0<c2.b0> g0Var22 = this.f30001g;
                            if (!zE2) {
                                int size5 = r722.size();
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size5) {
                                        t3 = 0;
                                        break;
                                    }
                                    t3 = r722.get(i17);
                                    kotlin.jvm.internal.g0<c2.b0> g0Var4 = g0Var3;
                                    if (b0.a0.b(((c2.b0) t3).f4593a, g0Var3.f16327a.f4593a)) {
                                        break;
                                    }
                                    i17++;
                                    g0Var3 = g0Var4;
                                }
                                g0Var22.f16327a = t3;
                            }
                        }
                    }
                    return aVar;
                }
                g0Var3.f16327a = r11;
                g0Var22.f16327a = r11;
            }
            cVar = cVar2;
            i14 = 2;
            rVar2 = null;
            if (i10 != 0) {
            }
        }
    }
}
