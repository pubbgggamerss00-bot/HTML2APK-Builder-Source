package androidx.room;

import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class q implements sh.f<Set<? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f3046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f3047b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f3048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f3049b;

        @vg.e(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {239}, m = "emit")
        /* renamed from: androidx.room.q$a$a, reason: collision with other inner class name */
        public static final class C0043a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f3050a;

            /* renamed from: b, reason: collision with root package name */
            public int f3051b;

            public C0043a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f3050a = obj;
                this.f3051b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar, String[] strArr) {
            this.f3048a = gVar;
            this.f3049b = strArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0043a c0043a;
            if (eVar instanceof C0043a) {
                c0043a = (C0043a) eVar;
                int i10 = c0043a.f3051b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0043a.f3051b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0043a = new C0043a(eVar);
                }
            }
            Object obj2 = c0043a.f3050a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0043a.f3051b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Set set = (Set) obj;
                rg.g gVar = new rg.g();
                for (String str : this.f3049b) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (mh.t.j(str, (String) it.next(), true)) {
                            gVar.add(str);
                        }
                    }
                }
                rg.g gVarA = qg.n0.a(gVar);
                if (gVarA.f23575a.isEmpty()) {
                    gVarA = null;
                }
                if (gVarA != null) {
                    c0043a.f3051b = 1;
                    if (this.f3048a.c(gVarA, c0043a) == aVar) {
                        return aVar;
                    }
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

    public q(sh.o0 o0Var, String[] strArr) {
        this.f3046a = o0Var;
        this.f3047b = strArr;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Set<? extends String>> gVar, tg.e eVar) {
        Object objB = this.f3046a.b(new a(gVar, this.f3047b), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
