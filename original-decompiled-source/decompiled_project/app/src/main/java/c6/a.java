package c6;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c6.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import pg.n;
import qg.x;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e f4990a;

    /* renamed from: c6.a$a, reason: collision with other inner class name */
    public static final class C0060a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f4991a = new LinkedHashSet();

        public C0060a(c cVar) {
            cVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // c6.c.b
        public final Bundle a() {
            Bundle bundleA = u3.d.a((n[]) Arrays.copyOf(new n[0], 0));
            b4.a.f(bundleA, "classes_to_restore", x.c0(this.f4991a));
            return bundleA;
        }
    }

    public a(e eVar) {
        this.f4990a = eVar;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (aVar != l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.getLifecycle().c(this);
        e eVar = this.f4990a;
        Bundle bundleA = eVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = stringArrayList.get(i10);
            i10++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, a.class.getClassLoader()).asSubclass(c.a.class);
                kotlin.jvm.internal.r.b(clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        kotlin.jvm.internal.r.b(objNewInstance);
                        ((c.a) objNewInstance).a(eVar);
                    } catch (Exception e10) {
                        throw new RuntimeException(m3.a.a("Failed to instantiate ", str2), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(i8.n.d("Class ", str2, " wasn't found"), e12);
            }
        }
    }
}
