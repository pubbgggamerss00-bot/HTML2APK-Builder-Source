package v;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class c0 {

    @vg.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29788a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29789b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ tg.h f29790c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vg.h f29791d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(tg.h hVar, eh.p<? super c2.c, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f29790c = hVar;
            this.f29791d = (vg.h) pVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.h] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f29790c, this.f29791d, eVar);
            aVar.f29789b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [c2.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [c2.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [eh.p, vg.h] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            c2.c cVar2;
            ug.a aVar = ug.a.f29706a;
            ?? r12 = this.f29788a;
            tg.h hVar = this.f29790c;
            try {
            } catch (CancellationException e10) {
                e = e10;
                if (ph.v1.h(hVar)) {
                }
            }
            if (r12 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f29789b;
                if (ph.v1.h(hVar)) {
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2) {
                        c2.c cVar3 = (c2.c) this.f29789b;
                        pg.q.b(obj);
                        cVar2 = cVar3;
                    } else {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2.c cVar4 = (c2.c) this.f29789b;
                        pg.q.b(obj);
                        cVar2 = cVar4;
                    }
                    cVar = cVar2;
                    if (ph.v1.h(hVar)) {
                        return pg.f0.f21461a;
                    }
                    try {
                    } catch (CancellationException e11) {
                        r12 = cVar;
                        e = e11;
                        if (ph.v1.h(hVar)) {
                            throw e;
                        }
                        this.f29789b = r12;
                        this.f29788a = 3;
                        Object objB = c0.b(r12, c2.t.f4696c, this);
                        cVar2 = r12;
                    }
                    ?? r13 = this.f29791d;
                    this.f29789b = cVar;
                    this.f29788a = 1;
                    if (r13.invoke(cVar, this) != aVar) {
                        r12 = cVar;
                        this.f29789b = r12;
                        this.f29788a = 2;
                        Object objB2 = c0.b(r12, c2.t.f4696c, this);
                        cVar2 = r12;
                    }
                    return aVar;
                }
                c2.c cVar5 = (c2.c) this.f29789b;
                pg.q.b(obj);
                r12 = cVar5;
                this.f29789b = r12;
                this.f29788a = 2;
                Object objB22 = c0.b(r12, c2.t.f4696c, this);
                cVar2 = r12;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean a(c2.c cVar) {
        ?? r52 = cVar.M().f4687a;
        int size = r52.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((c2.b0) r52.get(i10)).f4596d) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c2.c cVar, c2.t tVar, vg.a aVar) {
        b0 b0Var;
        if (aVar instanceof b0) {
            b0Var = (b0) aVar;
            int i10 = b0Var.f29783d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b0Var.f29783d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b0Var = new b0(aVar);
            }
        }
        Object objC1 = b0Var.f29782c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = b0Var.f29783d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2.t tVar2 = b0Var.f29781b;
            c2.c cVar2 = b0Var.f29780a;
            pg.q.b(objC1);
            tVar = tVar2;
            cVar = cVar2;
            ?? r92 = ((c2.r) objC1).f4687a;
            int size = r92.size();
            int i12 = 0;
            while (i12 < size) {
                if (((c2.b0) r92.get(i12)).f4596d) {
                    b0Var.f29780a = cVar;
                    b0Var.f29781b = tVar;
                    b0Var.f29783d = 1;
                    objC1 = cVar.C1(tVar, b0Var);
                    if (objC1 == aVar2) {
                        return aVar2;
                    }
                    ?? r922 = ((c2.r) objC1).f4687a;
                    int size2 = r922.size();
                    int i122 = 0;
                    while (i122 < size2) {
                    }
                } else {
                    i122++;
                }
            }
            return pg.f0.f21461a;
        }
        pg.q.b(objC1);
    }

    public static final Object c(c2.j0 j0Var, eh.p<? super c2.c, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super pg.f0> eVar) {
        Object objU0 = j0Var.U0(new a(eVar.getContext(), pVar, null), eVar);
        return objU0 == ug.a.f29706a ? objU0 : pg.f0.f21461a;
    }
}
