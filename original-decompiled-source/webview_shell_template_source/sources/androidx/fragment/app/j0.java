package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import androidx.fragment.app.y;
import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import q0.c;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1160a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<d> f1161b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<d> f1162c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1163d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1164e = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ c s;

        public a(c cVar) {
            this.s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<d> arrayList = j0.this.f1161b;
            c cVar = this.s;
            if (arrayList.contains(cVar)) {
                cVar.f1167a.a(cVar.f1169c.W);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public final /* synthetic */ c s;

        public b(c cVar) {
            this.s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j0 j0Var = j0.this;
            ArrayList<d> arrayList = j0Var.f1161b;
            c cVar = this.s;
            arrayList.remove(cVar);
            j0Var.f1162c.remove(cVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends d {
        public final e0 h;

        public c(d.c cVar, d.b bVar, e0 e0Var, q0.c cVar2) {
            super(cVar, bVar, e0Var.f1097c, cVar2);
            this.h = e0Var;
        }

        @Override // androidx.fragment.app.j0.d
        public final void b() {
            super.b();
            this.h.k();
        }

        @Override // androidx.fragment.app.j0.d
        public final void d() {
            d.b bVar = this.f1168b;
            d.b bVar2 = d.b.f1175t;
            e0 e0Var = this.h;
            if (bVar != bVar2) {
                if (bVar == d.b.f1176u) {
                    k kVar = e0Var.f1097c;
                    View viewZ = kVar.z();
                    if (y.H(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewZ.findFocus() + " on view " + viewZ + " for Fragment " + kVar);
                    }
                    viewZ.clearFocus();
                    return;
                }
                return;
            }
            k kVar2 = e0Var.f1097c;
            View viewFindFocus = kVar2.W.findFocus();
            if (viewFindFocus != null) {
                kVar2.b().f1210k = viewFindFocus;
                if (y.H(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + kVar2);
                }
            }
            View viewZ2 = this.f1169c.z();
            if (viewZ2.getParent() == null) {
                e0Var.b();
                viewZ2.setAlpha(0.0f);
            }
            if (viewZ2.getAlpha() == 0.0f && viewZ2.getVisibility() == 0) {
                viewZ2.setVisibility(4);
            }
            k.c cVar = kVar2.Z;
            viewZ2.setAlpha(cVar == null ? 1.0f : cVar.f1209j);
        }
    }

    public j0(ViewGroup viewGroup) {
        this.f1160a = viewGroup;
    }

    public static j0 f(ViewGroup viewGroup, k0 k0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof j0) {
            return (j0) tag;
        }
        ((y.e) k0Var).getClass();
        i iVar = new i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, iVar);
        return iVar;
    }

    public final void a(d.c cVar, d.b bVar, e0 e0Var) {
        synchronized (this.f1161b) {
            try {
                q0.c cVar2 = new q0.c();
                d dVarD = d(e0Var.f1097c);
                if (dVarD != null) {
                    dVarD.c(cVar, bVar);
                    return;
                }
                c cVar3 = new c(cVar, bVar, e0Var, cVar2);
                this.f1161b.add(cVar3);
                cVar3.f1170d.add(new a(cVar3));
                cVar3.f1170d.add(new b(cVar3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z6);

    public final void c() {
        if (this.f1164e) {
            return;
        }
        ViewGroup viewGroup = this.f1160a;
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f1163d = false;
            return;
        }
        synchronized (this.f1161b) {
            try {
                if (!this.f1161b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1162c);
                    this.f1162c.clear();
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        d dVar = (d) obj;
                        if (y.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                        }
                        dVar.a();
                        if (!dVar.f1173g) {
                            this.f1162c.add(dVar);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1161b);
                    this.f1161b.clear();
                    this.f1162c.addAll(arrayList2);
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((d) obj2).d();
                    }
                    b(arrayList2, this.f1163d);
                    this.f1163d = false;
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d d(k kVar) {
        ArrayList<d> arrayList = this.f1161b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            d dVar = arrayList.get(i6);
            i6++;
            d dVar2 = dVar;
            if (dVar2.f1169c.equals(kVar) && !dVar2.f1172f) {
                return dVar2;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (y.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1160a;
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1161b) {
            try {
                g();
                ArrayList<d> arrayList = this.f1161b;
                int size = arrayList.size();
                int i6 = 0;
                int i7 = 0;
                while (i7 < size) {
                    d dVar = arrayList.get(i7);
                    i7++;
                    dVar.d();
                }
                ArrayList arrayList2 = new ArrayList(this.f1162c);
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj = arrayList2.get(i8);
                    i8++;
                    d dVar2 = (d) obj;
                    if (y.H(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            str2 = "Container " + this.f1160a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(dVar2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    dVar2.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f1161b);
                int size3 = arrayList3.size();
                while (i6 < size3) {
                    Object obj2 = arrayList3.get(i6);
                    i6++;
                    d dVar3 = (d) obj2;
                    if (y.H(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            str = "Container " + this.f1160a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(dVar3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    dVar3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList<d> arrayList = this.f1161b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            d dVar = arrayList.get(i6);
            i6++;
            d dVar2 = dVar;
            if (dVar2.f1168b == d.b.f1175t) {
                dVar2.c(d.c.b(dVar2.f1169c.z().getVisibility()), d.b.s);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public c f1167a;

        /* renamed from: b, reason: collision with root package name */
        public b f1168b;

        /* renamed from: c, reason: collision with root package name */
        public final k f1169c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f1170d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final HashSet<q0.c> f1171e = new HashSet<>();

        /* renamed from: f, reason: collision with root package name */
        public boolean f1172f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1173g = false;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements c.a {
            public a() {
            }

            @Override // q0.c.a
            public final void onCancel() {
                d.this.a();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class b {
            public static final b s;

            /* renamed from: t, reason: collision with root package name */
            public static final b f1175t;

            /* renamed from: u, reason: collision with root package name */
            public static final b f1176u;

            /* renamed from: v, reason: collision with root package name */
            public static final /* synthetic */ b[] f1177v;

            static {
                b bVar = new b("NONE", 0);
                s = bVar;
                b bVar2 = new b("ADDING", 1);
                f1175t = bVar2;
                b bVar3 = new b("REMOVING", 2);
                f1176u = bVar3;
                f1177v = new b[]{bVar, bVar2, bVar3};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f1177v.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class c {
            public static final c s;

            /* renamed from: t, reason: collision with root package name */
            public static final c f1178t;

            /* renamed from: u, reason: collision with root package name */
            public static final c f1179u;

            /* renamed from: v, reason: collision with root package name */
            public static final c f1180v;

            /* renamed from: w, reason: collision with root package name */
            public static final /* synthetic */ c[] f1181w;

            static {
                c cVar = new c("REMOVED", 0);
                s = cVar;
                c cVar2 = new c("VISIBLE", 1);
                f1178t = cVar2;
                c cVar3 = new c("GONE", 2);
                f1179u = cVar3;
                c cVar4 = new c("INVISIBLE", 3);
                f1180v = cVar4;
                f1181w = new c[]{cVar, cVar2, cVar3, cVar4};
            }

            public c() {
                throw null;
            }

            public static c b(int i6) {
                if (i6 == 0) {
                    return f1178t;
                }
                if (i6 == 4) {
                    return f1180v;
                }
                if (i6 == 8) {
                    return f1179u;
                }
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Unknown visibility "));
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? f1180v : b(view.getVisibility());
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f1181w.clone();
            }

            public final void a(View view) {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (y.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (y.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public d(c cVar, b bVar, k kVar, q0.c cVar2) {
            this.f1167a = cVar;
            this.f1168b = bVar;
            this.f1169c = kVar;
            cVar2.a(new a());
        }

        public final void a() {
            HashSet<q0.c> hashSet = this.f1171e;
            if (this.f1172f) {
                return;
            }
            this.f1172f = true;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                q0.c cVar = (q0.c) obj;
                synchronized (cVar) {
                    try {
                        if (!cVar.f14096a) {
                            cVar.f14096a = true;
                            cVar.f14098c = true;
                            c.a aVar = cVar.f14097b;
                            if (aVar != null) {
                                try {
                                    aVar.onCancel();
                                } catch (Throwable th) {
                                    synchronized (cVar) {
                                        cVar.f14098c = false;
                                        cVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (cVar) {
                                cVar.f14098c = false;
                                cVar.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        public void b() {
            if (this.f1173g) {
                return;
            }
            if (y.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1173g = true;
            ArrayList arrayList = this.f1170d;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((Runnable) obj).run();
            }
        }

        public final void c(c cVar, b bVar) {
            int iOrdinal = bVar.ordinal();
            k kVar = this.f1169c;
            c cVar2 = c.s;
            if (iOrdinal == 0) {
                if (this.f1167a != cVar2) {
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kVar + " mFinalState = " + this.f1167a + " -> " + cVar + ". ");
                    }
                    this.f1167a = cVar;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f1167a == cVar2) {
                    if (y.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1168b + " to ADDING.");
                    }
                    this.f1167a = c.f1178t;
                    this.f1168b = b.f1175t;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (y.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kVar + " mFinalState = " + this.f1167a + " -> REMOVED. mLifecycleImpact  = " + this.f1168b + " to REMOVING.");
            }
            this.f1167a = cVar2;
            this.f1168b = b.f1176u;
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1167a + "} {mLifecycleImpact = " + this.f1168b + "} {mFragment = " + this.f1169c + "}";
        }

        public void d() {
        }
    }
}
