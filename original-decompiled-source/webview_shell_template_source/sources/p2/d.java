package p2;

import android.content.Context;
import androidx.work.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f14067f = k.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final u2.a f14068a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14069b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14070c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14071d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public T f14072e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList s;

        public a(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((n2.a) obj).a(d.this.f14072e);
            }
        }
    }

    public d(Context context, u2.a aVar) {
        this.f14069b = context.getApplicationContext();
        this.f14068a = aVar;
    }

    public abstract T a();

    public final void b(o2.c cVar) {
        synchronized (this.f14070c) {
            try {
                if (this.f14071d.remove(cVar) && this.f14071d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(T t6) {
        synchronized (this.f14070c) {
            try {
                T t7 = this.f14072e;
                if (t7 != t6 && (t7 == null || !t7.equals(t6))) {
                    this.f14072e = t6;
                    ((u2.b) this.f14068a).f14595c.execute(new a(new ArrayList(this.f14071d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
