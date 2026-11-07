package g7;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.basitce.htmltoapk.R;
import java.util.concurrent.CancellationException;
import ph.l2;
import ph.q0;

/* loaded from: classes.dex */
public final class d0 {
    public static final w7.d a(w7.f fVar, q0 q0Var) {
        y7.a aVar = fVar.f31330c;
        if (!(aVar instanceof y7.b)) {
            return new gb.h(q0Var);
        }
        View viewA = ((y7.b) aVar).a();
        Object tag = viewA.getTag(R.id.coil3_request_manager);
        w7.s sVar = tag instanceof w7.s ? (w7.s) tag : null;
        if (sVar == null) {
            synchronized (viewA) {
                try {
                    Object tag2 = viewA.getTag(R.id.coil3_request_manager);
                    sVar = tag2 instanceof w7.s ? (w7.s) tag2 : null;
                    if (sVar == null) {
                        sVar = new w7.s();
                        viewA.addOnAttachStateChangeListener(sVar);
                        viewA.setTag(R.id.coil3_request_manager, sVar);
                    }
                } finally {
                }
            }
        }
        synchronized (sVar) {
            w7.p pVar = sVar.f31424a;
            if (pVar != null) {
                Bitmap.Config[] configArr = b8.t.f3682a;
                if (kotlin.jvm.internal.r.a(Looper.myLooper(), Looper.getMainLooper()) && sVar.f31427d) {
                    sVar.f31427d = false;
                    pVar.f31418a = q0Var;
                    return pVar;
                }
            }
            l2 l2Var = sVar.f31425b;
            if (l2Var != null) {
                l2Var.cancel((CancellationException) null);
            }
            sVar.f31425b = null;
            w7.p pVar2 = new w7.p();
            pVar2.f31418a = q0Var;
            sVar.f31424a = pVar2;
            return pVar2;
        }
    }
}
