package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.p0;
import androidx.camera.camera2.internal.v0;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class y {
    public d.h A;
    public d.h B;
    public ArrayDeque<k> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<androidx.fragment.app.k> K;
    public b0 L;
    public final f M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1232b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f1234d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.k> f1235e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f1237g;

    /* renamed from: l, reason: collision with root package name */
    public final u f1241l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList<c0> f1242m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.camera.core.processing.u f1243n;

    /* renamed from: o, reason: collision with root package name */
    public final v f1244o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.camera.view.v f1245p;

    /* renamed from: q, reason: collision with root package name */
    public final w f1246q;

    /* renamed from: r, reason: collision with root package name */
    public final c f1247r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public s<?> f1248t;

    /* renamed from: u, reason: collision with root package name */
    public p f1249u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.k f1250v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.fragment.app.k f1251w;

    /* renamed from: x, reason: collision with root package name */
    public final d f1252x;

    /* renamed from: y, reason: collision with root package name */
    public final e f1253y;

    /* renamed from: z, reason: collision with root package name */
    public d.h f1254z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f1231a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f1233c = new f0();

    /* renamed from: f, reason: collision with root package name */
    public final t f1236f = new t(this);
    public final b h = new b();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1238i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f1239j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f1240k = Collections.synchronizedMap(new HashMap());

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements d.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // d.b
        @SuppressLint({"SyntheticAccessor"})
        public final void b(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                iArr[i6] = ((Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
            }
            y yVar = y.this;
            k kVarPollFirst = yVar.C.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
            } else {
                String str = kVarPollFirst.s;
                if (yVar.f1233c.d(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends androidx.activity.f0 {
        public b() {
            super(false);
        }

        @Override // androidx.activity.f0
        public final void a() {
            y yVar = y.this;
            yVar.y(true);
            if (yVar.h.f63a) {
                yVar.O();
            } else {
                yVar.f1237g.c();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements u0.l {
        public c() {
        }

        @Override // u0.l
        public final boolean a(MenuItem menuItem) {
            return y.this.o();
        }

        @Override // u0.l
        public final void b(Menu menu) {
            y.this.p();
        }

        @Override // u0.l
        public final void c(Menu menu, MenuInflater menuInflater) {
            y.this.j();
        }

        @Override // u0.l
        public final void d(Menu menu) {
            y.this.s();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends r {
        public d() {
        }

        @Override // androidx.fragment.app.r
        public final androidx.fragment.app.k a(String str) {
            try {
                return r.c(y.this.f1248t.f1222t.getClassLoader(), str).getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e6) {
                throw new k.d(v0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
            } catch (InstantiationException e7) {
                throw new k.d(v0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
            } catch (NoSuchMethodException e8) {
                throw new k.d(v0.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
            } catch (InvocationTargetException e9) {
                throw new k.d(v0.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e implements k0 {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.this.y(true);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class g implements c0 {
        public final /* synthetic */ androidx.fragment.app.k s;

        public g(androidx.fragment.app.k kVar) {
            this.s = kVar;
        }

        @Override // androidx.fragment.app.c0
        public final void a() {
            this.s.getClass();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class h implements d.b<d.a> {
        public h() {
        }

        @Override // d.b
        public final void b(d.a aVar) {
            d.a aVar2 = aVar;
            y yVar = y.this;
            k kVarPollFirst = yVar.C.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVarPollFirst.s;
            int i6 = kVarPollFirst.f1258t;
            androidx.fragment.app.k kVarD = yVar.f1233c.d(str);
            if (kVarD != null) {
                kVarD.m(i6, aVar2.s, aVar2.f12632t);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class i implements d.b<d.a> {
        public i() {
        }

        @Override // d.b
        public final void b(d.a aVar) {
            d.a aVar2 = aVar;
            y yVar = y.this;
            k kVarPollFirst = yVar.C.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVarPollFirst.s;
            int i6 = kVarPollFirst.f1258t;
            androidx.fragment.app.k kVarD = yVar.f1233c.d(str);
            if (kVarD != null) {
                kVarD.m(i6, aVar2.s, aVar2.f12632t);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class j extends e.a<d.j, d.a> {
        @Override // e.a
        public final Intent a(Context context, d.j jVar) {
            Bundle bundleExtra;
            d.j jVar2 = jVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = jVar2.f12653t;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    jVar2 = new d.j(jVar2.s, null, jVar2.f12654u, jVar2.f12655v);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar2);
            if (y.H(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        public final Object c(Intent intent, int i6) {
            return new d.a(intent, i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @SuppressLint({"BanParcelableUsage"})
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public String s;

        /* renamed from: t, reason: collision with root package name */
        public int f1258t;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                k kVar = new k();
                kVar.s = parcel.readString();
                kVar.f1258t = parcel.readInt();
                return kVar;
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i6) {
                return new k[i6];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.s);
            parcel.writeInt(this.f1258t);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface l {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final int f1259a;

        public m(int i6) {
            this.f1259a = i6;
        }

        @Override // androidx.fragment.app.y.l
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            y yVar = y.this;
            androidx.fragment.app.k kVar = yVar.f1251w;
            int i6 = this.f1259a;
            if (kVar == null || i6 >= 0 || !kVar.c().P(-1, 0)) {
                return yVar.Q(arrayList, arrayList2, i6, 1);
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.v] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.w] */
    public y() {
        Collections.synchronizedMap(new HashMap());
        this.f1241l = new u(this);
        this.f1242m = new CopyOnWriteArrayList<>();
        int i6 = 1;
        this.f1243n = new androidx.camera.core.processing.u(i6, this);
        this.f1244o = new t0.a() { // from class: androidx.fragment.app.v
            @Override // t0.a
            public final void accept(Object obj) {
                Integer num = (Integer) obj;
                y yVar = this.f1228a;
                if (yVar.J() && num.intValue() == 80) {
                    yVar.l(false);
                }
            }
        };
        this.f1245p = new androidx.camera.view.v(i6, this);
        this.f1246q = new t0.a() { // from class: androidx.fragment.app.w
            @Override // t0.a
            public final void accept(Object obj) {
                i0.u uVar = (i0.u) obj;
                y yVar = this.f1229a;
                if (yVar.J()) {
                    boolean z6 = uVar.f13339a;
                    yVar.r(false);
                }
            }
        };
        this.f1247r = new c();
        this.s = -1;
        this.f1252x = new d();
        this.f1253y = new e();
        this.C = new ArrayDeque<>();
        this.M = new f();
    }

    public static boolean H(int i6) {
        return Log.isLoggable("FragmentManager", i6);
    }

    public static boolean I(androidx.fragment.app.k kVar) {
        kVar.getClass();
        ArrayList arrayListF = kVar.L.f1233c.f();
        int size = arrayListF.size();
        boolean zI = false;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListF.get(i6);
            i6++;
            androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) obj;
            if (kVar2 != null) {
                zI = I(kVar2);
            }
            if (zI) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(androidx.fragment.app.k kVar) {
        if (kVar == null) {
            return true;
        }
        if (kVar.T) {
            return kVar.J == null || K(kVar.M);
        }
        return false;
    }

    public static boolean L(androidx.fragment.app.k kVar) {
        if (kVar == null) {
            return true;
        }
        y yVar = kVar.J;
        return kVar.equals(yVar.f1251w) && L(yVar.f1250v);
    }

    public static void a0(androidx.fragment.app.k kVar) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + kVar);
        }
        if (kVar.Q) {
            kVar.Q = false;
            kVar.f1183a0 = !kVar.f1183a0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[PHI: r14
      0x022b: PHI (r14v23 int) = (r14v22 int), (r14v24 int) binds: [B:103:0x021b, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i6, int i7) {
        ViewGroup viewGroup;
        boolean z6;
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        f0 f0Var = this.f1233c;
        boolean z11 = arrayList.get(i6).f1122o;
        ArrayList<androidx.fragment.app.k> arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(f0Var.g());
        androidx.fragment.app.k kVar = this.f1251w;
        int i12 = i6;
        boolean z12 = false;
        while (true) {
            int i13 = 1;
            if (i12 >= i7) {
                boolean z13 = z11;
                this.K.clear();
                if (!z13 && this.s >= 1) {
                    for (int i14 = i6; i14 < i7; i14++) {
                        ArrayList<g0.a> arrayList4 = arrayList.get(i14).f1109a;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            g0.a aVar = arrayList4.get(i15);
                            i15++;
                            androidx.fragment.app.k kVar2 = aVar.f1124b;
                            if (kVar2 != null && kVar2.J != null) {
                                f0Var.h(f(kVar2));
                            }
                        }
                    }
                }
                for (int i16 = i6; i16 < i7; i16++) {
                    androidx.fragment.app.a aVar2 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue()) {
                        aVar2.c(-1);
                        y yVar = aVar2.f1058p;
                        ArrayList<g0.a> arrayList5 = aVar2.f1109a;
                        boolean z14 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            g0.a aVar3 = arrayList5.get(size2);
                            androidx.fragment.app.k kVar3 = aVar3.f1124b;
                            if (kVar3 != null) {
                                if (kVar3.Z != null) {
                                    kVar3.b().f1201a = z14;
                                }
                                int i17 = aVar2.f1114f;
                                int i18 = 8194;
                                int i19 = 4097;
                                if (i17 != 4097) {
                                    if (i17 != 8194) {
                                        i18 = 4100;
                                        i19 = 8197;
                                        if (i17 != 8197) {
                                            i18 = i17 != 4099 ? i17 != 4100 ? 0 : i19 : 4099;
                                        }
                                    }
                                }
                                if (kVar3.Z != null || i18 != 0) {
                                    kVar3.b();
                                    kVar3.Z.f1206f = i18;
                                }
                                kVar3.b();
                                kVar3.Z.getClass();
                            }
                            switch (aVar3.f1123a) {
                                case 1:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    z14 = true;
                                    yVar.W(kVar3, true);
                                    yVar.R(kVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar3.f1123a);
                                case 3:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    yVar.a(kVar3);
                                    z14 = true;
                                case 4:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    yVar.getClass();
                                    a0(kVar3);
                                    z14 = true;
                                case 5:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    yVar.W(kVar3, true);
                                    yVar.G(kVar3);
                                    z14 = true;
                                case 6:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    yVar.c(kVar3);
                                    z14 = true;
                                case 7:
                                    kVar3.A(aVar3.f1126d, aVar3.f1127e, aVar3.f1128f, aVar3.f1129g);
                                    yVar.W(kVar3, true);
                                    yVar.g(kVar3);
                                    z14 = true;
                                case 8:
                                    yVar.Y(null);
                                    z14 = true;
                                case 9:
                                    yVar.Y(kVar3);
                                    z14 = true;
                                case 10:
                                    yVar.X(kVar3, aVar3.h);
                                    z14 = true;
                            }
                        }
                    } else {
                        aVar2.c(1);
                        y yVar2 = aVar2.f1058p;
                        ArrayList<g0.a> arrayList6 = aVar2.f1109a;
                        int size3 = arrayList6.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            g0.a aVar4 = arrayList6.get(i20);
                            androidx.fragment.app.k kVar4 = aVar4.f1124b;
                            if (kVar4 != null) {
                                if (kVar4.Z != null) {
                                    kVar4.b().f1201a = false;
                                }
                                int i21 = aVar2.f1114f;
                                if (kVar4.Z != null || i21 != 0) {
                                    kVar4.b();
                                    kVar4.Z.f1206f = i21;
                                }
                                kVar4.b();
                                kVar4.Z.getClass();
                            }
                            switch (aVar4.f1123a) {
                                case 1:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.W(kVar4, false);
                                    yVar2.a(kVar4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar4.f1123a);
                                case 3:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.R(kVar4);
                                case 4:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.G(kVar4);
                                case 5:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.W(kVar4, false);
                                    a0(kVar4);
                                case 6:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.g(kVar4);
                                case 7:
                                    kVar4.A(aVar4.f1126d, aVar4.f1127e, aVar4.f1128f, aVar4.f1129g);
                                    yVar2.W(kVar4, false);
                                    yVar2.c(kVar4);
                                case 8:
                                    yVar2.Y(kVar4);
                                case 9:
                                    yVar2.Y(null);
                                case 10:
                                    yVar2.X(kVar4, aVar4.f1130i);
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i7 - 1).booleanValue();
                for (int i22 = i6; i22 < i7; i22++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i22);
                    if (zBooleanValue) {
                        for (int size4 = aVar5.f1109a.size() - 1; size4 >= 0; size4--) {
                            androidx.fragment.app.k kVar5 = aVar5.f1109a.get(size4).f1124b;
                            if (kVar5 != null) {
                                f(kVar5).k();
                            }
                        }
                    } else {
                        ArrayList<g0.a> arrayList7 = aVar5.f1109a;
                        int size5 = arrayList7.size();
                        int i23 = 0;
                        while (i23 < size5) {
                            g0.a aVar6 = arrayList7.get(i23);
                            i23++;
                            androidx.fragment.app.k kVar6 = aVar6.f1124b;
                            if (kVar6 != null) {
                                f(kVar6).k();
                            }
                        }
                    }
                }
                M(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i24 = i6; i24 < i7; i24++) {
                    ArrayList<g0.a> arrayList8 = arrayList.get(i24).f1109a;
                    int size6 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size6) {
                        g0.a aVar7 = arrayList8.get(i25);
                        i25++;
                        androidx.fragment.app.k kVar7 = aVar7.f1124b;
                        if (kVar7 != null && (viewGroup = kVar7.V) != null) {
                            hashSet.add(j0.f(viewGroup, F()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    j0 j0Var = (j0) it.next();
                    j0Var.f1163d = zBooleanValue;
                    synchronized (j0Var.f1161b) {
                        try {
                            j0Var.g();
                            j0Var.f1164e = false;
                            int size7 = j0Var.f1161b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    j0.d dVar = j0Var.f1161b.get(size7);
                                    j0.d.c cVarC = j0.d.c.c(dVar.f1169c.W);
                                    j0.d.c cVar = dVar.f1167a;
                                    j0.d.c cVar2 = j0.d.c.f1178t;
                                    if (cVar != cVar2 || cVarC == cVar2) {
                                        size7--;
                                    } else {
                                        k.c cVar3 = dVar.f1169c.Z;
                                        j0Var.f1164e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j0Var.c();
                }
                for (int i26 = i6; i26 < i7; i26++) {
                    androidx.fragment.app.a aVar8 = arrayList.get(i26);
                    if (arrayList2.get(i26).booleanValue() && aVar8.f1060r >= 0) {
                        aVar8.f1060r = -1;
                    }
                    aVar8.getClass();
                }
                return;
            }
            androidx.fragment.app.a aVar9 = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                z6 = z11;
                i8 = i12;
                z7 = z12;
                int i27 = 1;
                ArrayList<androidx.fragment.app.k> arrayList9 = this.K;
                ArrayList<g0.a> arrayList10 = aVar9.f1109a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    g0.a aVar10 = arrayList10.get(size8);
                    int i28 = aVar10.f1123a;
                    if (i28 == i27) {
                        arrayList9.remove(aVar10.f1124b);
                    } else if (i28 != 3) {
                        switch (i28) {
                            case 6:
                                arrayList9.add(aVar10.f1124b);
                                break;
                            case 8:
                                kVar = null;
                                break;
                            case 9:
                                kVar = aVar10.f1124b;
                                break;
                            case 10:
                                aVar10.f1130i = aVar10.h;
                                break;
                        }
                    }
                    size8--;
                    i27 = 1;
                }
            } else {
                ArrayList<androidx.fragment.app.k> arrayList11 = this.K;
                ArrayList<g0.a> arrayList12 = aVar9.f1109a;
                int i29 = 0;
                while (i29 < arrayList12.size()) {
                    g0.a aVar11 = arrayList12.get(i29);
                    int i30 = aVar11.f1123a;
                    if (i30 != i13) {
                        z8 = z11;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList11.remove(aVar11.f1124b);
                                androidx.fragment.app.k kVar8 = aVar11.f1124b;
                                if (kVar8 == kVar) {
                                    arrayList12.add(i29, new g0.a(9, kVar8));
                                    i29++;
                                    i10 = i12;
                                    z9 = z12;
                                    i9 = 1;
                                    kVar = null;
                                }
                            } else if (i30 == 7) {
                                i9 = 1;
                            } else if (i30 == 8) {
                                arrayList12.add(i29, new g0.a(9, kVar, 0));
                                aVar11.f1125c = true;
                                i29++;
                                kVar = aVar11.f1124b;
                            }
                            i10 = i12;
                            z9 = z12;
                            i9 = 1;
                        } else {
                            androidx.fragment.app.k kVar9 = aVar11.f1124b;
                            int i31 = kVar9.O;
                            int size9 = arrayList11.size() - 1;
                            boolean z15 = false;
                            while (size9 >= 0) {
                                int i32 = size9;
                                androidx.fragment.app.k kVar10 = arrayList11.get(size9);
                                int i33 = i12;
                                if (kVar10.O != i31) {
                                    z10 = z12;
                                } else if (kVar10 == kVar9) {
                                    z10 = z12;
                                    z15 = true;
                                } else {
                                    if (kVar10 == kVar) {
                                        z10 = z12;
                                        i11 = 0;
                                        arrayList12.add(i29, new g0.a(9, kVar10, 0));
                                        i29++;
                                        kVar = null;
                                    } else {
                                        z10 = z12;
                                        i11 = 0;
                                    }
                                    g0.a aVar12 = new g0.a(3, kVar10, i11);
                                    aVar12.f1126d = aVar11.f1126d;
                                    aVar12.f1128f = aVar11.f1128f;
                                    aVar12.f1127e = aVar11.f1127e;
                                    aVar12.f1129g = aVar11.f1129g;
                                    arrayList12.add(i29, aVar12);
                                    arrayList11.remove(kVar10);
                                    i29++;
                                    kVar = kVar;
                                }
                                size9 = i32 - 1;
                                z12 = z10;
                                i12 = i33;
                            }
                            i10 = i12;
                            z9 = z12;
                            i9 = 1;
                            if (z15) {
                                arrayList12.remove(i29);
                                i29--;
                            } else {
                                aVar11.f1123a = 1;
                                aVar11.f1125c = true;
                                arrayList11.add(kVar9);
                            }
                        }
                        i29 += i9;
                        i13 = i9;
                        z11 = z8;
                        z12 = z9;
                        i12 = i10;
                    } else {
                        z8 = z11;
                        i9 = i13;
                    }
                    i10 = i12;
                    z9 = z12;
                    arrayList11.add(aVar11.f1124b);
                    i29 += i9;
                    i13 = i9;
                    z11 = z8;
                    z12 = z9;
                    i12 = i10;
                }
                z6 = z11;
                i8 = i12;
                z7 = z12;
            }
            z12 = z7 || aVar9.f1115g;
            i12 = i8 + 1;
            z11 = z6;
        }
    }

    public final androidx.fragment.app.k B(int i6) {
        f0 f0Var = this.f1233c;
        ArrayList arrayList = (ArrayList) f0Var.f1102t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.fragment.app.k kVar = (androidx.fragment.app.k) arrayList.get(size);
            if (kVar != null && kVar.N == i6) {
                return kVar;
            }
        }
        for (e0 e0Var : ((HashMap) f0Var.s).values()) {
            if (e0Var != null) {
                androidx.fragment.app.k kVar2 = e0Var.f1097c;
                if (kVar2.N == i6) {
                    return kVar2;
                }
            }
        }
        return null;
    }

    public final androidx.fragment.app.k C(String str) {
        f0 f0Var = this.f1233c;
        ArrayList arrayList = (ArrayList) f0Var.f1102t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.fragment.app.k kVar = (androidx.fragment.app.k) arrayList.get(size);
            if (kVar != null && str.equals(kVar.P)) {
                return kVar;
            }
        }
        for (e0 e0Var : ((HashMap) f0Var.s).values()) {
            if (e0Var != null) {
                androidx.fragment.app.k kVar2 = e0Var.f1097c;
                if (str.equals(kVar2.P)) {
                    return kVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(androidx.fragment.app.k kVar) {
        ViewGroup viewGroup = kVar.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (kVar.O <= 0 || !this.f1249u.g()) {
            return null;
        }
        View viewD = this.f1249u.d(kVar.O);
        if (viewD instanceof ViewGroup) {
            return (ViewGroup) viewD;
        }
        return null;
    }

    public final r E() {
        androidx.fragment.app.k kVar = this.f1250v;
        return kVar != null ? kVar.J.E() : this.f1252x;
    }

    public final k0 F() {
        androidx.fragment.app.k kVar = this.f1250v;
        return kVar != null ? kVar.J.F() : this.f1253y;
    }

    public final void G(androidx.fragment.app.k kVar) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + kVar);
        }
        if (kVar.Q) {
            return;
        }
        kVar.Q = true;
        kVar.f1183a0 = true ^ kVar.f1183a0;
        Z(kVar);
    }

    public final boolean J() {
        androidx.fragment.app.k kVar = this.f1250v;
        if (kVar == null) {
            return true;
        }
        return kVar.K != null && kVar.C && kVar.f().J();
    }

    public final void M(int i6, boolean z6) {
        s<?> sVar;
        if (this.f1248t == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i6 != this.s) {
            this.s = i6;
            f0 f0Var = this.f1233c;
            HashMap map = (HashMap) f0Var.s;
            ArrayList arrayList = (ArrayList) f0Var.f1102t;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                e0 e0Var = (e0) map.get(((androidx.fragment.app.k) obj).f1196w);
                if (e0Var != null) {
                    e0Var.k();
                }
            }
            for (e0 e0Var2 : map.values()) {
                if (e0Var2 != null) {
                    e0Var2.k();
                    androidx.fragment.app.k kVar = e0Var2.f1097c;
                    if (kVar.D && !kVar.k()) {
                        f0Var.i(e0Var2);
                    }
                }
            }
            b0();
            if (this.D && (sVar = this.f1248t) != null && this.s == 7) {
                sVar.l();
                this.D = false;
            }
        }
    }

    public final void N() {
        if (this.f1248t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f1080i = false;
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null) {
                kVar.L.N();
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i6, int i7) {
        y(false);
        x(true);
        androidx.fragment.app.k kVar = this.f1251w;
        if (kVar != null && i6 < 0 && kVar.c().O()) {
            return true;
        }
        boolean zQ = Q(this.I, this.J, i6, i7);
        if (zQ) {
            this.f1232b = true;
            try {
                S(this.I, this.J);
            } finally {
                d();
            }
        }
        d0();
        u();
        ((HashMap) this.f1233c.s).values().removeAll(Collections.singleton(null));
        return zQ;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        boolean z6 = (i7 & 1) != 0;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1234d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i6 < 0) {
                size = z6 ? 0 : this.f1234d.size() - 1;
            } else {
                int size2 = this.f1234d.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1234d.get(size2);
                    if (i6 >= 0 && i6 == aVar.f1060r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z6) {
                    size = size2;
                    while (size > 0) {
                        androidx.fragment.app.a aVar2 = this.f1234d.get(size - 1);
                        if (i6 < 0 || i6 != aVar2.f1060r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1234d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1234d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f1234d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(androidx.fragment.app.k kVar) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + kVar + " nesting=" + kVar.I);
        }
        boolean zK = kVar.k();
        if (kVar.R && zK) {
            return;
        }
        f0 f0Var = this.f1233c;
        synchronized (((ArrayList) f0Var.f1102t)) {
            ((ArrayList) f0Var.f1102t).remove(kVar);
        }
        kVar.C = false;
        if (I(kVar)) {
            this.D = true;
        }
        kVar.D = true;
        Z(kVar);
    }

    public final void S(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            if (!arrayList.get(i6).f1122o) {
                if (i7 != i6) {
                    A(arrayList, arrayList2, i7, i6);
                }
                i7 = i6 + 1;
                if (arrayList2.get(i6).booleanValue()) {
                    while (i7 < size && arrayList2.get(i7).booleanValue() && !arrayList.get(i7).f1122o) {
                        i7++;
                    }
                }
                A(arrayList, arrayList2, i6, i7);
                i6 = i7 - 1;
            }
            i6++;
        }
        if (i7 != size) {
            A(arrayList, arrayList2, i7, size);
        }
    }

    public final void T(Parcelable parcelable) {
        u uVar;
        int i6;
        boolean z6;
        int i7;
        e0 e0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1248t.f1222t.getClassLoader());
                this.f1240k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1248t.f1222t.getClassLoader());
                arrayList.add((d0) bundle.getParcelable("state"));
            }
        }
        f0 f0Var = this.f1233c;
        HashMap map = (HashMap) f0Var.f1103u;
        HashMap map2 = (HashMap) f0Var.s;
        map.clear();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            d0 d0Var = (d0) obj;
            map.put(d0Var.f1083t, d0Var);
        }
        a0 a0Var = (a0) bundle3.getParcelable("state");
        if (a0Var == null) {
            return;
        }
        map2.clear();
        ArrayList<String> arrayList2 = a0Var.s;
        int size2 = arrayList2.size();
        int i9 = 0;
        while (true) {
            uVar = this.f1241l;
            i6 = 2;
            if (i9 >= size2) {
                break;
            }
            String str3 = arrayList2.get(i9);
            i9++;
            d0 d0Var2 = (d0) ((HashMap) f0Var.f1103u).remove(str3);
            if (d0Var2 != null) {
                androidx.fragment.app.k kVar = this.L.f1076d.get(d0Var2.f1083t);
                if (kVar != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + kVar);
                    }
                    e0Var = new e0(uVar, f0Var, kVar, d0Var2);
                } else {
                    e0Var = new e0(this.f1241l, this.f1233c, this.f1248t.f1222t.getClassLoader(), E(), d0Var2);
                }
                androidx.fragment.app.k kVar2 = e0Var.f1097c;
                kVar2.J = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + kVar2.f1196w + "): " + kVar2);
                }
                e0Var.m(this.f1248t.f1222t.getClassLoader());
                f0Var.h(e0Var);
                e0Var.f1099e = this.s;
            }
        }
        b0 b0Var = this.L;
        b0Var.getClass();
        ArrayList arrayList3 = new ArrayList(b0Var.f1076d.values());
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            z6 = true;
            if (i10 >= size3) {
                break;
            }
            Object obj2 = arrayList3.get(i10);
            i10++;
            androidx.fragment.app.k kVar3 = (androidx.fragment.app.k) obj2;
            if (map2.get(kVar3.f1196w) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + kVar3 + " that was not found in the set of active Fragments " + a0Var.s);
                }
                this.L.e(kVar3);
                kVar3.J = this;
                e0 e0Var2 = new e0(uVar, f0Var, kVar3);
                e0Var2.f1099e = 1;
                e0Var2.k();
                kVar3.D = true;
                e0Var2.k();
            }
        }
        ArrayList<String> arrayList4 = a0Var.f1061t;
        ((ArrayList) f0Var.f1102t).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i11 = 0;
            while (i11 < size4) {
                String str4 = arrayList4.get(i11);
                i11++;
                String str5 = str4;
                androidx.fragment.app.k kVarC = f0Var.c(str5);
                if (kVarC == null) {
                    throw new IllegalStateException(v0.b("No instantiated fragment for (", str5, ")"));
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str5 + "): " + kVarC);
                }
                f0Var.b(kVarC);
            }
        }
        if (a0Var.f1062u != null) {
            this.f1234d = new ArrayList<>(a0Var.f1062u.length);
            int i12 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = a0Var.f1062u;
                if (i12 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i12];
                ArrayList<String> arrayList5 = bVar.f1068t;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int[] iArr = bVar.s;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iArr.length) {
                    g0.a aVar2 = new g0.a();
                    int i15 = i13 + 1;
                    int i16 = i6;
                    aVar2.f1123a = iArr[i13];
                    if (H(i16)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    aVar2.h = h.b.values()[bVar.f1069u[i14]];
                    aVar2.f1130i = h.b.values()[bVar.f1070v[i14]];
                    int i17 = i13 + 2;
                    aVar2.f1125c = iArr[i15] != 0 ? z6 : false;
                    int i18 = iArr[i17];
                    aVar2.f1126d = i18;
                    int i19 = iArr[i13 + 3];
                    aVar2.f1127e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    aVar2.f1128f = i21;
                    i13 += 6;
                    int[] iArr2 = iArr;
                    int i22 = iArr2[i20];
                    aVar2.f1129g = i22;
                    aVar.f1110b = i18;
                    aVar.f1111c = i19;
                    aVar.f1112d = i21;
                    aVar.f1113e = i22;
                    aVar.b(aVar2);
                    i14++;
                    i6 = i16;
                    iArr = iArr2;
                    z6 = true;
                }
                int i23 = i6;
                aVar.f1114f = bVar.f1071w;
                aVar.h = bVar.f1072x;
                aVar.f1115g = true;
                aVar.f1116i = bVar.f1074z;
                aVar.f1117j = bVar.A;
                aVar.f1118k = bVar.B;
                aVar.f1119l = bVar.C;
                aVar.f1120m = bVar.D;
                aVar.f1121n = bVar.E;
                aVar.f1122o = bVar.F;
                aVar.f1060r = bVar.f1073y;
                for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                    String str6 = arrayList5.get(i24);
                    if (str6 != null) {
                        aVar.f1109a.get(i24).f1124b = f0Var.c(str6);
                    }
                }
                aVar.c(1);
                if (H(i23)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i12 + " (index " + aVar.f1060r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new i0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1234d.add(aVar);
                i12++;
                i6 = i23;
                z6 = true;
            }
            i7 = 0;
        } else {
            i7 = 0;
            this.f1234d = null;
        }
        this.f1238i.set(a0Var.f1063v);
        String str7 = a0Var.f1064w;
        if (str7 != null) {
            androidx.fragment.app.k kVarC2 = f0Var.c(str7);
            this.f1251w = kVarC2;
            q(kVarC2);
        }
        ArrayList<String> arrayList6 = a0Var.f1065x;
        if (arrayList6 != null) {
            while (i7 < arrayList6.size()) {
                this.f1239j.put(arrayList6.get(i7), a0Var.f1066y.get(i7));
                i7++;
            }
        }
        this.C = new ArrayDeque<>(a0Var.f1067z);
    }

    public final Bundle U() {
        int i6;
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            j0 j0Var = (j0) it.next();
            if (j0Var.f1164e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                j0Var.f1164e = false;
                j0Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((j0) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.f1080i = true;
        f0 f0Var = this.f1233c;
        f0Var.getClass();
        HashMap map = (HashMap) f0Var.s;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            bVarArr = null;
            bVarArr = null;
            if (!it3.hasNext()) {
                break;
            }
            e0 e0Var = (e0) it3.next();
            if (e0Var != null) {
                androidx.fragment.app.k kVar = e0Var.f1097c;
                d0 d0Var = new d0(kVar);
                if (kVar.s <= -1 || d0Var.E != null) {
                    d0Var.E = kVar.f1193t;
                } else {
                    Bundle bundle2 = new Bundle();
                    kVar.t(bundle2);
                    kVar.f1190h0.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", kVar.L.U());
                    e0Var.f1095a.j(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (kVar.W != null) {
                        e0Var.o();
                    }
                    if (kVar.f1194u != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", kVar.f1194u);
                    }
                    if (kVar.f1195v != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", kVar.f1195v);
                    }
                    if (!kVar.Y) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", kVar.Y);
                    }
                    d0Var.E = bundle3;
                    if (kVar.f1199z != null) {
                        if (bundle3 == null) {
                            d0Var.E = new Bundle();
                        }
                        d0Var.E.putString("android:target_state", kVar.f1199z);
                        int i7 = kVar.A;
                        if (i7 != 0) {
                            d0Var.E.putInt("android:target_req_state", i7);
                        }
                    }
                }
                arrayList2.add(kVar.f1196w);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + kVar + ": " + kVar.f1193t);
                }
            }
        }
        f0 f0Var2 = this.f1233c;
        f0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) f0Var2.f1103u).values());
        if (!arrayList3.isEmpty()) {
            f0 f0Var3 = this.f1233c;
            synchronized (((ArrayList) f0Var3.f1102t)) {
                try {
                    if (((ArrayList) f0Var3.f1102t).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(((ArrayList) f0Var3.f1102t).size());
                        ArrayList arrayList4 = (ArrayList) f0Var3.f1102t;
                        int size2 = arrayList4.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj = arrayList4.get(i8);
                            i8++;
                            androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) obj;
                            arrayList.add(kVar2.f1196w);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + kVar2.f1196w + "): " + kVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList5 = this.f1234d;
            if (arrayList5 != null && (size = arrayList5.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i9 = 0; i9 < size; i9++) {
                    bVarArr[i9] = new androidx.fragment.app.b(this.f1234d.get(i9));
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i9 + ": " + this.f1234d.get(i9));
                    }
                }
            }
            a0 a0Var = new a0();
            a0Var.s = arrayList2;
            a0Var.f1061t = arrayList;
            a0Var.f1062u = bVarArr;
            a0Var.f1063v = this.f1238i.get();
            androidx.fragment.app.k kVar3 = this.f1251w;
            if (kVar3 != null) {
                a0Var.f1064w = kVar3.f1196w;
            }
            a0Var.f1065x.addAll(this.f1239j.keySet());
            a0Var.f1066y.addAll(this.f1239j.values());
            a0Var.f1067z = new ArrayList<>(this.C);
            bundle.putParcelable("state", a0Var);
            for (String str : this.f1240k.keySet()) {
                bundle.putBundle(androidx.camera.camera2.internal.k0.a("result_", str), this.f1240k.get(str));
            }
            int size3 = arrayList3.size();
            while (i6 < size3) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                d0 d0Var2 = (d0) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", d0Var2);
                bundle.putBundle("fragment_" + d0Var2.f1083t, bundle4);
            }
        } else if (H(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f1231a) {
            try {
                if (this.f1231a.size() == 1) {
                    this.f1248t.f1223u.removeCallbacks(this.M);
                    this.f1248t.f1223u.post(this.M);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(androidx.fragment.app.k kVar, boolean z6) {
        ViewGroup viewGroupD = D(kVar);
        if (viewGroupD == null || !(viewGroupD instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD).setDrawDisappearingViewsLast(!z6);
    }

    public final void X(androidx.fragment.app.k kVar, h.b bVar) {
        if (kVar.equals(this.f1233c.c(kVar.f1196w)) && (kVar.K == null || kVar.J == this)) {
            kVar.f1186d0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + kVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(androidx.fragment.app.k kVar) {
        if (kVar != null) {
            if (!kVar.equals(this.f1233c.c(kVar.f1196w)) || (kVar.K != null && kVar.J != this)) {
                throw new IllegalArgumentException("Fragment " + kVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        androidx.fragment.app.k kVar2 = this.f1251w;
        this.f1251w = kVar;
        q(kVar2);
        q(this.f1251w);
    }

    public final void Z(androidx.fragment.app.k kVar) {
        ViewGroup viewGroupD = D(kVar);
        if (viewGroupD != null) {
            k.c cVar = kVar.Z;
            if ((cVar == null ? 0 : cVar.f1205e) + (cVar == null ? 0 : cVar.f1204d) + (cVar == null ? 0 : cVar.f1203c) + (cVar == null ? 0 : cVar.f1202b) > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, kVar);
                }
                androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag);
                k.c cVar2 = kVar.Z;
                boolean z6 = cVar2 != null ? cVar2.f1201a : false;
                if (kVar2.Z == null) {
                    return;
                }
                kVar2.b().f1201a = z6;
            }
        }
    }

    public final e0 a(androidx.fragment.app.k kVar) {
        String str = kVar.f1185c0;
        if (str != null) {
            i1.b.c(kVar, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + kVar);
        }
        e0 e0VarF = f(kVar);
        kVar.J = this;
        f0 f0Var = this.f1233c;
        f0Var.h(e0VarF);
        if (!kVar.R) {
            f0Var.b(kVar);
            kVar.D = false;
            if (kVar.W == null) {
                kVar.f1183a0 = false;
            }
            if (I(kVar)) {
                this.D = true;
            }
        }
        return e0VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(s<?> sVar, p pVar, androidx.fragment.app.k kVar) {
        if (this.f1248t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1248t = sVar;
        this.f1249u = pVar;
        this.f1250v = kVar;
        CopyOnWriteArrayList<c0> copyOnWriteArrayList = this.f1242m;
        if (kVar != null) {
            copyOnWriteArrayList.add(new g(kVar));
        } else if (sVar instanceof c0) {
            copyOnWriteArrayList.add((c0) sVar);
        }
        if (this.f1250v != null) {
            d0();
        }
        if (sVar instanceof p0) {
            p0 p0Var = (p0) sVar;
            OnBackPressedDispatcher onBackPressedDispatcher = p0Var.getOnBackPressedDispatcher();
            this.f1237g = onBackPressedDispatcher;
            androidx.lifecycle.m mVar = p0Var;
            if (kVar != null) {
                mVar = kVar;
            }
            onBackPressedDispatcher.a(mVar, this.h);
        }
        if (kVar != null) {
            b0 b0Var = kVar.J.L;
            HashMap<String, b0> map = b0Var.f1077e;
            b0 b0Var2 = map.get(kVar.f1196w);
            if (b0Var2 == null) {
                b0Var2 = new b0(b0Var.f1079g);
                map.put(kVar.f1196w, b0Var2);
            }
            this.L = b0Var2;
        } else if (sVar instanceof androidx.lifecycle.k0) {
            androidx.lifecycle.h0 h0Var = new androidx.lifecycle.h0(((androidx.lifecycle.k0) sVar).getViewModelStore(), b0.f1075j);
            String canonicalName = b0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.L = (b0) h0Var.a(b0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.L = new b0(false);
        }
        b0 b0Var3 = this.L;
        b0Var3.f1080i = this.E || this.F;
        this.f1233c.f1104v = b0Var3;
        Object obj = this.f1248t;
        if ((obj instanceof y1.c) && kVar == null) {
            androidx.savedstate.a savedStateRegistry = ((y1.c) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new a.b() { // from class: androidx.fragment.app.x
                @Override // androidx.savedstate.a.b
                public final Bundle a() {
                    return this.f1230a.U();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                T(bundleA);
            }
        }
        Object obj2 = this.f1248t;
        if (obj2 instanceof d.i) {
            d.e activityResultRegistry = ((d.i) obj2).getActivityResultRegistry();
            String strA = androidx.camera.camera2.internal.k0.a("FragmentManager:", kVar != null ? androidx.activity.m.e(new StringBuilder(), kVar.f1196w, ":") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            this.f1254z = activityResultRegistry.c(androidx.camera.core.c.b(strA, "StartActivityForResult"), new e.f(), new h());
            this.A = activityResultRegistry.c(androidx.camera.core.c.b(strA, "StartIntentSenderForResult"), new j(), new i());
            this.B = activityResultRegistry.c(androidx.camera.core.c.b(strA, "RequestPermissions"), new e.d(), new a());
        }
        Object obj3 = this.f1248t;
        if (obj3 instanceof k0.b) {
            ((k0.b) obj3).addOnConfigurationChangedListener(this.f1243n);
        }
        Object obj4 = this.f1248t;
        if (obj4 instanceof k0.c) {
            ((k0.c) obj4).addOnTrimMemoryListener(this.f1244o);
        }
        Object obj5 = this.f1248t;
        if (obj5 instanceof i0.r) {
            ((i0.r) obj5).addOnMultiWindowModeChangedListener(this.f1245p);
        }
        Object obj6 = this.f1248t;
        if (obj6 instanceof i0.s) {
            ((i0.s) obj6).addOnPictureInPictureModeChangedListener(this.f1246q);
        }
        Object obj7 = this.f1248t;
        if ((obj7 instanceof u0.g) && kVar == null) {
            ((u0.g) obj7).addMenuProvider(this.f1247r);
        }
    }

    public final void b0() {
        ArrayList arrayListE = this.f1233c.e();
        int size = arrayListE.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListE.get(i6);
            i6++;
            e0 e0Var = (e0) obj;
            androidx.fragment.app.k kVar = e0Var.f1097c;
            if (kVar.X) {
                if (this.f1232b) {
                    this.H = true;
                } else {
                    kVar.X = false;
                    e0Var.k();
                }
            }
        }
    }

    public final void c(androidx.fragment.app.k kVar) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + kVar);
        }
        if (kVar.R) {
            kVar.R = false;
            if (kVar.C) {
                return;
            }
            this.f1233c.b(kVar);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + kVar);
            }
            if (I(kVar)) {
                this.D = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new i0());
        s<?> sVar = this.f1248t;
        if (sVar != null) {
            try {
                sVar.i(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
                throw illegalStateException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.f1232b = false;
        this.J.clear();
        this.I.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, p5.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.i, p5.a] */
    public final void d0() {
        synchronized (this.f1231a) {
            try {
                if (!this.f1231a.isEmpty()) {
                    b bVar = this.h;
                    bVar.f63a = true;
                    ?? r12 = bVar.f65c;
                    if (r12 != 0) {
                        r12.a();
                    }
                    return;
                }
                b bVar2 = this.h;
                ArrayList<androidx.fragment.app.a> arrayList = this.f1234d;
                bVar2.f63a = (arrayList != null ? arrayList.size() : 0) > 0 && L(this.f1250v);
                ?? r02 = bVar2.f65c;
                if (r02 != 0) {
                    r02.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListE = this.f1233c.e();
        int size = arrayListE.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListE.get(i6);
            i6++;
            ViewGroup viewGroup = ((e0) obj).f1097c.V;
            if (viewGroup != null) {
                hashSet.add(j0.f(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final e0 f(androidx.fragment.app.k kVar) {
        String str = kVar.f1196w;
        f0 f0Var = this.f1233c;
        e0 e0Var = (e0) ((HashMap) f0Var.s).get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this.f1241l, f0Var, kVar);
        e0Var2.m(this.f1248t.f1222t.getClassLoader());
        e0Var2.f1099e = this.s;
        return e0Var2;
    }

    public final void g(androidx.fragment.app.k kVar) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + kVar);
        }
        if (kVar.R) {
            return;
        }
        kVar.R = true;
        if (kVar.C) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + kVar);
            }
            f0 f0Var = this.f1233c;
            synchronized (((ArrayList) f0Var.f1102t)) {
                ((ArrayList) f0Var.f1102t).remove(kVar);
            }
            kVar.C = false;
            if (I(kVar)) {
                this.D = true;
            }
            Z(kVar);
        }
    }

    public final void h(boolean z6) {
        if (z6 && (this.f1248t instanceof k0.b)) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null) {
                kVar.U = true;
                if (z6) {
                    kVar.L.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (androidx.fragment.app.k kVar : this.f1233c.g()) {
                if (kVar != null) {
                    if (!kVar.Q ? kVar.L.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.k> arrayList = null;
        boolean z6 = false;
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null && K(kVar)) {
                if (!kVar.Q ? kVar.L.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(kVar);
                    z6 = true;
                }
            }
        }
        if (this.f1235e != null) {
            for (int i6 = 0; i6 < this.f1235e.size(); i6++) {
                androidx.fragment.app.k kVar2 = this.f1235e.get(i6);
                if (arrayList == null || !arrayList.contains(kVar2)) {
                    kVar2.getClass();
                }
            }
        }
        this.f1235e = arrayList;
        return z6;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).e();
        }
        s<?> sVar = this.f1248t;
        boolean z6 = sVar instanceof androidx.lifecycle.k0;
        f0 f0Var = this.f1233c;
        if (z6) {
            zIsChangingConfigurations = ((b0) f0Var.f1104v).h;
        } else {
            FragmentActivity fragmentActivity = sVar.f1222t;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<androidx.fragment.app.c> it2 = this.f1239j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = it2.next().s;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    String str = (String) obj;
                    b0 b0Var = (b0) f0Var.f1104v;
                    b0Var.getClass();
                    if (H(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    b0Var.d(str);
                }
            }
        }
        t(-1);
        Object obj2 = this.f1248t;
        if (obj2 instanceof k0.c) {
            ((k0.c) obj2).removeOnTrimMemoryListener(this.f1244o);
        }
        Object obj3 = this.f1248t;
        if (obj3 instanceof k0.b) {
            ((k0.b) obj3).removeOnConfigurationChangedListener(this.f1243n);
        }
        Object obj4 = this.f1248t;
        if (obj4 instanceof i0.r) {
            ((i0.r) obj4).removeOnMultiWindowModeChangedListener(this.f1245p);
        }
        Object obj5 = this.f1248t;
        if (obj5 instanceof i0.s) {
            ((i0.s) obj5).removeOnPictureInPictureModeChangedListener(this.f1246q);
        }
        Object obj6 = this.f1248t;
        if (obj6 instanceof u0.g) {
            ((u0.g) obj6).removeMenuProvider(this.f1247r);
        }
        this.f1248t = null;
        this.f1249u = null;
        this.f1250v = null;
        if (this.f1237g != null) {
            Iterator<androidx.activity.c> it3 = this.h.f64b.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
            this.f1237g = null;
        }
        d.h hVar = this.f1254z;
        if (hVar != null) {
            hVar.f12650a.e(hVar.f12651b);
            d.h hVar2 = this.A;
            hVar2.f12650a.e(hVar2.f12651b);
            d.h hVar3 = this.B;
            hVar3.f12650a.e(hVar3.f12651b);
        }
    }

    public final void l(boolean z6) {
        if (z6 && (this.f1248t instanceof k0.c)) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null) {
                kVar.U = true;
                if (z6) {
                    kVar.L.l(true);
                }
            }
        }
    }

    public final void m(boolean z6) {
        if (z6 && (this.f1248t instanceof i0.r)) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null && z6) {
                kVar.L.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListF = this.f1233c.f();
        int size = arrayListF.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListF.get(i6);
            i6++;
            androidx.fragment.app.k kVar = (androidx.fragment.app.k) obj;
            if (kVar != null) {
                kVar.j();
                kVar.L.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (androidx.fragment.app.k kVar : this.f1233c.g()) {
                if (kVar != null) {
                    if (!kVar.Q ? kVar.L.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null && !kVar.Q) {
                kVar.L.p();
            }
        }
    }

    public final void q(androidx.fragment.app.k kVar) {
        if (kVar != null) {
            if (kVar.equals(this.f1233c.c(kVar.f1196w))) {
                kVar.J.getClass();
                boolean zL = L(kVar);
                Boolean bool = kVar.B;
                if (bool == null || bool.booleanValue() != zL) {
                    kVar.B = Boolean.valueOf(zL);
                    z zVar = kVar.L;
                    zVar.d0();
                    zVar.q(zVar.f1251w);
                }
            }
        }
    }

    public final void r(boolean z6) {
        if (z6 && (this.f1248t instanceof i0.s)) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null && z6) {
                kVar.L.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z6 = false;
        for (androidx.fragment.app.k kVar : this.f1233c.g()) {
            if (kVar != null && K(kVar)) {
                if (!kVar.Q ? kVar.L.s() : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void t(int i6) {
        try {
            this.f1232b = true;
            for (e0 e0Var : ((HashMap) this.f1233c.s).values()) {
                if (e0Var != null) {
                    e0Var.f1099e = i6;
                }
            }
            M(i6, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).e();
            }
            this.f1232b = false;
            y(true);
        } catch (Throwable th) {
            this.f1232b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.k kVar = this.f1250v;
        if (kVar != null) {
            sb.append(kVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1250v)));
            sb.append("}");
        } else {
            s<?> sVar = this.f1248t;
            if (sVar != null) {
                sb.append(sVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1248t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            b0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strB = androidx.camera.core.c.b(str, "    ");
        f0 f0Var = this.f1233c;
        ArrayList arrayList = (ArrayList) f0Var.f1102t;
        String strB2 = androidx.camera.core.c.b(str, "    ");
        HashMap map = (HashMap) f0Var.s;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e0 e0Var : map.values()) {
                printWriter.print(str);
                if (e0Var != null) {
                    androidx.fragment.app.k kVar = e0Var.f1097c;
                    printWriter.println(kVar);
                    kVar.getClass();
                    printWriter.print(strB2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(kVar.N));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(kVar.O));
                    printWriter.print(" mTag=");
                    printWriter.println(kVar.P);
                    printWriter.print(strB2);
                    printWriter.print("mState=");
                    printWriter.print(kVar.s);
                    printWriter.print(" mWho=");
                    printWriter.print(kVar.f1196w);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(kVar.I);
                    printWriter.print(strB2);
                    printWriter.print("mAdded=");
                    printWriter.print(kVar.C);
                    printWriter.print(" mRemoving=");
                    printWriter.print(kVar.D);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(kVar.E);
                    printWriter.print(" mInLayout=");
                    printWriter.println(kVar.F);
                    printWriter.print(strB2);
                    printWriter.print("mHidden=");
                    printWriter.print(kVar.Q);
                    printWriter.print(" mDetached=");
                    printWriter.print(kVar.R);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(kVar.T);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strB2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(kVar.S);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(kVar.Y);
                    if (kVar.J != null) {
                        printWriter.print(strB2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(kVar.J);
                    }
                    if (kVar.K != null) {
                        printWriter.print(strB2);
                        printWriter.print("mHost=");
                        printWriter.println(kVar.K);
                    }
                    if (kVar.M != null) {
                        printWriter.print(strB2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(kVar.M);
                    }
                    if (kVar.f1197x != null) {
                        printWriter.print(strB2);
                        printWriter.print("mArguments=");
                        printWriter.println(kVar.f1197x);
                    }
                    if (kVar.f1193t != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(kVar.f1193t);
                    }
                    if (kVar.f1194u != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(kVar.f1194u);
                    }
                    if (kVar.f1195v != null) {
                        printWriter.print(strB2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(kVar.f1195v);
                    }
                    Object objC = kVar.f1198y;
                    if (objC == null) {
                        y yVar = kVar.J;
                        objC = (yVar == null || (str2 = kVar.f1199z) == null) ? null : yVar.f1233c.c(str2);
                    }
                    if (objC != null) {
                        printWriter.print(strB2);
                        printWriter.print("mTarget=");
                        printWriter.print(objC);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(kVar.A);
                    }
                    printWriter.print(strB2);
                    printWriter.print("mPopDirection=");
                    k.c cVar = kVar.Z;
                    printWriter.println(cVar == null ? false : cVar.f1201a);
                    k.c cVar2 = kVar.Z;
                    if ((cVar2 == null ? 0 : cVar2.f1202b) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getEnterAnim=");
                        k.c cVar3 = kVar.Z;
                        printWriter.println(cVar3 == null ? 0 : cVar3.f1202b);
                    }
                    k.c cVar4 = kVar.Z;
                    if ((cVar4 == null ? 0 : cVar4.f1203c) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getExitAnim=");
                        k.c cVar5 = kVar.Z;
                        printWriter.println(cVar5 == null ? 0 : cVar5.f1203c);
                    }
                    k.c cVar6 = kVar.Z;
                    if ((cVar6 == null ? 0 : cVar6.f1204d) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getPopEnterAnim=");
                        k.c cVar7 = kVar.Z;
                        printWriter.println(cVar7 == null ? 0 : cVar7.f1204d);
                    }
                    k.c cVar8 = kVar.Z;
                    if ((cVar8 == null ? 0 : cVar8.f1205e) != 0) {
                        printWriter.print(strB2);
                        printWriter.print("getPopExitAnim=");
                        k.c cVar9 = kVar.Z;
                        printWriter.println(cVar9 != null ? cVar9.f1205e : 0);
                    }
                    if (kVar.V != null) {
                        printWriter.print(strB2);
                        printWriter.print("mContainer=");
                        printWriter.println(kVar.V);
                    }
                    if (kVar.W != null) {
                        printWriter.print(strB2);
                        printWriter.print("mView=");
                        printWriter.println(kVar.W);
                    }
                    if (kVar.d() != null) {
                        new l1.a(kVar, kVar.getViewModelStore()).i(strB2, printWriter);
                    }
                    printWriter.print(strB2);
                    printWriter.println("Child " + kVar.L + ":");
                    kVar.L.v(androidx.camera.core.c.b(strB2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size3; i6++) {
                androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) arrayList.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(kVar2.toString());
            }
        }
        ArrayList<androidx.fragment.app.k> arrayList2 = this.f1235e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                androidx.fragment.app.k kVar3 = this.f1235e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(kVar3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1234d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                androidx.fragment.app.a aVar = this.f1234d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strB, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1238i.get());
        synchronized (this.f1231a) {
            try {
                int size4 = this.f1231a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size4; i9++) {
                        Object obj = (l) this.f1231a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1248t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1249u);
        if (this.f1250v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1250v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(l lVar, boolean z6) {
        if (!z6) {
            if (this.f1248t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1231a) {
            try {
                if (this.f1248t == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1231a.add(lVar);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z6) {
        if (this.f1232b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1248t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1248t.f1223u.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList<>();
            this.J = new ArrayList<>();
        }
    }

    public final boolean y(boolean z6) {
        boolean zA;
        x(z6);
        boolean z7 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.I;
            ArrayList<Boolean> arrayList2 = this.J;
            synchronized (this.f1231a) {
                if (this.f1231a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f1231a.size();
                        zA = false;
                        for (int i6 = 0; i6 < size; i6++) {
                            zA |= this.f1231a.get(i6).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                d0();
                u();
                ((HashMap) this.f1233c.s).values().removeAll(Collections.singleton(null));
                return z7;
            }
            z7 = true;
            this.f1232b = true;
            try {
                S(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(androidx.fragment.app.a aVar, boolean z6) {
        if (z6 && (this.f1248t == null || this.G)) {
            return;
        }
        x(z6);
        aVar.a(this.I, this.J);
        this.f1232b = true;
        try {
            S(this.I, this.J);
            d();
            d0();
            u();
            ((HashMap) this.f1233c.s).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
