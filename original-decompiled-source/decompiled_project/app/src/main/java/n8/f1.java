package n8;

import java.util.Iterator;
import k9.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class f1 implements sh.f<k9.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18440a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18441a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$3$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.f1$a$a, reason: collision with other inner class name */
        public static final class C0190a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18442a;

            /* renamed from: b, reason: collision with root package name */
            public int f18443b;

            public C0190a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18442a = obj;
                this.f18443b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18441a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0190a c0190a;
            T next;
            if (eVar instanceof C0190a) {
                c0190a = (C0190a) eVar;
                int i10 = c0190a.f18443b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0190a.f18443b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0190a = new C0190a(eVar);
                }
            }
            Object obj2 = c0190a.f18442a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0190a.f18443b;
            if (i11 == 0) {
                pg.q.b(obj2);
                a.C0164a c0164a = k9.a.f16171c;
                String str = (String) ((v4.e) obj).b(m1.f18522x);
                c0164a.getClass();
                Iterator<T> it = k9.a.f16174f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (((k9.a) next).f16175a.equalsIgnoreCase(str)) {
                        break;
                    }
                }
                k9.a aVar2 = next;
                if (aVar2 == null) {
                    aVar2 = k9.a.f16172d;
                }
                c0190a.f18443b = 1;
                if (this.f18441a.c(aVar2, c0190a) == aVar) {
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

    public f1(sh.f fVar) {
        this.f18440a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super k9.a> gVar, tg.e eVar) {
        Object objB = this.f18440a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
