package q2;

import androidx.compose.ui.d;
import i2.e0;
import i2.k2;

/* loaded from: classes.dex */
public final class u {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t a(e0 e0Var, boolean z10) {
        d.c cVar = e0Var.I.f13793e;
        Object obj = null;
        if ((cVar.f1147d & 8) != 0) {
            loop0: while (true) {
                if (cVar == null) {
                    break;
                }
                if ((cVar.f1146c & 8) != 0) {
                    d.c cVarB = cVar;
                    z0.b bVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof k2) {
                            obj = cVarB;
                            break loop0;
                        }
                        if ((cVarB.f1146c & 8) != 0 && (cVarB instanceof i2.m)) {
                            int i10 = 0;
                            for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                if ((cVar2.f1146c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (cVarB != null) {
                                            bVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        bVar.b(cVar2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = i2.k.b(bVar);
                    }
                    if ((cVar.f1147d & 8) != 0) {
                        break;
                    }
                    cVar = cVar.f1149f;
                } else if ((cVar.f1147d & 8) != 0) {
                }
            }
        }
        kotlin.jvm.internal.r.b(obj);
        d.c cVarB2 = ((k2) obj).B();
        l lVarE = e0Var.e();
        if (lVarE == null) {
            lVarE = new l();
        }
        return new t(cVarB2, z10, e0Var, lVarE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[LOOP:0: B:4:0x000b->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[EDGE_INSN: B:42:0x006d->B:38:0x006d BREAK  A[LOOP:0: B:4:0x000b->B:37:0x006a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final k2 b(e0 e0Var) {
        d.c cVar = e0Var.I.f13793e;
        Object obj = null;
        if ((cVar.f1147d & 8) != 0) {
            loop0: while (true) {
                if (cVar == null) {
                    break;
                }
                if ((cVar.f1146c & 8) != 0) {
                    d.c cVarB = cVar;
                    z0.b bVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof k2) {
                            if (((k2) cVarB).w1()) {
                                obj = cVarB;
                                break loop0;
                            }
                        } else if ((cVarB.f1146c & 8) != 0 && (cVarB instanceof i2.m)) {
                            int i10 = 0;
                            for (d.c cVar2 = ((i2.m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                if ((cVar2.f1146c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (cVarB != null) {
                                            bVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        bVar.b(cVar2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = i2.k.b(bVar);
                    }
                    if ((cVar.f1147d & 8) != 0) {
                        break;
                    }
                    cVar = cVar.f1149f;
                } else if ((cVar.f1147d & 8) != 0) {
                }
            }
        }
        return (k2) obj;
    }
}
