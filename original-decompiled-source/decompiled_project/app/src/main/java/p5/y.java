package p5;

import i0.e4;
import j5.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class y extends androidx.lifecycle.w0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21314b = new LinkedHashMap();

    public static final class a {
        public static y a(androidx.lifecycle.a1 a1Var) {
            j5.b factory = a0.f21189a;
            a.C0143a extras = a.C0143a.f15159b;
            kotlin.jvm.internal.r.e(factory, "factory");
            kotlin.jvm.internal.r.e(extras, "extras");
            j5.f fVar = new j5.f(a1Var, factory, extras);
            kotlin.jvm.internal.h hVarA = kotlin.jvm.internal.h0.a(y.class);
            String strA = hVarA.a();
            if (strA != null) {
                return (y) fVar.a(hVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // p5.z0
    public final androidx.lifecycle.a1 a(String backStackEntryId) {
        kotlin.jvm.internal.r.e(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f21314b;
        androidx.lifecycle.a1 a1Var = (androidx.lifecycle.a1) linkedHashMap.get(backStackEntryId);
        if (a1Var != null) {
            return a1Var;
        }
        androidx.lifecycle.a1 a1Var2 = new androidx.lifecycle.a1();
        linkedHashMap.put(backStackEntryId, a1Var2);
        return a1Var2;
    }

    @Override // androidx.lifecycle.w0
    public final void e() {
        LinkedHashMap linkedHashMap = this.f21314b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.a1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        g8.w.h(16);
        sb.append(e4.d(16, iIdentityHashCode & BodyPartID.bodyIdMax));
        sb.append("} ViewModelStores (");
        Iterator it = this.f21314b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
