package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ov0 {

    /* renamed from: a, reason: collision with root package name */
    public final fv0 f7869a;

    /* renamed from: b, reason: collision with root package name */
    public final lt0 f7870b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7871c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7872d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7873e;

    public ov0(fv0 fv0Var, lt0 lt0Var) {
        this.f7869a = fv0Var;
        this.f7870b = lt0Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f7871c) {
            try {
                if (!this.f7873e) {
                    fv0 fv0Var = this.f7869a;
                    if (!fv0Var.f4788b) {
                        mv0 mv0Var = new mv0(this);
                        fv0 fv0Var2 = this.f7869a;
                        fv0Var2.getClass();
                        fv0Var2.f4791e.s.addListener(new o30(2, fv0Var2, mv0Var), fv0Var2.f4795j);
                        return jSONArray;
                    }
                    b(fv0Var.a());
                }
                ArrayList arrayList = this.f7872d;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    jSONArray.put(((nv0) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        n00 n00Var;
        kt0 kt0VarA;
        kt0 kt0VarA2;
        n00 n00Var2;
        synchronized (this.f7871c) {
            try {
                if (this.f7873e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rv rvVar = (rv) it.next();
                    String string = (!((Boolean) zzbe.zzc().a(zn.j9)).booleanValue() || (kt0VarA2 = this.f7870b.a(rvVar.s)) == null || (n00Var2 = kt0VarA2.f6489c) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : n00Var2.toString();
                    String str = string;
                    boolean z6 = ((Boolean) zzbe.zzc().a(zn.k9)).booleanValue() && (kt0VarA = this.f7870b.a(rvVar.s)) != null && kt0VarA.f6490d;
                    ArrayList arrayList = this.f7872d;
                    String str2 = rvVar.s;
                    kt0 kt0VarA3 = this.f7870b.a(str2);
                    arrayList.add(new nv0(str2, str, (kt0VarA3 == null || (n00Var = kt0VarA3.f6488b) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : n00Var.toString(), rvVar.f8708t ? 1 : 0, rvVar.f8710v, rvVar.f8709u, z6));
                }
                this.f7873e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
