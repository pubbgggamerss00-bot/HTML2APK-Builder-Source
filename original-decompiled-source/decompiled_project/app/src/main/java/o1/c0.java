package o1;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f18854b = new c0();

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f18855c = new c0();

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f18856d = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<e0> f18857a = new z0.b<>(new e0[16]);

    public static void b(c0 c0Var) {
        c0Var.getClass();
        c0Var.a(new b0(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0044, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(eh.l<? super FocusTargetNode, Boolean> lVar) {
        if (this == f18854b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f18855c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        z0.b<e0> bVar = this.f18857a;
        int i10 = bVar.f34702c;
        if (i10 == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        e0[] e0VarArr = bVar.f34700a;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = e0VarArr[i11];
            if (!e0Var.B().f1157p) {
                f2.a.b("visitChildren called on an unattached node");
            }
            z0.b bVar2 = new z0.b(new d.c[16]);
            d.c cVar = e0Var.B().f1149f;
            if (cVar == null) {
                i2.k.a(bVar2, e0Var.B());
            } else {
                bVar2.b(cVar);
            }
            while (true) {
                int i12 = bVar2.f34702c;
                if (i12 != 0) {
                    d.c cVarB = (d.c) bVar2.k(i12 - 1);
                    if ((cVarB.f1147d & 1024) == 0) {
                        i2.k.a(bVar2, cVarB);
                    } else {
                        while (true) {
                            if (cVarB == null) {
                                break;
                            }
                            if ((cVarB.f1146c & 1024) != 0) {
                                z0.b bVar3 = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                        if (focusTargetNode.U1().f18909a ? lVar.invoke(focusTargetNode).booleanValue() : f3.i.g(focusTargetNode, 7, lVar)) {
                                            z10 = true;
                                            break;
                                        }
                                    } else if (((cVarB.f1146c & 1024) != 0) && (cVarB instanceof i2.m)) {
                                        int i13 = 0;
                                        for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                            if ((cVar2.f1146c & 1024) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    cVarB = cVar2;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new z0.b(new d.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        bVar3.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    bVar3.b(cVar2);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    cVarB = i2.k.b(bVar3);
                                }
                            } else {
                                cVarB = cVarB.f1149f;
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }
}
