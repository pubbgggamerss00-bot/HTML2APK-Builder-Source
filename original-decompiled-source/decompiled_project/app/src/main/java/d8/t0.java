package d8;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class t0 implements s0, kotlinx.serialization.internal.j0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f7555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7556c;

    public t0(Context context, zzis zzisVar) {
        r9.s sVarC;
        o9.b bVar;
        ae.y yVar;
        Set<o9.b> set;
        u0 u0Var = new u0();
        try {
            r9.u.b(context);
            sVarC = r9.u.a().c(p9.a.f21358e);
            bVar = new o9.b("proto");
            yVar = new ae.y();
            set = sVarC.f23308a;
        } catch (Throwable unused) {
            u0Var.f7559a = true;
        }
        if (!set.contains(bVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
        }
        u0Var.f7560b = new r9.t(sVarC.f23309b, bVar, yVar, sVarC.f23310c);
        this.f7556c = u0Var;
        this.f7555b = zzisVar;
    }

    @Override // kotlinx.serialization.internal.j0
    public Object a(kh.c cVar, ArrayList arrayList) {
        Object objA;
        Object obj = ((kotlinx.serialization.internal.j) this.f7556c).get(b3.e.c(cVar));
        kotlin.jvm.internal.r.d(obj, "get(...)");
        kotlinx.serialization.internal.d0 d0Var = (kotlinx.serialization.internal.d0) obj;
        Object i0Var = d0Var.f16362a.get();
        if (i0Var == null) {
            synchronized (d0Var) {
                i0Var = d0Var.f16362a.get();
                if (i0Var == null) {
                    i0Var = new kotlinx.serialization.internal.i0();
                    d0Var.f16362a = new SoftReference<>(i0Var);
                }
            }
        }
        kotlinx.serialization.internal.i0 i0Var2 = (kotlinx.serialization.internal.i0) i0Var;
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(new kotlinx.serialization.internal.x((kh.j) obj2));
        }
        ConcurrentHashMap<List<kotlinx.serialization.internal.x>, pg.p<zh.b<T>>> concurrentHashMap = i0Var2.f16374a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                objA = (zh.b) ((eh.p) this.f7555b).invoke(cVar, arrayList);
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            pg.p pVar = new pg.p(objA);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, pVar);
            obj3 = objPutIfAbsent == null ? pVar : objPutIfAbsent;
        }
        return ((pg.p) obj3).f21471a;
    }

    public void b(zzhx zzhxVar) {
        try {
            g(zzhxVar, (zzis) this.f7555b);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void c(zzhx zzhxVar, int i10, long j10) {
        try {
            zziq zziqVar = (zziq) ((zzis) this.f7555b).zzm();
            zziqVar.zzm(i10);
            zzis zzisVar = (zzis) zziqVar.zze();
            this.f7555b = zzisVar;
            if (j10 != 0) {
                zziq zziqVar2 = (zziq) zzisVar.zzm();
                zziqVar2.zzo(j10);
                zzisVar = (zzis) zziqVar2.zze();
            }
            g(zzhxVar, zzisVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void d(zzhx zzhxVar, long j10, boolean z10) {
        zzis zzisVar;
        try {
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z10);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j10 == 0) {
                zzisVar = (zzis) this.f7555b;
            } else {
                zziq zziqVar = (zziq) ((zzis) this.f7555b).zzm();
                zziqVar.zzo(j10);
                zzisVar = (zzis) zziqVar.zze();
            }
            g(zzhxVar2, zzisVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void e(zzhx zzhxVar, int i10, long j10, boolean z10) {
        zzis zzisVar;
        try {
            zziq zziqVar = (zziq) ((zzis) this.f7555b).zzm();
            zziqVar.zzm(i10);
            this.f7555b = (zzis) zziqVar.zze();
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z10);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j10 == 0) {
                zzisVar = (zzis) this.f7555b;
            } else {
                zziq zziqVar2 = (zziq) ((zzis) this.f7555b).zzm();
                zziqVar2.zzo(j10);
                zzisVar = (zzis) zziqVar2.zze();
            }
            g(zzhxVar2, zzisVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void f(zzjo zzjoVar) {
        try {
            u0 u0Var = (u0) this.f7556c;
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn((zzis) this.f7555b);
            zzjgVarZzc.zzo(zzjoVar);
            u0Var.a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void g(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zza(zzhxVar);
            ((u0) this.f7556c).a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public void h(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zzl(zzibVar);
            ((u0) this.f7556c).a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    public t0(eh.p pVar) {
        this.f7555b = pVar;
        this.f7556c = new kotlinx.serialization.internal.j();
    }
}
