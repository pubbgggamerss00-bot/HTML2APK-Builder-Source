package c5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
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
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.l;
import c5.h;
import c5.j0;
import c6.c;
import com.basitce.htmltoapk.R;
import j5.a;
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
import org.jf.dexlib2.dexbacked.raw.ItemType;

/* loaded from: classes.dex */
public abstract class b0 {
    public e.i A;
    public e.i B;
    public e.i C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<c5.a> J;
    public ArrayList<Boolean> K;
    public ArrayList<c5.h> L;
    public e0 M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4779b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<c5.a> f4781d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<c5.h> f4782e;

    /* renamed from: g, reason: collision with root package name */
    public b.d0 f4784g;

    /* renamed from: u, reason: collision with root package name */
    public t<?> f4798u;

    /* renamed from: v, reason: collision with root package name */
    public p f4799v;

    /* renamed from: w, reason: collision with root package name */
    public c5.h f4800w;

    /* renamed from: x, reason: collision with root package name */
    public c5.h f4801x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f4778a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final i0 f4780c = new i0();

    /* renamed from: f, reason: collision with root package name */
    public final u f4783f = new u(this);

    /* renamed from: h, reason: collision with root package name */
    public final b f4785h = new b();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f4786i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, c5.c> f4787j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f4788k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, Object> f4789l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final v f4790m = new v(this);

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList<f0> f4791n = new CopyOnWriteArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public final w f4792o = new x3.a() { // from class: c5.w
        @Override // x3.a
        public final void accept(Object obj) {
            b0 b0Var = this.f4986a;
            if (b0Var.I()) {
                b0Var.h(false);
            }
        }
    };

    /* renamed from: p, reason: collision with root package name */
    public final x f4793p = new x3.a() { // from class: c5.x
        @Override // x3.a
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            b0 b0Var = this.f4987a;
            if (b0Var.I() && num.intValue() == 80) {
                b0Var.l(false);
            }
        }
    };

    /* renamed from: q, reason: collision with root package name */
    public final y f4794q = new x3.a() { // from class: c5.y
        @Override // x3.a
        public final void accept(Object obj) {
            o3.f fVar = (o3.f) obj;
            b0 b0Var = this.f4988a;
            if (b0Var.I()) {
                boolean z10 = fVar.f18927a;
                b0Var.m(false);
            }
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final z f4795r = new x3.a() { // from class: c5.z
        @Override // x3.a
        public final void accept(Object obj) {
            o3.r rVar = (o3.r) obj;
            b0 b0Var = this.f4989a;
            if (b0Var.I()) {
                boolean z10 = rVar.f18958a;
                b0Var.r(false);
            }
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final c f4796s = new c();

    /* renamed from: t, reason: collision with root package name */
    public int f4797t = -1;

    /* renamed from: y, reason: collision with root package name */
    public final d f4802y = new d();

    /* renamed from: z, reason: collision with root package name */
    public final e f4803z = new e();
    public ArrayDeque<k> D = new ArrayDeque<>();
    public final f N = new f();

    public class a implements e.b<Map<String, Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f4804a;

        public a(c0 c0Var) {
            this.f4804a = c0Var;
        }

        @Override // e.b
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            b0 b0Var = this.f4804a;
            k kVarPollFirst = b0Var.D.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
            } else {
                String str = kVarPollFirst.f4812a;
                if (b0Var.f4780c.c(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            }
        }
    }

    public class b extends b.w {
        public b() {
            super(false);
        }

        @Override // b.w
        public final void b() {
            b0 b0Var = b0.this;
            b0Var.y(true);
            if (b0Var.f4785h.f3277a) {
                b0Var.N();
            } else {
                b0Var.f4784g.c();
            }
        }
    }

    public class c implements y3.o {
        public c() {
        }

        @Override // y3.o
        public final boolean a(MenuItem menuItem) {
            return b0.this.o();
        }

        @Override // y3.o
        public final void b(Menu menu) {
            b0.this.p();
        }

        @Override // y3.o
        public final void c(Menu menu, MenuInflater menuInflater) {
            b0.this.j();
        }

        @Override // y3.o
        public final void d(Menu menu) {
            b0.this.s();
        }
    }

    public class d extends s {
        public d() {
        }

        @Override // c5.s
        public final c5.h a(String str) {
            try {
                return s.c(b0.this.f4798u.f4980b.getClassLoader(), str).getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new h.e(i8.n.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    public class e implements n0 {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b0.this.y(true);
        }
    }

    public class g implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c5.h f4809a;

        public g(c5.h hVar) {
            this.f4809a = hVar;
        }

        @Override // c5.f0
        public final void s() {
            this.f4809a.getClass();
        }
    }

    public class h implements e.b<e.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f4810a;

        public h(c0 c0Var) {
            this.f4810a = c0Var;
        }

        @Override // e.b
        public final void a(e.a aVar) {
            e.a aVar2 = aVar;
            b0 b0Var = this.f4810a;
            k kVarPollFirst = b0Var.D.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVarPollFirst.f4812a;
            int i10 = kVarPollFirst.f4813b;
            c5.h hVarC = b0Var.f4780c.c(str);
            if (hVarC != null) {
                hVarC.o(i10, aVar2.f8086a, aVar2.f8087b);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements e.b<e.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f4811a;

        public i(c0 c0Var) {
            this.f4811a = c0Var;
        }

        @Override // e.b
        public final void a(e.a aVar) {
            e.a aVar2 = aVar;
            b0 b0Var = this.f4811a;
            k kVarPollFirst = b0Var.D.pollFirst();
            if (kVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVarPollFirst.f4812a;
            int i10 = kVarPollFirst.f4813b;
            c5.h hVarC = b0Var.f4780c.c(str);
            if (hVarC != null) {
                hVarC.o(i10, aVar2.f8086a, aVar2.f8087b);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class j extends f.a<e.k, e.a> {
        @Override // f.a
        public final Intent a(Context context, e.k kVar) {
            Bundle bundleExtra;
            e.k kVar2 = kVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = kVar2.f8111b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = kVar2.f8110a;
                    kotlin.jvm.internal.r.e(intentSender, "intentSender");
                    kVar2 = new e.k(intentSender, null, kVar2.f8112c, kVar2.f8113d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar2);
            if (b0.G(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.a
        public final Object c(Intent intent, int i10) {
            return new e.a(intent, i10);
        }
    }

    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f4812a;

        /* renamed from: b, reason: collision with root package name */
        public int f4813b;

        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                k kVar = new k();
                kVar.f4812a = parcel.readString();
                kVar.f4813b = parcel.readInt();
                return kVar;
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4812a);
            parcel.writeInt(this.f4813b);
        }
    }

    public interface l {
        boolean a(ArrayList<c5.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final int f4814a;

        public m(int i10) {
            this.f4814a = i10;
        }

        @Override // c5.b0.l
        public final boolean a(ArrayList<c5.a> arrayList, ArrayList<Boolean> arrayList2) {
            b0 b0Var = b0.this;
            c5.h hVar = b0Var.f4801x;
            int i10 = this.f4814a;
            if (hVar == null || i10 >= 0 || !hVar.g().N()) {
                return b0Var.O(arrayList, arrayList2, i10, 1);
            }
            return false;
        }
    }

    public static boolean G(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean H(c5.h hVar) {
        hVar.getClass();
        ArrayList arrayListE = hVar.f4891w.f4780c.e();
        int size = arrayListE.size();
        boolean zH = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListE.get(i10);
            i10++;
            c5.h hVar2 = (c5.h) obj;
            if (hVar2 != null) {
                zH = H(hVar2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(c5.h hVar) {
        if (hVar == null) {
            return true;
        }
        if (hVar.E) {
            return hVar.f4889t == null || J(hVar.f4892x);
        }
        return false;
    }

    public static boolean K(c5.h hVar) {
        if (hVar == null) {
            return true;
        }
        b0 b0Var = hVar.f4889t;
        return hVar.equals(b0Var.f4801x) && K(b0Var.f4800w);
    }

    public static void Y(c5.h hVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + hVar);
        }
        if (hVar.B) {
            hVar.B = false;
            hVar.L = !hVar.L;
        }
    }

    public final c5.h A(int i10) {
        i0 i0Var = this.f4780c;
        ArrayList<c5.h> arrayList = i0Var.f4914a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c5.h hVar = arrayList.get(size);
            if (hVar != null && hVar.f4893y == i10) {
                return hVar;
            }
        }
        for (h0 h0Var : i0Var.f4915b.values()) {
            if (h0Var != null) {
                c5.h hVar2 = h0Var.f4910c;
                if (hVar2.f4893y == i10) {
                    return hVar2;
                }
            }
        }
        return null;
    }

    public final c5.h B(String str) {
        i0 i0Var = this.f4780c;
        ArrayList<c5.h> arrayList = i0Var.f4914a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c5.h hVar = arrayList.get(size);
            if (hVar != null && str.equals(hVar.A)) {
                return hVar;
            }
        }
        for (h0 h0Var : i0Var.f4915b.values()) {
            if (h0Var != null) {
                c5.h hVar2 = h0Var.f4910c;
                if (str.equals(hVar2.A)) {
                    return hVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(c5.h hVar) {
        ViewGroup viewGroup = hVar.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (hVar.f4894z <= 0 || !this.f4799v.Z()) {
            return null;
        }
        View viewY = this.f4799v.Y(hVar.f4894z);
        if (viewY instanceof ViewGroup) {
            return (ViewGroup) viewY;
        }
        return null;
    }

    public final s D() {
        c5.h hVar = this.f4800w;
        return hVar != null ? hVar.f4889t.D() : this.f4802y;
    }

    public final n0 E() {
        c5.h hVar = this.f4800w;
        return hVar != null ? hVar.f4889t.E() : this.f4803z;
    }

    public final void F(c5.h hVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + hVar);
        }
        if (hVar.B) {
            return;
        }
        hVar.B = true;
        hVar.L = true ^ hVar.L;
        X(hVar);
    }

    public final boolean I() {
        c5.h hVar = this.f4800w;
        if (hVar == null) {
            return true;
        }
        return hVar.f4890v != null && hVar.f4882l && hVar.i().I();
    }

    public final void L(int i10, boolean z10) {
        t<?> tVar;
        if (this.f4798u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f4797t) {
            this.f4797t = i10;
            i0 i0Var = this.f4780c;
            HashMap<String, h0> map = i0Var.f4915b;
            ArrayList<c5.h> arrayList = i0Var.f4914a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                c5.h hVar = arrayList.get(i11);
                i11++;
                h0 h0Var = map.get(hVar.f4876e);
                if (h0Var != null) {
                    h0Var.j();
                }
            }
            for (h0 h0Var2 : map.values()) {
                if (h0Var2 != null) {
                    h0Var2.j();
                    c5.h hVar2 = h0Var2.f4910c;
                    if (hVar2.f4883m && !hVar2.m()) {
                        i0Var.h(h0Var2);
                    }
                }
            }
            Z();
            if (this.E && (tVar = this.f4798u) != null && this.f4797t == 7) {
                tVar.e0();
                this.E = false;
            }
        }
    }

    public final void M() {
        if (this.f4798u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.f4838g = false;
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null) {
                hVar.f4891w.M();
            }
        }
    }

    public final boolean N() {
        y(false);
        x(true);
        c5.h hVar = this.f4801x;
        if (hVar != null && hVar.g().N()) {
            return true;
        }
        boolean zO = O(this.J, this.K, -1, 0);
        if (zO) {
            this.f4779b = true;
            try {
                Q(this.J, this.K);
            } finally {
                d();
            }
        }
        b0();
        u();
        this.f4780c.f4915b.values().removeAll(Collections.singleton(null));
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList<c5.a> arrayList3 = this.f4781d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f4781d.size() - 1;
            } else {
                int size2 = this.f4781d.size() - 1;
                while (size2 >= 0) {
                    c5.a aVar = this.f4781d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f4762r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        c5.a aVar2 = this.f4781d.get(size - 1);
                        if (i10 < 0 || i10 != aVar2.f4762r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f4781d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f4781d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f4781d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(c5.h hVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + hVar + " nesting=" + hVar.f4888s);
        }
        boolean zM = hVar.m();
        if (hVar.C && zM) {
            return;
        }
        i0 i0Var = this.f4780c;
        synchronized (i0Var.f4914a) {
            i0Var.f4914a.remove(hVar);
        }
        hVar.f4882l = false;
        if (H(hVar)) {
            this.E = true;
        }
        hVar.f4883m = true;
        X(hVar);
    }

    public final void Q(ArrayList<c5.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f4933o) {
                if (i11 != i10) {
                    z(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4933o) {
                        i11++;
                    }
                }
                z(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            z(arrayList, arrayList2, i11, size);
        }
    }

    public final void R(Parcelable parcelable) {
        v vVar;
        int i10;
        boolean z10;
        int i11;
        h0 h0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4798u.f4980b.getClassLoader());
                this.f4788k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4798u.f4980b.getClassLoader());
                arrayList.add((g0) bundle.getParcelable("state"));
            }
        }
        i0 i0Var = this.f4780c;
        HashMap<String, g0> map = i0Var.f4916c;
        HashMap<String, h0> map2 = i0Var.f4915b;
        map.clear();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            g0 g0Var = (g0) obj;
            map.put(g0Var.f4860b, g0Var);
        }
        d0 d0Var = (d0) bundle3.getParcelable("state");
        if (d0Var == null) {
            return;
        }
        map2.clear();
        ArrayList<String> arrayList2 = d0Var.f4820a;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (true) {
            vVar = this.f4790m;
            i10 = 2;
            if (i13 >= size2) {
                break;
            }
            String str3 = arrayList2.get(i13);
            i13++;
            g0 g0VarRemove = i0Var.f4916c.remove(str3);
            if (g0VarRemove != null) {
                c5.h hVar = this.M.f4833b.get(g0VarRemove.f4860b);
                if (hVar != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + hVar);
                    }
                    h0Var = new h0(vVar, i0Var, hVar, g0VarRemove);
                } else {
                    h0Var = new h0(this.f4790m, this.f4780c, this.f4798u.f4980b.getClassLoader(), D(), g0VarRemove);
                }
                c5.h hVar2 = h0Var.f4910c;
                hVar2.f4889t = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + hVar2.f4876e + "): " + hVar2);
                }
                h0Var.l(this.f4798u.f4980b.getClassLoader());
                i0Var.g(h0Var);
                h0Var.f4912e = this.f4797t;
            }
        }
        e0 e0Var = this.M;
        e0Var.getClass();
        ArrayList arrayList3 = new ArrayList(e0Var.f4833b.values());
        int size3 = arrayList3.size();
        int i14 = 0;
        while (true) {
            z10 = true;
            if (i14 >= size3) {
                break;
            }
            Object obj2 = arrayList3.get(i14);
            i14++;
            c5.h hVar3 = (c5.h) obj2;
            if (map2.get(hVar3.f4876e) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + hVar3 + " that was not found in the set of active Fragments " + d0Var.f4820a);
                }
                this.M.h(hVar3);
                hVar3.f4889t = this;
                h0 h0Var2 = new h0(vVar, i0Var, hVar3);
                h0Var2.f4912e = 1;
                h0Var2.j();
                hVar3.f4883m = true;
                h0Var2.j();
            }
        }
        ArrayList<String> arrayList4 = d0Var.f4821b;
        i0Var.f4914a.clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i15 = 0;
            while (i15 < size4) {
                String str4 = arrayList4.get(i15);
                i15++;
                String str5 = str4;
                c5.h hVarB = i0Var.b(str5);
                if (hVarB == null) {
                    throw new IllegalStateException(i8.n.d("No instantiated fragment for (", str5, ")"));
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str5 + "): " + hVarB);
                }
                i0Var.a(hVarB);
            }
        }
        if (d0Var.f4822c != null) {
            this.f4781d = new ArrayList<>(d0Var.f4822c.length);
            int i16 = 0;
            while (true) {
                c5.b[] bVarArr = d0Var.f4822c;
                if (i16 >= bVarArr.length) {
                    break;
                }
                c5.b bVar = bVarArr[i16];
                ArrayList<String> arrayList5 = bVar.f4765b;
                c5.a aVar = new c5.a(this);
                int[] iArr = bVar.f4764a;
                int i17 = 0;
                int i18 = 0;
                while (i17 < iArr.length) {
                    j0.a aVar2 = new j0.a();
                    int i19 = i17 + 1;
                    int i20 = i10;
                    aVar2.f4934a = iArr[i17];
                    if (G(i20)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i18 + " base fragment #" + iArr[i19]);
                    }
                    aVar2.f4941h = l.b.values()[bVar.f4766c[i18]];
                    aVar2.f4942i = l.b.values()[bVar.f4767d[i18]];
                    int i21 = i17 + 2;
                    aVar2.f4936c = iArr[i19] != 0 ? z10 : false;
                    int i22 = iArr[i21];
                    aVar2.f4937d = i22;
                    int i23 = iArr[i17 + 3];
                    aVar2.f4938e = i23;
                    int i24 = i17 + 5;
                    int i25 = iArr[i17 + 4];
                    aVar2.f4939f = i25;
                    i17 += 6;
                    int[] iArr2 = iArr;
                    int i26 = iArr2[i24];
                    aVar2.f4940g = i26;
                    aVar.f4920b = i22;
                    aVar.f4921c = i23;
                    aVar.f4922d = i25;
                    aVar.f4923e = i26;
                    aVar.b(aVar2);
                    i18++;
                    i10 = i20;
                    iArr = iArr2;
                    z10 = true;
                }
                int i27 = i10;
                aVar.f4924f = bVar.f4768e;
                aVar.f4926h = bVar.f4769f;
                aVar.f4925g = true;
                aVar.f4927i = bVar.f4771h;
                aVar.f4928j = bVar.f4772j;
                aVar.f4929k = bVar.f4773k;
                aVar.f4930l = bVar.f4774l;
                aVar.f4931m = bVar.f4775m;
                aVar.f4932n = bVar.f4776n;
                aVar.f4933o = bVar.f4777p;
                aVar.f4762r = bVar.f4770g;
                for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                    String str6 = arrayList5.get(i28);
                    if (str6 != null) {
                        aVar.f4919a.get(i28).f4935b = i0Var.b(str6);
                    }
                }
                aVar.c(1);
                if (G(i27)) {
                    StringBuilder sbB = p.i0.b(i16, "restoreAllState: back stack #", " (index ");
                    sbB.append(aVar.f4762r);
                    sbB.append("): ");
                    sbB.append(aVar);
                    Log.v("FragmentManager", sbB.toString());
                    PrintWriter printWriter = new PrintWriter(new l0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4781d.add(aVar);
                i16++;
                i10 = i27;
                z10 = true;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f4781d = null;
        }
        this.f4786i.set(d0Var.f4823d);
        String str7 = d0Var.f4824e;
        if (str7 != null) {
            c5.h hVarB2 = i0Var.b(str7);
            this.f4801x = hVarB2;
            q(hVarB2);
        }
        ArrayList<String> arrayList6 = d0Var.f4825f;
        if (arrayList6 != null) {
            while (i11 < arrayList6.size()) {
                this.f4787j.put(arrayList6.get(i11), d0Var.f4826g.get(i11));
                i11++;
            }
        }
        this.D = new ArrayDeque<>(d0Var.f4827h);
    }

    public final Bundle S() {
        int i10;
        c5.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            m0 m0Var = (m0) it.next();
            if (m0Var.f4952e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                m0Var.f4952e = false;
                m0Var.b();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((m0) it2.next()).c();
        }
        y(true);
        this.F = true;
        this.M.f4838g = true;
        i0 i0Var = this.f4780c;
        i0Var.getClass();
        HashMap<String, h0> map = i0Var.f4915b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        Iterator<h0> it3 = map.values().iterator();
        while (true) {
            bVarArr = null;
            bVarArr = null;
            if (!it3.hasNext()) {
                break;
            }
            h0 next = it3.next();
            if (next != null) {
                c5.h hVar = next.f4910c;
                g0 g0Var = new g0(hVar);
                if (hVar.f4872a <= -1 || g0Var.f4871n != null) {
                    g0Var.f4871n = hVar.f4873b;
                } else {
                    Bundle bundle2 = new Bundle();
                    hVar.w(bundle2);
                    hVar.S.b(bundle2);
                    bundle2.putParcelable("android:support:fragments", hVar.f4891w.S());
                    next.f4908a.j(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (hVar.f4874c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", hVar.f4874c);
                    }
                    if (hVar.f4875d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", hVar.f4875d);
                    }
                    if (!hVar.I) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", hVar.I);
                    }
                    g0Var.f4871n = bundle3;
                    if (hVar.f4879h != null) {
                        if (bundle3 == null) {
                            g0Var.f4871n = new Bundle();
                        }
                        g0Var.f4871n.putString("android:target_state", hVar.f4879h);
                        int i11 = hVar.f4880j;
                        if (i11 != 0) {
                            g0Var.f4871n.putInt("android:target_req_state", i11);
                        }
                    }
                }
                next.f4909b.f4916c.put(hVar.f4876e, g0Var);
                arrayList2.add(hVar.f4876e);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + hVar + ": " + hVar.f4873b);
                }
            }
        }
        i0 i0Var2 = this.f4780c;
        i0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(i0Var2.f4916c.values());
        if (!arrayList3.isEmpty()) {
            i0 i0Var3 = this.f4780c;
            synchronized (i0Var3.f4914a) {
                try {
                    if (i0Var3.f4914a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(i0Var3.f4914a.size());
                        ArrayList<c5.h> arrayList4 = i0Var3.f4914a;
                        int size2 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            c5.h hVar2 = arrayList4.get(i12);
                            i12++;
                            c5.h hVar3 = hVar2;
                            arrayList.add(hVar3.f4876e);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + hVar3.f4876e + "): " + hVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList<c5.a> arrayList5 = this.f4781d;
            if (arrayList5 != null && (size = arrayList5.size()) > 0) {
                bVarArr = new c5.b[size];
                for (int i13 = 0; i13 < size; i13++) {
                    bVarArr[i13] = new c5.b(this.f4781d.get(i13));
                    if (G(2)) {
                        StringBuilder sbB = p.i0.b(i13, "saveAllState: adding back stack #", ": ");
                        sbB.append(this.f4781d.get(i13));
                        Log.v("FragmentManager", sbB.toString());
                    }
                }
            }
            d0 d0Var = new d0();
            d0Var.f4820a = arrayList2;
            d0Var.f4821b = arrayList;
            d0Var.f4822c = bVarArr;
            d0Var.f4823d = this.f4786i.get();
            c5.h hVar4 = this.f4801x;
            if (hVar4 != null) {
                d0Var.f4824e = hVar4.f4876e;
            }
            d0Var.f4825f.addAll(this.f4787j.keySet());
            d0Var.f4826g.addAll(this.f4787j.values());
            d0Var.f4827h = new ArrayList<>(this.D);
            bundle.putParcelable("state", d0Var);
            for (String str : this.f4788k.keySet()) {
                bundle.putBundle(m3.a.a("result_", str), this.f4788k.get(str));
            }
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                g0 g0Var2 = (g0) obj;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", g0Var2);
                bundle.putBundle("fragment_" + g0Var2.f4860b, bundle4);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.f4778a) {
            try {
                if (this.f4778a.size() == 1) {
                    this.f4798u.f4981c.removeCallbacks(this.N);
                    this.f4798u.f4981c.post(this.N);
                    b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void U(c5.h hVar, boolean z10) {
        ViewGroup viewGroupC = C(hVar);
        if (viewGroupC == null || !(viewGroupC instanceof q)) {
            return;
        }
        ((q) viewGroupC).setDrawDisappearingViewsLast(!z10);
    }

    public final void V(c5.h hVar, l.b bVar) {
        if (hVar.equals(this.f4780c.b(hVar.f4876e)) && (hVar.f4890v == null || hVar.f4889t == this)) {
            hVar.O = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void W(c5.h hVar) {
        if (hVar != null) {
            if (!hVar.equals(this.f4780c.b(hVar.f4876e)) || (hVar.f4890v != null && hVar.f4889t != this)) {
                throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        c5.h hVar2 = this.f4801x;
        this.f4801x = hVar;
        q(hVar2);
        q(this.f4801x);
    }

    public final void X(c5.h hVar) {
        ViewGroup viewGroupC = C(hVar);
        if (viewGroupC != null) {
            h.d dVar = hVar.K;
            if ((dVar == null ? 0 : dVar.f4902e) + (dVar == null ? 0 : dVar.f4901d) + (dVar == null ? 0 : dVar.f4900c) + (dVar == null ? 0 : dVar.f4899b) > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, hVar);
                }
                c5.h hVar2 = (c5.h) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag);
                h.d dVar2 = hVar.K;
                boolean z10 = dVar2 != null ? dVar2.f4898a : false;
                if (hVar2.K == null) {
                    return;
                }
                hVar2.f().f4898a = z10;
            }
        }
    }

    public final void Z() {
        ArrayList arrayListD = this.f4780c.d();
        int size = arrayListD.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListD.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            c5.h hVar = h0Var.f4910c;
            if (hVar.H) {
                if (this.f4779b) {
                    this.I = true;
                } else {
                    hVar.H = false;
                    h0Var.j();
                }
            }
        }
    }

    public final h0 a(c5.h hVar) {
        String str = hVar.N;
        if (str != null) {
            d5.b.c(hVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + hVar);
        }
        h0 h0VarF = f(hVar);
        hVar.f4889t = this;
        i0 i0Var = this.f4780c;
        i0Var.g(h0VarF);
        if (!hVar.C) {
            i0Var.a(hVar);
            hVar.f4883m = false;
            hVar.L = false;
            if (H(hVar)) {
                this.E = true;
            }
        }
        return h0VarF;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new l0());
        t<?> tVar = this.f4798u;
        if (tVar != null) {
            try {
                tVar.b0(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(t<?> tVar, p pVar, c5.h hVar) {
        if (this.f4798u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4798u = tVar;
        this.f4799v = pVar;
        this.f4800w = hVar;
        CopyOnWriteArrayList<f0> copyOnWriteArrayList = this.f4791n;
        if (hVar != null) {
            copyOnWriteArrayList.add(new g(hVar));
        } else if (tVar instanceof f0) {
            copyOnWriteArrayList.add((f0) tVar);
        }
        if (this.f4800w != null) {
            b0();
        }
        if (tVar instanceof b.i0) {
            b.i0 i0Var = (b.i0) tVar;
            b.d0 onBackPressedDispatcher = i0Var.getOnBackPressedDispatcher();
            this.f4784g = onBackPressedDispatcher;
            androidx.lifecycle.t tVar2 = i0Var;
            if (hVar != null) {
                tVar2 = hVar;
            }
            onBackPressedDispatcher.a(tVar2, this.f4785h);
        }
        if (hVar != null) {
            e0 e0Var = hVar.f4889t.M;
            HashMap<String, e0> map = e0Var.f4834c;
            e0 e0Var2 = map.get(hVar.f4876e);
            if (e0Var2 == null) {
                e0Var2 = new e0(e0Var.f4836e);
                map.put(hVar.f4876e, e0Var2);
            }
            this.M = e0Var2;
        } else if (tVar instanceof b1) {
            a1 store = ((b1) tVar).getViewModelStore();
            kotlin.jvm.internal.r.e(store, "store");
            a.C0143a defaultCreationExtras = a.C0143a.f15159b;
            kotlin.jvm.internal.r.e(defaultCreationExtras, "defaultCreationExtras");
            j5.f fVar = new j5.f(store, e0.f4832h, defaultCreationExtras);
            kotlin.jvm.internal.h hVarA = kotlin.jvm.internal.h0.a(e0.class);
            String strA = hVarA.a();
            if (strA == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.M = (e0) fVar.a(hVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        } else {
            this.M = new e0(false);
        }
        e0 e0Var3 = this.M;
        e0Var3.f4838g = this.F || this.G;
        this.f4780c.f4917d = e0Var3;
        v2.f fVar2 = this.f4798u;
        if ((fVar2 instanceof c6.e) && hVar == null) {
            c6.c savedStateRegistry = ((c6.e) fVar2).getSavedStateRegistry();
            final c0 c0Var = (c0) this;
            savedStateRegistry.c("android:support:fragments", new c.b() { // from class: c5.a0
                @Override // c6.c.b
                public final Bundle a() {
                    return c0Var.S();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                R(bundleA);
            }
        }
        v2.f fVar3 = this.f4798u;
        if (fVar3 instanceof e.j) {
            e.f activityResultRegistry = ((e.j) fVar3).getActivityResultRegistry();
            String strA2 = m3.a.a("FragmentManager:", hVar != null ? b.o.a(new StringBuilder(), hVar.f4876e, ":") : "");
            c0 c0Var2 = (c0) this;
            this.A = activityResultRegistry.c(k3.a.a(strA2, "StartActivityForResult"), new f.g(), new h(c0Var2));
            this.B = activityResultRegistry.c(k3.a.a(strA2, "StartIntentSenderForResult"), new j(), new i(c0Var2));
            this.C = activityResultRegistry.c(k3.a.a(strA2, "RequestPermissions"), new f.f(), new a(c0Var2));
        }
        v2.f fVar4 = this.f4798u;
        if (fVar4 instanceof p3.d) {
            ((p3.d) fVar4).addOnConfigurationChangedListener(this.f4792o);
        }
        v2.f fVar5 = this.f4798u;
        if (fVar5 instanceof p3.e) {
            ((p3.e) fVar5).addOnTrimMemoryListener(this.f4793p);
        }
        v2.f fVar6 = this.f4798u;
        if (fVar6 instanceof o3.o) {
            ((o3.o) fVar6).addOnMultiWindowModeChangedListener(this.f4794q);
        }
        v2.f fVar7 = this.f4798u;
        if (fVar7 instanceof o3.p) {
            ((o3.p) fVar7).addOnPictureInPictureModeChangedListener(this.f4795r);
        }
        v2.f fVar8 = this.f4798u;
        if ((fVar8 instanceof y3.k) && hVar == null) {
            ((y3.k) fVar8).addMenuProvider(this.f4796s);
        }
    }

    public final void b0() {
        synchronized (this.f4778a) {
            try {
                if (!this.f4778a.isEmpty()) {
                    this.f4785h.f(true);
                    return;
                }
                b bVar = this.f4785h;
                ArrayList<c5.a> arrayList = this.f4781d;
                bVar.f((arrayList != null ? arrayList.size() : 0) > 0 && K(this.f4800w));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(c5.h hVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + hVar);
        }
        if (hVar.C) {
            hVar.C = false;
            if (hVar.f4882l) {
                return;
            }
            this.f4780c.a(hVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + hVar);
            }
            if (H(hVar)) {
                this.E = true;
            }
        }
    }

    public final void d() {
        this.f4779b = false;
        this.K.clear();
        this.J.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.f4780c.d();
        int size = arrayListD.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListD.get(i10);
            i10++;
            ViewGroup viewGroup = ((h0) obj).f4910c.G;
            if (viewGroup != null) {
                hashSet.add(m0.d(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final h0 f(c5.h hVar) {
        String str = hVar.f4876e;
        i0 i0Var = this.f4780c;
        h0 h0Var = i0Var.f4915b.get(str);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f4790m, i0Var, hVar);
        h0Var2.l(this.f4798u.f4980b.getClassLoader());
        h0Var2.f4912e = this.f4797t;
        return h0Var2;
    }

    public final void g(c5.h hVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + hVar);
        }
        if (hVar.C) {
            return;
        }
        hVar.C = true;
        if (hVar.f4882l) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + hVar);
            }
            i0 i0Var = this.f4780c;
            synchronized (i0Var.f4914a) {
                i0Var.f4914a.remove(hVar);
            }
            hVar.f4882l = false;
            if (H(hVar)) {
                this.E = true;
            }
            X(hVar);
        }
    }

    public final void h(boolean z10) {
        if (z10 && (this.f4798u instanceof p3.d)) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null) {
                hVar.F = true;
                if (z10) {
                    hVar.f4891w.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f4797t < 1) {
            return false;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null) {
                if (!hVar.B ? hVar.f4891w.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f4797t < 1) {
            return false;
        }
        ArrayList<c5.h> arrayList = null;
        boolean z10 = false;
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null && J(hVar)) {
                if (!hVar.B ? hVar.f4891w.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(hVar);
                    z10 = true;
                }
            }
        }
        if (this.f4782e != null) {
            for (int i10 = 0; i10 < this.f4782e.size(); i10++) {
                c5.h hVar2 = this.f4782e.get(i10);
                if (arrayList == null || !arrayList.contains(hVar2)) {
                    hVar2.getClass();
                }
            }
        }
        this.f4782e = arrayList;
        return z10;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.H = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).c();
        }
        t<?> tVar = this.f4798u;
        boolean z10 = tVar instanceof b1;
        i0 i0Var = this.f4780c;
        if (z10) {
            zIsChangingConfigurations = i0Var.f4917d.f4837f;
        } else {
            n nVar = tVar.f4980b;
            if (nVar != null) {
                zIsChangingConfigurations = true ^ nVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<c5.c> it2 = this.f4787j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = it2.next().f4816a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    e0 e0Var = i0Var.f4917d;
                    e0Var.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    e0Var.g(str);
                }
            }
        }
        t(-1);
        v2.f fVar = this.f4798u;
        if (fVar instanceof p3.e) {
            ((p3.e) fVar).removeOnTrimMemoryListener(this.f4793p);
        }
        v2.f fVar2 = this.f4798u;
        if (fVar2 instanceof p3.d) {
            ((p3.d) fVar2).removeOnConfigurationChangedListener(this.f4792o);
        }
        v2.f fVar3 = this.f4798u;
        if (fVar3 instanceof o3.o) {
            ((o3.o) fVar3).removeOnMultiWindowModeChangedListener(this.f4794q);
        }
        v2.f fVar4 = this.f4798u;
        if (fVar4 instanceof o3.p) {
            ((o3.p) fVar4).removeOnPictureInPictureModeChangedListener(this.f4795r);
        }
        v2.f fVar5 = this.f4798u;
        if ((fVar5 instanceof y3.k) && this.f4800w == null) {
            ((y3.k) fVar5).removeMenuProvider(this.f4796s);
        }
        this.f4798u = null;
        this.f4799v = null;
        this.f4800w = null;
        if (this.f4784g != null) {
            this.f4785h.e();
            this.f4784g = null;
        }
        e.i iVar = this.A;
        if (iVar != null) {
            iVar.b();
            this.B.b();
            this.C.b();
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f4798u instanceof p3.e)) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null) {
                hVar.F = true;
                if (z10) {
                    hVar.f4891w.l(true);
                }
            }
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f4798u instanceof o3.o)) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null && z10) {
                hVar.f4891w.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListE = this.f4780c.e();
        int size = arrayListE.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListE.get(i10);
            i10++;
            c5.h hVar = (c5.h) obj;
            if (hVar != null) {
                hVar.l();
                hVar.f4891w.n();
            }
        }
    }

    public final boolean o() {
        if (this.f4797t >= 1) {
            for (c5.h hVar : this.f4780c.f()) {
                if (hVar != null) {
                    if (!hVar.B ? hVar.f4891w.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f4797t < 1) {
            return;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null && !hVar.B) {
                hVar.f4891w.p();
            }
        }
    }

    public final void q(c5.h hVar) {
        if (hVar != null) {
            if (hVar.equals(this.f4780c.b(hVar.f4876e))) {
                hVar.f4889t.getClass();
                boolean zK = K(hVar);
                Boolean bool = hVar.f4881k;
                if (bool == null || bool.booleanValue() != zK) {
                    hVar.f4881k = Boolean.valueOf(zK);
                    c0 c0Var = hVar.f4891w;
                    c0Var.b0();
                    c0Var.q(c0Var.f4801x);
                }
            }
        }
    }

    public final void r(boolean z10) {
        if (z10 && (this.f4798u instanceof o3.p)) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null && z10) {
                hVar.f4891w.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f4797t < 1) {
            return false;
        }
        boolean z10 = false;
        for (c5.h hVar : this.f4780c.f()) {
            if (hVar != null && J(hVar)) {
                if (!hVar.B ? hVar.f4891w.s() : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f4779b = true;
            for (h0 h0Var : this.f4780c.f4915b.values()) {
                if (h0Var != null) {
                    h0Var.f4912e = i10;
                }
            }
            L(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((m0) it.next()).c();
            }
            this.f4779b = false;
            y(true);
        } catch (Throwable th2) {
            this.f4779b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c5.h hVar = this.f4800w;
        if (hVar != null) {
            sb.append(hVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4800w)));
            sb.append("}");
        } else {
            t<?> tVar = this.f4798u;
            if (tVar != null) {
                sb.append(tVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4798u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.I) {
            this.I = false;
            Z();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strA = k3.a.a(str, "    ");
        i0 i0Var = this.f4780c;
        ArrayList<c5.h> arrayList = i0Var.f4914a;
        String strA2 = k3.a.a(str, "    ");
        HashMap<String, h0> map = i0Var.f4915b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : map.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    c5.h hVar = h0Var.f4910c;
                    printWriter.println(hVar);
                    hVar.e(strA2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                c5.h hVar2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(hVar2.toString());
            }
        }
        ArrayList<c5.h> arrayList2 = this.f4782e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                c5.h hVar3 = this.f4782e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(hVar3.toString());
            }
        }
        ArrayList<c5.a> arrayList3 = this.f4781d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                c5.a aVar = this.f4781d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strA, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4786i.get());
        synchronized (this.f4778a) {
            try {
                int size4 = this.f4778a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (l) this.f4778a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4798u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4799v);
        if (this.f4800w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4800w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4797t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void w(l lVar, boolean z10) {
        if (!z10) {
            if (this.f4798u == null) {
                if (!this.H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.F || this.G) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4778a) {
            try {
                if (this.f4798u == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4778a.add(lVar);
                    T();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x(boolean z10) {
        if (this.f4779b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4798u == null) {
            if (!this.H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4798u.f4981c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.F || this.G)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.J == null) {
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
        }
    }

    public final boolean y(boolean z10) {
        boolean zA;
        x(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<c5.a> arrayList = this.J;
            ArrayList<Boolean> arrayList2 = this.K;
            synchronized (this.f4778a) {
                if (this.f4778a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f4778a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= this.f4778a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                b0();
                u();
                this.f4780c.f4915b.values().removeAll(Collections.singleton(null));
                return z11;
            }
            z11 = true;
            this.f4779b = true;
            try {
                Q(this.J, this.K);
            } finally {
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[PHI: r14
      0x022b: PHI (r14v22 int) = (r14v21 int), (r14v23 int) binds: [B:103:0x021b, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(ArrayList<c5.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        i0 i0Var = this.f4780c;
        boolean z15 = arrayList.get(i10).f4933o;
        ArrayList<c5.h> arrayList3 = this.L;
        if (arrayList3 == null) {
            this.L = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.L.addAll(i0Var.f());
        c5.h hVar = this.f4801x;
        int i16 = i10;
        boolean z16 = false;
        while (true) {
            int i17 = 1;
            if (i16 >= i11) {
                boolean z17 = z15;
                this.L.clear();
                if (!z17 && this.f4797t >= 1) {
                    for (int i18 = i10; i18 < i11; i18++) {
                        ArrayList<j0.a> arrayList4 = arrayList.get(i18).f4919a;
                        int size = arrayList4.size();
                        int i19 = 0;
                        while (i19 < size) {
                            j0.a aVar = arrayList4.get(i19);
                            i19++;
                            c5.h hVar2 = aVar.f4935b;
                            if (hVar2 != null && hVar2.f4889t != null) {
                                i0Var.g(f(hVar2));
                            }
                        }
                    }
                }
                for (int i20 = i10; i20 < i11; i20++) {
                    c5.a aVar2 = arrayList.get(i20);
                    if (arrayList2.get(i20).booleanValue()) {
                        aVar2.c(-1);
                        b0 b0Var = aVar2.f4760p;
                        ArrayList<j0.a> arrayList5 = aVar2.f4919a;
                        boolean z18 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            j0.a aVar3 = arrayList5.get(size2);
                            c5.h hVar3 = aVar3.f4935b;
                            if (hVar3 != null) {
                                if (hVar3.K != null) {
                                    hVar3.f().f4898a = z18;
                                }
                                int i21 = aVar2.f4924f;
                                int i22 = ItemType.STRING_DATA_ITEM;
                                int i23 = ItemType.TYPE_LIST;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        i23 = ItemType.ENCODED_ARRAY_ITEM;
                                        if (i21 != 8197) {
                                            i22 = i21 != 4099 ? i21 != 4100 ? 0 : i23 : 4099;
                                        }
                                    }
                                }
                                if (hVar3.K != null || i22 != 0) {
                                    hVar3.f();
                                    hVar3.K.f4903f = i22;
                                }
                                hVar3.f();
                                hVar3.K.getClass();
                            }
                            switch (aVar3.f4934a) {
                                case 1:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    z18 = true;
                                    b0Var.U(hVar3, true);
                                    b0Var.P(hVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar3.f4934a);
                                case 3:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    b0Var.a(hVar3);
                                    z18 = true;
                                case 4:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    b0Var.getClass();
                                    Y(hVar3);
                                    z18 = true;
                                case 5:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    b0Var.U(hVar3, true);
                                    b0Var.F(hVar3);
                                    z18 = true;
                                case 6:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    b0Var.c(hVar3);
                                    z18 = true;
                                case 7:
                                    hVar3.B(aVar3.f4937d, aVar3.f4938e, aVar3.f4939f, aVar3.f4940g);
                                    b0Var.U(hVar3, true);
                                    b0Var.g(hVar3);
                                    z18 = true;
                                case 8:
                                    b0Var.W(null);
                                    z18 = true;
                                case 9:
                                    b0Var.W(hVar3);
                                    z18 = true;
                                case 10:
                                    b0Var.V(hVar3, aVar3.f4941h);
                                    z18 = true;
                            }
                        }
                    } else {
                        aVar2.c(1);
                        b0 b0Var2 = aVar2.f4760p;
                        ArrayList<j0.a> arrayList6 = aVar2.f4919a;
                        int size3 = arrayList6.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            j0.a aVar4 = arrayList6.get(i24);
                            c5.h hVar4 = aVar4.f4935b;
                            if (hVar4 != null) {
                                if (hVar4.K != null) {
                                    hVar4.f().f4898a = false;
                                }
                                int i25 = aVar2.f4924f;
                                if (hVar4.K != null || i25 != 0) {
                                    hVar4.f();
                                    hVar4.K.f4903f = i25;
                                }
                                hVar4.f();
                                hVar4.K.getClass();
                            }
                            switch (aVar4.f4934a) {
                                case 1:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.U(hVar4, false);
                                    b0Var2.a(hVar4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar4.f4934a);
                                case 3:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.P(hVar4);
                                case 4:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.F(hVar4);
                                case 5:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.U(hVar4, false);
                                    Y(hVar4);
                                case 6:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.g(hVar4);
                                case 7:
                                    hVar4.B(aVar4.f4937d, aVar4.f4938e, aVar4.f4939f, aVar4.f4940g);
                                    b0Var2.U(hVar4, false);
                                    b0Var2.c(hVar4);
                                case 8:
                                    b0Var2.W(hVar4);
                                case 9:
                                    b0Var2.W(null);
                                case 10:
                                    b0Var2.V(hVar4, aVar4.f4942i);
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i26 = i10; i26 < i11; i26++) {
                    c5.a aVar5 = arrayList.get(i26);
                    if (zBooleanValue) {
                        for (int size4 = aVar5.f4919a.size() - 1; size4 >= 0; size4--) {
                            c5.h hVar5 = aVar5.f4919a.get(size4).f4935b;
                            if (hVar5 != null) {
                                f(hVar5).j();
                            }
                        }
                    } else {
                        ArrayList<j0.a> arrayList7 = aVar5.f4919a;
                        int size5 = arrayList7.size();
                        int i27 = 0;
                        while (i27 < size5) {
                            j0.a aVar6 = arrayList7.get(i27);
                            i27++;
                            c5.h hVar6 = aVar6.f4935b;
                            if (hVar6 != null) {
                                f(hVar6).j();
                            }
                        }
                    }
                }
                L(this.f4797t, true);
                HashSet hashSet = new HashSet();
                for (int i28 = i10; i28 < i11; i28++) {
                    ArrayList<j0.a> arrayList8 = arrayList.get(i28).f4919a;
                    int size6 = arrayList8.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        j0.a aVar7 = arrayList8.get(i29);
                        i29++;
                        c5.h hVar7 = aVar7.f4935b;
                        if (hVar7 != null && (viewGroup = hVar7.G) != null) {
                            hashSet.add(m0.d(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    m0Var.f4951d = zBooleanValue;
                    synchronized (m0Var.f4949b) {
                        m0Var.e();
                        m0Var.f4952e = false;
                        int size7 = m0Var.f4949b.size() - 1;
                        if (size7 >= 0) {
                            m0Var.f4949b.get(size7).getClass();
                            throw null;
                        }
                    }
                    m0Var.b();
                }
                for (int i30 = i10; i30 < i11; i30++) {
                    c5.a aVar8 = arrayList.get(i30);
                    if (arrayList2.get(i30).booleanValue() && aVar8.f4762r >= 0) {
                        aVar8.f4762r = -1;
                    }
                    aVar8.getClass();
                }
                return;
            }
            c5.a aVar9 = arrayList.get(i16);
            if (arrayList2.get(i16).booleanValue()) {
                z10 = z15;
                i12 = i16;
                z11 = z16;
                int i31 = 1;
                ArrayList<c5.h> arrayList9 = this.L;
                ArrayList<j0.a> arrayList10 = aVar9.f4919a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    j0.a aVar10 = arrayList10.get(size8);
                    int i32 = aVar10.f4934a;
                    if (i32 == i31) {
                        arrayList9.remove(aVar10.f4935b);
                    } else if (i32 != 3) {
                        switch (i32) {
                            case 6:
                                arrayList9.add(aVar10.f4935b);
                                break;
                            case 8:
                                hVar = null;
                                break;
                            case 9:
                                hVar = aVar10.f4935b;
                                break;
                            case 10:
                                aVar10.f4942i = aVar10.f4941h;
                                break;
                        }
                    }
                    size8--;
                    i31 = 1;
                }
            } else {
                ArrayList<c5.h> arrayList11 = this.L;
                ArrayList<j0.a> arrayList12 = aVar9.f4919a;
                int i33 = 0;
                while (i33 < arrayList12.size()) {
                    j0.a aVar11 = arrayList12.get(i33);
                    int i34 = aVar11.f4934a;
                    if (i34 != i17) {
                        z12 = z15;
                        if (i34 != 2) {
                            if (i34 == 3 || i34 == 6) {
                                arrayList11.remove(aVar11.f4935b);
                                c5.h hVar8 = aVar11.f4935b;
                                if (hVar8 == hVar) {
                                    arrayList12.add(i33, new j0.a(9, hVar8));
                                    i33++;
                                    i14 = i16;
                                    z13 = z16;
                                    i13 = 1;
                                    hVar = null;
                                }
                            } else if (i34 == 7) {
                                i13 = 1;
                            } else if (i34 == 8) {
                                arrayList12.add(i33, new j0.a(9, hVar, 0));
                                aVar11.f4936c = true;
                                i33++;
                                hVar = aVar11.f4935b;
                            }
                            i14 = i16;
                            z13 = z16;
                            i13 = 1;
                        } else {
                            c5.h hVar9 = aVar11.f4935b;
                            int i35 = hVar9.f4894z;
                            int size9 = arrayList11.size() - 1;
                            boolean z19 = false;
                            while (size9 >= 0) {
                                int i36 = size9;
                                c5.h hVar10 = arrayList11.get(size9);
                                int i37 = i16;
                                if (hVar10.f4894z != i35) {
                                    z14 = z16;
                                } else if (hVar10 == hVar9) {
                                    z14 = z16;
                                    z19 = true;
                                } else {
                                    if (hVar10 == hVar) {
                                        z14 = z16;
                                        i15 = 0;
                                        arrayList12.add(i33, new j0.a(9, hVar10, 0));
                                        i33++;
                                        hVar = null;
                                    } else {
                                        z14 = z16;
                                        i15 = 0;
                                    }
                                    j0.a aVar12 = new j0.a(3, hVar10, i15);
                                    aVar12.f4937d = aVar11.f4937d;
                                    aVar12.f4939f = aVar11.f4939f;
                                    aVar12.f4938e = aVar11.f4938e;
                                    aVar12.f4940g = aVar11.f4940g;
                                    arrayList12.add(i33, aVar12);
                                    arrayList11.remove(hVar10);
                                    i33++;
                                    hVar = hVar;
                                }
                                size9 = i36 - 1;
                                z16 = z14;
                                i16 = i37;
                            }
                            i14 = i16;
                            z13 = z16;
                            i13 = 1;
                            if (z19) {
                                arrayList12.remove(i33);
                                i33--;
                            } else {
                                aVar11.f4934a = 1;
                                aVar11.f4936c = true;
                                arrayList11.add(hVar9);
                            }
                        }
                        i33 += i13;
                        i17 = i13;
                        z15 = z12;
                        z16 = z13;
                        i16 = i14;
                    } else {
                        z12 = z15;
                        i13 = i17;
                    }
                    i14 = i16;
                    z13 = z16;
                    arrayList11.add(aVar11.f4935b);
                    i33 += i13;
                    i17 = i13;
                    z15 = z12;
                    z16 = z13;
                    i16 = i14;
                }
                z10 = z15;
                i12 = i16;
                z11 = z16;
            }
            z16 = z11 || aVar9.f4925g;
            i16 = i12 + 1;
            z15 = z10;
        }
    }
}
