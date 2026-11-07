package g7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReference f11486a = new AtomicReference(null);

    public interface a {
        t a(Context context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [g7.p] */
    public static final p a(Context context) {
        t tVar;
        t tVar2;
        AtomicReference atomicReference = f11486a;
        Object obj = atomicReference.get();
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar;
        }
        t tVarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof p) {
                tVar = tVarA;
                tVar2 = (p) obj2;
            } else {
                if (tVarA == null) {
                    a aVar = obj2 instanceof a ? (a) obj2 : null;
                    if (aVar != null) {
                        tVarA = aVar.a(context);
                    } else {
                        Object applicationContext = context.getApplicationContext();
                        a aVar2 = applicationContext instanceof a ? (a) applicationContext : null;
                        tVarA = aVar2 != null ? aVar2.a(context) : g0.f11500a.a(context);
                    }
                }
                t tVar3 = tVarA;
                tVar = tVar3;
                tVar2 = tVar3;
            }
            while (!atomicReference.compareAndSet(obj2, tVar2)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            return tVar2;
            tVarA = tVar;
        }
    }
}
