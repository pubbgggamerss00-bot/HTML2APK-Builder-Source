package com.google.firebase;

import android.content.Context;
import android.os.Build;
import ce.f;
import ce.g;
import ce.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ne.b;
import ne.e;
import ne.h;
import sd.a;
import sd.d;
import sd.l;
import sd.y;
import sd.z;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a.C0274a c0274aA = a.a(h.class);
        c0274aA.a(new l(2, 0, e.class));
        c0274aA.f24848f = new b();
        arrayList.add(c0274aA.b());
        final y yVar = new y(jd.a.class, Executor.class);
        a.C0274a c0274a = new a.C0274a(f.class, new Class[]{ce.h.class, i.class});
        c0274a.a(l.b(Context.class));
        c0274a.a(l.b(id.e.class));
        c0274a.a(new l(2, 0, g.class));
        c0274a.a(new l(1, 1, h.class));
        c0274a.a(new l((y<?>) yVar, 1, 0));
        c0274a.f24848f = new d() { // from class: ce.d
            @Override // sd.d
            public final Object b(z zVar) {
                return new f((Context) zVar.a(Context.class), ((id.e) zVar.a(id.e.class)).f(), zVar.b(y.a(g.class)), zVar.d(ne.h.class), (Executor) zVar.g(yVar));
            }
        };
        arrayList.add(c0274a.b());
        arrayList.add(ne.g.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ne.g.a("fire-core", "21.0.0"));
        arrayList.add(ne.g.a("device-name", a(Build.PRODUCT)));
        arrayList.add(ne.g.a("device-model", a(Build.DEVICE)));
        arrayList.add(ne.g.a("device-brand", a(Build.BRAND)));
        arrayList.add(ne.g.b("android-target-sdk", new id.f()));
        arrayList.add(ne.g.b("android-min-sdk", new id.g()));
        arrayList.add(ne.g.b("android-platform", new id.h()));
        arrayList.add(ne.g.b("android-installer", new id.i()));
        try {
            pg.i.f21464b.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ne.g.a("kotlin", str));
        }
        return arrayList;
    }
}
