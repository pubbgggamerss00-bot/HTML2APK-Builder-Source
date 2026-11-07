package rd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends qd.p {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public zzahn f23365a;

    /* renamed from: b, reason: collision with root package name */
    public d f23366b;

    /* renamed from: c, reason: collision with root package name */
    public String f23367c;

    /* renamed from: d, reason: collision with root package name */
    public String f23368d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f23369e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f23370f;

    /* renamed from: g, reason: collision with root package name */
    public String f23371g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f23372h;

    /* renamed from: j, reason: collision with root package name */
    public i f23373j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23374k;

    /* renamed from: l, reason: collision with root package name */
    public qd.w0 f23375l;

    /* renamed from: m, reason: collision with root package name */
    public b0 f23376m;

    /* renamed from: n, reason: collision with root package name */
    public List<qd.n0> f23377n;

    public g() {
        throw null;
    }

    public g(id.e eVar, ArrayList arrayList) {
        eVar.a();
        this.f23367c = eVar.f14481b;
        this.f23368d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f23371g = "2";
        m(arrayList);
    }

    @Override // qd.g0
    public final String a() {
        return this.f23366b.f23350b;
    }

    @Override // qd.p
    public final String d() {
        return this.f23366b.f23351c;
    }

    @Override // qd.p
    public final String e() {
        return this.f23366b.f23354f;
    }

    @Override // qd.p
    public final /* synthetic */ j f() {
        return new j(this);
    }

    @Override // qd.p
    public final Uri g() {
        d dVar = this.f23366b;
        String str = dVar.f23352d;
        if (!TextUtils.isEmpty(str) && dVar.f23353e == null) {
            dVar.f23353e = Uri.parse(str);
        }
        return dVar.f23353e;
    }

    @Override // qd.p
    public final List<? extends qd.g0> h() {
        return this.f23369e;
    }

    @Override // qd.p
    public final String i() {
        Map map;
        zzahn zzahnVar = this.f23365a;
        if (zzahnVar == null || zzahnVar.zzc() == null || (map = (Map) a0.a(this.f23365a.zzc()).f22692b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // qd.p
    public final String j() {
        return this.f23366b.f23349a;
    }

    @Override // qd.p
    public final boolean k() {
        String str;
        Boolean bool = this.f23372h;
        if (bool == null || bool.booleanValue()) {
            zzahn zzahnVar = this.f23365a;
            if (zzahnVar != null) {
                Map map = (Map) a0.a(zzahnVar.zzc()).f22692b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z10 = true;
            if (this.f23369e.size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f23372h = Boolean.valueOf(z10);
        }
        return this.f23372h.booleanValue();
    }

    @Override // qd.p
    public final id.e l() {
        return id.e.e(this.f23367c);
    }

    @Override // qd.p
    public final synchronized g m(List list) {
        try {
            com.google.android.gms.common.internal.p.f(list);
            this.f23369e = new ArrayList(list.size());
            this.f23370f = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                qd.g0 g0Var = (qd.g0) list.get(i10);
                if (g0Var.a().equals("firebase")) {
                    this.f23366b = (d) g0Var;
                } else {
                    this.f23370f.add(g0Var.a());
                }
                this.f23369e.add((d) g0Var);
            }
            if (this.f23366b == null) {
                this.f23366b = (d) this.f23369e.get(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // qd.p
    public final void n(zzahn zzahnVar) {
        com.google.android.gms.common.internal.p.f(zzahnVar);
        this.f23365a = zzahnVar;
    }

    @Override // qd.p
    public final /* synthetic */ g o() {
        this.f23372h = Boolean.FALSE;
        return this;
    }

    @Override // qd.p
    public final void p(List<qd.n0> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f23377n = list;
    }

    @Override // qd.p
    public final zzahn q() {
        return this.f23365a;
    }

    @Override // qd.p
    public final void r(ArrayList arrayList) {
        b0 b0Var;
        if (arrayList.isEmpty()) {
            b0Var = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                qd.u uVar = (qd.u) obj;
                if (uVar instanceof qd.b0) {
                    arrayList2.add((qd.b0) uVar);
                } else if (uVar instanceof qd.e0) {
                    arrayList3.add((qd.e0) uVar);
                }
            }
            b0Var = new b0(arrayList2, arrayList3);
        }
        this.f23376m = b0Var;
    }

    @Override // qd.p
    public final List<qd.n0> s() {
        return this.f23377n;
    }

    @Override // qd.p
    public final List<String> t() {
        return this.f23370f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 1, this.f23365a, i10, false);
        androidx.lifecycle.c1.l(parcel, 2, this.f23366b, i10, false);
        androidx.lifecycle.c1.m(parcel, 3, this.f23367c, false);
        androidx.lifecycle.c1.m(parcel, 4, this.f23368d, false);
        androidx.lifecycle.c1.p(parcel, 5, this.f23369e, false);
        androidx.lifecycle.c1.n(parcel, 6, this.f23370f);
        androidx.lifecycle.c1.m(parcel, 7, this.f23371g, false);
        boolean zK = k();
        androidx.lifecycle.c1.s(parcel, 8, 4);
        parcel.writeInt(zK ? 1 : 0);
        androidx.lifecycle.c1.l(parcel, 9, this.f23373j, i10, false);
        boolean z10 = this.f23374k;
        androidx.lifecycle.c1.s(parcel, 10, 4);
        parcel.writeInt(z10 ? 1 : 0);
        androidx.lifecycle.c1.l(parcel, 11, this.f23375l, i10, false);
        androidx.lifecycle.c1.l(parcel, 12, this.f23376m, i10, false);
        androidx.lifecycle.c1.p(parcel, 13, this.f23377n, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }

    @Override // qd.p
    public final String zzd() {
        return this.f23365a.zzc();
    }

    @Override // qd.p
    public final String zze() {
        return this.f23365a.zzf();
    }
}
