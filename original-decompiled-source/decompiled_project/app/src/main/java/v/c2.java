package v;

import v.d0;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c2 extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29795a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.t f29797c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<d0> f29798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(c2.t tVar, kotlin.jvm.internal.g0<d0> g0Var, tg.e<? super c2> eVar) {
        super(2, eVar);
        this.f29797c = tVar;
        this.f29798d = g0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c2 c2Var = new c2(this.f29797c, this.f29798d, eVar);
        c2Var.f29796b = obj;
        return c2Var;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
        return ((c2) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (q1.g0.a(r15) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3.f16327a = v.d0.c.f29805a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r15 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r7 >= r15) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r8 = (c2.b0) r6.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.b() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (c2.s.d(r8, r1.a(), r1.R0()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r3.f16327a = v.d0.a.f29803a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        r15 = c2.t.f4696c;
        r14.f29796b = r1;
        r14.f29795a = 2;
        r15 = r1.C1(r15, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r15 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        r3.f16327a = v.d0.a.f29803a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        return pg.f0.f21461a;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [T, v.d0$a] */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, v.d0$c] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v19, types: [T, v.d0$a] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, v.d0$b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0096 -> B:34:0x0099). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c2.c cVar;
        c2.c cVar2;
        int size;
        int i10;
        Object objC1;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f29795a;
        kotlin.jvm.internal.g0<d0> g0Var = this.f29798d;
        if (i11 == 0) {
            pg.q.b(obj);
            cVar = (c2.c) this.f29796b;
            this.f29796b = cVar;
            this.f29795a = 1;
            objC1 = cVar.C1(this.f29797c, this);
            if (objC1 != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            cVar2 = (c2.c) this.f29796b;
            pg.q.b(obj);
            c2.r rVar = (c2.r) obj;
            ?? r62 = rVar.f4687a;
            size = r62.size();
            i10 = 0;
            while (true) {
                if (i10 >= size) {
                }
                i10++;
            }
            return aVar;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar2 = (c2.c) this.f29796b;
        pg.q.b(obj);
        ?? r15 = ((c2.r) obj).f4687a;
        int size2 = r15.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((c2.b0) r15.get(i12)).b()) {
                break;
            }
        }
        cVar = cVar2;
        this.f29796b = cVar;
        this.f29795a = 1;
        objC1 = cVar.C1(this.f29797c, this);
        if (objC1 != aVar) {
            cVar2 = cVar;
            obj = objC1;
            c2.r rVar2 = (c2.r) obj;
            ?? r622 = rVar2.f4687a;
            size = r622.size();
            i10 = 0;
            while (true) {
                if (i10 >= size) {
                    g0Var.f16327a = new d0.b((c2.b0) r622.get(0));
                    break;
                }
                if (!c2.s.b((c2.b0) r622.get(i10))) {
                    break;
                }
                i10++;
            }
        }
        return aVar;
    }
}
