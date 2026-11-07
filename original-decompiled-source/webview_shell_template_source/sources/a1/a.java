package a1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c0;
import androidx.activity.o0;
import com.htmltoapk.template.R;
import g5.d;
import g5.e;
import g5.f;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import p5.l;
import u0.k0;
import u4.g;
import u4.i;
import w5.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a {
    public static void a(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, l lVar) {
        j.e("<this>", onBackPressedDispatcher);
        onBackPressedDispatcher.a(componentActivity, new o0(lVar));
    }

    public static void b(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final void c(View view) {
        j.e("<this>", view);
        e eVar = new e();
        k0 k0Var = new k0(view, eVar);
        k0Var.f14510v = eVar;
        eVar.f15099v = k0Var;
        while (eVar.hasNext()) {
            View view2 = (View) eVar.next();
            c cVar = (c) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (cVar == null) {
                cVar = new c();
                view2.setTag(R.id.pooling_container_listener_holder_tag, cVar);
            }
            ArrayList<b> arrayList = cVar.f6a;
            for (int iB = e5.l.b(arrayList); -1 < iB; iB--) {
                arrayList.get(iB).a();
            }
        }
    }

    public static c0 d(int i6) {
        return i6 != 0 ? i6 != 1 ? new i() : new u4.e() : new i();
    }

    public static void e(String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }

    public static d f(d dVar) {
        j.e("<this>", dVar);
        i5.c cVar = dVar instanceof i5.c ? (i5.c) dVar : null;
        if (cVar != null && (dVar = cVar.f13374u) == null) {
            f fVar = cVar.f13373t;
            j.b(fVar);
            g5.e eVar = (g5.e) fVar.t(e.a.s);
            dVar = eVar != null ? eVar.m(cVar) : cVar;
            cVar.f13374u = dVar;
        }
        return dVar;
    }

    public static void g(View view, g gVar) {
        j4.a aVar = gVar.f14610t.f14620b;
        if (aVar == null || !aVar.f13498a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        g.c cVar = gVar.f14610t;
        if (cVar.f14629l != elevation) {
            cVar.f14629l = elevation;
            gVar.w();
        }
    }
}
