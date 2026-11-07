package androidx.savedstate;

import android.os.Bundle;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.v0;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.j;
import y1.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Recreator implements k {
    public final c s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f1730a = new LinkedHashSet();

        public a(androidx.savedstate.a aVar) {
            aVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1730a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.s = cVar;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (aVar != h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        mVar.getLifecycle().c(this);
        c cVar = this.s;
        Bundle bundleA = cVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i6 = 0;
        while (i6 < size) {
            String str = stringArrayList.get(i6);
            i6++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0019a.class);
                j.d("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        j.d("{\n                constr…wInstance()\n            }", objNewInstance);
                        ((a.InterfaceC0019a) objNewInstance).a(cVar);
                    } catch (Exception e6) {
                        throw new RuntimeException(k0.a("Failed to instantiate ", str2), e6);
                    }
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(v0.b("Class ", str2, " wasn't found"), e8);
            }
        }
    }
}
