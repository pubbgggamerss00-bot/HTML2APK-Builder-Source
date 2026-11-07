package pd;

import androidx.compose.ui.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f3.q;
import java.util.Map;
import x0.j;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements SuccessContinuation {
    public static String a(d.a aVar, float f10, j jVar, int i10, j jVar2) {
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar);
        return q.c(i10, jVar2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        long jE;
        ld.a aVar = (ld.a) obj;
        p.f(aVar);
        String str = aVar.f16975a;
        try {
            jE = (long) (Double.parseDouble(aVar.f16976b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> mapA = md.b.a(str);
            jE = 1000 * (ld.b.e("exp", mapA) - ld.b.e("iat", mapA));
        }
        return Tasks.forResult(new ld.b(str, jE, System.currentTimeMillis()));
    }
}
