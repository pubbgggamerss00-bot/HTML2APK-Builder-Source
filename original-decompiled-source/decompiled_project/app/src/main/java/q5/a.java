package q5;

import androidx.lifecycle.w0;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f21915b;

    /* renamed from: c, reason: collision with root package name */
    public gb.i f21916c;

    public a(androidx.lifecycle.l0 l0Var) {
        String string = (String) l0Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            l0Var.c(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f21915b = string;
    }

    @Override // androidx.lifecycle.w0
    public final void e() {
        gb.i iVar = this.f21916c;
        if (iVar == null) {
            kotlin.jvm.internal.r.h("saveableStateHolderRef");
            throw null;
        }
        g1.d dVar = (g1.d) ((WeakReference) iVar.f11913a).get();
        if (dVar != null) {
            dVar.f(this.f21915b);
        }
        gb.i iVar2 = this.f21916c;
        if (iVar2 != null) {
            ((WeakReference) iVar2.f11913a).clear();
        } else {
            kotlin.jvm.internal.r.h("saveableStateHolderRef");
            throw null;
        }
    }
}
