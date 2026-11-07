package aa;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import kc.o;
import v.t0;

/* loaded from: classes.dex */
public final class b implements a {
    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o oVar = (o) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", oVar.a());
            bundle.putLong("event_timestamp", oVar.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final void c(long j10, t0 t0Var) {
        if (t0Var == t0.f30083a) {
            if (f3.b.h(j10) != Integer.MAX_VALUE) {
                return;
            }
            y.c.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (f3.b.i(j10) != Integer.MAX_VALUE) {
                return;
            }
            y.c.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    @Override // aa.a
    public long a() {
        return SystemClock.elapsedRealtime();
    }
}
