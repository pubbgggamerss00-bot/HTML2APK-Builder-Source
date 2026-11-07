package w7;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import g7.j;
import java.util.LinkedHashMap;
import java.util.List;
import qg.k0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g7.t f31319a;

    public a(g7.t tVar, b8.a aVar) {
        this.f31319a = tVar;
    }

    public static androidx.lifecycle.l a(f fVar) {
        y7.a aVar = fVar.f31330c;
        Object context = aVar instanceof y7.b ? ((y7.b) aVar).a().getContext() : fVar.f31328a;
        while (!(context instanceof androidx.lifecycle.t)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((androidx.lifecycle.t) context).getLifecycle();
    }

    public static boolean b(f fVar, Bitmap.Config config) {
        if (!b8.b.a(config)) {
            return true;
        }
        if (!((Boolean) g7.k.a(fVar, h.f31396f)).booleanValue()) {
            return false;
        }
        y7.a aVar = fVar.f31330c;
        if (!(aVar instanceof y7.b)) {
            return true;
        }
        View viewA = ((y7.b) aVar).a();
        return !viewA.isAttachedToWindow() || viewA.isHardwareAccelerated();
    }

    public final m c(f fVar, x7.h hVar) {
        Context context = fVar.f31328a;
        x7.f fVar2 = fVar.f31343p;
        x7.c cVar = fVar.f31344q;
        hi.n nVar = fVar.f31332e;
        c cVar2 = fVar.f31336i;
        c cVar3 = fVar.f31337j;
        c cVar4 = fVar.f31338k;
        j.b<Bitmap.Config> bVar = h.f31392b;
        Bitmap.Config config = (Bitmap.Config) g7.k.a(fVar, bVar);
        j.b<Boolean> bVar2 = h.f31397g;
        boolean zBooleanValue = ((Boolean) g7.k.a(fVar, bVar2)).booleanValue();
        j.b<List<z7.a>> bVar3 = g.f31387a;
        boolean z10 = ((List) g7.k.a(fVar, bVar3)).isEmpty() || qg.o.r(b8.t.f3682a, (Bitmap.Config) g7.k.a(fVar, bVar));
        boolean z11 = !b8.b.a((Bitmap.Config) g7.k.a(fVar, bVar)) || b(fVar, (Bitmap.Config) g7.k.a(fVar, bVar));
        if (!z10 || !z11) {
            config = Bitmap.Config.ARGB_8888;
        }
        boolean z12 = zBooleanValue && ((List) g7.k.a(fVar, bVar3)).isEmpty() && config != Bitmap.Config.ALPHA_8;
        LinkedHashMap linkedHashMapK = k0.k(k0.f(fVar.f31347t.f31377n.f11510a, fVar.f31345r.f11510a));
        if (config != ((Bitmap.Config) g7.k.a(fVar, bVar))) {
            if (config != null) {
                linkedHashMapK.put(bVar, config);
            } else {
                linkedHashMapK.remove(bVar);
            }
        }
        if (z12 != ((Boolean) g7.k.a(fVar, bVar2)).booleanValue()) {
            linkedHashMapK.put(bVar2, Boolean.valueOf(z12));
        }
        return new m(context, hVar, fVar2, cVar, null, nVar, cVar2, cVar3, cVar4, new g7.j(b8.c.b(linkedHashMapK)));
    }
}
