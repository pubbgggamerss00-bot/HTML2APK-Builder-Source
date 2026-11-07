package b3;

import androidx.emoji2.text.d;
import x0.r3;
import x0.x1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public r3<Boolean> f3561a;

    public static final class a extends d.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x1 f3562a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f3563b;

        public a(x1 x1Var, g gVar) {
            this.f3562a = x1Var;
            this.f3563b = gVar;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.f3563b.f3561a = j.f3566a;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            this.f3562a.setValue(Boolean.TRUE);
            this.f3563b.f3561a = new k(true);
        }
    }

    public final r3<Boolean> a() {
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        if (dVarA.c() == 1) {
            return new k(true);
        }
        x1 x1VarH = bg.b.h(Boolean.FALSE);
        dVarA.h(new a(x1VarH, this));
        return x1VarH;
    }
}
