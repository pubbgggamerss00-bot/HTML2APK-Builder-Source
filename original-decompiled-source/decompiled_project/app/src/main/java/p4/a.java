package p4;

import android.view.View;
import com.basitce.htmltoapk.R;
import e1.d;
import java.util.ArrayList;
import lh.h;
import qg.p;
import y3.u0;

/* loaded from: classes.dex */
public final class a {
    public static final void a(View view) {
        h hVarF = d.f(new u0(view, null));
        while (hVarF.hasNext()) {
            ArrayList<b> arrayList = b((View) hVarF.next()).f21187a;
            for (int i10 = p.i(arrayList); -1 < i10; i10--) {
                arrayList.get(i10).a();
            }
        }
    }

    public static final c b(View view) {
        c cVar = (c) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(R.id.pooling_container_listener_holder_tag, cVar2);
        return cVar2;
    }
}
