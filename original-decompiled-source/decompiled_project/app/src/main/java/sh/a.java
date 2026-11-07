package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public abstract class a<T> implements f<T> {

    @vg.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: sh.a$a, reason: collision with other inner class name */
    public static final class C0275a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public th.v f24921a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f24923c;

        /* renamed from: d, reason: collision with root package name */
        public int f24924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0275a(a<T> aVar, tg.e<? super C0275a> eVar) {
            super(eVar);
            this.f24923c = aVar;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f24922b = obj;
            this.f24924d |= PKIFailureInfo.systemUnavail;
            return this.f24923c.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [eh.p, vg.i] */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super T> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        C0275a c0275a;
        Throwable th2;
        th.v vVar;
        if (eVar instanceof C0275a) {
            c0275a = (C0275a) eVar;
            int i10 = c0275a.f24924d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                c0275a.f24924d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                c0275a = new C0275a(this, eVar);
            }
        }
        Object obj = c0275a.f24922b;
        Object obj2 = ug.a.f29706a;
        int i11 = c0275a.f24924d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = c0275a.f24921a;
            try {
                pg.q.b(obj);
                vVar.releaseIntercepted();
                return pg.f0.f21461a;
            } catch (Throwable th3) {
                th2 = th3;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
        pg.q.b(obj);
        th.v vVar2 = new th.v(gVar, c0275a.getContext());
        try {
            c0275a.f24921a = vVar2;
            c0275a.f24924d = 1;
            Object objInvoke = ((m0) this).f25029a.invoke(vVar2, c0275a);
            if (objInvoke != obj2) {
                objInvoke = pg.f0.f21461a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
            vVar = vVar2;
            vVar.releaseIntercepted();
            return pg.f0.f21461a;
        } catch (Throwable th4) {
            th2 = th4;
            vVar = vVar2;
            vVar.releaseIntercepted();
            throw th2;
        }
    }
}
