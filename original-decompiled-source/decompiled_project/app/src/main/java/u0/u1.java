package u0;

/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29159a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(String str) {
        super(1);
        this.f29160b = str;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        String strConcat;
        int i10 = this.f29159a;
        Object obj2 = this.f29160b;
        switch (i10) {
            case 0:
                kh.i<Object>[] iVarArr = q2.a0.f21754a;
                ((q2.d0) obj).c(q2.w.J, (String) obj2);
                return pg.f0.f21461a;
            default:
                y2.i iVar = (y2.i) obj;
                StringBuilder sbA = k1.q.a(((y2.i) obj2) == iVar ? " > " : "   ");
                if (iVar instanceof y2.a) {
                    StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
                    y2.a aVar = (y2.a) iVar;
                    sb.append(aVar.f33675a.f27761b.length());
                    sb.append(", newCursorPosition=");
                    strConcat = b.b.a(sb, aVar.f33676b, ')');
                } else if (iVar instanceof y2.a0) {
                    StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    y2.a0 a0Var = (y2.a0) iVar;
                    sb2.append(a0Var.f33677a.f27761b.length());
                    sb2.append(", newCursorPosition=");
                    strConcat = b.b.a(sb2, a0Var.f33678b, ')');
                } else if ((iVar instanceof y2.z) || (iVar instanceof y2.g) || (iVar instanceof y2.h) || (iVar instanceof y2.b0)) {
                    strConcat = iVar.toString();
                } else if (iVar instanceof y2.l) {
                    strConcat = "FinishComposingTextCommand()";
                } else if (iVar instanceof y2.f) {
                    strConcat = "DeleteAllCommand()";
                } else {
                    String strE = kotlin.jvm.internal.h0.a(iVar.getClass()).e();
                    if (strE == null) {
                        strE = "{anonymous EditCommand}";
                    }
                    strConcat = "Unknown EditCommand: ".concat(strE);
                }
                sbA.append(strConcat);
                return sbA.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(y2.i iVar, y2.j jVar) {
        super(1);
        this.f29160b = iVar;
    }
}
