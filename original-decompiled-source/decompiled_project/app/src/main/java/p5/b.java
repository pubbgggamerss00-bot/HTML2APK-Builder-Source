package p5;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import p5.b1;

@b1.a("activity")
/* loaded from: classes.dex */
public class b extends b1<a> {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f21191c;

    public static class a extends k0 {
        public a() {
            throw null;
        }

        @Override // p5.k0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a) || !super.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // p5.k0
        public final int hashCode() {
            return super.hashCode() * 961;
        }
    }

    public b(Context context) {
        Object next;
        kotlin.jvm.internal.r.e(context, "context");
        Iterator it = lh.l.h(new p5.a(0), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f21191c = (Activity) next;
    }

    @Override // p5.b1
    public final k0 a() {
        return new a(this);
    }

    @Override // p5.b1
    public final k0 c(k0 k0Var) {
        throw new IllegalStateException(x0.a.a(new StringBuilder("Destination "), ((a) k0Var).f21235b.f24511d, " does not have an Intent set.").toString());
    }

    @Override // p5.b1
    public final boolean f() {
        Activity activity = this.f21191c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
