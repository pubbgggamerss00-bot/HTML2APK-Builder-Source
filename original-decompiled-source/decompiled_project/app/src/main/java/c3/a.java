package c3;

import android.graphics.Typeface;
import android.text.Spannable;
import b3.c;
import b3.m;
import eh.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import t2.b0;
import x2.a0;
import x2.f;
import x2.n;
import x2.o;
import x2.p;

/* loaded from: classes.dex */
public final class a extends s implements q<b0, Integer, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spannable f4730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.a f4731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Spannable spannable, c.a aVar) {
        super(3);
        this.f4730a = spannable;
        this.f4731b = aVar;
    }

    @Override // eh.q
    public final f0 b(b0 b0Var, Integer num, Integer num2) {
        Typeface typeface;
        b0 b0Var2 = b0Var;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        f fVar = b0Var2.f27780f;
        p pVar = b0Var2.f27777c;
        if (pVar == null) {
            pVar = p.f32030c;
        }
        n nVar = b0Var2.f27778d;
        int i10 = nVar != null ? nVar.f32027a : 0;
        o oVar = b0Var2.f27779e;
        int i11 = oVar != null ? oVar.f32028a : 65535;
        c cVar = c.this;
        a0 a0VarA = cVar.f3540e.a(fVar, pVar, i10, i11);
        if (a0VarA instanceof a0.a) {
            Object obj = ((a0.a) a0VarA).f32011a;
            r.c(obj, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj;
        } else {
            m mVar = new m(a0VarA, cVar.f3545j);
            cVar.f3545j = mVar;
            Object obj2 = mVar.f3570c;
            r.c(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj2;
        }
        this.f4730a.setSpan(new w2.m(typeface), iIntValue, iIntValue2, 33);
        return f0.f21461a;
    }
}
