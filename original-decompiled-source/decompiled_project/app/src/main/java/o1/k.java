package o1;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import i2.d1;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke() {
        d1 d1Var;
        char c10;
        l lVar = (l) this.receiver;
        p.m0<FocusTargetNode> m0Var = lVar.f18872d;
        p.m0<h> m0Var2 = lVar.f18873e;
        FocusTargetNode focusTargetNode = (FocusTargetNode) lVar.f18871c.get();
        if (focusTargetNode == null) {
            Object[] objArr = m0Var2.f20753b;
            long[] jArr = m0Var2.f20752a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    char c11 = 7;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j10 & 255) < 128) {
                                c10 = c11;
                                ((h) objArr[(i10 << 3) + i12]).Q(i0.f18867d);
                            } else {
                                c10 = c11;
                            }
                            j10 >>= 8;
                            i12++;
                            c11 = c10;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        } else if (focusTargetNode.f1157p) {
            if (m0Var.a(focusTargetNode)) {
                focusTargetNode.W1();
            }
            i0 i0VarY = focusTargetNode.Y();
            if (!focusTargetNode.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNode.f1144a;
            i2.e0 e0VarF = i2.k.f(focusTargetNode);
            int i13 = 0;
            while (e0VarF != null) {
                if ((e0VarF.I.f13793e.f1147d & 5120) != 0) {
                    while (cVar != null) {
                        int i14 = cVar.f1146c;
                        if ((i14 & 5120) != 0) {
                            if ((i14 & 1024) != 0) {
                                i13++;
                            }
                            if ((cVar instanceof h) && m0Var2.a(cVar)) {
                                if (i13 <= 1) {
                                    ((h) cVar).Q(i0VarY);
                                } else {
                                    ((h) cVar).Q(i0.f18865b);
                                }
                                m0Var2.l(cVar);
                            }
                        }
                        cVar = cVar.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
            }
            Object[] objArr2 = m0Var2.f20753b;
            long[] jArr2 = m0Var2.f20752a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr2[i15];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & 255) < 128) {
                                ((h) objArr2[(i15 << 3) + i17]).Q(i0.f18867d);
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                        if (i15 == length2) {
                            break;
                        }
                        i15++;
                    }
                }
            }
        }
        lVar.f18870b.invoke();
        m0Var.e();
        m0Var2.e();
        lVar.f18874f = false;
        return pg.f0.f21461a;
    }
}
