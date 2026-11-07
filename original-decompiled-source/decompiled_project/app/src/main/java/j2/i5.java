package j2;

import android.view.View;
import android.view.ViewParent;
import com.basitce.htmltoapk.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i5 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14768a;

    public i5(a aVar) {
        this.f14768a = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        a aVar = this.f14768a;
        Iterator it = lh.l.h(y3.v0.f33900a, aVar.getParent()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                kotlin.jvm.internal.r.e(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return;
        }
        aVar.e();
    }
}
