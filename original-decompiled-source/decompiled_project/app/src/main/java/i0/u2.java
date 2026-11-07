package i0;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u2 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sh.d1 d1Var, eh.q qVar, Throwable th2, vg.c cVar) {
        sh.l lVar;
        if (cVar instanceof sh.l) {
            lVar = (sh.l) cVar;
            int i10 = lVar.f25020c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f25020c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new sh.l(cVar);
            }
        }
        Object obj = lVar.f25019b;
        ug.a aVar = ug.a.f29706a;
        int i11 = lVar.f25020c;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                lVar.f25018a = th2;
                lVar.f25020c = 1;
                if (qVar.b(d1Var, th2, lVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = lVar.f25018a;
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                c9.u1.b(th3, th2);
            }
            throw th3;
        }
    }

    public static boolean b(List list, lc.l lVar) {
        Iterator it = list.iterator();
        g8.w.e(lVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (lVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return i10 != -1;
    }

    public static int c(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static nc.m d(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i10 = 0; i10 < 2; i10++) {
            iterableArr[i10].getClass();
        }
        return new nc.m(iterableArr);
    }

    public static final wg.b e(Enum[] entries) {
        kotlin.jvm.internal.r.e(entries, "entries");
        return new wg.b(entries);
    }

    public static nc.b0 f(Iterable iterable, lc.l lVar) {
        iterable.getClass();
        lVar.getClass();
        return new nc.b0(iterable, lVar);
    }

    public static final int g(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int h(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static int i(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j10;
    }

    public static nc.c0 j(Iterable iterable, lc.e eVar) {
        iterable.getClass();
        eVar.getClass();
        return new nc.c0(iterable, eVar);
    }
}
