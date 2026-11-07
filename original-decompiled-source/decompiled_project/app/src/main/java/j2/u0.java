package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import o2.b;

/* loaded from: classes.dex */
public final class u0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f14909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.b f14910b;

    public u0(Configuration configuration, o2.b bVar) {
        this.f14909a = configuration;
        this.f14910b = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f14909a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<b.C0213b, WeakReference<b.a>>> it = this.f14910b.f18920a.entrySet().iterator();
        while (it.hasNext()) {
            b.a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f18922b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @pg.d
    public final void onLowMemory() {
        this.f14910b.f18920a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f14910b.f18920a.clear();
    }
}
