package th;

import h9.z1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.s1;
import ph.v1;
import tg.h;

/* loaded from: classes2.dex */
public final class v<T> extends vg.c implements sh.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final sh.g<T> f28851a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.h f28852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28853c;

    /* renamed from: d, reason: collision with root package name */
    public tg.h f28854d;

    /* renamed from: e, reason: collision with root package name */
    public tg.e<? super f0> f28855e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(sh.g<? super T> gVar, tg.h hVar) {
        super(s.f28846a, tg.i.f28768a);
        this.f28851a = gVar;
        this.f28852b = hVar;
        this.f28853c = ((Number) hVar.fold(0, new z1())).intValue();
    }

    @Override // sh.g
    public final Object c(T t3, tg.e<? super f0> eVar) {
        try {
            Object objE = e(eVar, t3);
            return objE == ug.a.f29706a ? objE : f0.f21461a;
        } catch (Throwable th2) {
            this.f28854d = new o(th2, eVar.getContext());
            throw th2;
        }
    }

    public final Object e(tg.e<? super f0> eVar, T t3) {
        tg.h context = eVar.getContext();
        v1.e(context);
        tg.h hVar = this.f28854d;
        if (hVar != context) {
            if (hVar instanceof o) {
                throw new IllegalStateException(mh.p.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) hVar).f28841b + ", but then emission attempt of value '" + t3 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new eh.p() { // from class: th.x
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // eh.p
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    h.a aVar = (h.a) obj2;
                    h.b<?> key = aVar.getKey();
                    h.a aVar2 = this.f28858a.f28852b.get(key);
                    if (key != s1.a.f21589a) {
                        iIntValue = aVar != aVar2 ? PKIFailureInfo.systemUnavail : iIntValue + 1;
                    } else {
                        s1 s1Var = (s1) aVar2;
                        s1 parent = (s1) aVar;
                        while (true) {
                            if (parent != null) {
                                if (parent == s1Var || !(parent instanceof uh.r)) {
                                    break;
                                }
                                parent = ((uh.r) parent).getParent();
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != s1Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + s1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (s1Var != null) {
                        }
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue() != this.f28853c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f28852b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f28854d = context;
        }
        this.f28855e = eVar;
        eh.q<sh.g<Object>, Object, tg.e<? super f0>, Object> qVar = w.f28856a;
        sh.g<T> gVar = this.f28851a;
        kotlin.jvm.internal.r.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objB = qVar.b(gVar, t3, this);
        if (!kotlin.jvm.internal.r.a(objB, ug.a.f29706a)) {
            this.f28855e = null;
        }
        return objB;
    }

    @Override // vg.a, vg.d
    public final vg.d getCallerFrame() {
        tg.e<? super f0> eVar = this.f28855e;
        if (eVar instanceof vg.d) {
            return (vg.d) eVar;
        }
        return null;
    }

    @Override // vg.c, tg.e
    public final tg.h getContext() {
        tg.h hVar = this.f28854d;
        return hVar == null ? tg.i.f28768a : hVar;
    }

    @Override // vg.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = pg.p.a(obj);
        if (thA != null) {
            this.f28854d = new o(thA, getContext());
        }
        tg.e<? super f0> eVar = this.f28855e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return ug.a.f29706a;
    }
}
