package m1;

import eh.l;
import i2.n2;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f extends s implements l<g, n2> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f17621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, g gVar, b0 b0Var) {
        super(1);
        this.f17621a = b0Var;
    }

    @Override // eh.l
    public final n2 invoke(g gVar) {
        g gVar2 = gVar;
        if (!gVar2.f1157p) {
            return n2.f13964b;
        }
        if (gVar2.f17624s != null) {
            f2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        gVar2.f17624s = null;
        b0 b0Var = this.f17621a;
        b0Var.f16318a = b0Var.f16318a;
        return n2.f13963a;
    }
}
