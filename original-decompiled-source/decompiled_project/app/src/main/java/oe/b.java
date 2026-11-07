package oe;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import sd.d;
import sd.z;

/* loaded from: classes2.dex */
public final class b {
    public final List<sd.a<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final sd.a<?> aVar : componentRegistrar.getComponents()) {
            final String str = aVar.f24836a;
            if (str != null) {
                aVar = new sd.a<>(str, aVar.f24837b, aVar.f24838c, aVar.f24839d, aVar.f24840e, new d() { // from class: oe.a
                    @Override // sd.d
                    public final Object b(z zVar) {
                        String str2 = str;
                        sd.a aVar2 = aVar;
                        try {
                            Trace.beginSection(str2);
                            return aVar2.f24841f.b(zVar);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, aVar.f24842g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
