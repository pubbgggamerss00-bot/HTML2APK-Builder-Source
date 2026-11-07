package c5;

import android.util.Log;
import android.view.ViewGroup;
import c5.b0;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y3.q0;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f4949b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<a> f4950c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f4951d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4952e = false;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4953a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4954b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: c5.m0$a$a, reason: collision with other inner class name */
        public static final class EnumC0059a {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0059a f4955a;

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0059a f4956b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0059a f4957c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ EnumC0059a[] f4958d;

            static {
                EnumC0059a enumC0059a = new EnumC0059a("NONE", 0);
                f4955a = enumC0059a;
                EnumC0059a enumC0059a2 = new EnumC0059a("ADDING", 1);
                f4956b = enumC0059a2;
                EnumC0059a enumC0059a3 = new EnumC0059a("REMOVING", 2);
                f4957c = enumC0059a3;
                f4958d = new EnumC0059a[]{enumC0059a, enumC0059a2, enumC0059a3};
            }

            public EnumC0059a() {
                throw null;
            }

            public static EnumC0059a valueOf(String str) {
                return (EnumC0059a) Enum.valueOf(EnumC0059a.class, str);
            }

            public static EnumC0059a[] values() {
                return (EnumC0059a[]) f4958d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4959a;

            /* renamed from: b, reason: collision with root package name */
            public static final b f4960b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ b[] f4961c;

            static {
                b bVar = new b("REMOVED", 0);
                f4959a = bVar;
                b bVar2 = new b("VISIBLE", 1);
                f4960b = bVar2;
                f4961c = new b[]{bVar, bVar2, new b("GONE", 2), new b("INVISIBLE", 3)};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f4961c.clone();
            }

            public final void a() {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    throw null;
                }
                if (iOrdinal == 1) {
                    if (!b0.G(2)) {
                        throw null;
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view null to VISIBLE");
                    throw null;
                }
                if (iOrdinal == 2) {
                    if (!b0.G(2)) {
                        throw null;
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view null to GONE");
                    throw null;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (!b0.G(2)) {
                    throw null;
                }
                Log.v("FragmentManager", "SpecialEffectsController: Setting view null to INVISIBLE");
                throw null;
            }
        }

        public final void a() {
            if (this.f4953a) {
                return;
            }
            this.f4953a = true;
            throw null;
        }

        public void b() {
            if (this.f4954b) {
                return;
            }
            if (b0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4954b = true;
            throw null;
        }

        public void c() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + ((Object) null) + "} {mLifecycleImpact = " + ((Object) null) + "} {mFragment = " + ((Object) null) + "}";
        }
    }

    public m0(ViewGroup viewGroup) {
        this.f4948a = viewGroup;
    }

    public static m0 d(ViewGroup viewGroup, n0 n0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof m0) {
            return (m0) tag;
        }
        ((b0.e) n0Var).getClass();
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public abstract void a(ArrayList arrayList, boolean z10);

    public final void b() {
        if (this.f4952e) {
            return;
        }
        ViewGroup viewGroup = this.f4948a;
        Field field = q0.f33885a;
        if (!viewGroup.isAttachedToWindow()) {
            c();
            this.f4951d = false;
            return;
        }
        synchronized (this.f4949b) {
            try {
                if (!this.f4949b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f4950c);
                    this.f4950c.clear();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        a aVar = (a) obj;
                        if (b0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + aVar);
                        }
                        aVar.a();
                        if (!aVar.f4954b) {
                            this.f4950c.add(aVar);
                        }
                    }
                    e();
                    ArrayList arrayList2 = new ArrayList(this.f4949b);
                    this.f4949b.clear();
                    this.f4950c.addAll(arrayList2);
                    if (b0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        ((a) obj2).c();
                    }
                    a(arrayList2, this.f4951d);
                    this.f4951d = false;
                    if (b0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        String str;
        String str2;
        if (b0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f4948a;
        Field field = q0.f33885a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f4949b) {
            try {
                e();
                ArrayList<a> arrayList = this.f4949b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    a aVar = arrayList.get(i11);
                    i11++;
                    aVar.c();
                }
                ArrayList arrayList2 = new ArrayList(this.f4950c);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    a aVar2 = (a) obj;
                    if (b0.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4948a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(aVar2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    aVar2.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f4949b);
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    a aVar3 = (a) obj2;
                    if (b0.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4948a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(aVar3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    aVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        ArrayList<a> arrayList = this.f4949b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            aVar.getClass();
        }
    }
}
