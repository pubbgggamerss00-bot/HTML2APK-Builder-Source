package uh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f29716a = new v("CLOSED");

    public static final <S extends s<S>> Object a(S s10, long j10, eh.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f29768c >= j10 && !s10.c()) {
                return s10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f29717a;
            Object obj = atomicReferenceFieldUpdater.get(s10);
            v vVar = f29716a;
            if (obj == vVar) {
                return vVar;
            }
            S sInvoke = (S) ((b) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.f29768c + 1), s10);
                while (!atomicReferenceFieldUpdater.compareAndSet(s10, null, sInvoke)) {
                    if (atomicReferenceFieldUpdater.get(s10) != null) {
                        break;
                    }
                }
                if (s10.c()) {
                    s10.e();
                }
            }
            s10 = sInvoke;
        }
    }
}
