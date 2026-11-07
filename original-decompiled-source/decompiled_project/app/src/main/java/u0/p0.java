package u0;

import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x.o;

/* loaded from: classes.dex */
public final class p0 implements sh.f<x.k> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f29107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f29108b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f29109a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f29110b;

        @vg.e(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {223}, m = "emit")
        /* renamed from: u0.p0$a$a, reason: collision with other inner class name */
        public static final class C0299a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f29111a;

            /* renamed from: b, reason: collision with root package name */
            public int f29112b;

            public C0299a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f29111a = obj;
                this.f29112b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar, q0 q0Var) {
            this.f29109a = gVar;
            this.f29110b = q0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0299a c0299a;
            x.k cVar;
            q0 q0Var = this.f29110b;
            LinkedHashMap linkedHashMap = q0Var.f29120b;
            if (eVar instanceof C0299a) {
                c0299a = (C0299a) eVar;
                int i10 = c0299a.f29112b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0299a.f29112b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0299a = new C0299a(eVar);
                }
            }
            Object obj2 = c0299a.f29111a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0299a.f29112b;
            if (i11 == 0) {
                pg.q.b(obj2);
                x.k kVar = (x.k) obj;
                if (kVar instanceof o.b) {
                    o.b bVar = new o.b(p1.c.f(((o.b) kVar).f31599a, q0Var.f29119a));
                    linkedHashMap.put(kVar, bVar);
                    cVar = bVar;
                } else if (kVar instanceof o.a) {
                    o.a aVar2 = (o.a) kVar;
                    o.b bVar2 = (o.b) linkedHashMap.remove(aVar2.f31598a);
                    cVar = aVar2;
                    if (bVar2 != null) {
                        cVar = new o.a(bVar2);
                    }
                } else {
                    boolean z10 = kVar instanceof o.c;
                    cVar = kVar;
                    if (z10) {
                        o.c cVar2 = (o.c) kVar;
                        o.b bVar3 = (o.b) linkedHashMap.remove(cVar2.f31600a);
                        cVar = cVar2;
                        if (bVar3 != null) {
                            cVar = new o.c(bVar3);
                        }
                    }
                }
                c0299a.f29112b = 1;
                if (this.f29109a.c(cVar, c0299a) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj2);
            }
            return pg.f0.f21461a;
        }
    }

    public p0(sh.f fVar, q0 q0Var) {
        this.f29107a = fVar;
        this.f29108b = q0Var;
    }

    @Override // sh.f
    public final Object b(sh.g<? super x.k> gVar, tg.e eVar) {
        Object objB = this.f29107a.b(new a(gVar, this.f29108b), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
