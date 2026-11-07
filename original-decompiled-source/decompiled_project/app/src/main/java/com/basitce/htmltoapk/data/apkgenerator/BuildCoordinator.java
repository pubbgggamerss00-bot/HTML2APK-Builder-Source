package com.basitce.htmltoapk.data.apkgenerator;

import eh.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;

/* loaded from: classes.dex */
public final class BuildCoordinator {
    public static final BuildCoordinator INSTANCE = new BuildCoordinator();
    private static final yh.a mutex = new yh.c();
    public static final int $stable = 8;

    @vg.e(c = "com.basitce.htmltoapk.data.apkgenerator.BuildCoordinator", f = "BuildCoordinator.kt", l = {17, 9}, m = "run")
    /* renamed from: com.basitce.htmltoapk.data.apkgenerator.BuildCoordinator$run$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends vg.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(tg.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return BuildCoordinator.this.run(null, this);
        }
    }

    private BuildCoordinator() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object run(l<? super tg.e<? super T>, ? extends Object> lVar, tg.e<? super T> eVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        yh.a aVar;
        Throwable th2;
        yh.a aVar2;
        if (eVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) eVar;
            int i10 = anonymousClass1.label;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                anonymousClass1.label = i10 - PKIFailureInfo.systemUnavail;
            } else {
                anonymousClass1 = new AnonymousClass1(eVar);
            }
        }
        Object obj = anonymousClass1.result;
        ug.a aVar3 = ug.a.f29706a;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                q.b(obj);
                aVar = mutex;
                anonymousClass1.L$0 = lVar;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.label = 1;
                if (aVar.h(anonymousClass1) != aVar3) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (yh.a) anonymousClass1.L$0;
                try {
                    q.b(obj);
                    aVar2.l(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.l(null);
                    throw th2;
                }
            }
            yh.a aVar4 = (yh.a) anonymousClass1.L$1;
            l<? super tg.e<? super T>, ? extends Object> lVar2 = (l) anonymousClass1.L$0;
            q.b(obj);
            aVar = aVar4;
            lVar = lVar2;
            anonymousClass1.L$0 = aVar;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            Object objInvoke = lVar.invoke(anonymousClass1);
            if (objInvoke != aVar3) {
                yh.a aVar5 = aVar;
                obj = objInvoke;
                aVar2 = aVar5;
                aVar2.l(null);
                return obj;
            }
            return aVar3;
        } catch (Throwable th4) {
            yh.a aVar6 = aVar;
            th2 = th4;
            aVar2 = aVar6;
            aVar2.l(null);
            throw th2;
        }
    }
}
