package i0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class v3 extends kotlin.jvm.internal.p implements eh.l<a2.c, Boolean> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(a2.c cVar) {
        y2.a aVar;
        a2 a2VarA;
        Integer numValueOf;
        KeyEvent keyEvent = cVar.f17a;
        u3 u3Var = (u3) this.receiver;
        m0.p3 p3Var = u3Var.f13624f;
        boolean z10 = u3Var.f13622d;
        boolean z11 = true;
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            aVar = null;
        } else {
            s1 s1Var = u3Var.f13627i;
            s1Var.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                s1Var.f13548a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = s1Var.f13548a;
                if (num != null) {
                    s1Var.f13548a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    numValueOf = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(unicodeChar);
                    }
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                aVar = new y2.a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            }
        }
        if (aVar != null) {
            if (z10) {
                u3Var.a(c0.g0.c(aVar));
                p3Var.f17457a = null;
            } else {
                z11 = false;
            }
        } else if (a2.d.b(keyEvent) == 2 && (a2VarA = u3Var.f13628j.a(keyEvent)) != null && (!a2VarA.f13149a || z10)) {
            kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
            b0Var.f16318a = true;
            t3 t3Var = new t3(a2VarA, u3Var, b0Var);
            y2.c0 c0Var = u3Var.f13621c;
            m0.s2 s2Var = new m0.s2(c0Var, u3Var.f13625g, u3Var.f13619a.d(), p3Var);
            t3Var.invoke(s2Var);
            if (!t2.j0.a(s2Var.f17383f, c0Var.f33683b) || !kotlin.jvm.internal.r.a(s2Var.f17384g, c0Var.f33682a)) {
                u3Var.f13629k.invoke(y2.c0.b(c0Var, s2Var.f17384g, s2Var.f17383f, 4));
            }
            y4 y4Var = u3Var.f13626h;
            if (y4Var != null) {
                y4Var.f13712f = true;
            }
            z11 = b0Var.f16318a;
        }
        return Boolean.valueOf(z11);
    }
}
