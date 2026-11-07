package i0;

import android.view.KeyEvent;
import i0.c2;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13253a = new a();

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a2 a(KeyEvent keyEvent) {
            a2 a2Var;
            a2 a2Var2;
            a2 a2Var3 = null;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long jA = a2.g.a(keyEvent.getKeyCode());
                if (a2.b.a(jA, s2.f13557i)) {
                    a2Var = a2.T;
                } else if (a2.b.a(jA, s2.f13558j)) {
                    a2Var = a2.U;
                } else if (a2.b.a(jA, s2.f13559k)) {
                    a2Var = a2.L;
                } else if (a2.b.a(jA, s2.f13560l)) {
                    a2Var = a2.M;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA2 = a2.g.a(keyEvent.getKeyCode());
                a2Var = a2.b.a(jA2, s2.f13557i) ? a2.f13135k : a2.b.a(jA2, s2.f13558j) ? a2.f13136l : a2.b.a(jA2, s2.f13559k) ? a2.f13141r : a2.b.a(jA2, s2.f13560l) ? a2.f13142s : null;
            }
            if (a2Var != null) {
                return a2Var;
            }
            c2.b bVar = c2.f13221a;
            bVar.getClass();
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jA3 = a2.g.a(keyEvent.getKeyCode());
                if (a2.b.a(jA3, s2.f13557i)) {
                    a2Var2 = a2.N;
                } else if (a2.b.a(jA3, s2.f13558j)) {
                    a2Var2 = a2.O;
                } else if (a2.b.a(jA3, s2.f13559k)) {
                    a2Var2 = a2.Q;
                } else if (a2.b.a(jA3, s2.f13560l)) {
                    a2Var2 = a2.P;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jA4 = a2.g.a(keyEvent.getKeyCode());
                a2Var2 = a2.b.a(jA4, s2.f13557i) ? a2.f13130e : a2.b.a(jA4, s2.f13558j) ? a2.f13129d : a2.b.a(jA4, s2.f13559k) ? a2.f13132g : a2.b.a(jA4, s2.f13560l) ? a2.f13131f : a2.b.a(jA4, s2.f13551c) ? a2.f13146x : a2.b.a(jA4, s2.f13569u) ? a2.A : a2.b.a(jA4, s2.f13568t) ? a2.f13148z : a2.b.a(jA4, s2.f13556h) ? a2.V : null;
            } else if (keyEvent.isShiftPressed()) {
                long jA5 = a2.g.a(keyEvent.getKeyCode());
                if (a2.b.a(jA5, s2.f13563o)) {
                    a2Var2 = a2.R;
                } else if (a2.b.a(jA5, s2.f13564p)) {
                    a2Var2 = a2.S;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA6 = a2.g.a(keyEvent.getKeyCode());
                if (a2.b.a(jA6, s2.f13568t)) {
                    a2Var2 = a2.B;
                } else if (a2.b.a(jA6, s2.f13569u)) {
                    a2Var2 = a2.C;
                }
            }
            if (a2Var2 != null) {
                return a2Var2;
            }
            eh.l<a2.c, Boolean> lVar = bVar.f13223a.f13175a;
            if (lVar.invoke(new a2.c(keyEvent)).booleanValue() && keyEvent.isShiftPressed()) {
                long jA7 = a2.g.a(keyEvent.getKeyCode());
                int i10 = s2.f13574z;
                if (a2.b.a(jA7, s2.f13555g)) {
                    a2Var3 = a2.Z;
                }
            } else {
                if (lVar.invoke(new a2.c(keyEvent)).booleanValue()) {
                    long jA8 = a2.d.a(keyEvent);
                    int i11 = s2.f13574z;
                    if (a2.b.a(jA8, s2.f13550b) ? true : a2.b.a(jA8, s2.f13565q)) {
                        a2Var3 = a2.f13143t;
                    } else if (a2.b.a(jA8, s2.f13552d)) {
                        a2Var3 = a2.f13144v;
                    } else if (a2.b.a(jA8, s2.f13554f)) {
                        a2Var3 = a2.f13145w;
                    } else if (a2.b.a(jA8, s2.f13549a)) {
                        a2Var3 = a2.D;
                    } else if (a2.b.a(jA8, s2.f13553e)) {
                        a2Var3 = a2.Z;
                    } else if (a2.b.a(jA8, s2.f13555g)) {
                        a2Var3 = a2.Y;
                    }
                } else if (!keyEvent.isCtrlPressed()) {
                    if (keyEvent.isShiftPressed()) {
                        long jA9 = a2.g.a(keyEvent.getKeyCode());
                        int i12 = s2.f13574z;
                        if (a2.b.a(jA9, s2.f13557i)) {
                            a2Var3 = a2.E;
                        } else if (a2.b.a(jA9, s2.f13558j)) {
                            a2Var3 = a2.F;
                        } else if (a2.b.a(jA9, s2.f13559k)) {
                            a2Var3 = a2.G;
                        } else if (a2.b.a(jA9, s2.f13560l)) {
                            a2Var3 = a2.H;
                        } else if (a2.b.a(jA9, s2.f13561m)) {
                            a2Var3 = a2.I;
                        } else if (a2.b.a(jA9, s2.f13562n)) {
                            a2Var3 = a2.K;
                        } else if (a2.b.a(jA9, s2.f13563o)) {
                            a2Var3 = a2.R;
                        } else if (a2.b.a(jA9, s2.f13564p)) {
                            a2Var3 = a2.S;
                        } else if (a2.b.a(jA9, s2.f13565q)) {
                            a2Var3 = a2.f13144v;
                        }
                    } else {
                        long jA10 = a2.g.a(keyEvent.getKeyCode());
                        int i13 = s2.f13574z;
                        if (a2.b.a(jA10, s2.f13557i)) {
                            a2Var3 = a2.f13127b;
                        } else if (a2.b.a(jA10, s2.f13558j)) {
                            a2Var3 = a2.f13128c;
                        } else if (a2.b.a(jA10, s2.f13559k)) {
                            a2Var3 = a2.f13137m;
                        } else if (a2.b.a(jA10, s2.f13560l)) {
                            a2Var3 = a2.f13138n;
                        } else if (a2.b.a(jA10, s2.f13561m)) {
                            a2Var3 = a2.f13139p;
                        } else if (a2.b.a(jA10, s2.f13562n)) {
                            a2Var3 = a2.f13140q;
                        } else if (a2.b.a(jA10, s2.f13563o)) {
                            a2Var3 = a2.f13133h;
                        } else if (a2.b.a(jA10, s2.f13564p)) {
                            a2Var3 = a2.f13134j;
                        } else {
                            if (a2.b.a(jA10, s2.f13566r) ? true : a2.b.a(jA10, s2.f13567s)) {
                                a2Var3 = a2.W;
                            } else if (a2.b.a(jA10, s2.f13568t)) {
                                a2Var3 = a2.f13146x;
                            } else if (a2.b.a(jA10, s2.f13569u)) {
                                a2Var3 = a2.f13147y;
                            } else if (a2.b.a(jA10, s2.f13570v)) {
                                a2Var3 = a2.f13144v;
                            } else if (a2.b.a(jA10, s2.f13571w)) {
                                a2Var3 = a2.f13145w;
                            } else if (a2.b.a(jA10, s2.f13572x)) {
                                a2Var3 = a2.f13143t;
                            } else if (a2.b.a(jA10, s2.f13573y)) {
                                a2Var3 = a2.X;
                            }
                        }
                    }
                }
            }
            return a2Var3;
        }
    }
}
